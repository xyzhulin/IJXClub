package club.ijiaxiang.pojo;

import java.io.Serializable;

/**
 * Created by zhulin on 2017/4/27.
 * description:用户类
 */
public class User implements Serializable {
    private int uid;
    private String uName;
    private String uPwd;
    private String uSex;
    private String uBirthday;
    private int uScore;
    private String uImage;
    private String uPhone;

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuBirthday() {
        return uBirthday;
    }

    public void setuDirthday(String uBirthday) {
        this.uBirthday = uBirthday;
    }

    public int getuScore() {
        return uScore;
    }

    public void setuScore(int uScore) {
        this.uScore = uScore;
    }

    public String getuImage() {
        return uImage;
    }

    public void setuImage(String uImage) {
        this.uImage = uImage;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", uSex='" + uSex + '\'' +
                ", uDirthday='" + uBirthday + '\'' +
                ", uDcore=" + uScore +
                ", uImage='" + uImage + '\'' +
                ", uPhone='" + uPhone + '\'' +
                '}';
    }
}
