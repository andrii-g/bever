package beverageBuilder;

/**
 * Created by User on 05.02.2017.
 */
/*Concrete Builder*/

public class FreshBuilder extends BeverageBuilder {

    @Override
    public void buildPrimaryIngredient() {
        beverage.setPrimaryIngredient("orange juice");
    }

    @Override
    public void buildAdditionalIngredient() {
        beverage.setAdditionalIngredient("celery juice");
    }

    @Override
    public void buildIce() {
        beverage.setIce("No ice");
    }

}
