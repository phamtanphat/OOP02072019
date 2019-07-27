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

//        Nhanvien nhanvien = new Nhanvien("Nguyen Van A",10 ,"Nhan vien cap A");
//        nhanvien.cuchi("Lam viec theo team A");

        //Overide
        //1 : Khong thay đổi ten phương thức , tham số truyền vào , giá trị trả về
        //2 : Khi 2 phương thức khác vị trí

        //Overload
        //1 : Phai thêm xóa hoặc chỉnh sửa kiếu dữ liệu truyền vào
        //2 : 2 phương thức phải cùng nơi tạo ra
        //3 : Có quyền thay đổi giá trị trả về của function , thân hàm
       showLog(1);
    }
    public void showLog(String key){
        Log.d("BBB",key);
    }
    public void showLog(int value){
        Log.d("BBB", String.valueOf(value));
    }
}
