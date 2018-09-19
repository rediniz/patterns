package br.uece.ps.mediator;

import java.util.ArrayList;
import java.util.List;

public class ClassroomImpl implements Classroom {

	private final List<Member> members;

	public ClassroomImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void act(Member actor, Action action) {

		if (actor.getClass().equals(Teacher.class) && action.equals(Action.SEND_PAPER)) {
			for (Member member : members) {
				if (!member.equals(actor)) {
					member.classroomAction(action);
				}
			}
		} else if (actor.getClass().equals(Student.class) && action.equals(Action.SEND_PAPER)) {
			for (Member member : members) {
				if (member.getClass().equals(Teacher.class)) {
					member.classroomAction(action);
				}
			}
		} else if (action.equals(Action.SEND_MESSAGE)) {
			for (Member member : members) {
				if (!member.equals(actor) && member.getClass().equals(Student.class)) {
					member.classroomAction(action);
				}
			}
		}
	}

	@Override
	public void addMember(Member member) {
		members.add(member);
		member.joinedClassroom(this);
	}

}
