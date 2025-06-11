package com.sunbeam.tester;

import static com.sunbeam.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.sunbeam.dao.UserDao;
import com.sunbeam.dao.UserDaoImpl;
import com.sunbeam.entities.User;
import com.sunbeam.entities.UserRole;

public class UserRegistration {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
				Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDao dao = new UserDaoImpl();
			System.out.println("Enter user details - firstName,  lastName,  " + "email,  password,  dob,  userRole subscripton amount");
			// create user instance
//			User user = new User(sc.next(), sc.next(), sc.next(), sc.next(), LocalDate.parse(sc.next()),
//					UserRole.valueOf(sc.next().toUpperCase()),sc.nextDouble());
//			//user - does it exist in heap ? YES - TRANSIENT
//			//invoke dao's method
//			System.out.println(dao.signUp(user));
			
	
//			System.out.println(dao.userSignIn(sc.next(),sc.next()));
			UserRole u = UserRole.ADMIN;
			System.out.println(dao.getSelectedUsersDetails(u));

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
