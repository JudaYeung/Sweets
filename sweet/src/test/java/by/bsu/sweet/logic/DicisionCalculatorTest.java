package by.bsu.sweet.logic;

import by.bsu.sweet.model.GingerbreadMan;
import by.bsu.sweet.model.Darkchocolate;
import by.bsu.sweet.model.Division;
import org.junit.Assert;
import org.junit.Test;

public class DicisionCalculatorTest {
    @Test
    public  void testPrice(){
        Division division = new Division();
        GingerbreadMan gingerbreadMan  = new GingerbreadMan("T1",20,50,"87");
        Darkchocolate darkchocolate = new Darkchocolate("T2",30,80,"1");
        division.add(gingerbreadMan);
        division.add(darkchocolate);
        DivisionCalculator calculator = new DivisionCalculator();
        double priceTotal = calculator.calculateTotalPrice(division);
        Assert.assertEquals(50,priceTotal,0.1);
        }

    @Test
    public  void testWeight(){
        Division division = new Division();
        GingerbreadMan gingerbreadMan = new GingerbreadMan("T1",20,50,"87");
        Darkchocolate darkchocolate = new Darkchocolate("T2",30,100,"1");
        division.add(gingerbreadMan);
        division.add(darkchocolate);
        DivisionCalculator calculator = new DivisionCalculator();
        double priceWeight = calculator.calculateTotalWeight(division);
        Assert.assertEquals(150,priceWeight,0.1);
    }
    }


