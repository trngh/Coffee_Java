package mypack;

public class NhanVien {
	public int manhanvien;
    public String tennhanvien;
    public BoPhan BOPHAN;
    public NhanVien(int manhanvien, String tennhanvien, BoPhan bOPHAN)
    {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        BOPHAN = bOPHAN;
    }
    public NhanVien(NhanVien nv)
    {
        if (nv != null)
        {
            manhanvien = nv.manhanvien;
            tennhanvien = nv.tennhanvien;
            BOPHAN = nv.BOPHAN;
        }
    }
}
