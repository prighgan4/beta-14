public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1000;
        int RubForMiles = 20;
        int BonusMiles = price/RubForMiles;
        int miles = service.calculate(BonusMiles);
        System.out.println(miles);
    }
}