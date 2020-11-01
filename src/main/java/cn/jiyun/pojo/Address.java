package cn.jiyun.pojo;

public class Address {
    private int aid;
    private String aname;
    private int pid;


    public Address(int aid, String aname, int pid) {
        this.aid = aid;
        this.aname = aname;
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", pid=" + pid +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Address() {
    }
}
