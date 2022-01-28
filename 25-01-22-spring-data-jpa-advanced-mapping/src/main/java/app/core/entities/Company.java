package app.core.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * spring beans (@Component, @Bean, are managed by spring context (pring container)
 * JPA Entities (@Entity) are managed by Hibernate session context (hibdernate session)
 * Entity is not component. it is not managed by spring context.
 * this is Entity. managed by hibernate.
 * */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // 
public class Company {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")	
	private Address address;
}
