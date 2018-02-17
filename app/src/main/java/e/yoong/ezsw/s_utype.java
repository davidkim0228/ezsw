package e.yoong.ezsw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class s_utype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_utype);
    }

    public void transfer_next(){
        Intent intent = new Intent(getApplicationContext(), s_dining.class);
        startActivity(intent);
    }
    public void buyclicked(View v) {
        transfer_next();
    }
    public void sellclicked(View v){
        transfer_next();
    }
}
