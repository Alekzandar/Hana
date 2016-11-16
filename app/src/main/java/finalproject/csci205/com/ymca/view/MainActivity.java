package finalproject.csci205.com.ymca.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import finalproject.csci205.com.ymca.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Check if user has opened app before, if they have ship this screen and go
        //to nav act

        Button tempLogin = (Button) findViewById(R.id.tempLogin);
        tempLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NavActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
