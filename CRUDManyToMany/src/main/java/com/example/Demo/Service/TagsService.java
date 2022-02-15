package com.example.Demo.Service;

import java.util.List;

import com.example.Demo.Model.Post;
import com.example.Demo.Model.Tag;

public interface TagsService {


	public Tag addrec(Tag tag);
	public List<Tag> show();
	public List<Tag> update(Tag tag);
	public void delete(Tag tag);
}
