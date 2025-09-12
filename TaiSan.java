package src;
import java.time.LocalDate;
public class TaiSan {
	private String ten;
	private String moTa;
	private double giaMua;
	private int namMua;
	
	public TaiSan(String name, String describe, double money, int yearBuy) {
		this.ten = name;
		this.moTa = describe;
		this.giaMua = money;
		this.namMua = yearBuy;
	}
	
	public double giaTri() {
		int namHienTai = LocalDate.now().getYear();
		int namSuDung = namHienTai - this.namMua;
		
		double tileSale = Math.min(namSuDung * 0.1, 0.7);
		
		return this.giaMua * tileSale;
				
	}
	
	public String hienThi() {
		return "Ten: "+ this.ten +"Mo Ta: "+ this.moTa +
				"Gia Mua: "+ this.giaMua+
				"Nam mua: "+ this.namMua+
				"Gia Tri: "+this.giaTri();
	}
}
