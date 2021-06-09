package com.example.animelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] anime_name,anime_status;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter (Context context, String[] anime_name, int[] flags, String[] anime_status){
        this.context = context;
        this.anime_name = anime_name;
        this.anime_status = anime_status;
        this.flags = flags;
    }

    public int getCount() {
        return anime_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageViewID);
        TextView textView = convertView.findViewById(R.id.aNameID);
        TextView textView1 = convertView.findViewById(R.id.astatus);

        imageView.setImageResource(flags[position]);
        textView.setText(anime_name[position]);
        textView1.setText(anime_status[position]);

        return convertView;
    }
}
