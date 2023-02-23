package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Program {
	public static List<BoPhan> dsBophan = new ArrayList<BoPhan>();
    public static List<NhanVien> dsNhanvien = new ArrayList<NhanVien>();
    public static List<KhachHang> dsKhachhang = new ArrayList<KhachHang>();
    public static List<ThucUong> dsThucuong = new ArrayList<ThucUong>();
    public static List<CongViec> dsCongviec = new ArrayList<CongViec>();
    public static List<HoaDon> dsHoadon = new ArrayList<HoaDon>();
    public static List<HoaDon_ThucUong> dsHoadon_thucuong = new ArrayList<HoaDon_ThucUong>();
    public static List<CongViec_BoPhan> dsCongViec_BoPhan = new ArrayList<CongViec_BoPhan>();
    public static List<NhanVien_KhachHang> dsNhanvien_Khachhang = new ArrayList<NhanVien_KhachHang>();
    public static void TaoDSBoPhan()
    {
        dsBophan.add(new BoPhan(0, "thu ngan", null));
        dsBophan.add(new BoPhan(1, "pha che", null));
        dsBophan.add(new BoPhan(2, "phuc vu", null));
    }
    public static void TaoDSNhanVien()
    {
        dsNhanvien.add(new NhanVien(0, "Hoang Van An", dsBophan.get(0)));
        dsNhanvien.add(new NhanVien(1, "Trinh Ngoc Ha", dsBophan.get(0)));
        dsNhanvien.add(new NhanVien(2, "Nguyen Thi Nhu Y", dsBophan.get(0)));
        dsNhanvien.add(new NhanVien(3, "Ho Thanh Tam", dsBophan.get(1)));
        dsNhanvien.add(new NhanVien(4, "Do Thu Thuy", dsBophan.get(1)));
        dsNhanvien.add(new NhanVien(5, "Nguyen Thi Nhu Phuong", dsBophan.get(1)));
        dsNhanvien.add(new NhanVien(6, "Nguyen Hong Ngoc", dsBophan.get(2)));
        dsNhanvien.add(new NhanVien(7, "Phan Thi Huynh Tram", dsBophan.get(2)));
        dsNhanvien.add(new NhanVien(8, "Nguyen Thanh Tam", dsBophan.get(2)));
        dsNhanvien.add(new NhanVien(9, "Nguyen Trung Kien", dsBophan.get(2)));
        dsBophan.get(0).laptruongbophan(dsNhanvien.get(0));
        dsBophan.get(1).laptruongbophan(dsNhanvien.get(4));
        dsBophan.get(2).laptruongbophan(dsNhanvien.get(5));
    }
    public static void TaoDSKhachHang()
    {
        dsKhachhang.add(new KhachHang(0, "Le Trung Nghia", "0352180428"));
        dsKhachhang.add(new KhachHang(1, "Le Trung Truc", "0352180465"));
        dsKhachhang.add(new KhachHang(2, "Le Minh Tri", "0352180111"));
        dsKhachhang.add(new KhachHang(3, "Do Minh Tan", "0352180123"));
    }
    public static void TaoDSHoaDon_KhachHang()
    {
        dsHoadon.add(new HoaDon(0, "24/11/2022", 100000, dsKhachhang.get(0)));
        dsHoadon.add(new HoaDon(1, "24/11/2022", 500000, dsKhachhang.get(0)));
        dsHoadon.add(new HoaDon(2, "24/11/2022", 70000, dsKhachhang.get(1)));
        dsHoadon.add(new HoaDon(3, "24/11/2022", 100000, dsKhachhang.get(1)));
        dsHoadon.add(new HoaDon(4, "24/11/2022", 80000, dsKhachhang.get(1)));
        dsHoadon.add(new HoaDon(5, "24/11/2022", 40000, dsKhachhang.get(2)));
        dsHoadon.add(new HoaDon(6, "24/11/2022", 50000, dsKhachhang.get(2)));
        dsHoadon.add(new HoaDon(7, "24/11/2022", 90000, dsKhachhang.get(3)));
        dsHoadon.add(new HoaDon(8, "24/11/2022", 90000, dsKhachhang.get(3)));
    }
    public static void TaoDSCongViec()
    {
        dsCongviec.add(new CongViec(0, "pha che"));
        dsCongviec.add(new CongViec(1, "kiem tra thuc uong"));
        dsCongviec.add(new CongViec(2, "in hoa don va thu tien"));
        dsCongviec.add(new CongViec(3, "phuc vu"));
        dsCongviec.add(new CongViec(4, "don dep"));
    }
    public static void TaoDSThucUong()
    {
        dsThucuong.add(new ThucUong(0, "ca phe hat rang xay", 15000));
        dsThucuong.add(new ThucUong(1, "Latte", 15000));
        dsThucuong.add(new ThucUong(2, "Capuchino", 15000));
        dsThucuong.add(new ThucUong(3, "Tra sua truyen thong", 15000));
        dsThucuong.add(new ThucUong(4, "Matcha da xay", 15000));
        dsThucuong.add(new ThucUong(5, "Tra sua chocolate", 15000));
        dsThucuong.add(new ThucUong(6, "Tran chau duong den", 15000));
        dsThucuong.add(new ThucUong(7, "Tran chau duong trang", 15000));
    }
    public static void TaoDSHoaDon_ThucUong()
    {
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(0), dsThucuong.get(0)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(0), dsThucuong.get(5)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(1), dsThucuong.get(5)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(2), dsThucuong.get(1)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(2), dsThucuong.get(3)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(2), dsThucuong.get(4)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(3), dsThucuong.get(6)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(3), dsThucuong.get(2)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(4), dsThucuong.get(7)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(5), dsThucuong.get(1)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(5), dsThucuong.get(7)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(6), dsThucuong.get(2)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(7), dsThucuong.get(2)));
        dsHoadon_thucuong.add(new HoaDon_ThucUong(dsHoadon.get(8), dsThucuong.get(3)));
    }
    public static void TaoDSNhanVien_KhachHang()
    {
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(0), dsNhanvien.get(0)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(0), dsNhanvien.get(3)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(0), dsNhanvien.get(6)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(1), dsNhanvien.get(1)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(1), dsNhanvien.get(4)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(1), dsNhanvien.get(7)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(2), dsNhanvien.get(2)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(2), dsNhanvien.get(5)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(2), dsNhanvien.get(8)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(3), dsNhanvien.get(1)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(3), dsNhanvien.get(5)));
        dsNhanvien_Khachhang.add(new NhanVien_KhachHang(dsKhachhang.get(3), dsNhanvien.get(9)));
    }
    public static void TaoDSCongViec_BoPhan()
    {
        dsCongViec_BoPhan.add(new CongViec_BoPhan(dsCongviec.get(0), dsBophan.get(1)));
        dsCongViec_BoPhan.add(new CongViec_BoPhan(dsCongviec.get(1), dsBophan.get(1)));
        dsCongViec_BoPhan.add(new CongViec_BoPhan(dsCongviec.get(2), dsBophan.get(0)));
        dsCongViec_BoPhan.add(new CongViec_BoPhan(dsCongviec.get(3), dsBophan.get(2)));
        dsCongViec_BoPhan.add(new CongViec_BoPhan(dsCongviec.get(4), dsBophan.get(2)));
    }
    public static void Cau1() {
    	List<HoaDon> hd = dsHoadon
    			.stream()
    			.filter(p -> p.giatrihoadon>=70000)
    			.collect(Collectors.toList());
    	
        System.out.println("Danh sach cac hoa don co gia tri tu 70000 tro len:");
        for (HoaDon p: hd) {
        	System.out.println("Ma hoa don: "+p.mahoadon+"          Khach hang:"+p.kh.tenkhachhang);        	
        } 
    }
    public static void Cau2()
    {
    	Map<String, List<HoaDon>> KH = dsHoadon
				.stream()
				.collect(Collectors.groupingBy((HoaDon p)-> p.kh.tenkhachhang));
    	for (Entry<String, List<HoaDon>> kh : KH.entrySet()) {
    		System.out.println("Khach hang: "+kh.getKey().toString()+" 		so hoa don: "+kh.getValue().size());   
    	}
    }
    public static void Cau3() {
    	Map<String, List<HoaDon_ThucUong>> dsthucuong = dsHoadon_thucuong
				.stream()
				.collect(Collectors.groupingBy((HoaDon_ThucUong thucuong) -> thucuong.tu.tenthucuong));

    	int max=0;
    	String tenthucuong = "";
    	for (Entry<String, List<HoaDon_ThucUong>> thucuong : dsthucuong.entrySet()) {
    		if(max < thucuong.getValue().size()) {
    			max = thucuong.getValue().size();
    			tenthucuong = thucuong.getKey().toString();
    		}
    		System.out.println(String.format("Thuc uong: %s, 	So luong da ban: %s", thucuong.getKey().toString(), thucuong.getValue().size()));
    	}
    	System.out.println("Thuc uong duoc mua nhieu nhat: "+tenthucuong+" - So luong mua: "+max);
    }
    public static void Cau4() {
    	List<HoaDon> hd = dsHoadon
    			.stream()
    			.collect(Collectors.toList());
    	int max=0;
    	String tenkh="";
        for (HoaDon p: hd) {
        	if (max <p.giatrihoadon) {
        		max=p.giatrihoadon;
        		tenkh=p.kh.tenkhachhang;
        	}
        } 
        System.out.println("Khach hang co hoa don gia tri cao nhat: "+tenkh+" ("+max+")");
    }
    public static void Cau5() {
    	List<NhanVien_KhachHang> listnv_kh = dsNhanvien_Khachhang
    			.stream()
    			.filter(p -> p.kh.tenkhachhang =="Le Trung Nghia")
    			.collect(Collectors.toList());
        System.out.println("Cac nhan vien da phuc vu khach hang Le Trung Nghia: ");
        for (NhanVien_KhachHang p: listnv_kh) {
        	System.out.println(p.nv.tennhanvien);        	
        } 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaoDSBoPhan();
        TaoDSNhanVien();
        TaoDSKhachHang();
        TaoDSHoaDon_KhachHang();
        TaoDSCongViec();
        TaoDSThucUong();
        TaoDSHoaDon_ThucUong();
        TaoDSNhanVien_KhachHang();
        TaoDSCongViec_BoPhan();
        //tim cac ma hoa don co gia tri lon hon hoac bang 70000
        //Cau1();
        //so hoa don tung khach hang da mua
        //Cau2();
        //thuc uong duoc nhieu khach hang mua nhat
        //Cau3();
        //khach hang có hoa don co gia tri cao nhat 
        //Cau4();
        //cac nhan vien da phuc vu khach hang Le Trung Nghia
        Cau5();
	}

}
