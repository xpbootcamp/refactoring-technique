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
        new Fibonacci().calculate(1);
        return new StringBuffer().append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n")
                .append("You earned ").append(String.valueOf(getFrequentRenterPoints())).append(" frequent renter points").toString();
    }

    public class Fibonacci {

        public long calculate(int position) {
            if (position == 1) {
                return 1L;
            }
            return calculate(position - 1)
                    + calculate(position - 2);
        }
    }

    private int getFrequentRenterPoints() {
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental rental : rentals) {
            result += rental.getCharge();
        }
        return result;
    }

}
