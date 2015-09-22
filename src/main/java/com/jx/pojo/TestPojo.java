package com.jx.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
 

@Entity
@Table(name="POJO")
public class TestPojo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	
	@Column(name = "age", nullable = false)
	private int age;
	
	
	public TestPojo() {	}
	public TestPojo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public TestPojo(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
//	@Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + id;
//        result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
//        return result;
//    }
// 
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (!(obj instanceof Employee))
//            return false;
//        Employee other = (Employee) obj;
//        if (id != other.id)
//            return false;
//        if (ssn == null) {
//            if (other.ssn != null)
//                return false;
//        } else if (!ssn.equals(other.ssn))
//            return false;
//        return true;
//    }
// 
//    @Override
//    public String toString() {
//        return "Employee [id=" + id + ", name=" + name + ", joiningDate="
//                + joiningDate + ", salary=" + salary + ", ssn=" + ssn + "]";
//    }
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
