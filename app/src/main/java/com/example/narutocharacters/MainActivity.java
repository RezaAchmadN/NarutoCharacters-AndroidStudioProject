package com.example.narutocharacters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Characters> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(CharactersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListCharacterAdapter listCharacterAdapter = new ListCharacterAdapter(this);
        listCharacterAdapter.setListCharacter(list);
        rvCategory.setAdapter(listCharacterAdapter);

        listCharacterAdapter.setOnItemClickCallback(new ListCharacterAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Characters data) {
                showSelectedCharacter(data);
            }
        });
    }

    private void showSelectedCharacter(Characters hero) {
        Toast.makeText(this, "Kamu memilih " + hero.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,CharacterProfile.class);
        String[] data = {hero.getName(),hero.getDescription(),hero.getPhoto()};
        intent.putExtra("data",data);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,MyProfile.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }

}
