package net.fuzui.StudentInfo.pojo;

public class StudentCourse {
    private int id;
    private int Sid;
    private int Cid;
    private int Tid;
    private int credits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public int getTid() {
        return Tid;
    }

    public void setTid(int tid) {
        Tid = tid;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


}
