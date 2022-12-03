package com.example.slovarsluha.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.slovarsluha.R;
import com.example.slovarsluha.RecyclerViewInterface;
import com.example.slovarsluha.model.CategoryItems;

import java.util.ArrayList;
import java.util.List;

public class CategoryItemsAdapter extends RecyclerView.Adapter<CategoryItemsAdapter.CategoryItemsViewHolder> {

    private final RecyclerViewInterface recyclerViewInterface;
    Context context;
    List<CategoryItems> categoryItemsList;

    public CategoryItemsAdapter(Context context, List<CategoryItems> categoryItemsList,
                                RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.categoryItemsList = categoryItemsList;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public CategoryItemsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View categoryItemsItem = LayoutInflater.from(context).inflate(R.layout.category_items_item, viewGroup, false);
        return new CategoryItemsViewHolder(categoryItemsItem, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemsViewHolder categoryItemsViewHolder, int i) {
        categoryItemsViewHolder.textViewNameItems.setText(categoryItemsList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return categoryItemsList.size();
    }

    public void filterList(ArrayList<CategoryItems> filteredList) {
        categoryItemsList = filteredList;
        notifyDataSetChanged();
    }


    public static final class CategoryItemsViewHolder extends RecyclerView.ViewHolder {

        TextView textViewNameItems;

        public CategoryItemsViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            textViewNameItems = itemView.findViewById(R.id.textViewNameItems);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recyclerViewInterface != null){
                        int position = getAdapterPosition();

                        if (position != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
