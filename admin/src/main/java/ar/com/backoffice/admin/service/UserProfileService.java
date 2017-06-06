package ar.com.backoffice.admin.service;

import java.util.List;

import ar.com.backoffice.admin.model.UserProfile;
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}