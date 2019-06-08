package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice extends Bill {
    private String address;
    private String companyInfo;

    @Override
    public String toString() {
        return "Invoice{" +
                "pizzasToOrder='" + super.getPizzasToOrder() + '\'' +
                "price='" + super.getFinalPrice() + '\'' +
                "address='" + address + '\'' +
                ", companyInfo='" + companyInfo + '\'' +
                '}';
    }
}
