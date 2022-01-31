package com.project.mariliburancom._adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.mariliburancom.R;
import com.project.mariliburancom._model.ModelTransport;

import java.util.ArrayList;

public class Transportasi_adapter extends RecyclerView.Adapter<Transportasi_adapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ModelTransport> mList;

//    public Transportasi_adapter(Context context, ArrayList<ModelTransport> list){
//        this.mContext = context;
//        this.mList = list;
//    }

    public Transportasi_adapter(ArrayList<ModelTransport> list) {
        this.mList = list;
    }

//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
//        View view = layoutInflater.inflate(R.layout.rv_fg_transportation_item, parent,false);

//        ViewHolder viewHolder = new ViewHolder(view);
//        return viewHolder;
//    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_fg_transportation_item, parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Transportasi_adapter.ViewHolder holder, final int position) {

        ModelTransport transportItem = mList.get(position);

        ImageView image = holder.item_image;
        TextView carsName, typeTransmisi, priceRent, include, seeDetil;

        carsName = holder.item_cars_name;
        typeTransmisi = holder.item_type_transmisi;
        priceRent = holder.item_price_rent;
        include = holder.item_include;
        seeDetil = holder.item_detil;

        image.setImageResource(transportItem.getImage());

        carsName.setText(transportItem.getCarsName());
        typeTransmisi.setText(transportItem.getTypeTransmisi());
        priceRent.setText(transportItem.getPriceRent());
        include.setText(transportItem.getInclude());
        seeDetil.setText(transportItem.getSeeDetil());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView item_image;
        TextView item_cars_name, item_type_transmisi, item_price_rent, item_include, item_detil;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.item_image = (ImageView) itemView.findViewById(R.id.item_image);

            this.item_cars_name = (TextView) itemView.findViewById(R.id.item_cars_name);
            this.item_type_transmisi = (TextView) itemView.findViewById(R.id.item_type_transmisi);
            this.item_price_rent = (TextView) itemView.findViewById(R.id.item_price_rent);
            this.item_include = (TextView) itemView.findViewById(R.id.item_include);
            this.item_detil = (TextView) itemView.findViewById(R.id.item_detil);


        }
    }
}
