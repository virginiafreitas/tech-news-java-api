package com.technews.repository;

import com.technews.model.Post;
import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Post, Integer> {
    User findUserByEmail(String email) throws Exception;
}
