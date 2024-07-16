package dev.derekhayes.reservations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
                if(numGuests>0 && numGuests<5) {
                    toast=Toast.makeText(this,"thank you for the reservation", Toast.LENGTH_LONG);
                }
                else if(numGuests> 0){
                    toast=Toast.makeText(this,"thank you for the reservation", Toast.LENGTH_LONG);
                }
                else  toast=Toast.makeText(this,"the number of guests must be greater than 0", Toast.LENGTH_LONG);
            }
            toast.show();
        }
        catch (Exception e){
            e.printStackTrace();  }
    }
}
