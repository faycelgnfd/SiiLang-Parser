

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class semantic extends grammaireBaseListener{

    /**
     * This class provides an  implementation of {@link grammairListener},
     * wit extendeds the grammaireBaselistener class to cover the semantic analysis
     * of the given code.
     */

    // When an error is detected, we will add a warning to the list of errors
    private LinkedList<String> errors = new LinkedList<>();
    private int nbr_erreur=0;
    //If no error is detected after an instruction, we will update the Table
    private TableDesSymboles table=new TableDesSymboles();

    public void enterAffect(grammairParser.AffectContext ctx) { }

    // AFFECTATION
    public void exitAffect(grammairParser.AffectContext ctx) {
        String name=ctx.ID().getText();
        //vérifier si la variable a été declarée
        if(!table.existElement(name)) {
            message_erreur="operation d'affectation sur variable non declarée :+"name;
            errors.add(message_erreur);
        }
        else {
            //vérifier la compatibilité des types
            int type_var= (table.getElement(name)).typeElem;
            int type_affect= 0; //extraire le type d'une operation
            if( !compatible(type_var,type_affect)){
                message_erreur="operation d'affectation sur types non compatibles";
                errors.add(message_erreur);
            }
            else {
                // il ny a pas de problème alors on réalise l'affectation
                (table.getElement(name)).val= ctx.operande().getText();
            }
        }
    }

    // DECLARATION DE VARIABLES
    @Override public void exitDecvar(grammairParser.DecvarContext ctx) {
        String name=ctx.ID().getText();
        int x,y;
        // vérifier que la variable n'a pas déjà été declaré
        if(table.existElement(name)) {
            message_erreur="variable déjà declarée :+"name;
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
        op=ctx.operateur().getText();
        switch (op){
            case "/": break;
            case "+": break;
            case "*": break;
            case "-": break;
        }

    }

    // AFFICHAGE DE DEBUT DE PROGRAMME
    @Override public void enterProgramme(grammairParser.ProgrammeContext ctx) {
        System.out.println("Analyse sémantique");
    }

    //AFFICHAGE DE FIN DE PROGRAMME
    @Override public void exitProgramme(grammairParser.ProgrammeContext ctx) {
        int i;
        if(nbr_erreur==0){System.out.println("Programme correcte");}
          else{ System.out.println("erreurs du programme:")
                for(i=0;i<errors.size();i++)
                { System.out.println(errors.get(i));}
        }
    }




}