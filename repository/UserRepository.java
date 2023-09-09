package com.firstproj.RESTAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.firstproj.RESTAPI.entity.Users;
public interface  UserRepository  extends JpaRepository<Users,ID>{

}
