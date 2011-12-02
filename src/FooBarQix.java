/**
 */
public class FooBarQix {

    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

// -------------------------- INSTANCE --------------------------

    StringBuilder sb = new StringBuilder();

    int intToProcess;

    private boolean noFooBarQix = true;

// --------------------------- CONSTRUCTORS ---------------------------

    public FooBarQix(final int start, final int end) {
        for (intToProcess = start; intToProcess < end + 1; intToProcess++) {
            processLine();
        }
    }

    private void processLine() {
        appendDiviseurs();
        appendContenus();
        appendNumberIfNoFooBarQix();
        newLine();
    }

    private void newLine() {
        sb.append('\n');
        noFooBarQix = true;
    }

    private void appendDiviseurs() {
        appendDiviseur(3, FOO);
        appendDiviseur(5, BAR);
        appendDiviseur(7, QIX);
    }

    private void appendDiviseur(int i, String foo) {
        if (intToProcess % i == 0) {
            sb.append(foo);
            noFooBarQix = false;
        }
    }

    private void appendContenus() {
        String st = String.valueOf(intToProcess);
        for (char c : st.toCharArray()) {
            appendFooBarQuixIfEquals('3', c, FOO);
            appendFooBarQuixIfEquals('5', c, BAR);
            appendFooBarQuixIfEquals('7', c, QIX);
        }
    }

    private void appendFooBarQuixIfEquals(char c1, char c, String fooOrBarOrQix) {
        if (c == c1){
            sb.append(fooOrBarOrQix);
            noFooBarQix = false;
        }
    }

    private void appendNumberIfNoFooBarQix() {
        if (noFooBarQix)
            sb.append(intToProcess);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    // --------------------------- main() method ---------------------------

    public static void main(String[] args) {
        System.out.println(new FooBarQix(1, 100));
    }
}
