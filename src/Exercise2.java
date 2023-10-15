public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 10, j = 1; i > 0; i--, j++) {
            System.out.println(i + " " + j);
        }

        int i = 10, j = 1;
        while (i > 0) {
            System.out.println(i + " " + j);
            i--;
            j++;
        }
    }
}
