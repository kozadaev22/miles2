public class BonusMilesService {
    public int calculate(int cost) {
        int priceTicket = cost;
        int bonusMiles = priceTicket / 20;
        return  bonusMiles;
    }
}
