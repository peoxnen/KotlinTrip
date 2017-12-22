package iview.wsienski.kotlintrip.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.List;

import iview.wsienski.kotlintrip.Constants;
import iview.wsienski.kotlintrip.R;
import iview.wsienski.kotlintrip.data.inheritance.DogJava;
import iview.wsienski.kotlintrip.data.properties.LanguageJava;
import timber.log.Timber;

/**
 * Created by WSienski on 20/12/2017.
 */

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LanguageJava languageJava = new LanguageJava();
        languageJava.setName("Java");

        TextView msg = findViewById(R.id.message);
        msg.setText(languageJava.getName());

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DogJava dogJava = new DogJava("Rex", "sheep-dog");
                dogJava.greet();
                dogJava.makeCommand("Jump");
                Toast.makeText(getBaseContext(), dogJava.greetingsTxt(), Toast.LENGTH_SHORT).show();
            }
        });

        List<String> items = new ArrayList<>();
        items.add("Kotlin");
        items.add("Java");
        items.add("C++");

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapterJava(items));

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, Constants.Companion.getURL(),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Timber.d(response);
                        Toast.makeText(getBaseContext(), "Request OK", Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getBaseContext(), "Request error", Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(stringRequest);
    }

}
