package com.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Note;

@WebServlet(value = "/save")
public class SaveNoteServlet extends HttpServlet {
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("anand");
	public static EntityManager em = emf.createEntityManager();
	public static EntityTransaction et = em.getTransaction();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			
			//fetch title, content
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content);
			
			//save to DB
			et.begin();
			em.persist(note);
			et.commit();
			
			PrintWriter pw = response.getWriter();
			pw.print("<h1 style='text-align:center;'>Note is added successfully!!</h1>");
			pw.print("<h1 style='text-align:center;'><a href='all_notes.jsp'>View all notes</a></h1>");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
