package Streams;

import java.util.Arrays;
import java.util.List;

class Student
{
	String name;
	int score;
	Student(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}

}

public class ParllelStream {

	public static void main(String[] args) {
	List<Student> studentList=Arrays.asList(new Student("abhi",84),new Student("john",91),new Student("mat",95));
    studentList.parallelStream().filter(s->s.getScore()>=90).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
	}

}
