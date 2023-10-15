public class Exercise6 {


    public static void main(String[] args) {
        System.out.println(equals("","hello"));
        System.out.println(equals("",""));
        System.out.println(equals("helo","hello"));
        System.out.println(equals("hello","hello"));
    }

    private static boolean equals(String text1, String text2){

        // If the legth of the text1 and text2 are different, we can say that they are not equal
        if(text1.length()!=text2.length())
            return false;

        boolean sameSequence=true;
        int i=0;

        // We compare the letters while they are equal and there are letters left to compare
        while(sameSequence && i<text1.length())
            sameSequence = text1.charAt(i)==text2.charAt(i++);

        return sameSequence;
    }
}
