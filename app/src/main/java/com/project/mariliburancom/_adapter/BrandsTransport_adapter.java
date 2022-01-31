package com.project.mariliburancom._adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.mariliburancom.R;
import com.project.mariliburancom._model.ModelBrandsCarTrasnport;

import java.util.ArrayList;

public class BrandsTransport_adapter extends RecyclerView.Adapter<BrandsTransport_adapter.ViewHolder> {

    private ArrayList<ModelBrandsCarTrasnport> mList;

    public BrandsTransport_adapter(ArrayList<ModelBrandsCarTrasnport> list){
        this.mList = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_fg_appbar_transport, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BrandsTransport_adapter.ViewHolder holder, final int position) {
        ModelBrandsCarTrasnport modelBrandsCarTrasnportItem = mList.get(position);

        TextView BrandsCarTransport;

        BrandsCarTransport = holder.item_txtTypeCar;

        BrandsCarTransport.setText(modelBrandsCarTrasnportItem.getBrandsCarTp());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView item_txtTypeCar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.item_txtTypeCar = (TextView) itemView.findViewById(R.id.item_txtTypeCar);
        }
    }
}
