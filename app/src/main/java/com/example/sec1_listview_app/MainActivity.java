package com.example.sec1_listview_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sec1_listview_app.dataaccess.Car;
import com.example.sec1_listview_app.dataaccess.Car_Details;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText searchEditText;
    private Button searchbtn;
    private ListView lstCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dataSetup();

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String car = searchEditText.getText().toString().trim();

                if (!car.isEmpty()) {
                    ArrayAdapter<Car> adapter = (ArrayAdapter<Car>) lstCars.getAdapter();

                    List<Car> searchedCars = new ArrayList<>();
                    for (int i = 0; i < adapter.getCount(); i++) {
                        Car c = adapter.getItem(i);
                        if (c.getName().toLowerCase().contains(car.toLowerCase())) {
                            searchedCars.add(c);
                        }
                    }

                    adapter.clear();
                    adapter.addAll(searchedCars);
                    adapter.notifyDataSetChanged();

                    if (searchedCars.isEmpty()) {
                        Toast.makeText(MainActivity.this, "No cars found", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Car_Details cd = new Car_Details();
                    List<Car> allCars = cd.getCars();
                    ArrayAdapter<Car> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, allCars);
                    lstCars.setAdapter(adapter);
                }
            }
        });

        lstCars.setOnItemClickListener((parent, view, position, id) -> {
            Car clickedCar = (Car) parent.getItemAtPosition(position);

            String msg = "Name: " + clickedCar.getName() + "\n" + "Brand: " + clickedCar.getBrand() + "\n" +
                    "Year: " + clickedCar.getYear() + "\n" + "Price: $" + clickedCar.getPrice() + "\n" +
                    "Description: " + clickedCar.getDescription();

            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
        });
    }

    private void dataSetup() {
        searchEditText = findViewById(R.id.searchEditText);
        searchbtn = findViewById(R.id.searchbtn);
        lstCars = findViewById(R.id.lstCars);

        Car_Details cd = new Car_Details();
        List<Car> cars = cd.getCars();

        ArrayAdapter<Car> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cars);
        lstCars.setAdapter(adapter);
    }
}