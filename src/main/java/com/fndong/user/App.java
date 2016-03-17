package com.fndong.user;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();

	    UserDetails userDetails = new UserDetails("No A419 Cheras Perdana","57000");
	     
	    User user = new User("password","Frank FNdong","fndong@gmail.com");
	    user.setUserDetails(userDetails);
	    userDetails.setUser(user);
	     
	    session.save(user);

	     
	    List<User> userlist = session.createQuery("from User").list();
	    for (User user1 : userlist) {
	        System.out.println(" User and His Details : " + user1.getName() + " , "    + user1.getEmail() + ", "  + user1.getUserDetails().getAddress());
	    }

	    session.getTransaction().commit();
	    session.close();

	}
}


