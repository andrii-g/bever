package beverageBuilder;

/**
 * Created by User on 05.02.2017.
 */
/*Director 1*/
public class BarmanFirst {

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
        beverageBuilder.buildIce();
    }
}
