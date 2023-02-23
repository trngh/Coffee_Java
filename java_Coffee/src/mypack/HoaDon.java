package mypack;

public class HoaDon {
	public int mahoadon;
    public int getMahoadon() {
		return mahoadon;
	}
	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}
	public String getNgayinhoadon() {
		return ngayinhoadon;
	}
	public void setNgayinhoadon(String ngayinhoadon) {
		this.ngayinhoadon = ngayinhoadon;
	}
	public int getGiatrihoadon() {
		return giatrihoadon;
	}
	public void setGiatrihoadon(int giatrihoadon) {
		this.giatrihoadon = giatrihoadon;
	}
	public KhachHang getKh() {
		return kh;
	}
	public void setKh(KhachHang kh) {
		this.kh = kh;
	}
	public String ngayinhoadon;
    public int giatrihoadon;
    public KhachHang kh;
    public HoaDon(int mahoadon, String ngayinhoadon, int giatrihoadon, KhachHang kh)
    {
        this.mahoadon = mahoadon;
        this.ngayinhoadon = ngayinhoadon;
        this.giatrihoadon = giatrihoadon;
        this.kh = kh;
    }
    public HoaDon(HoaDon hd)
    {
        this.mahoadon = hd.mahoadon;
        this.ngayinhoadon = hd.ngayinhoadon;
        this.giatrihoadon = hd.giatrihoadon;
        this.kh=hd.kh;
    }
}
