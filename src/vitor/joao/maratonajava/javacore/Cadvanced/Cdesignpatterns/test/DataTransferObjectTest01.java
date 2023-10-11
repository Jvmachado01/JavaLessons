package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("B-29");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person.PersonBuilder person = new Person.PersonBuilder().firstName("Lemmy").lastName("Kilmister");
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
