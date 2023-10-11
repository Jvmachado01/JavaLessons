package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain.Country;
import vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain.Currency;
import vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency brazil = CurrencyFactory.newCurrency(Country.BRAZIL);
        Currency usa = CurrencyFactory.newCurrency(Country.USA);

        System.out.println(brazil.getSymbol());
        System.out.println(usa.getSymbol());
    }
}
