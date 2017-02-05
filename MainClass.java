package beverageBuilder;

/**
 * Created by User on 05.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        BarmanFirst barmanFirst = new BarmanFirst();
        BarmanSecond barmanSecond = new BarmanSecond();
        BeverageBuilder freshBuilder = new FreshBuilder();
        BeverageBuilder bloodyMaryBuilder = new BloodyMaryBuilder();

        barmanFirst.setBeverageBuilder(freshBuilder);
        barmanFirst.makeBeverage();
        Beverage fresh = barmanFirst.getBeverage();
        System.out.println("\nFresh made by first barman: ");
        System.out.println(fresh.getPrimaryIngredient());
        System.out.println(fresh.getAdditionalIngredient());
        System.out.println(fresh.getIce());


        barmanFirst.setBeverageBuilder(bloodyMaryBuilder);
        barmanFirst.makeBeverage();
        Beverage bloodyMary = barmanFirst.getBeverage();
        System.out.println("\nBloody Mary made by first barmen ");
        System.out.println(bloodyMary.getPrimaryIngredient());
        System.out.println(bloodyMary.getAdditionalIngredient());
        System.out.println(bloodyMary.getIce());

        barmanSecond.setBeverageBuilder(freshBuilder);
        barmanSecond.makeBeverage();
        Beverage freshSecond = barmanSecond.getBeverage();
        System.out.println("\nFresh made by second barman:");
        System.out.println(freshSecond.getPrimaryIngredient());
        System.out.println(freshSecond.getAdditionalIngredient());
        System.out.println(freshSecond.getIce());

        barmanSecond.setBeverageBuilder(bloodyMaryBuilder);
        barmanSecond.makeBeverage();
        Beverage bloodyMarySecond = barmanSecond.getBeverage();
        System.out.println("\nBloody Mary made by second barman:");
        System.out.println(bloodyMarySecond.getPrimaryIngredient());
        System.out.println(bloodyMarySecond.getAdditionalIngredient());
        System.out.println(bloodyMarySecond.getIce());
    }

}
