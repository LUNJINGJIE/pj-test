package com.ssm.entity;

public class RoleResource{

	// Fields

	private Integer roleResourceId;
	private Resource resource;
	private Role role;

	// Constructors

	/** default constructor */
	public RoleResource() {
	}

	/** full constructor */
	public RoleResource(Resource resource, Role role) {
		this.resource = resource;
		this.role = role;
	}

	public Integer getRoleResourceId() {
		return this.roleResourceId;
	}

	public void setRoleResourceId(Integer roleResourceId) {
		this.roleResourceId = roleResourceId;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "RoleResource{" +
				"roleResourceId=" + roleResourceId +
				", resource=" + resource +
				", role=" + role +
				'}';
	}
}