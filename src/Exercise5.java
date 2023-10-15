public class Exercise5 {

    public static void main(String[] args) {
        System.out.println("Random password of length 6: " + getRandomPassword(6));
    }

    public static String getRandomPassword(int size){

        // The use of an explicit String is also allowed.
        // String aux = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String aux = getAllAllowedCharacters();

        String password = "";

        for (int i = 0; i < size; i++)
            password+=aux.charAt((int)(Math.random()*aux.length()));

        return password;
    }

    private static String getAllAllowedCharacters(){
        String allCharacters="";

        allCharacters+=getCharactersBetween('a','z');
        allCharacters+=allCharacters.toUpperCase();
        allCharacters+=getCharactersBetween('0','9');

        return allCharacters;
    }

    private static String getCharactersBetween(char start, char end){
        String aux="";
        for(int i=start;i<=end;i++)
            aux+=(char)i;
        return aux;
    }
}
