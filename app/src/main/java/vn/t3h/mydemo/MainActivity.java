package vn.t3h.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp);
    }

    public void test() {
        if (true) {
            int t = 1;
        } else {
            String s = "2" + "s" + "cv";
        }
    }
}