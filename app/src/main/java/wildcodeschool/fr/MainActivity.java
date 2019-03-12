package wildcodeschool.fr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.btn_Send);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText first_name = (EditText) findViewById(R.id.first_name);
                final String firstName = first_name.getText().toString();

                EditText last_name = (EditText) findViewById(R.id.last_name);
                String lastName = last_name.getText().toString();

                Toast.makeText(MainActivity.this, firstName + " " + lastName, Toast.LENGTH_LONG).show();
            }

        });




    }


}
