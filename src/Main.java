import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        year = userInput.nextInt();
        //yıl bilgisini aldık
        if (year >= 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 == 0) {
                    //  yıl bilgisi 100 un aktı olmayan yıllar için 4 e
                    //  100 katı olan yıllar için 400e bölünüp bölünmedigine baktık
                    System.out.println(year + " Bir artık yıldır: ");
                    // sonucu kullanıcı görmesi için ekrana bastırdık
                } else {
                    System.out.print(year + " Bir artık yıl degildir: ");

                }
            }
        }
        else {
            System.out.println("Yıl bilgisi 0 dan küçük olamaz");
        }
    }
}