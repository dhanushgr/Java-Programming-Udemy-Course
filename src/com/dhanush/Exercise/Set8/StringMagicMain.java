package src.com.dhanush.Exercise.Set8;

public class StringMagicMain {
    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        System.out.println(stringMagic.areAnagrams("Listen", "Silent"));
        System.out.println(stringMagic.areAnagrams("Hello", "Silent"));

        System.out.println(stringMagic.reverseWordsInSentence("Hey there I'm Dhanush"));
    }
}
