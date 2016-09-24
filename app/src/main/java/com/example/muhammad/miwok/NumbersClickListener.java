package com.example.muhammad.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Muhammad on 9/16/2016.
 */
public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"Open list of numbers",Toast.LENGTH_SHORT).show();
    }
}
