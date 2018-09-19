package br.uece.ps.mediator;

public interface Member {
	
	void joinedClassroom(Classroom classroom);

	void classroomAction(Action action);

	void act(Action action);

}
