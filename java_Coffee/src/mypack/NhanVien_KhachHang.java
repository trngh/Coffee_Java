package mypack;

public class NhanVien_KhachHang {
	public NhanVien nv;
	public NhanVien getNv() {
		return nv;
	}
	public void setNv(NhanVien nv) {
		this.nv = nv;
	}
	public KhachHang getKh() {
		return kh;
	}
	public void setKh(KhachHang kh) {
		this.kh = kh;
	}
	public KhachHang kh;
	public NhanVien_KhachHang(KhachHang kh, NhanVien nv) {
		this.nv=nv;
		this.kh=kh;
	}
	
}
