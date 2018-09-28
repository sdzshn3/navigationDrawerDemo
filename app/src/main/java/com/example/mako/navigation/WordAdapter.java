package com.example.mako.navigation;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder> {


    public View view;
    private ArrayList<Word> mWord;
    private Context mContext;

    public WordAdapter(Context context, ArrayList<Word> words) {
        mContext = context;
        mWord = words;
    }

    @Override
    public int getItemCount() {
        return mWord.size();
    }

    private Word getItem(int position) {
        return mWord.get(position);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Word currentWord = getItem(position);


        //All info variables of places
        String placeTitle = currentWord.getTitle();

        holder.title.setText(placeTitle);


    }



    class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ViewHolder(View listItemView) {
            super(listItemView);
            title = listItemView.findViewById(R.id.title_text_view);
        }
    }

}
