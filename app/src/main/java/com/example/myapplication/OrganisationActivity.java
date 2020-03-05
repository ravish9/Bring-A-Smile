package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class OrganisationActivity extends AppCompatActivity {

 ListView listViewOrganisations;

 List<Organisation> organisationList;
 DatabaseReference databaseOrganisations;
    private DatabaseReference databaseOrgnisations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organisation);

        databaseOrgnisations = FirebaseDatabase.getInstance().getReference("Organisations");

        listViewOrganisations =  findViewById(R.id.listViewOrganisations);
        organisationList= new ArrayList<>();

    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseOrganisations.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot){
                for(DataSnapshot organisationSnapshot : dataSnapshot.getChildren())
                {

                    organisationList.clear();
                    Organisation organisation = organisationSnapshot.getValue(Organisation.class);

                    organisationList.add(organisation);
                }

                OrganisationList adapter = new OrganisationList(OrganisationActivity.this, organisationList);
                listViewOrganisations.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError){

            }
        });
}}
