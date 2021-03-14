public class Tiny_SII {



    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream("test.simpler");
            Tiny_SIILexer = new Tiny_SIILexer(input);
            Tiny_SIIParser parser = new Tiny_SIIParser(new CommonTokenStream(lexer));
            parser.addParseListener(new Tiny_SIICustomListener());
            parser.program();
        } catch (IOException ex) {
            Logger.getLogger(Tiny_SII.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}