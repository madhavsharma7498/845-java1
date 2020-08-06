package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionOnJava() {
		String subjectName = "Java";
		
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Databse", false));
		ops.add(new Option("Java is a Programming Language", true));
		ops.add(new Option("Java is an OS", false));
		ops.add(new Option("Java is a file system", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("G1 is a Garbage Collector in java", true));
		ops.add(new Option("G1 is an english word for Jeevan", false));
		ops.add(new Option("G1 is the name of spy agency", false));
		ops.add(new Option("G1 is the sequel of SRK's Ra.One", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is List", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("List is just a list", false));
		ops.add(new Option("List is just a column", false));
		ops.add(new Option("List is a collection", true));
		ops.add(new Option("List is an object of Map", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Which of the following is not a Java features?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Dynamic", false));
		ops.add(new Option("Architecture Neutral", false));
		ops.add(new Option("Use of pointers", true));
		ops.add(new Option("Object-oriented", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is the return type of the hashCode() method in the Object class?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Object", false));
		ops.add(new Option("int", true));
		ops.add(new Option("long", false));
		ops.add(new Option("void", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		
		return qb.getQuestionsFor(subjectName);
	}

}
