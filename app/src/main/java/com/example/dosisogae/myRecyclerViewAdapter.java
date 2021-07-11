package com.example.dosisogae;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class myRecyclerViewAdapter extends RecyclerView.Adapter {
      String TAG = "RecyclerViewAdapter";

      ArrayList<DataModel> dataModels;
      Context context;

      public myRecyclerViewAdapter(Context context, ArrayList<DataModel> dataModels){
          this.dataModels = dataModels;
          this.context = context;
      }

      @Override
      public int getItemCount() {
          return dataModels.size();
      }

      @NonNull
      @Override
      public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          Log.d(TAG,"onCreateViewHolder");
          View view = LayoutInflater.from(parent.getContext())
                  .inflate(R.layout.itemview,parent,false);
          MyViewHolder viewHolder = new MyViewHolder(view);
          return viewHolder;
      }

      @Override
      public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
          Log.d(TAG,"onBindViewHolder");
          MyViewHolder myViewHolder = (MyViewHolder)holder;
          myViewHolder.textView.setText(dataModels.get(position).getTitle());
          myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(context,"[ "+(String)dataModels.get(position).title.toString()+" ]", Toast.LENGTH_SHORT).show();
                  Intent intent=new Intent(v.getContext(), Main2Activity.class);

                  intent.putExtra("name",dataModels.get(position));

                  context.startActivity(intent);
              }
          });
          myViewHolder.imageView.setImageResource(dataModels.get(position).image_path);
      }

      public class MyViewHolder extends RecyclerView.ViewHolder {
          TextView textView;
          ImageView imageView;
          public MyViewHolder(@NonNull View itemView) {
              super(itemView);
              textView = itemView.findViewById(R.id.textview);
              imageView = itemView.findViewById(R.id.imageview);
          }
      }
}
