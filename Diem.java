package src;

public class Diem {
	private String tenHp;
	private int soTC;
	private int chuyenCan,giuaKy,cuoiKy;
	
	public Diem(String name, int TC, int CC,int GK, int CK) {
		this.tenHp = name;
		this.soTC = TC;
		this.chuyenCan = CC;
		this.giuaKy = GK;
		this.cuoiKy = CK;
	}
	
	public double tinhDiem() {
		return ((this.chuyenCan*0.1)+ (this.giuaKy * 0.2) + (this.cuoiKy * 0.7));
	}
	
	public int getSoTC() {
		return this.soTC;
	}
	
	public String getTenHP() {
		return this.tenHp;
	}
	
	public int getChuyenCan() {
		return this.chuyenCan;
	}
	
	public int getGiuaKy() {
		return this.giuaKy;
	}
	
	public int getCuoiKi() {
		return this.cuoiKy;
	}
	
	
}
