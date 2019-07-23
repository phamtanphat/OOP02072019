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

        //class object
        // Class : Person : Tâp hợp những đói tượng cùng
//            +Thuoc tinh
//            +Hanh vi
        //object : la con cua class
        Person nguyenvana = new Person("Nguyen Van A",20);

        Person nguyenvanb = new Person("Nguyen Van B",30);


    }
}
