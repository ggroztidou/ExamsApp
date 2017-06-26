package com.example.android.examsapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26/6/2017.
 */

public class MerchantAdapter extends ArrayAdapter<Model> {

    private ArrayList<Model> merchants;
    private Context context;

    public MerchantAdapter(Context context, ArrayList<Model> objects) {
        super(context, 0, objects);
        this.merchants = objects;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;
        Model m = merchants.get(position);

        if(rowView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.listview_merchant_item, null);
            viewHolder = new ViewHolder(rowView);
            rowView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)rowView.getTag();
        }


        viewHolder.legalNameView.setText(m.getLegalName());
        viewHolder.idView.setText(m.getId());
        return  rowView;
    }

    static class ViewHolder {
        public final TextView idView;
        public final TextView legalNameView;


        public ViewHolder(View view){
            idView = (TextView)view.findViewById(R.id.list_merchant_Id);
            legalNameView = (TextView)view.findViewById(R.id.list_merchant_legelName);

        }
    }
}