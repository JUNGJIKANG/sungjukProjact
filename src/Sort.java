
/*
 * 객체 정렬하기
 * 1. 배열 정렬하기
 *  - Arrays.sort()
 *  - Comparable interface를 재정의 해야한다.
 *  ---------------------------------------
 * 2. Colletion 정렬하기
 *  - Collections.sort()
 *  - Comparator inperface를 재정의 해야한다.
 *  - compare()
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private List<Student> list;

	public Sort(List<Student> list) {
		this.list = list;
	}

	public void sort() {
		Collections.sort(this.list, new Comparator<Student>() {

			@Override
			public int compare(Student front, Student back) {
				return front.getName().compareTo(back.getName());
			}
		});
	}
}
//	public void sort() {
//		Collections.sort(this.list, new MyComparator());s
//
//	}
//
//	class MyComparator implements Comparator<Student> {
//
//		@Override
//		public int compare(Student front, Student back) {
//			return back.getTot()-front.getTot();
//		}
