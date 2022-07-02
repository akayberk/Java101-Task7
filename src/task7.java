import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        float pricePears = 2.14f, priceApples = 3.67f, priceTomatoes = 1.11f, priceBananas = 0.95f, priceEggplants = 5.0f;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac kg armut aldiniz?");
        float kgPears = input.nextFloat();
        System.out.println("Kac kg elma aldiniz?");
        float kgApples = input.nextFloat();
        System.out.println("Kac kg domates aldiniz?");
        float kgTomatoes = input.nextFloat();
        System.out.println("Kac kg muz aldiniz?");
        float kgBananas = input.nextFloat();
        System.out.println("Kac kg patlican aldiniz?");
        float kgEggplants = input.nextFloat();
        float total = (pricePears*kgPears)+(priceApples*kgApples)+(priceTomatoes*kgTomatoes)+(priceBananas*kgBananas)+(priceEggplants*kgEggplants);
        System.out.println("Harcanan toplam para= " + total);
    }
}
