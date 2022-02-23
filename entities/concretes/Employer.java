package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
public class Employer {
	
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	int userId;
	
	@Column(name="company_name")
	String companyName;
	
	@Column(name="website")
	String website;
	
	@Column(name="company_mail")
	String companyMail;
	
	@Column(name="telephone_number")
	String telephoneNumber;
	
	@Column(name="password")
	String password;
}
