
public class student {

	public int sno;
	public String name;
	public String adr;
	int getSno() {
		return sno;
	}
	void setSno(int sno) {
		this.sno = sno;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getAdr() {
		return adr;
	}
	void setAdr(String adr) {
		this.adr = adr;
	}
	public student(int sno, String name, String adr) {
		super();
		this.sno = sno;
		this.name = name;
		this.adr = adr;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
