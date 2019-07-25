package khoapham.ptp.phamtanphat.oop02072019;

import android.util.Log;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void info(){
        Log.d("BBB",this.name + " : "+this.age);
    }
    public void cuchi(String hanhdong){
        Log.d("BBB",hanhdong);
    }
}
