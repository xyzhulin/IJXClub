package club.ijiaxiang.pojo;

import java.io.Serializable;

public class Manager implements Serializable{
    private int mid;
    private String mname;
    private String msex;
    private String mpwd;
    private int mpower;
    private String mregTime;
    private String mimage;
    private String mphone;

    public Manager() {
        // TODO Auto-generated constructor stub
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMsex() {
        return msex;
    }

    public void setMsex(String msex) {
        this.msex = msex;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    public int getMpower() {
        return mpower;
    }

    public void setMpower(int mpower) {
        this.mpower = mpower;
    }

    public String getMregTime() {
        return mregTime;
    }

    public void setMregTime(String mregTime) {
        this.mregTime = mregTime;
    }

    public String getMimage() {
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    @Override
    public String toString() {
        return "Manager [mid=" + mid + ", mname=" + mname + ", msex=" + msex + ", mpwd=" + mpwd + ", mpower=" + mpower
                + ", mregTime=" + mregTime + ", mimage=" + mimage + ", mphone=" + mphone + "]";
    }


}
