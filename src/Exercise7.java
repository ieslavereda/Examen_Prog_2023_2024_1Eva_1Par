public class Exercise7 {

    public static void main(String[] args) {
        System.out.println(endsWith("","hello"));
        System.out.println(endsWith("",""));
        System.out.println(endsWith("hello","hellos"));
        System.out.println(endsWith("hellos","hello"));
        System.out.println(endsWith("hello","hello"));
        System.out.println(endsWith("   hello","hello"));
    }



    private static boolean endsWith(String text, String suffix){

        // By definition, if the suffix is an empty String we must return true
        if(suffix.equals(""))
            return true;
        // If the length of the text is less than suffix, it's imposible for the text to end with the suffix.
        if(text.length()<suffix.length())
            return false;

        boolean isSuffix;
        int i=0;

        // We start comparing letters from the end and we must compare letters as long as they are the same and there are letters to compare.
        do {
            isSuffix = text.charAt(text.length() - i - 1) == suffix.charAt(suffix.length() - i++ - 1);
        } while(isSuffix && i<suffix.length());

        return isSuffix;
    }
}
