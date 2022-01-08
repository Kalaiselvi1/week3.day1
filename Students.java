package student.details;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The id is " +id);
		

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The id is " +id +","  +name);
		
	}
	public void getStudentInfo(String email, long phoneL) {
		System.out.println(email);
		System.out.println(phoneL);
	}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(10);
		obj.getStudentInfo(10, "Kalai");
		obj.getStudentInfo("Kalai@gmail.com", 1234567);

	
	}

}
