import java.util.Set;
import java.util.TreeSet;

class books implements Comparable<books> {
	String title;
	int year;
	books(String title,int year) {
		this.title=title;
		this.year=year;
	}
	@Override
	public boolean equals(Object O) {
		if(this==O) return true;
		if(O==null || getClass()!=O.getClass()) return false;
		books b = (books) O;
		return year == b.year && title.equals(b.title);
	}
	@Override
	public int hashCode() {
		return java.util.Objects.hash(title,year);
	}
	@Override
	public String toString() {
		return title +" (" + year + ")";
	}
	@Override
	public int compareTo(books other) {
		return Integer.compare(this.year, other.year);
	}
}
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <books> book = new TreeSet<>();
		book.add(new books("titile1", 1));
		book.add(new books("title2",2));
		book.add(new books("title3",3));
		book.add(new books("titile1", 1));
		System.out.println(book);
		System.out.println(book.size());
	}

}
