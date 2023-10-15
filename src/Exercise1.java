public class Exercise1 {
    public static void main(String[] args) {

        int numero = -5;
        switch (numero) {
            case 0:
            case 1:
                System.out.println("Mountains");
                break;
            case 2:
                System.out.println("Ocean");
            case 3:
                System.out.println("Sea");
                break;
            case 4:
                System.out.println("Desert");
                break;
            default:
                System.out.println("Nature");
        }


        if (numero >= 0 && numero <= 1) {
            System.out.println("Mountains");
        } else if (numero >= 2 && numero <= 3) {
            if (numero == 2)
                System.out.println("Ocean");
            System.out.println("Sea");
        } else if(numero==4){
            System.out.println("Desert");
        }else {
            System.out.println("Nature");
        }
    }

}