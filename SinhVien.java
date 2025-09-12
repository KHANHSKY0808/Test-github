package src;

public class SinhVien {
	private String hoTen;
	private Diem dm1,dm2;
	private TaiSan ds[] ;
	private int slTaiSan;
	
	public SinhVien(String name, Diem m1, Diem m2) {
		this.hoTen = name;
		this.dm1 = m1;
		this.dm2 = m2;
		this.ds = new TaiSan[100]; 
        this.slTaiSan = 0;
	}
	
	public double tinhDTB() {
		return ((this.dm1.tinhDiem()*dm1.getSoTC()) + (this.dm2.tinhDiem()*dm2.getSoTC())) / (this.dm1.getSoTC() + this.dm2.getSoTC());
	}
	
	public void themTaiSan(TaiSan a) {
		if(this.slTaiSan < this.ds.length) {
			ds[slTaiSan] = a;
			slTaiSan ++;
		} else {
			System.out.println(" khong them duoc vi danh sach da day ");
		}
	}
	
	public double tongGiaTriTaiSan() {
		double sum = 0;
		for(int i=0;i<slTaiSan;i++) {
			sum += ds[i].giaTri();
		}
		
		return sum;
	}
	
	 public void lietKeTS() {
	        System.out.println("Danh sách tài sản của sinh viên: " + hoTen);
	        for (int i = 0; i < slTaiSan; i++) {
	            System.out.println((i + 1) + ". " + ds[i].hienThi());
	        }
	    }
	public void hienThi() {
		System.out.println("Ho va Ten: "+this.hoTen);
		System.out.println("Ten Hoc phan 1 " + this.dm1.getTenHP() + " Ten Hoc Phan 2: " + this.dm2.getTenHP());
		System.out.println("Hoc Phan 1 : " + " Chuyen Can: "+ this.dm1.getChuyenCan() + " Giua Ky "+ this.dm1.getGiuaKy() + " Cuoi Ky "+ this.dm1.getCuoiKi());
		System.out.println("Hoc Phan 2 : " + " Chuyen Can: "+ this.dm2.getChuyenCan() + " Giua Ky "+ this.dm2.getGiuaKy() + " Cuoi Ky "+ this.dm2.getCuoiKi());
		System.out.println("Diem Trung Binh: "+this.tinhDTB());
	}
	
}
