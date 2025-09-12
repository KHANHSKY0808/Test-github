package src;

public class main {
    public static void main(String[] args) {
        // Tạo mảng sinh viên
        SinhVien[] sv = new SinhVien[3];

        // Khởi tạo sinh viên
        sv[0] = new SinhVien("An",
                new Diem("CTDL", 3, 5, 4, 5),
                new Diem("OOP", 3, 8, 7, 9));
        
        sv[1] = new SinhVien("Huy",
                new Diem("MangMayTinh", 4, 6, 7, 8),
                new Diem("NgoaiNgu", 3, 6, 7, 9));
        
        sv[2] = new SinhVien("Quan",
                new Diem("Web", 2, 5, 5, 5),
                new Diem("C++", 3, 5, 8, 6));

        // Thêm tài sản cho mỗi sinh viên
        sv[0].themTaiSan(new TaiSan("Laptop", "Dell", 20000000, 2022));
        sv[0].themTaiSan(new TaiSan("Xe đạp", "Thể thao", 5000000, 2023));

        sv[1].themTaiSan(new TaiSan("Điện thoại", "iPhone 13", 25000000, 2021));

        sv[2].themTaiSan(new TaiSan("Tablet", "iPad", 15000000, 2020));
        sv[2].themTaiSan(new TaiSan("Loa", "Bluetooth", 2000000, 2024));
        sv[2].themTaiSan(new TaiSan("Chuột", "Gaming", 1000000, 2023));

        // Hiển thị thông tin sinh viên và tài sản
        for (int i = 0; i < sv.length; i++) {
            System.out.println("----------");
            sv[i].hienThi();        // Thông tin điểm và tên
            sv[i].lietKeTS();       // Liệt kê tài sản
            System.out.println("Tổng giá trị tài sản: " + sv[i].tongGiaTriTaiSan());
        }
    }
}
