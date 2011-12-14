import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(new FooBarQix(i).getReplacementLine());
        }
    }

    private static enum FBQEnum {
        Foo(3), Bar(5), Qix(7);

        private int value;

        FBQEnum(int value) {
            assert value < 10;
            this.value = value;
        }
    }

    private static final Map<String, FBQEnum> ST_VALUE_TO_FBQ = new HashMap<String, FBQEnum>();
    static {
        for (FBQEnum fbqEnum : FBQEnum.values()) {
            ST_VALUE_TO_FBQ.put(String.valueOf(fbqEnum.value), fbqEnum);
        }
    }

    private final int input;
    private final StringBuilder replacementLine;

    public FooBarQix(int toAnalyse) {
        input = toAnalyse;
        replacementLine = new StringBuilder();
    }

    public String getReplacementLine() {
        appendNamesByDivisibles();
        appendNamesByContent();
        appendNumberIfNoName();
        return replacementLine.toString();
    }

    private void appendNamesByDivisibles() {
        for (FBQEnum fbqEnum : FBQEnum.values()) {
            if (isDivisibleBy(fbqEnum)) {
                appendName(fbqEnum);
            }
        }
    }

    private boolean isDivisibleBy(FBQEnum fbqEnum) {
        return input % fbqEnum.value == 0;
    }

    private void appendNamesByContent() {
        for (char c : String.valueOf(input).toCharArray()) {
            appendNameIfExistsReplacementFor(c);
        }
    }

    private void appendNameIfExistsReplacementFor(char c) {
        FBQEnum fbqEnum = ST_VALUE_TO_FBQ.get(String.valueOf(c));
        if (fbqEnum != null)
            appendName(fbqEnum);
    }

    private void appendName(FBQEnum fbqEnum) {
        replacementLine.append(fbqEnum.name());
    }

    private void appendNumberIfNoName() {
        if (replacementLine.length() == 0)
            replacementLine.append(input);
    }
}
