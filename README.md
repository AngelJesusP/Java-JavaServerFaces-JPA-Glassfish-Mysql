# Java-JavaServerFaces-JPA-Glassfish-Mysql

Cuando creen sus Entitys de la base de datos, Haganlo pero una vez creado las clases deben modificar o borrar las anotaciones, por ejemplo @NotNull
entre otras, para que funciones deben dejar las la notaciones @Basic y @Column con sus respectivos parametros.

<code>
private static final long serialVersionUID = 1L;
@Id
@Basic(optional = false)
@Column(name = "<nombreAtributo>", nullable = false)
private Integer <nombreAtributo>;
@Basic(optional = false)
@Column(name = "<nombreAtributo>",length = 50, nullable = false)
private String <nombreAtributo>;
</code>
