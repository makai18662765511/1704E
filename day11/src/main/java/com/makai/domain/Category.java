package com.makai.domain;

public class Category {

	private int id;
	private String name;
	private int channel_id;
	private Integer sorted;
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", channel_id=" + channel_id + ", sorted=" + sorted + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public Integer getSorted() {
		return sorted;
	}
	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
