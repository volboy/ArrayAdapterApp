package com.example.arrayadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //набор данных, которые свяжем со списокм
    String[] countries={"Бразилия", "Аргентина","Колумбия","Чили","Уругвай"};
    private TextView selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //получаем элемент TextView
        selection=findViewById(R.id.itemSelection);
        //получаем элемент ListView
        ListView countriesList=findViewById(R.id.countriesList);

        //создаем адаптер
        ArrayAdapter<String> adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);
        //устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
        //добавляем для списка слушатель
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){

            //по позиции получаем выбранный элемент
            String selectionItem = countries[position];
            //установка текста элемента TextView
            selection.setText(selectionItem);
        }

        });
    }
}
