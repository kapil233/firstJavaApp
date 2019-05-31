public class Primary {

    public static void main(String[]args){

        System.out.println("Primary Numbers");
        int count = 0;
        for ( int i = 2; i<100; i++){ //
            for(int j = 2; j<=i;j++){ //
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
            count = 0;
        }

      /*  36/7 => 5
                36%7 => 1
        division =>*/

    }
}