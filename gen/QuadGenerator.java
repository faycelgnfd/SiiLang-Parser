import java.util.HashMap;
import java.util.LinkedList;

import org.antlr.v4.runtime.ParserRuleContext;


public class QuadGenerator extends grammairBaseListener{
	
	private Quads quads = new Quads();
	private int cptTemps;
	semantic sem;
	private static HashMap<String,String> flags;
	LinkedList<Instruction> instructions;
	private LinkedList<String> pile;
	int sauvegardeCond;
	
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
		
		//intancier la pile
		pile = new LinkedList<String>();
		
		this.sem = sem;
	}
	
	@Override public void exitProgramme(grammairParser.ProgrammeContext ctx)
	{
		if(sem.getNbErrors()==0)
		{
			quads.ajouterQuad("END","","","");
			System.out.println("Les quadruplets : \n");
			for(int i=0;i<quads.tailleQuads();i++)
			{
				System.out.println(quads.getQuad(i).toString()+"\n");
			}
		}
	}
	
	@Override public void exitExpression(grammairParser.ExpressionContext ctx)
	{
		String t1;
		if(ctx.expression()==null)//expression simple
		{
			t1 = ctx.operande().toString();
			
		}
		else
		{
			t1 = pile.removeLast();
		}
		
		String t2 = ctx.endExp().operande().getText();
		cptTemps++;
		String temp = "temps"+cptTemps;
		String operateur = ctx.operateur().getText();
		quads.ajouterQuad(operateur,t1,t2,temp);
		pile.add(temp);
	}
	
	@Override public void exitComparaison(grammairParser.ComparaisonContext ctx)
	{
		String t1 = ctx.operande().getText();
		String t2 = ctx.endComp().operande().getText();
		String comp = ctx.comparateur().getText();
		sauvegardeCond = quads.ajouterQuad(flags.get(comp),t2,t1,"");
	}
	
	@Override public void exitAffect(grammairParser.AffectContext ctx)
	{
		String t;
		if(ctx.expression()!=null) //si c'est une affectation d'une expression
		{
			t = pile.removeLast();
		}
		else //affectation simple
		{
			t = ctx.operande().getText();
		}
		String ID = ctx.ID().getText();
		quads.ajouterQuad("=",t,"",ID);
	}
	

	@Override public void exitSi(grammairParser.SiContext ctx)
	{
		//mettre à jour l'adresse
		quads.getQuad(sauvegardeCond).setChamp(3,""+quads.tailleQuads());
	}
	
	@Override public void exitSinon(grammairParser.SinonContext ctx)
	{
		quads.getQuad(sauvegardeCond).setChamp(3,""+(quads.tailleQuads()+1));
        sauvegardeCond = quads.ajouterQuad("BR","","","");
	}
}
