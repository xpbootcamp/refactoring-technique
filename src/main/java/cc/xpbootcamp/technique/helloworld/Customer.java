package cc.xpbootcamp.technique.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append(generateHeader());
        for (Rental rental : rentals) {
            // show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t")
                    .append(String.valueOf(rental.getCharge())).append("\n");
        }
        return result.append(generateFooter()).toString();
    }

    private String generateHeader() {
        return new StringBuffer().append("Rental Record for ").append(getName()).append("\n").toString();
    }

    private String generateFooter() {
        return new StringBuffer().append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n")
                .append("You earned ").append(String.valueOf(getFrequentRenterPoints())).append(" frequent renter points").toString();
    }

    private int getFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
    }

    private double getTotalCharge() {
        return rentals.stream().mapToDouble(Rental::getCharge).sum();
    }

}
