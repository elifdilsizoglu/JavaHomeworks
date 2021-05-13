package kodalamaio.javaCampProject.Entities.Concretes;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="jobs")
@Data
public class Job{
	
	@Id
	@GeneratedValue
	@Column(name="job_id")
	private int id;
	@Column(name="job_title")
	private String jobTitle;
	@Column(name="description")
	private String description;
	@Column(name="employer_id")
	private int employerId;
	
}
