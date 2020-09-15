import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
class Date {
	private int year;
	private int month;
	private int day;
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//////// 구현해야 할 메소드 /////////////////
	// 현재 날짜와 비교할 날짜 obj를 비교하여 같으면 true반환, 다르면 false 반환
	public boolean equals(Object obj) {
        return false;

    }
	// 현재 날짜와 비교할 날짜 d를 비교하여 현재 날짜가 앞서면 -1, 같으면 0,
	// 뒤서면 1을 반환한다
	public int compareTo(Date d) {
        return 0;
    }
	/////////////////////////////////////////////////

	public String toString() {
		return year + "/" + month + "/" + day;
	}

}
public class TestDate {
    public static void main(String[] args) throws FileNotFoundException {
        int year, month, day;
        Date[] dates = new Date[50];
        int num = 0;
        Scanner inFile = new Scanner(new File("input.txt"));
        while (inFile.hasNextLine()) {
                year = inFile.nextInt();
                month = inFile.nextInt();
                day = inFile.nextInt();
                dates[num] = new Date(year, month, day);
                num++;
        }
        inFile.close();
       System.out.println(dates[0].toString());
    }
}