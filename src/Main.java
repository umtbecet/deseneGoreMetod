import java.util.Scanner;
public class Main {

    static void pattern (){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();
        int result = n;
        System.out.print("Çıktısı : ");
        for (int i =0 ;0<result;i++){
            System.out.print(" "+result);
            result = result-5;
        }
        for (int j =0; result<=n;j++){
            System.out.print(" "+ result);
            result = result+5;
        }


    }
    public static void main(String[] args) {
       pattern();

    }
}