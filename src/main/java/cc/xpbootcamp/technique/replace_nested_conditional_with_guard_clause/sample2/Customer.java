package cc.xpbootcamp.technique.replace_nested_conditional_with_guard_clause.sample2;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;
    private Vector<Rental> rentals = new Vector<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    String statement() {
        double totalAmount = 0d;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "：\n");
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            //show figures for this rental
            //determine amounts for each line
            double thisAmount = calculateAmount(each);
            //add frequent renter points
            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;

            //show figures for this rental
            result.append("\t")
                    .append(each.getMovie().getTitle())
                    .append("\t")
                    .append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }
        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return result.toString();
    }

    private double calculateAmount(Rental rental) {
        double thisAmount = 0d;
        Movie movie = rental.getMovie();
        int priceCode = movie.getPriceCode();

        if (movie.isInPromotionPeriod()) {
            if (rental.getDaysRented() < 10) {
                thisAmount = 5;
            } else {
                thisAmount = 100;
            }
        } else {
            if (priceCode == Movie.HISTORY) {
                thisAmount = 2;
                if (rental.getDaysRented() > 2) {
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                }
            }
            if (priceCode == Movie.NEW_RELEASE) {
                thisAmount = rental.getDaysRented() * 3;
            }
            if (priceCode == Movie.CAMPUS) {
                thisAmount = 1.5;
                if (rental.getDaysRented() > 3) {
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                }
            }
        }
        return thisAmount;
    }


}
