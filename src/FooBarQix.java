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

    private final int intToProcess;

    private final StringBuilder line;

    public FooBarQix(int i) {
        intToProcess = i;
        line = new StringBuilder();
    }

    public String getFBQLine() {
        appendFBQPourDiviseur();
        appendFBQPourChar();
        appendNumberIfNoFBQ();
        return line.toString();
    }

    private void appendFBQPourDiviseur() {
        for (FBQEnum fbqEnum : FBQEnum.values()) {
            if (intToProcess % fbqEnum.value == 0) {
                appendFBQName(fbqEnum);
            }
        }
    }

    private void appendFBQPourChar() {
        String st = String.valueOf(intToProcess);
        for (char c : st.toCharArray()) {
            appendFooBarQuixIfEquals(c);
        }
    }

    private void appendFooBarQuixIfEquals(char c) {
        for (FBQEnum fbqEnum : FBQEnum.values()) {
            if (c == fbqEnum.chValue){
                appendFBQName(fbqEnum);
            }
        }
    }

    private void appendFBQName(FBQEnum fbqEnum) {
        line.append(fbqEnum.name());
    }

    private void appendNumberIfNoFBQ() {
        if(line.length() == 0)
            line.append(intToProcess);
    }

// --------------------------- main() method ---------------------------

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(new FooBarQix(i).getFBQLine());
        }
    }
}
