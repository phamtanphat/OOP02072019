package khoapham.ptp.phamtanphat.oop02072019;

import android.util.Log;

public class Hocsinh {
    private String ten;
    private int lop;
    private int maso;

    public Hocsinh(String ten, int lop, int maso) {
        if (maso <= 0 || maso >12){
            maso = 1;
        }else if(lop <= 0 || lop > 12){
            lop = 1;
        }else{
            if (lop > 0 && lop < 13){
                maso = lop;
            }
        }
        this.ten = ten;
        this.lop = lop;
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }
}
