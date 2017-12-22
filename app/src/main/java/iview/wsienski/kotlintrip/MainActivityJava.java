package iview.wsienski.kotlintrip;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import iview.wsienski.kotlintrip.data.inheritance.DogJava;

/**
 * Created by WSienski on 20/12/2017.
 */

public class MainActivityJava extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView msg = findViewById(R.id.message);
        msg.setText("Java");

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DogJava dogJava = new DogJava("Rex", "sheep-dog");
                dogJava.greet();
                Toast.makeText(getParent(), dogJava.greetingsTxt(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
