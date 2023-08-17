package com.finzly.studentmanagement;

public class Student {
	private int stId;
	private String stName;
	private static int stCount;

	public Student() {

	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public static int getCount() {
		return stCount;
	}

	public void addStudent(int stId, String stName) {
		if (stId <= 0 || stName == "") {
			System.out.println("Invalid data!");
		} else {
			this.stId = stId;
			this.stName = stName;
			stCount++;
		}
	}

	public Student removeStudent() {
		this.stId = 0;
		this.stName = "";
		stCount--;
		return this;
	}

}
