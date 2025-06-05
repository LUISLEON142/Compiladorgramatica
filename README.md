Compilador SmallC → RISC-V
Este proyecto implementa un compilador para un subconjunto del lenguaje C, denominado SmallC, el cual es transformado a código ensamblador RISC-V. Utiliza herramientas modernas como ANTLR 4 y Maven, y está desarrollado en Java 21, ofreciendo una solución robusta y modular para la enseñanza y el aprendizaje de los principios de compilación. 

🎯 ¿Qué hace este proyecto?
El compilador toma un programa escrito en SmallC (archivos .c) y lo traduce a su equivalente en código ensamblador RISC-V.  Este ensamblador puede ser luego ejecutado en un simulador o hardware compatible con RISC-V.

🚀 Tecnologías Clave
ANTLR 4: Herramienta potente para la generación automática de analizadores léxicos (lexers) y sintácticos (parsers).  Simplifica la parte más compleja del análisis léxico y sintáctico al permitir definir la gramática en un archivo EBNF legible (SmallC.g4). 

Java 21: Lenguaje de programación principal para la lógica del compilador, incluyendo el visitor y la generación de código.  Ofrece portabilidad y un ecosistema maduro para el manejo de cadenas y colecciones. 

Maven: Administrador de dependencias y herramienta de empaquetado para el proyecto.  Compila el proyecto Java, incluye el runtime de ANTLR y genera un JAR ejecutable. 

IntelliJ IDEA: Entorno de Desarrollo Integrado (IDE) recomendado para trabajar con este proyecto, especialmente con el plugin de ANTLR. 
📂 Estructura de Carpetas
La organización del proyecto sigue una estructura estándar de Maven, con una clara separación de responsabilidades:

gramatica/
├── pom.xml                                  # Configuración de Maven [cite: 32]
└── src/
    └── main/
        ├── antlr4/
        │   └── SmallC.g4                    # Definición de la gramática ANTLR [cite: 32]
        └── java/
            └── gramatica/
                ├── Main.java                # Front-end: Punto de entrada, maneja el análisis léxico y sintáctico, y la invocación del visitor. [cite: 32]
                └── SmallCVisitorImpl.java   # Back-end: Generador de código ASM, recorre el AST y produce instrucciones RISC-V. [cite: 32]
                                             # (Archivos generados por ANTLR: SmallCLexer.java, SmallCParser.java, SmallCBaseVisitor.java) [cite: 32]
├── target/                                  # Salida de Maven (clases compiladas, JAR ejecutable) [cite: 32]
│   └── luis-1.0-SNAPSHOT.jar                # JAR ejecutable del compilador [cite: 32]
└── test/                                    # (Opcional) Contiene archivos de prueba unitarios. [cite: 32]
⚙️ Flujo de Compilación y Ejecución
El proceso de compilación y generación de ensamblador sigue los siguientes pasos:

Fuente: El proceso inicia con programas escritos en SmallC (archivos .c). 
Análisis Léxico y Sintáctico: ANTLR 4 lee la gramática .g4 y genera automáticamente el lexer (tokenizador) y el parser (analizador sintáctico) en Java. 
Construcción del AST: El parser produce un ParseTree (árbol de sintaxis abstracta), donde cada nodo representa una regla de la gramática (función, sentencia, expresión). 
Recorrido del AST y Generación de Código: La clase SmallCVisitorImpl implementa el patrón visitor para transformar el AST en texto, generando instrucciones RISC-V por cada nodo (variables, operaciones, saltos). 
Empaquetado y Ejecución: Maven compila el proyecto Java, incluyendo el runtime de ANTLR, y genera un JAR ejecutable.  El JAR es invocado con el archivo .c de entrada y la salida es redirigida a out.s. 

Para compilar y ejecutar un programa SmallC, sigue estos comandos en la terminal, desde el directorio raíz del proyecto (gramatica/):

Limpiar y Empaquetar el Proyecto (Genera código ANTLR y JAR):
Bash

mvn clean package
Este comando primero genera el código ANTLR, luego compila el código Java y empaqueta el JAR con todas las dependencias. 
Compilar tu código SmallC y generar el ensamblador RISC-V:
Bash

java -jar target/luis-1.0-SNAPSHOT.jar test.c > out.s
Este comando lee el archivo test.c, lo tokeniza y parsea según la gramática, recorre el AST con el visitor y escribe el ensamblador RISC-V resultante en out.s. 
📝 Gramática SmallC.g4
Ubicada en src/main/antlr4/SmallC.g4, este archivo define la sintaxis del lenguaje SmallC. 

Tokens (Fragmentos Léxicos): Incluye identificadores (ID), constantes enteras (INT), operadores (+, -, *, /, >, <, >=, <=, ==, !=), y palabras clave (int, if, else, while, func). 
Reglas Sintácticas: Define la estructura de los programas (múltiples declaraciones de funciones o sentencias), declaraciones de funciones (funcDecl), sentencias (stmt), expresiones (expr), entre otros. 
Si deseas extender o modificar el lenguaje (por ejemplo, añadir for, do-while, tipos de datos o arreglos), puedes modificar este archivo .g4. Maven regenerará automáticamente el parser al compilar. 

💻 Front-End: Main.java
Este es el punto de entrada principal del compilador.  Se encarga de:

Leer el archivo .c de entrada. 

Crear instancias de SmallCLexer (para dividir el texto en tokens) y SmallCParser (para aplicar las reglas de la gramática y construir el AST), ambos generados por ANTLR. 
Invocar parser.program() para obtener el ParseTree (representación en memoria del programa). 

Llamar a SmallCVisitorImpl.visit() para recorrer el AST y generar el código. 

Mostrar la salida del ensamblador. 
🛠️ Back-End: SmallCVisitorImpl.java
Esta clase implementa la lógica principal de generación de código RISC-V.  Recorre los nodos del AST (Árbol de Sintaxis Abstracta) y genera las instrucciones RISC-V correspondientes. 


Aquí se manejan aspectos como:

FuncDecl: Gestiona el prólogo y epílogo de la pila (32 bytes) para las funciones. 
VarDecl/AssignStmt: Gestiona las variables utilizando offsets en el registro s0 y los registros a4/a5. 
IfStmt/WhileStmt: Implementa el flujo de control con etiquetas y saltos condicionales. 
Expresiones: Traduce operaciones aritméticas y relacionales a instrucciones RISC-V como mv, add, sub, mul, div, bge, blt, etc., utilizando etiquetas únicas para los saltos. 
Manejo de la agregación de resultados para concatenaciones limpias de código. 
✅ Cómo Probar
Crea o edita un archivo test.c con tu código en SmallC en la raíz de tu proyecto.
Corre los comandos de Maven y Java indicados en la sección "Flujo de Compilación y Ejecución". 
Abre el archivo out.s generado para revisar el ensamblador RISC-V. 
Con todos estos archivos actualizados, el flujo completo generará un ensamblador idéntico al de Godbolt, cumpliendo la convención ABI y usando registros y offsets correctamente. 
