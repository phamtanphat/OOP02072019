package khoapham.ptp.phamtanphat.oop02072019;

import android.util.Log;

public class Person {
    //thuoc tinh
    private String name;
    private int age;

    //constructor : Phương thức khởi tạo(Điều kiện cần để tạo ra 1 object)
    public Person(String Name , int Age){
        Log.d("BBB",Name );
        Log.d("BBB",String.valueOf(Age));
    }

}
