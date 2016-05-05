package com.example.actine.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Actine on 05.05.2016.
 */
public class PizzaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int TYPE_HEADER = 1;
    public static final int TYPE_ITEM = 0;

    private Context context;
    private Pizza[] items;

    public PizzaAdapter(Context context, Pizza[] items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View item = LayoutInflater.from(context).inflate(R.layout.item_pizza, parent, false);
            return new PizzaItemHolder(context, item);
        } else if (viewType == TYPE_HEADER) {
            View item = LayoutInflater.from(context).inflate(R.layout.item_header, parent, false);
            return new HeaderHolder(item);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof PizzaItemHolder) {
            ((PizzaItemHolder) holder).setData(items[position - 1]);
        }
    }

    @Override
    public int getItemCount() {
        return items.length + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HEADER;
        } else {
            return TYPE_ITEM;
        }
    }
}
