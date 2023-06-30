package com.selflearning.selflearning.restapi.user;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


@Entity(name = "USER_DETAILS")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	private int userId;

	@Size(min = 2, message = "Name should have atleast 2 characters. ")
	@JsonProperty("user_name")
	@Column(name = "name")
	private String name;
	
	@Past(message = "Birth date should be past dated.")
	@JsonProperty("birth_date")
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
	private List<Post> posts;	

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public int getuserId() {
		return userId;
	}

	public void setId(int iuserId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return birthDate;
	}

	public void setDob(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", name=" + name + ", dob=" + birthDate + "]";
	}

	

	public User(int id, @Size(min = 2, message = "Name should have atleast 2 characters. ") String name,
			@Past(message = "Birth date should be past dated.") LocalDate birthDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.birthDate = birthDate;
		
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
