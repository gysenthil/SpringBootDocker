package com.tarento.sbdock.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tarento.sbdock.model.User;


public interface UserRepository {

    int count();

    int save(User user);

    List<User> findAll();

    String getNameById(Long id);

}