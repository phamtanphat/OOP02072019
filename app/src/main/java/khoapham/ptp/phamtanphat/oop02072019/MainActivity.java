package khoapham.ptp.phamtanphat.oop02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
        Person nguyenvana = new Person();

        Person nguyenvanb = new Person();

    }
}
