public class Code_Ass{

    public ArrayList<ElementCode> code = new ArrayList<ElementCode>();


    static public class elemJmp{
        int inst;
        int jmp;
        elemJmp(int inst,int jmp)
        {
            this.inst=inst;
            this.jmp=jmp;
        }
    }
    static public class Listejmp {
        public ArrayList<elemJmp> jmpList = new ArrayList<elemJmp>();
        void addElemJmp(int inst,int jmp)
        {
            jmpList.add(new elemJmp(inst,jmp));
        }
        int ContainJmp(int jmp)
        {
            int ind;
            for (int i=0;i<jmpList.size();i++)
            {
                if(jmpList.get(i).jmp==jmp)
                {
                    ind=jmpList.get(i).inst;
                    jmpList.remove(i);
                    return  ind;
                }
            }
            return -1;
        }
    }
    String Acc="";
    Listejmp JmpList=new Listejmp();
    public void addcElement(String v1,String v2,String v3,String v4)
    {
        ElementCode elem=new ElementCode(v1,v2,v3,v4);
        code.add(elem);
    }
    public ElementCode getqElement(int indice)
    {
        return code.get(indice);
    }

    void Gen(String etiq,String inst,String op1 ,String op2){
        ElementCode elem=new cElement(etiq,inst,op1,op2);

        code.add(elem);
    }

    void GetInAcc( String op1,String op2,Quad q)
    {
        if (Acc.equals(""))        {
            Gen("      ","MOV","AX",op1);
            Acc=op1;        }
        else        {
            if(Acc.equals(op2))            {
                String T=q.element[1].toString();
                q.element[1]=q.element[2].toString();
                q.element[2]=T.toString();
            }
            else            {
                if(!Acc.equals(op1))                {
                    Gen("      ","MOV",Acc,"AX");
                    Gen("      ","MOV","AX",op1);
                    Acc=op1;
                }            }
        }    }
    String toAssembleur(String inst)
    {
        switch (inst){

            case "BL":return "JL";
            case "BG":return "JG";
            case "BLE":return "JLE";
            case "BGE":return "JGE";
            case "BE":return "JE";
            case "BNE":return "JNE";
            case "BR":return "JMP";
        }
        return "";
    }
    void Add(Quad q)
    {
        this.GetInAcc(q.element[1],q.element[2],q);
        this.Gen("      ","ADD","AX",q.element[2]);
        Acc=q.element[3];
    }
    void Mul(quad q)
    {
        this.GetInAcc(q.element[1],q.element[2],q);
        this.Gen("      ","MUL","AX",q.element[2]);
        Acc=q.element[3];
    }
    void Sub( q)
    {
        this.GetInAcc(q.element[1],"",q);
        this.Gen("      ","SUB","AX",q.element[2]);
        Acc=q.element[3];
    }
    void Div(Quad q)
    {
        this.GetInAcc(q.element[1],"",q);
        this.Gen("      ","DIV","AX",q.element[2]);
        Acc=q.element[3];
    }
    void Affect(Quad q)
    {
        if (!q.element[1].equals(Acc))
        {
            this.Gen("      ","MOV","AX",q.element[1]);
        }
        this.Gen("      ","MOV",q.element[3],"AX");
        Acc="";//fin de l'instruction d'affectl
    }
    void jmp(Quad q)
    {
        this.Gen("      ",this.toAssembleur(q.element[0]),"","");
        JmpList.addElemJmp(code.size()-1,Integer.parseInt(q.element[1])-1);
    }
    void CMP(Quad q) {
        this.Gen("      ","MOV",Acc, "AX");
        this.Gen("      ","MOV", "AX", q.element[2]);
        this.Gen("      ","CMP","AX",q.element[3]);
        this.Gen("      ",this.toAssembleur(q.element[0]),"","");
        JmpList.addElemJmp(code.size()-1,Integer.parseInt(q.element[1])-1);
    }
    void Fin()
    {
        this.Gen("      ","MOV","AX","4C00h");
        this.Gen("      ","INT","21h","");
    }
    void Inst(Quad q,int indice,indiceEtiq intE)
    {

        int ind;
        String etiq="      ";
        if(JmpList.jmpList.size()!=0) {
            while ((ind = JmpList.ContainJmp(indice)) != -1) {
                etiq = "etiq" +String.valueOf(intE.intEtiq);
                code.get(ind).setVal(2, etiq);

            }
        }
        ind=code.size();
        switch (q.element[0])
        {
            case "+":this.Add(q);break;
            case "-":this.Sub(q);break;
            case "*":this.Mul(q);break;
            case "/":this.Div(q);break;
            case "=":this.Affect(q);break;
            case "FIN":this.Fin();break;
            case "BR":this.jmp(q);break;
            default:this.CMP(q);break;
        }
        if (!etiq.equals("      "))
        {
            code.get(ind).setVal(0,etiq+":");
            intE.intEtiq=intE.intEtiq+1;
        }

    }
}

}