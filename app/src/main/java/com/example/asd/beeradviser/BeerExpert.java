package com.example.asd.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asd on 31.05.2017.
 */

public class BeerExpert {
    List<String> getBrands (String color){
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else {
            brands.add("Jail Pale Ali");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
