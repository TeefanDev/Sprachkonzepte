import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HTMLGenerator {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Bitte geben Sie mindestens eine Klasse oder ein Interface an.");
            return;
        }

        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n<html lang=\"de\">\n<head>\n<style type=\"text/css\">\n")
            .append("th, td { border-bottom: thin solid; padding: 4px; text-align: left; }\n")
            .append("td { font-family: monospace }\n</style>\n</head>\n<body>\n")
            .append("<h1>Sprachkonzepte, Aufgabe 6</h1>\n");

        for (String className : args) {
            try {
                Class<?> clazz = Class.forName(className);
                generateHTMLForClass(clazz, html);
            } catch (ClassNotFoundException e) {
                html.append("<p><b>Klasse oder Interface nicht gefunden:</b> ").append(className).append("</p>\n");
            }
        }

        html.append("</body>\n</html>");
        System.out.println(html);
    }

    private static void generateHTMLForClass(Class<?> clazz, StringBuilder html) {
        html.append("<h2>").append(clazz.isInterface() ? "interface " : "class ").append(clazz.getName()).append(":</h2>\n")
            .append("<table>\n");

        if (clazz.isInterface()) {
            // Methoden direkt anzeigen, wenn es ein Interface ist
            appendMethods(clazz.getMethods(), "Methods", html);
        } else {
            // Interfaces anzeigen
            Class<?>[] interfaces = clazz.getInterfaces();
            if (interfaces.length > 0) {
                html.append("<tr><th>Interface</th><th>Methods</th></tr>\n");
                for (Class<?> iface : interfaces) {
                    html.append("<tr>\n<td valign=top>").append(iface.getName()).append("</td>\n");
                    html.append("<td>").append(formatMethods(iface.getMethods())).append("</td>\n</tr>\n");
                }
            }
        }

        html.append("</table>\n<br>\n");
    }

    private static void appendMethods(Method[] methods, String header, StringBuilder html) {
        if (methods.length > 0) {
            html.append("<tr><th>").append(header).append("</th></tr>\n<tr><td>")
                .append(formatMethods(methods))
                .append("</td></tr>\n");
        }
    }

    private static String formatMethods(Method[] methods) {
        List<String> methodSignatures = new ArrayList<>();
        for (Method method : methods) {
            String signature = method.getReturnType().getTypeName() + " " + method.getName() + "(" +
                    Arrays.stream(method.getParameterTypes())
                          .map(Class::getTypeName)
                          .reduce((a, b) -> a + ", " + b)
                          .orElse("") +
                    ")";
            methodSignatures.add(signature);
        }
        return String.join("<br>\n", methodSignatures);
    }
}
