package com.tarento.sbdock.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tarento.sbdock.model.User;
@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(User user) {
		
		return jdbcTemplate.update(
				"INSERT INTO users (first_name, second_name, address, street, pincode, city, state, country) VALUES (?,?,?,?,?,?,?,?)",
				user.getFirst_name(),user.getLast_name(),user.getAddress(),user.getStreet(),user.getPincode(),user.getCity(),user.getState(),user.getCountry());
		
		
	}

	@Override
	public List<User> findAll() {
		return jdbcTemplate.query(
                "select * from users",
                (rs, rowNum) ->
                        new User(
                                rs.getInt("id"),
                                rs.getString("first_name"),
                                rs.getString("second_name"),
                                rs.getString("address"),
                                rs.getString("street"),
                                rs.getString("city"),
                                rs.getLong("pincode"),
                                rs.getString("state"),
                                rs.getString("country")
                        )
        );
	}
	
	@Override
	public String getNameById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
