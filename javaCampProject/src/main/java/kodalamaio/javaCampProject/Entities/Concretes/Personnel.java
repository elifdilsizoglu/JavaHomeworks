package kodalamaio.javaCampProject.Entities.Concretes;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name ="personnels")
@Data
public class Personnel {
	
	@Id
	@GeneratedValue
	@Column(name = "personnel_id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="nationalty_id")
	private String nationalityId;
	@Column(name="salary")
	private double salary; 
}
