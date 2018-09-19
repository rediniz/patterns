package br.uece.ps.mediator;

public class Teacher extends MemberBase {
	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Professor " + name;
	}
}
