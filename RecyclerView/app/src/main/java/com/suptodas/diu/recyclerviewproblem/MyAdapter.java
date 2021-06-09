package com.suptodas.diu.recyclerviewproblem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public static ClickListener clickListener;
    Context context;
    String[] playerName;
    String[] playerDes;
    int[] images;

    public MyAdapter(Context context, String[] playerName, String[] playerDes, int[] images) {
        this.context = context;
        this.playerName = playerName;
        this.playerDes = playerDes;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_view, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(playerName[position]);
        holder.textView1.setText(playerDes[position]);
        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return playerName.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView, textView1;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageViewid);
            textView = itemView.findViewById(R.id.playersNameID);
            textView1 = itemView.findViewById(R.id.playerDesignation);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onItemClick(getBindingAdapterPosition(), view);
        }
    }

    public interface ClickListener{
        public void onItemClick(int position, View view);
    }

    public void setOnItemClickListener(ClickListener clickListener){
        MyAdapter.clickListener = clickListener;
    }
}
