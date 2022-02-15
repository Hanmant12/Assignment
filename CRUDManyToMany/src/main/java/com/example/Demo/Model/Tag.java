package com.example.Demo.Model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Tag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	// private List<Posts> posts=new ArrayList<>();
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tagss")
	private Set<Post> postss = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Post> getPosts() {
		return postss;
	}

	public void setPosts(Set<Post> posts) {
		this.postss = posts;
	}

	public Tag(Long id, String name, Set<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.postss = posts;
	}

	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tags [id=" + id + ", name=" + name + ", posts=" + postss + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, postss);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(postss, other.postss);
	}

}
