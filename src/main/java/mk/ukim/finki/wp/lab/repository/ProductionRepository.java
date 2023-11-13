package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Production;

import java.util.ArrayList;
import java.util.List;

public class ProductionRepository {
    private List<Production> productions = new ArrayList<>();

    public ProductionRepository() {
        initializeProductions();
    }
    private void initializeProductions() {
        // Add your logic to create and add 5 film productions to the list
        // For example:
        for (int i = 1; i <= 5; i++) {
            Production production = new Production();
            production.setId((long) i);
            production.setName("Production " + i);
            production.setCountry("Country " + i);
            production.setAddress("Address " + i);

            // Add the production to the list
            productions.add(production);
        }
    }
    public List<Production> findAll() {
        return productions;
    }
}
