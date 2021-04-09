

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
    //If no error is detected after an instruction, we will update the Table
    private TableDesSymboles table=new TableDesSymboles();

    public void enterAffect(grammairParser.AffectContext ctx) { }

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
            int type_affect= 0;
            if( !compatible(type_var,type_affect)){
                message_erreur="operation d'affectation sur types non compatibles";
                errors.add(message_erreur);
            }
            else {}
        }
    }

}