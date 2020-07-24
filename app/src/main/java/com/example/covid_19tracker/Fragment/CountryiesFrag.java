package com.example.covid_19tracker.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.covid_19tracker.R;
import com.example.covid_19tracker.adapter.CountryAdapter;
import com.example.covid_19tracker.adapter.StateAdapter;
import com.example.covid_19tracker.model.CountryModel;
import com.example.covid_19tracker.model.StateModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CountryiesFrag extends Fragment {

    public CountryiesFrag() {
        // Required empty public constructor
    }
    RecyclerView recyclerView;
    ArrayList<CountryModel>arrayList;

View view;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_countryies, container, false);
    getdata();
        return view;
    }
    private void init(){
        recyclerView=view.findViewById(R.id.rrecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CountryAdapter countryAdapter= new CountryAdapter(arrayList);
        recyclerView.setAdapter(countryAdapter);
    }

    private void getdata() {
        String url="https://2019ncov.asia/api/country_region";
        arrayList=new ArrayList<>();
        StringRequest stringRequest= new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject=new JSONObject(response);
                    JSONArray jsonArray=jsonObject.getJSONArray("results");
                    for(int i=0;i<jsonArray.length(); i++){
                        JSONObject data= jsonArray.getJSONObject(i);
                        arrayList.add(new CountryModel(data.getString("country_region"),  data.getString("confirmed")));
                    }init();

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(getActivity(),""+e,Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("tag",String.valueOf(error));
                Toast.makeText(getActivity(),""+error,Toast.LENGTH_LONG).show();
            }

        });
        Volley.newRequestQueue(getActivity()).add(stringRequest);
    }

}
}
