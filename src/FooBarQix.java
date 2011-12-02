/**
 */
public class FooBarQix {

    private static enum  FBQEnum{
        FOO (3, "Foo"), BAR(5, "Bar"), QIX(7, "Qix");

        private int value;
        private String replacement;
        private char chValue;

        FBQEnum(int value, String replacement) {
            assert value < 10;
            this.value = value;
            this.replacement = replacement;
            this.chValue = String.valueOf(value).charAt(0);
        }
    }


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
        for (FBQEnum fbqEnum : FBQEnum.values()) {
            if (intToProcess % fbqEnum.value == 0) {
                appendFBQ(fbqEnum);
            }
        }
    }

    private void appendContenus() {
        String st = String.valueOf(intToProcess);
        for (char c : st.toCharArray()) {
            appendFooBarQuixIfEquals(c);
        }
    }

    private void appendFooBarQuixIfEquals(char c) {
        for (FBQEnum fbqEnum : FBQEnum.values()) {
            if (c == fbqEnum.chValue){
                appendFBQ(fbqEnum);
            }
        }
    }

    private void appendFBQ(FBQEnum fbqEnum) {
        sb.append(fbqEnum.replacement);
        noFooBarQix = false;
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
