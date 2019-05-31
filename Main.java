public class Main {

    public static void main(String[] args) {

        // have any name, don't use predefined methods for now. input "Kapil ChavhAN". output printing as capital letters. convert capitala letter as small letters
        // and display in console
        String name = "KapiL alskSDFGHdfdkn 8927345][p";
        StringBuilder UpperCase = new StringBuilder("");
        System.out.println(name);
        for(int i = 0; i< name.length(); i++){
            if(97 <= (int) name.charAt(i) && 122 >= (int) name.charAt(i)){
                char inst = (char) ((int) name.charAt(i) - 32);
                UpperCase.append(inst);
            }else {
                UpperCase.append(name.charAt(i));
            }
        }
        System.out.println(UpperCase);

        StringBuilder LowerCase = new StringBuilder("");
        for(int i = 0; i< name.length(); i++){
            if( 65<= (int) name.charAt(i) && 90 >= (int) name.charAt(i)){
                char inst = (char) ((int) name.charAt(i) + 32);
                LowerCase.append(inst);
            }else {
                LowerCase.append(name.charAt(i));
            }
        }
        System.out.println(LowerCase);
        // printing primary number
        // Number table (2 to 20) 2 * 1 = 2

    }
}

