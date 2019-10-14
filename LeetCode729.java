
public class LeetCode729 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalendar m = new MyCalendar();
		System.out.println(m.book(10, 20));
	}

}

class MyCalendar {
	private int start;
    private int end;
    
    public MyCalendar() {
        this.start = 0;
        this.end = 0;
    }
    
    public boolean book(int start, int end) {
        if(start > this.end) {this.end = end;return true;}
        else if(end < this.start) {this.start = start; return true;}
        else return false;
    }
}