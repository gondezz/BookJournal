package naufal.uasakb;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Nama:    Naufal Hafizh
 * Kelas:   IF-6
 * NIM:     10119227
 */
public class MainActivity extends AppCompatActivity {

    private Button btnMyReviews;
    private Button btnNewRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the buttons
        btnMyReviews = findViewById(R.id.btn_my_ratings);
        btnNewRating = findViewById(R.id.btn_new_rating);

        // create functionality for button leading to all ratings entered activity
        btnMyReviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyRatingsActivity.class);
                startActivity(intent);
            }
        });

        // create functionality for button leading to new rating activity
        btnNewRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RatingActivity.class);
                startActivity(intent);
            }
        });
    }
}