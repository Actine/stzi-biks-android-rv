package com.example.actine.collections;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pizza[] pizzas = {
                new Pizza("Маргарита", 50, R.drawable.pizza_1),
                new Pizza("Салямі", 60, R.drawable.pizza_2),
                new Pizza("М’ясна", 70, R.drawable.pizza_3),
                new Pizza("Гавайська", 55, R.drawable.pizza_1),
                new Pizza("Кальцоне", 60, R.drawable.pizza_3),
                new Pizza("Квадро формаджо", 80, R.drawable.pizza_4),
                new Pizza("Чілі", 60, R.drawable.pizza_2),
                new Pizza("Маргарита", 50, R.drawable.pizza_1),
                new Pizza("Салямі", 60, R.drawable.pizza_2),
                new Pizza("М’ясна", 70, R.drawable.pizza_3),
                new Pizza("Гавайська", 55, R.drawable.pizza_1),
                new Pizza("Кальцоне", 60, R.drawable.pizza_3),
                new Pizza("Квадро формаджо", 80, R.drawable.pizza_4),
                new Pizza("Чілі", 60, R.drawable.pizza_2),
                new Pizza("Маргарита", 50, R.drawable.pizza_1),
                new Pizza("Салямі", 60, R.drawable.pizza_2),
                new Pizza("М’ясна", 70, R.drawable.pizza_3),
                new Pizza("Гавайська", 55, R.drawable.pizza_1),
                new Pizza("Кальцоне", 60, R.drawable.pizza_3),
                new Pizza("Квадро формаджо", 80, R.drawable.pizza_4),
                new Pizza("Чілі", 60, R.drawable.pizza_2),
                new Pizza("Маргарита", 50, R.drawable.pizza_1),
                new Pizza("Салямі", 60, R.drawable.pizza_2),
                new Pizza("М’ясна", 70, R.drawable.pizza_3),
                new Pizza("Гавайська", 55, R.drawable.pizza_1),
                new Pizza("Кальцоне", 60, R.drawable.pizza_3),
                new Pizza("Квадро формаджо", 80, R.drawable.pizza_4),
                new Pizza("Чілі", 60, R.drawable.pizza_2),
        };

        RecyclerView pizzaList = (RecyclerView) findViewById(R.id.pizza_list);
        pizzaList.setAdapter(new PizzaAdapter(this, pizzas));
        pizzaList.setLayoutManager(new LinearLayoutManager(this));
    }
}
