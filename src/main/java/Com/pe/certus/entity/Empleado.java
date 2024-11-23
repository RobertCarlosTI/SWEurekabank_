package Com.pe.certus.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chr_emplcodigo")
    private Long id;

    @Column(name = "vch_emplpaterno")
    private String paterno;

    @Column(name = "vch_emplmaterno")
    private String materno;

    @Column(name = "vch_emplnombre")
    private String nombres;

    @Column(name = "vch_emplusuario")
    private String usuario;

    @Column(name = "vch_emplclave")
    private String clave;

    @Column(name = "chr_emplestado")
    private Boolean estado;

    @Column(name = "chr_emplfoto", length = 8)
    private String foto;

    public Empleado() {
    	super();
    }



    public Empleado(Long id, String paterno, String materno, String nombres, String usuario, String clave,
			Boolean estado, String foto) {
		super();
		this.id = id;
		this.paterno = paterno;
		this.materno = materno;
		this.nombres = nombres;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
		this.foto = foto;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPaterno() {
		return paterno;
	}



	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}



	public String getMaterno() {
		return materno;
	}



	public void setMaterno(String materno) {
		this.materno = materno;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public Boolean getEstado() {
		return estado;
	}



	public void setEstado(Boolean estado) {
		this.estado = estado;
	}



	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}



	@Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", paterno='" + paterno + '\'' +
                ", materno='" + materno + '\'' +
                ", nombres='" + nombres + '\'' +
                ", usuario='" + usuario + '\'' +
                ", estado='" + estado + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
