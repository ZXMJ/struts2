package com.ultra.emp.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.ultra.emp.bean.Emp;
import com.ultra.emp.dao.EmpDao;

public class EmpModelDrivenPreparableAction implements RequestAware, ModelDriven<Emp> ,Preparable{

	/**
	 * Action实现ModelDriven接口:实现getModel()方法(ps:getModel()对象要和Action中的对象关联，
	 * 否则Action中的对象为空) ModelDrivenInterceptor会把Action中的创建的对象压入栈顶。
	 */
	//	特殊属性直接在action中创建
	private Integer empId;
	
	private Emp emp;
	private EmpDao dao = new EmpDao();
	private Map<String, Object> request;

	public String update(){
		dao.updateEmp(emp);
		return "success";
	}
	
	// 调用update()之前组装emp对象
	public void prepareUpdate(){
		emp = new Emp();
	}
	
	public String edit(){
		return "edit";
	}
	
	// 调用edit()之前组装emp对象
	public void prepareEdit(){
		emp = dao.getEmpById(empId);
	}
	
	public String save() {
		dao.saveEmp(emp);
		return "success";
	}

	// 调用save()之前组装emp对象
	public void prepareSave(){
		emp = new Emp();
	}
	
	public String delete() {
		dao.deleteEmp(empId);
		return "success";
	}

	public String list() {
		request.put("emps", dao.getEmps());
		return "list";
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@Override
	public Emp getModel() {
		// 将ModelDrivenInterceptor调用的返回的对象和Action对象关联
		return emp;
	}

	// 该方法在配置文件中配置为禁止执行，由具体的prepareMethodName()代替。
	@Override
	public void prepare() throws Exception {}

}