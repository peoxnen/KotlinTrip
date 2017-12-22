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

import java.util.ArrayList;
import java.util.List;

import iview.wsienski.kotlintrip.R;
import iview.wsienski.kotlintrip.data.inheritance.DogJava;
import iview.wsienski.kotlintrip.data.properties.LanguageJava;

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
    }

}
