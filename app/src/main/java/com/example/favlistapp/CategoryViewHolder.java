package com.example.favlistapp;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    private TextView nbrCat;
    private TextView nameCate;

    public CategoryViewHolder(View view){
        super(view);

        nbrCat = view.findViewById(R.id.catNbr);
        nameCate = view.findViewById(R.id.catName);

    }

    public TextView getNbrCat() {
        return nbrCat;
    }

    public TextView getNameCate() {
        return nameCate;
    }
}
