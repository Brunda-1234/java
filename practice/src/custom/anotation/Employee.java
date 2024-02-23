package custom.anotation;

@CustomsAnnotation
public class Employee {
	
	private Integer id;
	private String name;
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(1,"Bruno","bru@gmail.com");
		System.out.println(emp.getEmail());
	}
	public Employee() {
		super();
	}
	public Employee(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
}
