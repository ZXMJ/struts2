package com.ultra.emp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ultra.emp.bean.Emp;

public class EmpDao {

	private static Map<Integer, Emp> emps;
	private static int empId;
	static {
		empId = 1006;
		emps = new HashMap<Integer, Emp>();
		emps.put(1001, new Emp(1001, "AA", "aa", "aa@163.com"));
		emps.put(1002, new Emp(1002, "BB", "bb", "bb@163.com"));
		emps.put(1003, new Emp(1003, "CC", "cc", "cc@163.com"));
		emps.put(1004, new Emp(1004, "DD", "dd", "dd@163.com"));
		emps.put(1005, new Emp(1005, "EE", "ee", "ee@163.com"));
	}

	public List<Emp> getEmps() {
		return new ArrayList<Emp>(emps.values());
	}

	public void deleteEmp(int empId) {
		emps.remove(empId);
	}

	public void updateEmp(Emp emp) {
		emps.put(emp.getEmpId(), emp);
	}

	public void saveEmp(Emp emp) {
		emp.setEmpId(empId);
		emps.put(emp.getEmpId(), emp);
		empId++;
	}
	
	public Emp getEmpById(int empId){
		return emps.get(empId);
	}
}
