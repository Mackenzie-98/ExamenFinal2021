package co.reposteria.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "typedb")
@NamedQuery(name="Typedb.findAll", query="SELECT t FROM Typedb t")
public class Typedb implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false)
	private String id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "driver")
	private String aditional;
	
	@OneToMany(mappedBy = "type")
	List<ConnectionToken> tokens=new ArrayList<>();
}
