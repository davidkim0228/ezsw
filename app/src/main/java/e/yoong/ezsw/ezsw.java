package e.yoong.ezsw;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

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

        ParseObject abc = new ParseObject("Request");
        abc.put("myNumber", "123");
        abc.saveInBackground();
        transfer_next();
    }
}

