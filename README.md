# curso_java

NOTA: Usar git en eclipse, es necesario generar un token como contraseña (Necesario para hacer commits desde eclipse)
GENERAR_TOKEN_GIT: Settigns > Developer settigns > Personal access tokens > Tokens (classic)


JEP : Documento con una propuesta de mejora, identificada por un código.
    - no sustituyen el JCP, se requieren aprobaciones de la JCP para que las JEP se conviertan en JSR
JCP : Grupo que estudia y refina un JEP, creando un JSR
JSR: Documento de solicitudes de inclusión de cambios o mejoras en el lenguaje.

Bean, pojo, modelo, dto: tipos de objetos de java

Interfaz funcional:  Una interfaz funcional define “objetos” que no guardan valores como los objetos tradicionales sino que sirven para guardar “funciones”. 
    - Para que sea interfaz funcional (FI) debe constar de un solo metodo abstracto "sin cuerpo" (puede haber más de default y static,sobreescritos object)
    - Se puede comprobar si una interfaz es funcional añadiendo "@FunctionalInterface"

Lambda (funciones anónimas): Se usarian para ejecutar funciones sin declararlas en una clase
    - Si el cuerpo de la expresion lambada tiene más de una instrucción, uso llaves para delimitar su alcance en ese caso, si la funcion devuevel algo debo usar return

Streams: 
    - Un flujo/chorro donde van los datos. 
    - Se compone de funciones intermedias y una unica de cierre. 
    - No se puede reutilizar un stream cerrado
    
Collectors: Permite transformar un stream en una colección


TextBlocks:

##package jose.carlos.java16
Records(registros): Son como una clase bean, pero con restricciones
    - Se crean por defecto:
        - Los atributos son finales (el propio registro también)
        - No puede hacer set por ser final los atributos
        - Metodos de acceso solo los get
        - Metodo toString
        - Metodo equals
        - Metodo hashCode
        - Constructor "largo"  con todos los atributos como parámetros
        - Los métodos dados, los puedo sobreescibir
    - No heredan ni pueden heredar
    - Puedo add nuevos métodos (siempre que no modifiquen el estado)

##package jose.carlos.java17
Sealed class: Mecanismo para limitar la herencia de clases e interfazces
    - Las subclases autorizadas están acotadas explícitamente 
    - Las clases que entran en esta relación deben estar en el mismo paquete o en el mismo módulo (si estamos usando un proyecto modular)
    - Cuando una subclase hyereda de una sellada, tiene que indicarlos con extends. 
	- Además, debe usar uno de los siguientes adjetivos/palabras reservadas
		- sealed -> algunas subclases podrán heredar
		- non-sealed -> todas las subclases podrán heredar
		- final -> ninguna classe puede heredar
