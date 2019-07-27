package khoapham.ptp.phamtanphat.oop02072019;


import android.util.Log;

public class Nhanvien extends Person{

    String chucvi;

    public Nhanvien(String name, int age , String chucvi) {
        super(name, age);
        this.chucvi = chucvi;
    }


    @Override
    public void cuchi(String hanhdong) {
        Log.d("BBB","Nhan vien " + hanhdong);
    }

}
