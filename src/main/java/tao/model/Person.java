package tao.model;

public class Person {
	public String name;
	public int seq;
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return String.format("%s %d", this.name,this.seq);
	}
	
}
