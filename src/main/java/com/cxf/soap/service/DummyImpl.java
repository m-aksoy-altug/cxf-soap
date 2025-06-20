package com.cxf.soap.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.cxf.soap.model.Student;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.cxf.soap.service.Dummy")
public class DummyImpl implements Dummy{

	private Map<Integer, Student> students = new LinkedHashMap<Integer, Student>();

    public String hello(String name) {
        return "Hello " + name;
    }

    public String helloStudent(Student student) {
        students.put(students.size() + 1, student);
        return "Hello " + student.getName();
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }
	
}

