package com.example.ecommerce;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.slider.Slider;

public class SliderAdapter {
    class SliderViewHolder extends RecyclerView.ViewHolder {
        private  RoundedImageView imageView;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
