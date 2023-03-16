package practice.condition;
import java.util.Calendar;

public class ThuTrongTuanP2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                System.out.println("Chủ nhật");
                break;
            case Calendar.MONDAY:
                System.out.println("Thứ hai");
                break;
            case Calendar.TUESDAY:
                System.out.println("Thứ ba");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Thứ tư");
                break;
            case Calendar.THURSDAY:
                System.out.println("Thứ năm");
                break;
            case Calendar.FRIDAY:
                System.out.println("Thứ sáu");
                break;
            case Calendar.SATURDAY:
                System.out.println("Thứ bảy");
                break;
        }
		
	}

}
