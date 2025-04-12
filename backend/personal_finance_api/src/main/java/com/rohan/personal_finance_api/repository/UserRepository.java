package com.rohan.personal_finance_api.repository;

import com.rohan.personal_finance_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
