package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.TextView;

import androidx.annotation.NonNull;


import com.example.myapplication.R;

import java.util.*;

public class OrganisationList extends ArrayAdapter {

    private Activity context;
    private List<Organisation> organisationList;



    public OrganisationList(Activity context, List<Organisation> organisationList) {

        super(context, R.layout.list_layout, organisationList);
        this.context=context;
        this.organisationList=organisationList;


    }


    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewName= (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewGenre= (TextView) listViewItem.findViewById(R.id.textViewGenre);


        Organisation organisation = organisationList.get(position);

        textViewName.setText(organisation.getOrganisationName());
        textViewGenre.setText(organisation.getOrganisationAddress());

        return listViewItem;

    }


}
