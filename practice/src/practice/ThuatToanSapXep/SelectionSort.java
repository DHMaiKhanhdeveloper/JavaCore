package practice.ThuatToanSapXep;

public class SelectionSort {

	 public static void main(String[] args) {
	       
	      // Khởi tạo mảng cần sắp xếp
	      int[] arr = {64,25,12,22,11};
	 
	      // Vòng lặp ngoài cùng để duyệt qua từng phần tử trong mảng
	      for (int i = 0; i < arr.length-1; i++) {
	          
	         // Giả sử phần tử hiện tại là phần tử nhỏ nhất trong mảng chưa được sắp xếp
	         int min_idx = i;
	         for (int j = i+1; j < arr.length; j++) {
	            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
	            if (arr[j] < arr[min_idx]) {
	               min_idx = j;
	            }
	         }
	         
	         // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên trong mảng chưa được sắp xếp
	         int temp = arr[min_idx];
	         arr[min_idx] = arr[i];
	         arr[i] = temp;
	      }
	      
	      // In ra mảng đã được sắp xếp
	      for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }

}
