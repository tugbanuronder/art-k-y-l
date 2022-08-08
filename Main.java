import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int yıl;

        System.out.print("Yil giriniz:");
        yıl=input.nextInt();

        if(yıl % 4 !=0 || (yıl % 100 == 0 && yıl % 400 != 0)){
            System.out.println(yıl + " Artik bir yil degildir.");
        }
        else{
            System.out.println(yıl + " Artik yildir.");
        }


    }
}