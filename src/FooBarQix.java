/**
 */
public class FooBarQix {

// -------------------------- INNER CLASSES --------------------------

    private static enum  FBQEnum{
        Foo(3), Bar(5), Qix(7);

        private int value;
        private char chValue;

        FBQEnum(int value) {
            assert value < 10;
            this.value = value;
            this.chValue = String.valueOf(value).charAt(0);
        }
    }

// -------------------------- INSTANCE --------------------------

    int intToProcess;
    StringBuilder sb = new StringBuilder();

    private boolean fooBarQixForLine = false;

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

    private void appendDiviseurs() {
        for (FBQEnum fbqEnum : FBQEnum.values()) {
            if (intToProcess % fbqEnum.value == 0) {
                appendFBQ(fbqEnum);
            }
        }
    }

    private void appendFBQ(FBQEnum fbqEnum) {
        sb.append(fbqEnum.name());
        fooBarQixForLine = true;
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

    private void appendNumberIfNoFooBarQix() {
        if (fooBarQixForLine == false)
            sb.append(intToProcess);
    }

    private void newLine() {
        sb.append('\n');
        fooBarQixForLine = false;
    }

    public String allLines() {
        return sb.toString();
    }

// --------------------------- main() method ---------------------------

    public static void main(String[] args) {
        System.out.println(new FooBarQix(1, 100).allLines());
    }
}
