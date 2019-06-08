package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;

@Getter
@AllArgsConstructor
@ToString
public class Pizza {
    private String name;
    private Set<Ingredients> ingredients;
    private int spiciness;
}