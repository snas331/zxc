public class BonusMilesService {

    public int calculate(int price) {

        int mil = 20;
        int miles = price / mil;

        return miles;
    }
}
