package beverageBuilder;

/**
 * Created by User on 05.02.2017.
 */
public class BloodyMaryBuilder extends BeverageBuilder{

    @Override
    public void buildPrimaryIngredient() {
        beverage.setPrimaryIngredient("tomato juice");
    }

    @Override
    public void buildAdditionalIngredient() {
        beverage.setAdditionalIngredient("vodka");
    }

    @Override
    public void buildIce() {
        beverage.setIce("one ice cube");
    }
}
