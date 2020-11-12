package myPack;

public class Student {
	private String name;
	private int stt;

	public Student(String name, int stt) {
		super();
		this.name = name;
		this.stt = stt;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

}
