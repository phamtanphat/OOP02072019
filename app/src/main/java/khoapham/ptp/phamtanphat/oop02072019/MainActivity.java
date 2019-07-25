package khoapham.ptp.phamtanphat.oop02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nhanvien nhanvien = new Nhanvien("Nguyen Van A",10 ,"Nhan vien cap A");



    }
}
