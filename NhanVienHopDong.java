package entityes.libarary;

public class NhanVienHopDong extends NhanVien{
	private String tenCoQuan;
	private String loaiHopDong;
	private int luongCoBan;
	
	// constructor
	public NhanVienHopDong(String name, int tuoi, String tenCoQuan, String loaiHopDong, int lcb) {
		super(name, tuoi);
		this.tenCoQuan = tenCoQuan;
		this.loaiHopDong = loaiHopDong;
		this.luongCoBan = lcb;
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
		return this.luongCoBan * 0.2;
	}

	@Override
	public String toString() {
		return this.name + "-"+ this.tuoi+"-"+this.loaiHopDong+"-"+this.tenCoQuan+"-"+this.luong();
	}
	
	
}
