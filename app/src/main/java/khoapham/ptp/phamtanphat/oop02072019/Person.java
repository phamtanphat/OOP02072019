package khoapham.ptp.phamtanphat.oop02072019;

import android.util.Log;

public class Person {
    //thuoc tinh
    private String name;
    private int age;

//    //constructor : Phương thức khởi tạo(Điều kiện cần để tạo ra 1 object)
//    public Person(String name , int age){
////        Log.d("BBB",Name );
////        Log.d("BBB",String.valueOf(Age));
//        this.name = name;
//        this.age = age;
//
//    }
//    //them xóa sửa dữ liệu
//    public void setName(String name){
//        if (name == ""){
//            this.name = "Teo";
//        }
//        this.name = name;
//    }
//    //Lay dữ liệu
//    public String getName(){
//        return name;
//    }
    //Alt + ínert
//    https://medium.com/mindorks/11-android-studio-shortcuts-every-android-developer-must-know-a153e736e611
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
