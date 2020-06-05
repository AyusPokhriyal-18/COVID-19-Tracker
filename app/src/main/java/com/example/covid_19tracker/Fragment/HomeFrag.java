package com.example.covid_19tracker.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.covid_19tracker.R;
import com.google.gson.JsonObject;

import org.json.JSONException;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFrag extends Fragment {

 TextView totalCase,totalDeath,totalRecov;
 View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    view= inflater.inflate(R.layout.fragment_home, container, false);

   viewInit();
    getDataAPI();
    return view;
    }

    private void getDataAPI() {
        RequestQueue requestQueue= Volley.newRequestQueue(getActivity());

        String url="https://akashraj.tech/corona/api";
        StringRequest stringRequest= new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {

                    JsonObject  jsonObject = new JsonObject(response);
                    totalCase.setText(jsonObject.get("total_cases"));
                    totalDeath.setText(jsonObject.get("total_deaths"));
                    totalRecov.setText(jsonObject.get("total_recovered"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("tag",String.valueOf(error));
                Toast.makeText(getActivity(),""+error,Toast.LENGTH_LONG).show();
            }

    });
    }

    private void viewInit() {
        totalCase=view.findViewById(R.id.cases);
        totalDeath=view.findViewById(R.id.deaths);
        totalRecov=view.findViewById(R.id.recover);
    }
}
