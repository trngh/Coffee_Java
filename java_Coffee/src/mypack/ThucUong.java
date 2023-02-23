package mypack;

public class ThucUong {
	public int mathucuong;
    public int getMathucuong() {
		return mathucuong;
	}
	public void setMathucuong(int mathucuong) {
		this.mathucuong = mathucuong;
	}
	public String getTenthucuong() {
		return tenthucuong;
	}
	public void setTenthucuong(String tenthucuong) {
		this.tenthucuong = tenthucuong;
	}
	public int getGiatien() {
		return giatien;
	}
	public void setGiatien(int giatien) {
		this.giatien = giatien;
	}
	public String tenthucuong;
    public int giatien;
    public ThucUong(int mathucuong, String tenthucuong, int giatien)
    {
        this.mathucuong = mathucuong;
        this.tenthucuong = tenthucuong;
        this.giatien = giatien;
    }
    public ThucUong(ThucUong tu)
    {
        this.mathucuong = tu.mathucuong;
        this.tenthucuong = tu.tenthucuong;
        this.giatien = tu.giatien;
    }
}
