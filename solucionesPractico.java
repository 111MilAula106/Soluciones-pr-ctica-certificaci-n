/*
*************************************
* SOLUCIONES PRACTICA CERTIFICACION *
*************************************
-------------------------
EJERCICOS BASE DE DATOS:
-------------------------
1)
SELECT e.id_proveedor, e.id_articulo 
FROM PROVEEDOR p JOIN ENVIO e
ON p.id_proveedor = e.id_proveedor
Lista todos los id de proveedores con sus respectivos id de artículos.

2)
SELECT SUM(e.cantidad), e.id_proveedor, e.id_articulo
FROM PROVEEDOR p JOIN ENVIO e
ON p.id_proveedor=e.id_proveedor
AND e.id_articulo IN(SELECT a.id_articulo FROM ARTICULO a)
Listará la cantidad total de cada artículo, su proveedor id y su id.

3)
Se listará la cantidad total de cada artículo cuya catidad sea mayor a 100, el id de su proveedor y su id de artpiculo, agrupando por id de proveedor y ordenándolo de manera descendente según la ciudad del proveedor.
*La tuplas envios están mal ordenadas los valores?
** ORDER BY e.ciudad DESC sería p.ciudad ?

4)
SELECT a.Nombre, a.Apellido, a.DNI, a.Edad, c.Nombre

FROM Alumno a JOIN Inscripcion i

ON a.DNI=i.Alumno_DNI

JOIN Curso c 
ON i.Curso_idCurso=c.idCurso

WHERE i.Nota >= 7

ORDER BY a.Apellido DESC

5)
SELECT o.idOrden FROM Orden o
JOIN Cliente c ON o.Cliente_dni=c.dni
WHERE c.apellido LIKE 'Rodriguez'

6)??? *No sé qué hay que hacer*
'monto' decimal(8,2) unsigned NOT NULL,

7)??? *No sé qué hay que hacer*
FOREIGN KEY ('codigoInfraccionNomenclada') REFERENCES 'InfraccionNomenclada'('codigo') ON DELETE NO ACTION ON UPDATE NO ACTION

-----------------
EJERCICIOS JAVA:
-----------------
1)
a)13 21
b)5 6
c)6 6
d)7 11

2)
int[] a1 = {26, 19, 14, 11, 10};

3)int[] array = {3, 24, 8, -5, 7, 1}; //6 en vez de 7

4)
*El constructor va sin "void".
**El el constructor, la referencia a los atributos de clase no llevan explícito el tipo ("int"), ya están definidos.

5)*Iría todo seguido*
Dentro del método primero. 

Dentro del método tercero.
Dentro del método primero.
Dentro del método segundo.
Dentro del método primero.

Dentro del método segundo.
Dentro del método primero.

Dentro del método tercero.
Dentro del método primero.
Dentro del método segundo.
Dentro del método primero.

6)
a)Nada
b)Error
c)Salida
d)Error
e)Salida
f)Salida *no habría salto de línea*

7)
public List<Productos> ListaDeProductosFiltrada(char letra){
List<Productos> productosFiltrados;
productosFiltrados = new ArrayList<>();
for(Productos p: productos)
 if(p.charAt[0].equalsIgnoreCase(letra)
     productosFiltrados.add(p);
return productosFiltrados;
}

8)
public class CorreoPublico{
 String contenido;
 static String nombreUsuarioConfigurado = Pepito;
 
 public String leer(String nombreUsuario){
  if(this.nombreUsuarioCongigurado.equalsIgnoreCase(nombreUsuario) 
   return contenido;
  else System.out.println("ERROR: el usuario no coincide.");
 }
}

9) 
class NoticiaResumida extends Noticia{
    private String cont;
    private String tit;
    public String mostrarResumen(){
        tit=getTitulo().substring(0,20)+"\n";
        cont=getContenido().substring(0,50)+"...";
        return tit + cont;
    }
} 

10.1)
En la clase AdministradorDeInscripciones:
private List<Curso> cursos;
public List<Carrera> getCarreras(){return carreras;}
public List<Curso> mostrarCursos(int unAño){
  cursos = new ArrayList<>();
  for(Carrera c: carreras){
    for(Curso m: c.getMaterias()){
      if(m.getAño() == unAño){
        cursos.add(m);
      }
    }
  }
  return cursos;
}

10.2)
**== reemplazarlo por equals
if(estudiante.getApellido().equalsIgnoreCase(apellido))
    estudiantesConApellido.add(estudiante);

10.3)
*Ordena las materias según el año de menor a mayor.*

11.1) ??? *local o visitante? No entiendo la diferencia, la googlié y la entendí aún menos. Por ello puede que este código no tenga sentido...o sí.*
En la clase Equipo:
public int diferenciaDeGoles(){
 int goles,contras,diferencia;
 for(Partido p: partidosJugados){
  goles+=p.getResultado().getGolesLocal();
  contras+=p.getResultado().getGolesVisitante();
 }
 if(goles<contras)
  diferencia=contras-goles;
 else diferencia=goles-contras;
 return diferencia;
}

11.2) ???

11.3)
*Promedio de partidos ganados por el equipo local.*

12) ??? JavaDoc

13) ??? JavaDoc

14)
public interface Acciones(){
 public void comer();
 public void jugar(); 
}
*/