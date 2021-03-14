import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class grammaireCustomListener extends grammaireBaseListener {

    HashMap<String, Integer> variableMap = new HashMap();

    @Override
    public void exitAffect(grammaireParser.LetContext ctx) {
        this.variableMap.put(ctx.VAR().getText(),
                Integer.parseInt(ctx.INT().getText()));

    }
}