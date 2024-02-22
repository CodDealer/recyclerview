package com.example.recyclerview;// AnimalAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private List<Animal> animalList;

    public AnimalAdapter(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.imageViewAnimal.setImageResource(animal.getImageId());
        holder.textViewAnimalName.setText(animal.getName());
        holder.textViewAnimalType.setText(animal.getType());
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    static class AnimalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewAnimal;
        TextView textViewAnimalName;
        TextView textViewAnimalType;

        AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewAnimal = itemView.findViewById(R.id.imageViewAnimal);
            textViewAnimalName = itemView.findViewById(R.id.textViewAnimalName);
            textViewAnimalType = itemView.findViewById(R.id.textViewAnimalType);
        }
    }
}
