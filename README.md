# Java-JavaServerFaces-JPA-Glassfish-Mysql

Cuando creen sus Entitys de la base de datos, Haganlo pero una vez creado las clases deben modificar o borrar las anotaciones, por ejemplo @NotNull
entre otras, para que funciones deben dejar las la notaciones @Basic y @Column con sus respectivos parametros.

<code>
private static final long serialVersionUID = 1L;<br/>
@Id
@Basic(optional = false)<br/>
@Column(name = "<nombreAtributo>", nullable = false)<br/>
private Integer <nombreAtributo>;<br/>
@Basic(optional = false)<br/>
@Column(name = "<nombreAtributo>",length = 50, nullable = false)<br/>
private String <nombreAtributo>;<br/>
</code>
