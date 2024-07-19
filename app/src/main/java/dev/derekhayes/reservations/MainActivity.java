package dev.derekhayes.reservations;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton(View view) {
        EditText et=(EditText)findViewById(R.id.editText);
        try {
            Toast toast;
            int numGuests = Integer.parseInt(et.getText().toString());
            if(numGuests>6) {
                toast=Toast.makeText(this,"please call 123-456-7890 to make a reservation for parties larger than 6",
                        Toast.LENGTH_LONG);
            }
            else {
                if(numGuests>0 && numGuests<7) {
                    toast=Toast.makeText(this,"thank you for the reservation", Toast.LENGTH_LONG);

                    Intent intent = new Intent(this, FloorPlanActivity.class);
                    intent.putExtra("numGuests", numGuests);
                    startActivity(intent);
                }
                else  toast=Toast.makeText(this,"the number of guests must be greater than 0", Toast.LENGTH_LONG);
            }
            toast.show();
        }
        catch (Exception e){
            e.printStackTrace();  }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.help) {
            Intent intent = new Intent(this, HelpActivity.class);
            this.startActivity(intent);
            return true;
        }
        else if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(this, AboutActivity.class);
            this.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
