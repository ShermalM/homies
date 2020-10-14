package humber.college.homies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class edit_profile_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile_layout);
    }

    public void Go_To_Profile(View view){
        Intent intent = new Intent(view.getContext(), profile_page.class);
        startActivityForResult(intent, 0);
    }
}
