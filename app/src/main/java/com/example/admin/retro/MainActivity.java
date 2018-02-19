package com.example.admin.retro;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
@SuppressLint("Registered")
public class MainActivity extends AppCompatActivity {

    ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView=findViewById(R.id.List);

        //calling the method to display the infos
        getInfos();
    }

    private void getInfos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<info>> call = api.getInfos();

        call.enqueue(new Callback<List<info>>() {
            @Override
            public void onResponse(@NonNull Call<List<info>> call, @NonNull Response<List<info>> response) {
                List<info> heroList = response.body();

                //Creating an String array for the ListView
                assert heroList != null;
                String[] heroes = new String[heroList.size()];

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < heroList.size(); i++) {
                    heroes[i] = heroList.get(i).getName();
                }


                //displaying the string array into listview
                ListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, heroes));

            }

            @Override
            public void onFailure(@NonNull Call<List<info>> call, @NonNull Throwable t) {
                Log.d("Error", t.toString());
            }
        });
    }

}