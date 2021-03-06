package com.example.favlistapp;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public class CategoryManager {

    private Context mContext;

    public CategoryManager(Context mContext) {
        this.mContext = mContext;
    }

    public void saveCategory(Category category){

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        HashSet itemsHashSet = new HashSet(Arrays.asList(category.getItems()));

        editor.putStringSet(category.getName(), itemsHashSet);

        editor.apply();

    }

    public ArrayList<Category> retrieveCatgories(){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        Map<String, ?> date = sharedPreferences.getAll();

        ArrayList<Category> categories = new ArrayList<>();

        for (Map.Entry<String, ?> entry : date.entrySet()){

            Category category = new Category(entry.getKey(), new ArrayList<String>((HashSet) entry.getValue() ));

            categories.add(category);

        }

        return categories;

    }

}
