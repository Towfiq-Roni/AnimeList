package com.suptodas.diu.recyclerviewproblem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetailsActivity extends AppCompatActivity {

    String[] playerDetails;
    String imageId;
    ImageView imageView;
    TextView name, details, born, height,nationality,spouse,salary,current_team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        Intent intent = getIntent();
        playerDetails = intent.getStringArrayExtra("details");
        imageId = intent.getStringExtra("image");
        int id = Integer.parseInt(imageId);

        imageView = findViewById(R.id.playerImage);
        name = findViewById(R.id.p_name);
        details = findViewById(R.id.p_details);
        born = findViewById(R.id.p_born);
        height = findViewById(R.id.p_height);
        nationality = findViewById(R.id.p_nationality);
        spouse = findViewById(R.id.p_spouse);
        salary = findViewById(R.id.p_salary);
        current_team = findViewById(R.id.p_currentTeam);

        imageView.setImageResource(id);
        name.setText(playerDetails[0]);
        details.setText(playerDetails[1]);
        born.setText(playerDetails[2]);
        height.setText(playerDetails[3]);
        nationality.setText(playerDetails[4]);
        spouse.setText(playerDetails[5]);
        salary.setText(playerDetails[6]);
        current_team.setText(playerDetails[7]);
    }
}