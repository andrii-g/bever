package beverageBuilder;

/**
 * Created by User on 05.02.2017.
 */
/*Abstract Builder*/

public abstract class BeverageBuilder {

    protected Beverage beverage;

    public Beverage getBeverage(){
        return beverage;
    }

    public void createNewBeverage(){
        beverage = new Beverage();
    }

    public abstract void buildPrimaryIngredient();
    public abstract void buildAdditionalIngredient();
    public abstract void buildIce();

}
