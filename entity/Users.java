package com.firstproj.RESTAPI.entity;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SuppressWarnings("unused")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Users",uniqueConstraints={
		@UniqueConstraint(columnNames={"email"})
})
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="password")
	private String password;
	

}
