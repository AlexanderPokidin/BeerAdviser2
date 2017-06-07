package com.example.asd.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    //Call when the user clicks the button
    public void onClickFindBeer(View view){
        //Get a link to TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Get a link to Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the option selected in Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Print the selected option
        brands.setText(beerType);
        //Get recommendations from the BeerExper class
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandList){
            brandsFormatted.append(brand).append('\n');
        }
        //Print brands of beer
        brands.setText(brandsFormatted);
    }
}
