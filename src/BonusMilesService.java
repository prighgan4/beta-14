public class BonusMilesService {
    public int calculate(int price, int RubForMiles) {
        int BonusMiles = price/RubForMiles;
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(BonusMiles);


        return price;
    }

    public int calculate(int bonusMiles) {
        return bonusMiles;
    }

}
