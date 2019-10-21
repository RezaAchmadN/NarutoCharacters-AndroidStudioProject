package com.example.narutocharacters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCharacterAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<Characters> listCharacter;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    private ArrayList<Characters> getListCharacter() {
        return listCharacter;
    }

    void setListCharacter(ArrayList<Characters> listCharacter) {
        this.listCharacter = listCharacter;
    }

    ListCharacterAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.characters_fragment, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {
        final CategoryViewHolder viewHolder = (CategoryViewHolder) holder;
        viewHolder.tvName.setText(getListCharacter().get(position).getName());

        Glide.with(context)
                .load(getListCharacter().get(position).getPhoto())
                .apply(new RequestOptions().override(65, 65))
                .into(viewHolder.imgPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listCharacter.get(holder.getAdapterPosition()));
            }
        });
    }


    @Override
    public int getItemCount() {
        return getListCharacter().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Characters data);
    }
}
