package beverageBuilder;

/**
 * Created by User on 05.02.2017.
 */
public class BarmanSecond {
    private BeverageBuilder beverageBuilder;

    public void setBeverageBuilder(BeverageBuilder beverageBuilder){
        this.beverageBuilder = beverageBuilder;
    }

    public Beverage getBeverage(){
        return beverageBuilder.getBeverage();
    }

    public void makeBeverage(){
        beverageBuilder.createNewBeverage();
        beverageBuilder.buildPrimaryIngredient();
        beverageBuilder.buildAdditionalIngredient();
    }
}
