package entityes.libarary;

public class NhanVienThucTap extends NhanVien {
	private String tenCoQuan;
	private String loaiHopDong;
	private int luongCoBan;
	private int luongPhuCap;
	// constructor
	public NhanVienThucTap(String name, int tuoi, String tenCoQuan, String loaiHopDong, int luongCoBan,int luongPhuCap) {
		super(name, tuoi);
		this.tenCoQuan = tenCoQuan;
		this.loaiHopDong = loaiHopDong;
		this.luongCoBan = luongCoBan;
		this.luongPhuCap = luongPhuCap;
	}

	@Override
	public String tenCoQuan() {
		return tenCoQuan;
	}

	@Override
	public String LoaiHopDong() {
		return loaiHopDong;
	}

	@Override
	public Double luong() {
		return (double) (this.luongCoBan + this.luongPhuCap);
	}

	@Override
	public String toString() {
		return this.name + "-"+ this.tuoi+"-"+this.loaiHopDong+"-"+this.tenCoQuan+"-"+this.luong();
	}
	
}
