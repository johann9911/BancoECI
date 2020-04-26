package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.Iniciativa;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IniciativaMapper {

    /**
     * Metodo que permite registrar un comentario a una iniciativa
     * @param fecha_comentario fecha en la que se realizo el comentario
     * @param contenido contenido del comentario
     * @param documentoUsuario documento del usuario que realiza el comentario
     * @param idIniciativa id de la iniciativa sobre la cual se realiza el comentario
     */
    public void agregarComentarioAIniciativa(@Param("fecha_comentario") Date fecha_comentario , @Param("contenido") String contenido , @Param("usuario") long documentoUsuario , @Param("iniciativa") int idIniciativa) ;

    /**
     * Metodo que permite consultar las iniciativas ordenadas por una columna
     * @param columna Columna por la cual se quieren ordenar las iniciativas
     * @return Lista de iniciativas
     */
    public List<Iniciativa> consultarIniciativasOrdenadasPorColumna(@Param("columna") String columna) ;

    /**
     * Agrega una iniciativa relacionada a una iniciativa
     * @param idIniciativa iniciativa principal
     * @param idIniciativaRelacionada iniciativa relacionada a la principal
     */
    public void agregarIniciativaRelacionadaAIniciativa(@Param("idIniciativa") int idIniciativa , @Param("idIniciativaRelacionada") int idIniciativaRelacionada );

    /**
     * Metodo que permite consultar las iniciativas que pertenecen a cierta area
     * @param area Area a la que pertenece el usuario que registro la iniciativa
     * @return Lista de iniciativas
     */
    public List<Iniciativa> consultarIniciativasPorArea(@Param("area") String area);

    /**
     * Metodo que permite consultar el numero de iniciativas que pertenecen a cierta area
     * @param area Area a la que pertenece el usuario que registro la iniciativa
     * @return Numero de iniciativas
     */
    public int consultarNumeroDeIniciativasPorArea(@Param("area") String area);

    /**
     * Metodo que permite registrar una iniciativa
     * @param i Iniciativa a insertar del usuario a consultar
     */
    public void insertarIniciativa(@Param("iniciativa") Iniciativa i);

    /**
     * Metodo que permite registrar una palabra clave a una inicitiava
     * @param iniciativa Iniciativa a insertar del usuario a consultar
     * @param palabra palabra a insertar
     */
    public void agregarPalabraClaveAIniciativa(@Param("iniciativa") Iniciativa iniciativa , @Param("palabra") String palabra);

    /**
     * Metodo que permite consultar todas las iniciativas
     * @return Lista de iniciativas
     */
    public List<Iniciativa> consultarIniciativas();

    /**
     * Metodo que permite consultar iniciativas que contengan una palabra clave
     * @param palabra palabra la cual va a filtrar la lista de iniciativas
     * @return Lista de iniciativas
     */
    public List<Iniciativa> consultarIniciativasPorPalabraClave(@Param("palabra") String palabra);

    /**
     * Metodo que permite consultar todas las iniciativas por id
     * @param id id de la iniciativa a consultar
     * @return Iniciativa que coincida con el id ingresado como parametro
     */
    public  Iniciativa consultarIniciativasPorId(@Param("id") int id);

    /**
     * Metodo que permite consultar todas las iniciativas por id
     * @param estado estado a actualizar
     * @param iniciativa Iniciativa a la cual se le cambiará el estado
     */
    public void cambiarEstadoAiniciativa(@Param("estado") String estado, @Param("iniciativa") Iniciativa iniciativa);

}
