package kodlamaio.hrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "work_times")
@Data
@AllArgsConstructor
@NoArgsConstructor  // Lombok ile parametresiz bir constructor oluşturur.
public class WorkTime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "time")
	private String time;
	
	@JsonIgnore
	@OneToMany(mappedBy = "workTime")
	private List<JobAdvertisement> jobAdvertisements;

}
