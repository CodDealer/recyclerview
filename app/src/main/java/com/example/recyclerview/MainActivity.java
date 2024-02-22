package com.example.recyclerview;// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AnimalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AnimalAdapter(getAnimalList());
        recyclerView.setAdapter(adapter);
    }

    private List<Animal> getAnimalList() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(R.drawable.ic_launcher_foreground, "Singa", "Karnivora"));
        animalList.add(new Animal(R.drawable.ic_launcher_foreground, "Kuda", "Herbivora"));
        animalList.add(new Animal(R.drawable.ic_launcher_foreground, "Beruang", "Omnivora"));
        animalList.add(new Animal(R.drawable.ic_launcher_foreground, "Gajah", "Herbivora"));
        animalList.add(new Animal(R.drawable.ic_launcher_foreground, "Harimau", "Karnivora"));
        return animalList;
    }
}
