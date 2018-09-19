package br.uece.ps.mediator;

public class Aplicacao {

	public static void main(String[] args) {

		Classroom classroom = new ClassroomImpl();
		Student student1 = new Student("Renato");
		Student student2 = new Student("Edgar");
		Teacher teacher = new Teacher("Paulo Henrique");
	
		classroom.addMember(student1);
		classroom.addMember(student2);
		classroom.addMember(teacher);	
		System.out.println("\n---------------------------------------\n");

		teacher.act(Action.SEND_PAPER);
		System.out.println("\n---------------------------------------\n");
		
		student1.act(Action.SEND_PAPER);
		System.out.println("\n---------------------------------------\n");
		
		Student student3 = new Student("Novo");
		classroom.addMember(student3);
		System.out.println("\n---------------------------------------\n");
		
		student2.act(Action.SEND_MESSAGE);
		System.out.println("\n---------------------------------------\n");
	}
}
