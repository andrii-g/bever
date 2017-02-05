package beverageBuilder;

/**
 * Created by User on 05.02.2017.
 */
/*Product*/

public class Beverage {
    private String primaryIngredient;
    private String additionalIngredient;
    private String ice;

    public String getPrimaryIngredient() {
        return primaryIngredient;
    }

    public void setPrimaryIngredient(String primaryIngredient) {
        this.primaryIngredient = primaryIngredient;
    }

    public String getAdditionalIngredient() {
        return additionalIngredient;
    }

    public void setAdditionalIngredient(String additionalIngredient) {
        this.additionalIngredient = additionalIngredient;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }
}
