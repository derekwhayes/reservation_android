package dev.derekhayes.reservations;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class FloorPlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_plan);

        Intent intent = getIntent();
        int numGuests = intent.getIntExtra("numGuests", 6);

        if (numGuests <= 4) {
            TextView testTextView = findViewById(R.id.test);
            testTextView.setText(getResources().getString(R.string.test, numGuests));
        }
    }
}