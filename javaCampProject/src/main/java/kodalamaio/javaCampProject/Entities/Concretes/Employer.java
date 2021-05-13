package kodalamaio.javaCampProject.Entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employers")
@Data
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="employer_id")
	private int id;
	@Column(name="company_name")
	private String companyName;
	@Column(name="web_address")
	private String webAddress;
	@Column(name="phone_number")
	private String phoneNumber;
}
