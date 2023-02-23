package mypack;

public class KhachHang {
	public int makhachhang;
	public String tenkhachhang;
    public String sdt;
    public int getMakhachhang() {
		return makhachhang;
	}
	public void setMakhachhang(int makhachhang) {
		this.makhachhang = makhachhang;
	}
	public String getTenkhachhang() {
		return tenkhachhang;
	}
	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
    public KhachHang(int makhachhang, String tenkhachhang, String sdt)
    {
        this.makhachhang = makhachhang;
        this.tenkhachhang = tenkhachhang;
        this.sdt = sdt;
    }
    public KhachHang(KhachHang kh)
    {
        this.makhachhang = kh.makhachhang;
        this.tenkhachhang = kh.tenkhachhang;
        this.sdt = kh.sdt;
    }
}
