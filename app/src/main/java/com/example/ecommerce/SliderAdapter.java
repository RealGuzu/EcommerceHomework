package com.example.ecommerce;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.ecommereceredo.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.util.List;


public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {
    private List<SliderItems> sliderItems;

    private ViewPager2 viewPager2;

    SliderAdapter(List<SliderItems> sliderItems, ViewPager2 viewPager2) {
        this.sliderItems = sliderItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.slide_item_container, parent, false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImage(sliderItems.get(position));
        if (position == sliderItems.size() - 2) {
            // Example of a runnable
            Runnable myRunnable = new Runnable() {
                @Override
                public void run() {
                    // Perform some action when the condition is met
                    // For example, scrolling to a specific position in ViewPager2
                    viewPager2.setCurrentItem(0);
                }
            };

            // Post the runnable to the ViewPager2
            viewPager2.post(myRunnable);
        }
    }


    @Override
    public int getItemCount() {
        return sliderItems.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder {
        private RoundedImageView imageView; // Assuming you have a custom ImageView class

        SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageSlide); // Make sure this ID exists in your layout
        }

        void setImage(SliderItems sliderItem) {
            // Use Glide or Picasso to load image from URL if needed
            imageView.setImageResource(sliderItem.getImage()); // Assuming getImage() returns drawable resource ID
        }
    }
}
