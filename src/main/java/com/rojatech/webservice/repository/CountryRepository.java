package com.rojatech.webservice.repository;

import com.rojatech.webservice.Country;
import com.rojatech.webservice.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;
@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);
        countries.put(spain.getName(), spain);

        Country france = new Country();
        france.setName("France");
        france.setCapital("Paris");
        france.setCurrency(Currency.EUR);
        france.setPopulation(60704314);
        countries.put(france.getName(), france);

        Country us = new Country();
        us.setName("US");
        us.setCapital("Washington");
        us.setCurrency(Currency.USD);
        us.setPopulation(946704314);
        countries.put(spain.getName(), us);

        Country india = new Country();
        india.setName("India");
        india.setCapital("New Delhi");
        india.setCurrency(Currency.INR);
        india.setPopulation(120000000);
        countries.put(india.getName(), india);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);
        countries.put(poland.getName(), poland);

        Country uk = new Country();
        poland.setName("UK");
        poland.setCapital("London");
        poland.setCurrency(Currency.GBP);
        poland.setPopulation(78186860);
        countries.put(uk.getName(), uk);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        System.out.println(countries);
        return countries.get(name);
    }
}
