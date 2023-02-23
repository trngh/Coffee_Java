package mypack;

public class HoaDon_ThucUong {
	public HoaDon hd;
    public HoaDon getHd() {
		return hd;
	}

	public void setHd(HoaDon hd) {
		this.hd = hd;
	}

	public ThucUong getTu() {
		return tu;
	}

	public void setTu(ThucUong tu) {
		this.tu = tu;
	}

	public ThucUong tu;
    
    public HoaDon_ThucUong(HoaDon hd, ThucUong tu)
    {
        this.hd = hd;
        this.tu = tu;
    }
}
