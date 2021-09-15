import java.util.*;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> slist = new ArrayList<Student>();
		// Student sd = new Student();

		int c = 0, k = 0;
		while (c == 0) {
			System.out.println("Enter ID");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your name");
			String name = sc.nextLine();

			System.out.println("Enter your DOB");
			LocalDate dob = LocalDate.parse(sc.next());
			sc.nextLine();
			System.out.println("Enter your college name");
			String college = sc.nextLine();
			System.out.println("Enter your Phone number");
			long phn = sc.nextLong();
			sc.nextLine();
			slist.add(new Student(id, name, dob, college, phn));

			Info inf = new Info();
			inf.display(slist.get(k));
			k++;

			System.out.println("\nEnter 0 to continue");
			c = sc.nextInt();
		}

		// for(Student x : slist)
sc.close();
	}

}

class Student {
	int id;
	static String name;
	LocalDate dob;
	String college;
	long phn;

	public Student(int id, String name, LocalDate dob, String college, long phn) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.college = college;
		this.phn = phn;
	}

	public Student() {
		super();
		int id;
		String name;
		LocalDate dob;
		String college;
		long phn;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", dob=" + dob + ", college=" + college + ", phn=" + phn + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

}

class Info {
	Student ob = new Student();

	void display(Student ref) {
		System.out.println("\n");
		System.out.println("-------------------------------------");
		System.out.println("The deatils of the students are: ");
		System.out.println("ID\t    \t: " + ref.getId());
		System.out.println("Name\t\t: " + ref.getName());
		System.out.println("DOB\t      \t: " + ref.getDob());
		System.out.println("College\t\t: " + ref.getCollege());
		System.out.println("Phone\t\t: " + ref.getPhn());
	}
}


