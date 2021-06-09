package com.suptodas.diu.recyclerviewproblem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] flags = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,
            R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9,
            R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14,
            R.drawable.p15, R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19,
            R.drawable.p20, R.drawable.p21, R.drawable.p22, R.drawable.p23, R.drawable.p24};
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] player_names = getResources().getStringArray(R.array.players_name);
        String[] player_designation = getResources().getStringArray(R.array.Player_designation);

        recyclerView = findViewById(R.id.recyclerViewId);
        myAdapter = new MyAdapter(this, player_names, player_designation, flags);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new  LinearLayoutManager(this));

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View view) {
                if(position==0) {
                    String[] player_details = getResources().getStringArray(R.array.stegen);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[0]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==1) {

                    String[] player_details = getResources().getStringArray(R.array.dest);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[1]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==2) {

                    String[] player_details = getResources().getStringArray(R.array.pique);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[2]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==3) {

                    String[] player_details = getResources().getStringArray(R.array.araujo);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[3]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==4) {

                    String[] player_details = getResources().getStringArray(R.array.busquets);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[4]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==5) {

                    String[] player_details = getResources().getStringArray(R.array.alena);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[5]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==6) {

                    String[] player_details = getResources().getStringArray(R.array.griezmann);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[6]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==7) {

                    String[] player_details = getResources().getStringArray(R.array.pjanic);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[7]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==8) {

                    String[] player_details = getResources().getStringArray(R.array.braithwaite);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[8]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==9) {

                    String[] player_details = getResources().getStringArray(R.array.messi);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[9]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==10) {

                    String[] player_details = getResources().getStringArray(R.array.dembele);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[10]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==11) {

                    String[] player_details = getResources().getStringArray(R.array.puig);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[11]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==12) {

                    String[] player_details = getResources().getStringArray(R.array.neto);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[12]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==13) {

                    String[] player_details = getResources().getStringArray(R.array.coutinho);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[13]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==14) {

                    String[] player_details = getResources().getStringArray(R.array.lenglet);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[14]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==15) {

                    String[] player_details = getResources().getStringArray(R.array.pedri);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[15]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==16) {

                    String[] player_details = getResources().getStringArray(R.array.trincao);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[16]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==17) {

                    String[] player_details = getResources().getStringArray(R.array.alba);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[17]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==18) {

                    String[] player_details = getResources().getStringArray(R.array.matheus);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[18]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==19) {

                    String[] player_details = getResources().getStringArray(R.array.roberto);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[19]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==20) {

                    String[] player_details = getResources().getStringArray(R.array.jong);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[20]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==21) {

                    String[] player_details = getResources().getStringArray(R.array.fati);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[21]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==22) {

                    String[] player_details = getResources().getStringArray(R.array.umtiti);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[22]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                if(position==23) {

                    String[] player_details = getResources().getStringArray(R.array.junior);
                    Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("image", String.valueOf(flags[23]));
                    extras.putStringArray("details", player_details);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
            }
        });

    }
}