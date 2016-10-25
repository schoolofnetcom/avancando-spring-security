package com.schoolofnet.son_security.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Column
    private Long id;
	@Column
    private String username;
	@Column
    private String password;
	@Column
	private Set<Role> roles;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToMany
	@JoinTable( name = "user_role", joinColumns = @JoinColumn( name = "user_id"), inverseJoinColumns = @JoinColumn( name = "role_id"))
	public Set<Role> getRoles() {
		return this.roles;
	}
	
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
