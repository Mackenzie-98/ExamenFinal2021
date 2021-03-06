package co.reposteria.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="usuario",unique = true)
	private String usuario;
	
	@Column(name="email")
	private String email;
	
	@Column(name = "pass")
	private String pass;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role")
	private Rol role;
	
	@Column(name = "state")
	private Integer state;

	@OneToMany(mappedBy = "user")
	List<ConnectionToken> tokens=new ArrayList();
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id, String usuario, String email, String pass, Rol rol, Integer state) {
		this.id = id;
		this.usuario = usuario;
		this.email = email;
		this.pass = pass;
		this.role = rol;
		this.state = state;
	}
	
	public Usuario(String usuario, String email, String pass, Rol rol, Integer state) {
		this.usuario = usuario;
		this.email = email;
		this.pass = pass;
		this.role = rol;
		this.state = state;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}



	public Rol getRole() {
		return role;
	}

	public void setRole(Rol role) {
		this.role = role;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", email=" + email + ", pass=" + pass + ", rol=" + role
				+ ", state=" + state + "]";
	}

}
