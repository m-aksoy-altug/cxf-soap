package com.cxf.soap.service;

import java.util.Map;

import com.cxf.soap.model.Student;
import com.cxf.soap.model.StudentMapAdapter;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@WebService
public interface Dummy {
		
	 	@WebMethod
	    public String hello(String name);
	 	
	 	@WebMethod
	    public String helloStudent(Student student);

	 	@WebMethod
	    @XmlJavaTypeAdapter(StudentMapAdapter.class)
	    public Map<Integer, Student> getStudents();
}
