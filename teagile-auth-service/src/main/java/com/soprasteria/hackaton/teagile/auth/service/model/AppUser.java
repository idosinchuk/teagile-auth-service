package com.soprasteria.hackaton.teagile.auth.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * A (temporary) class represent the user saved in the database.
 * 
 * @author Igor Dosinchuk
 */
@Data
@AllArgsConstructor
public class AppUser {

	private Integer id;

	private String username;

	private String password;

	private String role;

}
