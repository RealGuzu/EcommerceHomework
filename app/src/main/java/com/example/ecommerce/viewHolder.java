package com.example.ecommerce;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommereceredo.R;

public class viewHolder
    extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView category,desc;

    View view;

    public viewHolder(@NonNull View itemView) {
        super(itemView);
        category
                =(TextView) itemView
                .findViewById(R.id.txtApparel);
        desc
            =(TextView) itemView
                .findViewById(R.id.txtDesc);
        imageView
                = (ImageView) itemView
                .findViewById(R.id.eImage);

        view = itemView;
    }
}
