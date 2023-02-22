package Language;

public class Dansk extends Dialog {

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String welcome() {
        return "Velkommen!";
    }

    @Override
    public String askAge() {
        return "Hvor gammel er du?";
    }

    @Override
    public String changeLanguage() {
        return "Tryk y for at ændre sprog";
    }
}
