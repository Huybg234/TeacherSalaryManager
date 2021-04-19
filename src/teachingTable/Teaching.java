package teachingTable;

import Entity.Subject;
import Entity.Teacher;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Teaching implements Serializable {
    private Teacher teacher;
    private List<TeachingSubjectClass> teachingSubjectClass = new ArrayList<>();
    private float allLesson;
    public Teaching() {
    }

    public Teaching(Teacher teacher, List<TeachingSubjectClass> teachingSubjectClass) {
        this.teacher = teacher;
        this.teachingSubjectClass = teachingSubjectClass;
    }

    public float getAllLesson() {
        return allLesson;
    }

    public void setAllLesson(float allLesson) {
        this.allLesson = allLesson;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<TeachingSubjectClass> getTeachingSubjectClass() {
        return teachingSubjectClass;
    }

    public void setTeachingSubjectClass(List<TeachingSubjectClass> teachingSubjectClass) {
        this.teachingSubjectClass = teachingSubjectClass;
    }

    @Override
    public String toString() {
        return "Teaching{" +
                "teacher=" + teacher +
                ", teachingSubjectClass=" + teachingSubjectClass +
                '}';
    }
}