package fr.utt.if26.isidore_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //String message ="Bonjour IF26";

    /**
     * la méthode onCreate
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx=(TextView)findViewById(R.id.textview);
        //Définition de la variable
        String message="Bonjour IF26";
        tx.setText(message);
        //tx.setText(getResources().);

        //Le bouton
        Button bt=(Button) findViewById(R.id.button_id);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            }
        });
    }
}
