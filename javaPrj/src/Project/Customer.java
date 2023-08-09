package Project;

public class Customer {
	private String name;
	private String address;
	private String phone;
	private int totalCost;
	private int totalPoint;
	private Membership mmsh;

	public Customer() {
	}

	public Customer(String name, String address, String phone, int totalCost, int totalPoint, Membership mmsh) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.totalCost = totalCost;
		this.totalPoint = totalPoint;
		this.mmsh = mmsh;
	}

	public int gettotalCost() {
		return totalCost;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phone=" + phone + ", totalCost=" + totalCost
				+ ", totalPoint=" + totalPoint + ", mmsh=" + mmsh.getGrade() + "]";
	}

	public int compareTo(Customer customer) {
		return this.totalCost - customer.totalCost;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Membership getMmsh() {
		return mmsh;
	}

}
