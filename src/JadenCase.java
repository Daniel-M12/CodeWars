import java.util.Locale;

public class JadenCase {

    public static void main(String[] args) {
        String phrase = "hello World in the language of Jaden smith";

        System.out.println(toJadenCase(null));
    }

    public static String toJadenCase(String phrase) {
        String character;
        String lastChar = "";

        if (phrase == null || phrase.equals("")){
            return null;
        }else {
            for (int i = 0; i < phrase.length(); i++) {
                character = String.valueOf(phrase.charAt(i));
                if (i > 0){
                    lastChar = String.valueOf(phrase.charAt(i-1));
                }

                if (i == 0 || lastChar.equals(" ")){
                    phrase = phrase.substring(0,i) + character.toUpperCase() + phrase.substring(i+1,phrase.length());
                }
            }
        }
        return phrase;
    }
}
