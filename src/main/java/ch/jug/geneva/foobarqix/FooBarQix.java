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
        if (string.contains("3")) stringBuilder.append("Foo");
        return stringBuilder.length() > 0 ? stringBuilder.toString() : string;
    }
}
