package com.pe.app.dao;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	/**
     * finds a user given its username
     *
     * @param username - the username of the searched user
     * @return  a matching user, or null if no user found.
     */
    public User findUserByUsername(String username) {
    	return null;
    }

    /**
     *
     * find the total calories that a given user has consumed so far in ongoing day
     *
     * @param username
     * @return the total number of calories for the user for today
     */
    public Long findTodaysCaloriesForUser(String username) {
    	return null;
    }

    /**
     *
     * save changes made to a user, or insert it if its new
     *
     * @param user
     */
    public void save(User user) {
    	
    }

    /**
     * checks if a username is still available in the database
     *
     * @param username - the username to be checked for availability
     * @return true if the username is still available
     */
    public boolean isUsernameAvailable(String username) {
    	return false;
    }
	
}
