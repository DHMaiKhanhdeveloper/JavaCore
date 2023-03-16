package practice.condition;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Viết chương trình xếp loại điểm môn học của một sinh viên. Chương trình yêu cầu người dùng nhập vào 3 cột điểm một môn học của sinh viên (bao gồm điểm chuyên cần, điểm kiểm tra và điểm thi học kỳ). Kết quả xếp loại được phân chia như sau:

	Nếu điểm trung bình >= 8.5 thì xếp loại A.
	Nếu điểm trung bình >= 7 và nhỏ hơn 8.5 thì xếp loại B.
	Nếu điểm trung bình >= 5.5 và nhỏ hơn 7 thì xếp loại C.
	Nếu điểm trung bình >= 4 và nhỏ hơn 5.5 thì xếp loại D.
	Nếu điểm trung bình < 4 thì xếp loại F.*/

public class XepLoaiMonHoc {
	public static void main(String[] args) {
        double diemKiemTraHS1, diemKiemTraHS2, diemThi, diemTrungBinh;
        String ketQuaXepLoai;   
         
        Scanner scanner = new Scanner(System.in);
        // làm tròn số đến 1 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.#"); 
         
        System.out.println("Nhập vào điểm kiểm tra hệ số 1:");
        diemKiemTraHS1 = scanner.nextDouble();
        System.out.println("Nhập vào điểm kiểm tra hệ số 2: ");
        diemKiemTraHS2 = scanner.nextDouble();
        System.out.println("Nhập vào điểm thi cuối kỳ: ");
        diemThi = scanner.nextDouble();
         
        // Kiểm tra điểm nhập vào phải hợp lệ
        // toán tử OR: chỉ cần 1 biểu thức đúng thì vẫn trả về giá trị đúng
        if ((diemKiemTraHS1 < 0 || diemKiemTraHS1 > 10) 
            || (diemKiemTraHS2 < 0 || diemKiemTraHS2 > 10) || (diemThi < 0 || diemThi > 10)) {
            System.out.println("Nhập điểm không hợp lệ.");
        } else {
         
            // Tính điểm trung bình
            diemTrungBinh = (((diemKiemTraHS1 + diemKiemTraHS2 * 2.0) / 3) * 0.4) + 
                (diemThi * 0.6);
            decimalFormat.format(diemTrungBinh);
             
            // Tiến hành xếp loại điểm môn học của sinh viên.
            // Sử dụng cấu trúc if - else if - else
            if (diemTrungBinh >= 8.5) {
                ketQuaXepLoai = "Loại A";
            } else if ((diemTrungBinh >= 7) && (diemTrungBinh < 8.5)) {
                // toán tử AND: đúng khi cả hai biểu thức đều đúng
                ketQuaXepLoai = "Loại B";
            } else if ((diemTrungBinh >= 5.5) && (diemTrungBinh < 7)) {
                ketQuaXepLoai = "Loại C";
            } else if ((diemTrungBinh > 4) && (diemTrungBinh < 5.5)) {
                ketQuaXepLoai = "Loại D";
            } else {
                ketQuaXepLoai = "Loại F";
            }
            System.out.println("Kết quả xếp loại môn học của sinh viên là " + ketQuaXepLoai);
        }
     
    }
}
