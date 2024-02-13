package com.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Note {
	
	@Override
	public String toString() {
		return title.toUpperCase()+"<br>" + content;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@Column(length = 500)
	private String content;
	
	@CreationTimestamp
	private LocalDateTime date;
	
	public Note() {
	}
	
	public Note(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getDate() {
		return date;
	}

}
