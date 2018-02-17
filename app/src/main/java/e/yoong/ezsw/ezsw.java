package e.yoong.ezsw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ezsw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ezsw);
    }
    public void transfer_next(){
        Intent intent = new Intent(getApplicationContext(), s_utype.class);
        startActivity(intent);
    }
    public void submitclicked(View v) {
        transfer_next();
    }
}

