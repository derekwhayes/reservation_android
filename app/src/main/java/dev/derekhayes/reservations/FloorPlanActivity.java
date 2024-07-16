package dev.derekhayes.reservations;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FloorPlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_plan);

        Intent intent = getIntent();
        int numGuests = intent.getIntExtra("numGuests", 6);

        if (numGuests > 4) {
            ImageView table1 = findViewById(R.id.table1);
            table1.setImageResource(R.drawable.grayroundtable);
            ImageView table2 = findViewById(R.id.table2);
            table2.setImageResource(R.drawable.grayroundtable);
            ImageView table3 = findViewById(R.id.table3);
            table3.setImageResource(R.drawable.grayroundtable);
            ImageView table4 = findViewById(R.id.table4);
            table4.setImageResource(R.drawable.grayroundtable);
            ImageView table5 = findViewById(R.id.table5);
            table5.setImageResource(R.drawable.grayroundtable);
            ImageView table6 = findViewById(R.id.table6);
            table6.setImageResource(R.drawable.grayroundtable);
        }
    }

    public void returnToMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}