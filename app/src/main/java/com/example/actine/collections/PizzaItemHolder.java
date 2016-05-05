package com.example.actine.collections;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Actine on 05.05.2016.
 */
public class PizzaItemHolder extends RecyclerView.ViewHolder {

    private final Context context;
    private final TextView name;
    private final TextView price;
    private final ImageView photo;

    private Pizza pizza;

    public PizzaItemHolder(final Context context, View itemView) {
        super(itemView);
        this.context = context;
        name = (TextView) itemView.findViewById(R.id.name);
        price = (TextView) itemView.findViewById(R.id.price);
        photo = (ImageView) itemView.findViewById(R.id.photo);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Вибрано піцу: " + pizza.name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setData(Pizza p) {
        pizza = p;
        name.setText(p.name);
        price.setText(String.format("%d ₴", p.price));
    }

}
