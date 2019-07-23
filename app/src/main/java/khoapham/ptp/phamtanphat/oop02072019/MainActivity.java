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
        // Hocsinh
//            +Ten : String
//            +Lop  : int
//            +Maso : int
//        Nhập mã số thì 2 đơn vi đầu tiên = đơn vị của lớp
//             Điều kiện đúng : 11 == Lop 11 => truyền đúng
//                + maso == malop
//                + 0< maso <13
//             Điều kiện sai : còn lại
//                Log.d("BBB","Giá trị không chính xác");
//                Maso = lop
//         Nhanvien
//            +Idnhanvien : int
//            +Ten      : String
//            +Giolamviec    : int
//            +Calamviec : String
//            Nhân viên
//             Điều kiện đúng :
//                Giolamviec : 7h
//                calamviec : sáng hoặc tối
//                + 7h - 17h ca sáng
//                + 18h - 6h ca tối
//            Điều kiện sai
//                + Mặc định làm ca sáng
//                + Giờ làm việc 7h sáng
    }
}
