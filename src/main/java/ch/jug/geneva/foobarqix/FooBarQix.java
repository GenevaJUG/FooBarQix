package ch.jug.geneva.foobarqix;

/**
 * @author <a href="mailto:rueinegni@gmail.com>rueinegni</a>
 * @since 12/5/11 10:52 PM
 */
public class FooBarQix {
    public String affiche(int nombre) {
        String string = "" + nombre;
        StringBuilder stringBuilder = new StringBuilder();
        if (nombre % 3 == 0) stringBuilder.append("Foo");
        if (nombre % 5 == 0) stringBuilder.append("Bar");
        if (nombre % 7 == 0) stringBuilder.append("Qix");
        for (char character : string.toCharArray()) {
            if (character == '5') stringBuilder.append("Bar");
            if (character == '3') stringBuilder.append("Foo");
            if (character == '7') stringBuilder.append("Qix");
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
