package mypack;

public class CongViec_BoPhan {
	public CongViec cv;
	public CongViec getCv() {
		return cv;
	}
	public void setCv(CongViec cv) {
		this.cv = cv;
	}
	public BoPhan getBp() {
		return bp;
	}
	public void setBp(BoPhan bp) {
		this.bp = bp;
	}
	public BoPhan bp;
	public CongViec_BoPhan(CongViec cv, BoPhan bp) {
		this.cv=cv;
		this.bp=bp;
	}
	
}
