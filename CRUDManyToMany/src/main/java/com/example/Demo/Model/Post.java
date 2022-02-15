package com.example.Demo.Model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Post {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, description;
   
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(
            name = "tags_posts",    // intermediate physical table name
            joinColumns = {
                    @JoinColumn(name = "posts_id")  // column to connect with posts
                    },
            inverseJoinColumns = {
                    @JoinColumn(name="tags_id") }  // column to connect with tags
                    )
    private Set<Tag> tagss=new HashSet<>();
	    
		public Set<Tag> getTagsobj() {
			return tagss;
		}
		public void setTagsobj(Set<Tag> tagsobj) {
			this.tagss = tagsobj;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		public Post(Long id, String title, String description, Set<Tag> tags) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.tagss = tags;
		}
		public Post() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Posts [id=" + id + ", title=" + title + ", description=" + description + ", tagsobj=" + tagss
					+ "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(description, id, tagss, title);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Post other = (Post) obj;
			return Objects.equals(description, other.description) && Objects.equals(id, other.id)
					&& Objects.equals(tagss, other.tagss) && Objects.equals(title, other.title);
		} 
	    
	    
	    
	    
	    
	    
}
