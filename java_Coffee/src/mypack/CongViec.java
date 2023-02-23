package mypack;

public class CongViec {
	public int macongviec;
    public int getMacongviec() {
		return macongviec;
	}
	public void setMacongviec(int macongviec) {
		this.macongviec = macongviec;
	}
	public String getNoidungcongviec() {
		return noidungcongviec;
	}
	public void setNoidungcongviec(String noidungcongviec) {
		this.noidungcongviec = noidungcongviec;
	}
	public String noidungcongviec;
    public CongViec(int macongviec, String noidungcongviec)
    {
        this.macongviec = macongviec;
        this.noidungcongviec = noidungcongviec;
    }
    public CongViec(CongViec cv)
    {
        macongviec = cv.macongviec;
        noidungcongviec = cv.noidungcongviec;
    }
}
