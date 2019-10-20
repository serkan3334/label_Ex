import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // iki boyutlu array yazacagım daha sonra bu array içerisnde bulmasını istedigim bir int degeri aratacagım
        //deger bulunduktan sonra iç içe döngüden "etiket" (label) yöntemi ile döngünün başından çıkmaya çalışcaz.

        int [][] array1 = {{12,23,36,45},{23,3,45,56},{12,23,34,45}};
        // array ı tanımladık daha sonra da burada aramak istedigimiz degeri belirlicez
        int deger = 3;
        int i = 0;
        int J = 0;

        boolean array2 = false;

         serkan : for(i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                if(array1[i][j] == deger) {
                    array2 = true;
                    System.out.println("found :"+deger+"at :"+i+","+j);
                    break serkan;
                }


            }



    }


    }

}

