public class Exercise3 {
    public static void main(String[] args) {
        printMatrix(5);
    }

    public static void printMatrix(int size){
        for (int i = 1; i <= size; i++) {
            for (int j=1,k=i; j<=size; j++) {
                if(i<=j)
                    System.out.print(k+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

}
