package com.ssm.entity;


import java.util.HashSet;
import java.util.Set;

public class Role{

	// Fields

	private Integer roleId;
	private String name;
	private Set<RoleResource> roleResources = new HashSet<RoleResource>(0);
	private Set<User> users = new HashSet<User>(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String name, Set<RoleResource> roleResources, Set<User> users) {
		this.name = name;
		this.roleResources = roleResources;
		this.users = users;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<RoleResource> getRoleResources() {
		return this.roleResources;
	}

	public void setRoleResources(Set<RoleResource> roleResources) {
		this.roleResources = roleResources;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role{" +
				"roleId=" + roleId +
				", name='" + name + '\'' +
				", roleResources=" + roleResources +
				", users=" + users +
				'}';
	}
}