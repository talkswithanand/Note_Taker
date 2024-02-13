package com.servlets;

import java.io.IOException;

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

@WebServlet(value="/delete")
public class DeleteNoteServlet extends HttpServlet {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("anand");
	public static EntityManager em = emf.createEntityManager();
	public static EntityTransaction et = em.getTransaction();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
		int noteId = Integer.parseInt(req.getParameter("note_id"));
		
		//delete
			Note note = em.find(Note.class,	noteId);
			
			et.begin();
			em.remove(note);
			et.commit();
			
			resp.sendRedirect("all_notes.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
