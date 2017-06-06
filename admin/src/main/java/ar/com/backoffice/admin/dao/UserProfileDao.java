package ar.com.backoffice.admin.dao;

import java.util.List;

import ar.com.backoffice.admin.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}