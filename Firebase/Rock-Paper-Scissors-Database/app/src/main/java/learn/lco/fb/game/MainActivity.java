package learn.lco.fb.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button rock, paper, scissor;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference rootRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);

        /*rootRef.setValue("Hello World");
        rootRef.child("user").setValue("Prathamesh");

        rootRef.child("Users").child("01").child("Name").setValue("Prathamesh");
        rootRef.child("Users").child("01").child("Email").setValue("pmutkure009@gmail.com");*/

    }
}
