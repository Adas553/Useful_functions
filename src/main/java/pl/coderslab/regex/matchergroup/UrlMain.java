package pl.coderslab.regex.matchergroup;

public class UrlMain {
    public static void main(String[] args) {
        StandardUrl standardUrl = new StandardUrl();
        ExtendedUrl extendedUrl = new ExtendedUrl();
        String param1 = standardUrl.getParam("param1", "url_example?param1=99&param2=string");
        String param2 = extendedUrl.getParam("param2", "url_example/param1.55/param2.byte");
        System.out.println(param1);
        System.out.println(param2);

    }
}
