package cc.xpbootcamp.helloworld;

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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(getName()).append("\n");

        for (Rental rental : rentals) {
            double thisAmount = 0;

            // determine amounts for each line
            switch (rental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (rental.getDaysRented() > 2) {
                        thisAmount += (rental.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += rental.getDaysRented() * 3;
                    break;
                case Movie.CHILDREN:
                    thisAmount += 1.5;
                    if (rental.getDaysRented() > 3) {
                        thisAmount += (rental.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus  for a two day new release rental
            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            // show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t")
                    .append(String.valueOf(thisAmount)).append("\n");
            totalAmount += thisAmount;
        }
        // add footer lines
        result.append("Amount owed is ").append(String.valueOf(totalAmount)).append("\n");
        result.append("You earned ").append(String.valueOf(frequentRenterPoints)).append(" frequent renter points");
        return result.toString();
    }
}
