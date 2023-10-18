public class Exercise3 {
    public static void main(String[] args) {
        printMatrix(5);
    }

    public static void printMatrix(int size){
        for (int i = 1; i <= size; i++) {
            for (int j=1; j<=size; j++) {
                if(i<=j)
                    System.out.print(i+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

}
