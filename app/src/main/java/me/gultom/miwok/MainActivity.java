package me.gultom.miwok;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMenuListeners();
    }

    @Override
    public void onClick(View view) {
        Class activityClass = null;
        if (view.getId() == R.id.numbers) {
            activityClass = NumbersActivity.class;
        } else if (view.getId() == R.id.family) {
            activityClass = FamilyActivity.class;
        } else if (view.getId() == R.id.colors) {
            activityClass = ColorsActivity.class;
        } else if (view.getId() == R.id.phrases) {
            activityClass = PhrasesActivity.class;
        }
        startActivity(new Intent(this, activityClass));
    }


    private void setMenuListeners() {
        findViewById(R.id.numbers).setOnClickListener(this);
        findViewById(R.id.family).setOnClickListener(this);
        findViewById(R.id.colors).setOnClickListener(this);
        findViewById(R.id.phrases).setOnClickListener(this);
    }

}
