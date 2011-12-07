package ch.jug.geneva.foobarqix;

/**
 * @author <a href="mailto:rueinegni@gmail.com>rueinegni</a>
 * @since 12/5/11 10:52 PM
 */
public class FooBarQix {

    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String QIX = "Qix";

    public String affiche(Integer nombre) {
        StringBuilder stringBuilder = new StringBuilder();

        if (nombre % 3 == 0) stringBuilder.append(FOO);
        if (nombre % 5 == 0) stringBuilder.append(BAR);
        if (nombre % 7 == 0) stringBuilder.append(QIX);

        String string = nombre.toString();
        for (char character : string.toCharArray()) {
            if (character == '5') stringBuilder.append(BAR);
            if (character == '3') stringBuilder.append(FOO);
            if (character == '7') stringBuilder.append(QIX);
        }
        return stringBuilder.length() > 0 ? stringBuilder.toString() : string;
    }

    public static void main(String[] args) {
        FooBarQix fooBarQix = new FooBarQix();
        for (int i = 1; i < 101; i++) {
            System.out.println(fooBarQix.affiche(i));
        }
    }
}
