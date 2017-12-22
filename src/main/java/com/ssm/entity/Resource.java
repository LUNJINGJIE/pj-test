package com.ssm.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Resource entity. @author MyEclipse Persistence Tools
 */
public class Resource{

	// Fields

	private Integer resourceId;
	private Resource resource;
	private String name;
	private String actionUrl;
	private String css;
	private List<Resource> resources = new ArrayList<Resource>();
	private Set<RoleResource> roleResources = new HashSet<RoleResource>(0);

	// Constructors

	/** default constructor */
	public Resource() {
	}

	/** minimal constructor */
	public Resource(String name) {
		this.name = name;
	}

	/** full constructor */
	public Resource(Resource resource, String name, String actionUrl,
                    String css, List<Resource> resources, Set<RoleResource> roleResources) {
		this.resource = resource;
		this.name = name;
		this.actionUrl = actionUrl;
		this.css = css;
		this.resources = resources;
		this.roleResources = roleResources;
	}

	// Property accessors
	public Integer getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getCss() {
		return this.css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Set<RoleResource> getRoleResources() {
		return this.roleResources;
	}

	public void setRoleResources(Set<RoleResource> roleResources) {
		this.roleResources = roleResources;
	}

	@Override
	public String toString() {
		return "Resource{" +
				"resourceId=" + resourceId +
				", resource=" + resource +
				", name='" + name + '\'' +
				", actionUrl='" + actionUrl + '\'' +
				", css='" + css + '\'' +
				", resources=" + resources +
				", roleResources=" + roleResources +
				'}';
	}
}