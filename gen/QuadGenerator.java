import java.util.HashMap;
import java.util.LinkedList;

import org.antlr.v4.runtime.ParserRuleContext;


public class QuadGenerator extends grammairBaseListener{
	
	private Quads quads = new Quads();
	private int cptTemps;
	semantic sem;
	private static HashMap<String,String> flags;
	LinkedList<Instruction> instructions;
	
	//stack
	//instructions

	public QuadGenerator(semantic sem)
	{
		//initialiser la map des flags
		this.flags = new HashMap<String,String>();
		flags.put("==","BNE");
		flags.put("!=", "BE");
		flags.put("<", "BGE");
		flags.put(">", "BLE");
		flags.put("<=", "BG");
		flags.put(">=", "BL");
		
		//initialiser le compteur de temporraires
		this.cptTemps = 0;
		
		this.sem = sem;
	}
	
	
}
