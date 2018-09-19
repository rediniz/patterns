package br.uece.ps.mediator;

public class Student extends MemberBase {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Aluno "+name;
	}
}
