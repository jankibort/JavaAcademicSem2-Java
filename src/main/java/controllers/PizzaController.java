package controllers;

import builders.PizzaBuilder;
import model.Bill;
import model.Ingredients;
import model.Invoice;
import model.Pizza;

import java.util.HashMap;
import java.util.Map;

public class PizzaController {

    private Map<Pizza, Integer> pizzasToOrder = new HashMap<Pizza, Integer>();

    public PizzaController() {
        printPizza();
        pizzasToOrder.put(pizzaWege, 1);
        pizzasToOrder.put(pizzaCapricciosa, 2);
        makeOrder("ul.Jednorozca 13", pizzasToOrder, true);
    }

    private Pizza pizzaWege = new PizzaBuilder()
            .setName("WEGETARIAN")
            .setIngredients(Ingredients.PEPPER)
            .setIngredients(Ingredients.TOMATO)
            .setIngredients(Ingredients.CHEESE)
            .setSpiciness(0)
            .buildPizza();

    private Pizza pizzaCapricciosa = new PizzaBuilder()
            .setName("CAPRICCIOSA")
            .setIngredients(Ingredients.MUSHROOMS)
            .setIngredients(Ingredients.SAUCE)
            .setIngredients(Ingredients.HAM)
            .setSpiciness(1)
            .buildPizza();

    private Pizza pizzaPepperoni = new PizzaBuilder()
            .setName("PEPPERONI")
            .setIngredients(Ingredients.SALAMI)
            .setIngredients(Ingredients.HOT_PEPPER)
            .setIngredients(Ingredients.ONION)
            .setIngredients(Ingredients.CHEESE)
            .setSpiciness(5)
            .buildPizza();


    private void printPizza() {
        System.out.println(pizzaWege.toString());
        System.out.println(pizzaCapricciosa.toString());
        System.out.println(pizzaPepperoni.toString());
    }

    private Bill makeOrder(String clientAddress, Map<Pizza, Integer> pizzasToOrder, boolean isInvoice) {

        int finalPrice = 0;

        for (Map.Entry<Pizza, Integer> entry : pizzasToOrder.entrySet()) {
            finalPrice = finalPrice + calculatePrice(entry.getKey().getName(), entry.getValue());
        }


        if (!isInvoice) {
            Bill bill = new Bill();
            bill.setFinalPrice(finalPrice);
            bill.setPizzasToOrder(pizzasToOrder);
            System.out.println(bill.toString());
            return bill;
        } else {
            Invoice invoice = new Invoice();
            invoice.setFinalPrice(finalPrice);
            invoice.setPizzasToOrder(pizzasToOrder);
            invoice.setAddress(clientAddress);
            invoice.setCompanyInfo("example info");
            System.out.println(invoice.toString());
            return invoice;
        }
    }

    private int calculatePrice(String name, int size) {
        int price = 0;
        if (name.equals("WEGETARIAN")) {
            if (size == 1) {
                price = 2000;
            } else if (size == 2) {
                price = 2500;
            } else if (size == 3) {
                price = 3000;
            }
        } else if (name.equals("CAPRICCIOSA")) {

            if (size == 1) {
                price = 2200;
            } else if (size == 2) {
                price = 2700;
            } else if (size == 3) {
                price = 3200;
            }
        } else if (name.equals("PEPPERONI")) {
            if (size == 1) {
                price = 2500;
            } else if (size == 2) {
                price = 3000;
            } else if (size == 3) {
                price = 3500;
            }
        }
        return price;
    }

}
