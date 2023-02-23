package mypack;

public class BoPhan {
	public int mabophan;
    public int getMabophan() {
		return mabophan;
	}
	public void setMabophan(int mabophan) {
		this.mabophan = mabophan;
	}
	public String getTenbophan() {
		return tenbophan;
	}
	public void setTenbophan(String tenbophan) {
		this.tenbophan = tenbophan;
	}
	public NhanVien getTruongbophan() {
		return truongbophan;
	}
	public void setTruongbophan(NhanVien truongbophan) {
		this.truongbophan = truongbophan;
	}
	public String tenbophan;
    public NhanVien truongbophan;
    public BoPhan(int mabophan, String tenbophan, NhanVien truongbophan)
    {
        this.mabophan = mabophan;
        this.tenbophan = tenbophan;
        this.truongbophan = truongbophan;
    }
    public BoPhan(BoPhan bp)
    {
        mabophan = bp.mabophan;
        tenbophan = bp.tenbophan;
        truongbophan = bp.truongbophan;
    }
    public void laptruongbophan(NhanVien truongbophan)
    {
        this.truongbophan = truongbophan;
    }
}
