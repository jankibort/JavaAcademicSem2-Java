package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class Bill {
    private Map<Pizza,Integer> pizzasToOrder;
    private int finalPrice;
}
