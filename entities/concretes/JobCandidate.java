package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="job_candidates")
public class JobCandidate {
	
	@Id
	@GeneratedValue     //(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	int userId;
	
	@NotNull
	@NotBlank
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="password")
	String password;
	
	@Column(name="email")
	String email;
	
	@Column(name="tcno")
	String nationalityId;
	
	@Column(name="telephone_number")
	String telephoneNumber;
	
	//veri tabaninda data tipi Date oldugu icin illegal access this web application instance has been stopped hatasi aldin.
	@Column(name="date_of_birth")
	String yearOfBirth;
}
