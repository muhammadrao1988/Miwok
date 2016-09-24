package com.example.muhammad.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Muhammad on 9/19/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int activity_color;//the background color which apply on the selected category

    public WordAdapter(Context context, ArrayList<Word> words, int activiy_color) {
        super(context, 0, words);
        this.activity_color = activiy_color;
    }
    /*public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0,words);
    }*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        //check if the existing view is being reused, otherwise inflate the view
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        //get the object of word at the current position in list
        Word currentWord = getItem(position);

            //find the image view in the list_item.xml with the id image
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            //get the image id from the object of Word and set this image on the id image
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }
        //find the linear layout which containg two text area
        LinearLayout textViewLayout = (LinearLayout) listItemView.findViewById(R.id.textViewLayout);
        //fetch color from color resource id
        int color = ContextCompat.getColor(getContext(),this.activity_color);
        //applying color on the layout according to selected category
        textViewLayout.setBackgroundColor(color);
        //find the text view in the list_item.xml with the id default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //get the defualt word from the object of Word and set this text on the id default_text_view
        defaultTextView.setText(currentWord.getDefaultWord());

        //find the text view in the list_item.xml with the id miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //get the miwok word from the object of Word and set this text on the id miwok_text_view
        miwokTextView.setText(currentWord.getMiwokWord());



        //return whole list item contain two text view
        return listItemView;
    }
}
