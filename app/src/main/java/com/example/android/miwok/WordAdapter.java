package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Michael Peterson on 7/23/2016.
 */
public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Context context, int resource,  ArrayList<Word> words) {
        super(context, resource, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        return super.getView(position, convertView, parent);
    }
}
