

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.LinkedList;
public class semantic extends grammairBaseListener{

    /**
     * This class provides an  implementation of {@link grammairListener},
     * wit extendeds the grammaireBaselistener class to cover the semantic analysis
     * of the given code.
     */

    // Si une erreur est détectée elle sera ajoutée a la liste errors
    private LinkedList<String> errors = new LinkedList<>();
    private int nbr_erreur=0;
    private String message_erreur;
    private LinkedList<String> result_exp=new LinkedList();
    private LinkedList<Integer> types=new LinkedList();

    //Si aucune erreur n'est détéctée on met à jour la TS
    private TableDesSymboles table=TableDesSymboles.getInstance();

    public boolean compatible(int a,int b){
        boolean compatibilite=true;
        if (a==0){ if(a!=0) compatibilite=false; }
        else if (a==1){if(b==2) compatibilite=false;}
                else if(a==2){if(b!=2) compatibilite= false;}
                return compatibilite;
    }
    
    public void enterAffect(grammairParser.AffectContext ctx) { }

    // AFFECTATION
    public void exitAffect(grammairParser.AffectContext ctx) {
        String name=ctx.ID().getText();
        //vérifier si la variable a été declarée
        if(!table.existElement(name))
        {
            message_erreur="operation d'affectation sur variable non declarée :"+name;
            errors.add(message_erreur);
        }
        else {
            //vérifier la compatibilité des types
            int type_var= (table.getElement(name)).typeElem;
            int type_affect= types.getLast(); //extraire le type d'une operation
            if( !compatible(type_var,type_affect)){
                message_erreur="operation d'affectation sur types non compatibles";
                errors.add(message_erreur);
            }
            else {
                // il ny a pas de problème alors on réalise l'affectation
                String x = null;
                if(ctx.operande()!=null){x=ctx.operande().getText();}
                if(ctx.expression()!=null){x=result_exp.getLast();}
                (table.getElement(name)).val= x;
            }
        }
    }

    // DECLARATION DE VARIABLES
    @Override public void exitDecvar(grammairParser.DecvarContext ctx) {
        String name=ctx.ID().getText();
        int x=0,y=0;
        // vérifier que la variable n'a pas déjà été declaré
        if(table.existElement(name)) {
            message_erreur="variable déjà declarée :"+name;
            errors.add(message_erreur);
        }
        else {
           if(ctx.INT_TYPE()!=null) {x=1; y=4;}
           if(ctx.FLOAT_TYPE()!=null) {x=2; y=8;}
           if(ctx.STRING_TYPE()!=null) {x=3; y=12;}
           //ajouter la variable à la TS
            ElementTable e=new ElementTable("null",name,x,true,y);

        }
    }


    // EVALUATION D'EXPRESSION
    @Override public void exitExpression(grammairParser.ExpressionContext ctx) {
        String op=ctx.operateur().getText();
        switch (op){
            case "/": if(ctx.endExp().operande().getText()=="0"){
                message_erreur="division par 0 ";
                errors.add(message_erreur);
            }
                break;
            case "+": break;
            case "*": break;
            case "-": break;
        }

    }


    @Override public void exitInsidelecture(grammairParser.InsidelectureContext ctx){
        String name=ctx.ID().getText();
        //vérifier si la variable a été declarée
        if(!table.existElement(name)) {
            message_erreur="operation d'ecriture sur variable non declarée :"+name;
            errors.add(message_erreur);
        }
        // mettre à jour TS

    }

    // AFFICHAGE DE DEBUT DE PROGRAMME
    @Override public void enterProgramme(grammairParser.ProgrammeContext ctx) {
        System.out.println("Analyse sémantique");
    }

    //AFFICHAGE DE FIN DE PROGRAMME
    @Override public void exitProgramme(grammairParser.ProgrammeContext ctx) {
        int i;
        if(nbr_erreur==0){System.out.println("Programme correcte");}
          else{ System.out.println("erreurs du programme:");
                for(i=0;i<errors.size();i++)
                { System.out.println(errors.get(i));}
        }
    }




}