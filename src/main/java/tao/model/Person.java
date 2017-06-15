package tao.model;

import java.util.Date;

public class Person {
	public String name;
	public String description;
	public Date birth;
	public long seq;
	public long seq2;
	public float level;
	public long getSeq() {
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public float getLevel() {
		return level;
	}

	public void setLevel(float level) {
		this.level = level;
	}

	@Override
	public String toString(){
		return String.format("%s %d", this.name,this.seq);
	}
	
}
