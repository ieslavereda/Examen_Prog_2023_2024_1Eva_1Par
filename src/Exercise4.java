public class Exercise4 {
    public static void main(String[] args) {
        int num = 'X' + (int)1.73;
        System.out.println((char)num); // the console must display letter Y
        double num2 = Double.valueOf("44.6") + 1;
        System.out.println(123 + "" + num2); // the console must display 12345.6
        System.out.println(String.valueOf('7') + '-' + '3'); // the console must display 7-3
        double num3 = 1.5f + 1.5d;
        int num4 = Integer.valueOf("3") + (int)num3;
        System.out.println(num4);  //the console must display 6
        double num5 = 2.5;
        float num6 = (float) num5 + 2;
        System.out.println(num6); //the console must display 4.5

    }

//    public static void badCode(){
//        int num = 'X' + 1.73;
//        System.out.println(num); // the console must display letter Y
//        double num2 = "44.6" + 1;
//        System.out.println(123 + num2); // the console must display 12345.6
//        System.out.println('7' + '-' + '3'); // the console must display 7-3
//        double num3 = 1.5f + 1.5d;
//        int num4 = "3" + num3;
//        System.out.println(num4);  //the console must display 6
//        double num5 = 2.5;
//        float num6 = num5 + 2;
//        System.out.println(num6); //the console must display 4.5
//    }
}
