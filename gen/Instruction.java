
public class Instruction {
	
	String inst;
	String op1;
	String op2;
	
	public Instruction(String inst, String op1, String op2) {
        this.inst = inst;
        this.op1 = op1;
        this.op2 = op2;
    }

    public Instruction(String inst, String op1) {
        this.inst = inst;
        this.op1 = op1;
        this.op2 = null;
    }
}
