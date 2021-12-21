package by.bsu.sweet;

import by.bsu.sweet.logic.DivisionCalculator;
import by.bsu.sweet.model.GingerbreadMan;
import by.bsu.sweet.model.Darkchocolate;
import by.bsu.sweet.model.Division;
import by.bsu.sweet.view.DivisionPrinter;

public class main {

    public static void main(String[] args) {
        Division division = new Division();
        Darkchocolate darkchocolate  = new Darkchocolate("Happy New Year",20,6,"6");
        GingerbreadMan gingerbreadMan = new GingerbreadMan("Merry Christmas",16,10,"9");
        division.add(darkchocolate);
        division.add(gingerbreadMan);

        DivisionPrinter printer = new DivisionPrinter();
        printer.print(division);
        DivisionCalculator calculator = new DivisionCalculator();
        double totalWeight =calculator.calculateTotalWeight(division);
        System.out.println("totalWeight = " + totalWeight);
        System.out.println("DarkchocolateType = " + darkchocolate.getDarkchocolateType());
        double totalPrice =calculator.calculateTotalPrice(division);
        System.out.println("totalPrice = " + totalPrice);
    }
}
