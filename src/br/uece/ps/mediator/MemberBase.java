package br.uece.ps.mediator;

public abstract class MemberBase implements Member {

	protected Classroom classroom;

	@Override
	public void joinedClassroom(Classroom classroom) {
		System.out.println(this + " entrou na sala de aula.");
		this.classroom = classroom;

	}

	@Override
	public void classroomAction(Action action) {
		System.out.println(this + " " + action.getDescription());
	}

	@Override
	public void act(Action action) {
		if (classroom != null) {
			System.out.println(this + " " + action);
			classroom.act(this, action);
		}
	}
}
