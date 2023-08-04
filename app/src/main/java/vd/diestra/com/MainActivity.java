package vd.diestra.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import vd.diestra.com.application.view.fragments.MainDetailsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new MainDetailsFragment())
                    .commit();
        }
    }
}