# Java de 0 a Programas Gráficos Simples (pasando por POO)
### Guía rápida pero bien hecha para 2do semestre de Ingeniería de Sistemas

> Ya sabes: `void main()`, `Scanner`, `if/else`, variables. Partimos de ahí, sin repetir lo obvio, hasta que hagas GUIs con Swing.

**Cómo usar esta guía:**
1. Lee en orden. No te saltes fases.
2. Escribe TODO el código a mano, no copies-peges.
3. Haz los **Retos**. Si no puedes con un reto, repasa la fase, no avances.
4. Tiempo estimado realista sin afán: 2-4 semanas a 1h/día.

**Lo que vas a lograr al final:**
- Entender POO de verdad (no solo memorizar "herencia y polimorfismo").
- Hacer 3 programas gráficos: Calculadora, Lista de Tareas y un Mini-Juego/Dibujo.
- Dejar de programar todo en un solo `main()` gigante.

**Tu entorno:** Java 27 + IntelliJ IDEA. Te sirven las 2 formas de `main`:
```java
// Forma simple (la que ya usas, Java 21+)
void main() {
    System.out.println("Hola Mundo");
}

// Forma clásica (la que verás en parciales, libros y StackOverflow)
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```
En esta guía uso la forma clásica cuando hay varias clases, y la simple para ejemplos cortos. Ambas funcionan.

---

## FASE 0 — Repaso relámpago (15 min)

Ya dominas esto, solo verifica:

```java
void main() {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Digite n1: ");
    int n1 = sc.nextInt();
    System.out.print("Digite n2: ");
    int n2 = sc.nextInt();
    System.out.println("Suma: " + (n1 + n2));
    sc.close();
}
```

Si eso te parece fácil, pasa a Fase 1. Si te confunde `sc.nextInt()` o el `+` con Strings, repásalo.

### ✅ Reto 0 — Calentamiento
Modifica tu `calculadoraSimple` para que:
1. No se cierre después de 1 operación, sino que pregunte hasta que el usuario digite `0` para salir (pista: `while`).
2. No se rompa al dividir por cero (ya lo tienes a medias: revisa qué pasa con `n2 < 0` o división `7/2`).

Criterio de logrado: puedes explicar por qué `7/2` da `3` y no `3.5` en Java.

---

## FASE 1 — Fundamentos que la universidad no explica bien

### 1.1 Variables y tipos: lo único que importa

```java
int edad = 19;          // enteros: -2 mil millones a 2 mil millones
long poblacion = 50_000_000L; // enteros gigantes
double promedio = 4.2;  // decimales (usa este, no float)
boolean pasa = promedio >= 3.0; // true / false
char letra = 'A';       // un solo carácter con comilla simple
String nombre = "Sebas"; // texto con comilla doble (es un OBJETO, no un primitivo)
```

3 reglas de oro:
1. `int` para contar, `double` para promedios/dinero simple, `boolean` para decisiones, `String` para texto.
2. Java es fuertemente tipado: no puedes hacer `int x = "hola";`
3. División entera: `7/2 = 3`. Si quieres decimales: `7/2.0 = 3.5`.

### 1.2 Scanner sin sufrir (error #1 de todo principiante)

```java
void main() {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Edad: ");
    int edad = sc.nextInt();
    sc.nextLine(); // <- TRUCO: limpia el Enter que queda colgado
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.println(nombre + " tiene " + edad + " años");
}
```

> Si no pones `sc.nextLine()` después de `nextInt()`, el siguiente `nextLine()` se salta. Esto te va a pasar en un parcial. Grábatelo.

### 1.3 Condicionales: `if` ya lo sabes, suma `switch`

```java
void main() {
    int opc = 2;
    // if-else para rangos
    if (opc < 1 || opc > 4) {
        System.out.println("Opción inválida");
    }

    // switch para menús (más limpio que 10 else-if)
    switch (opc) {
        case 1 -> System.out.println("Suma");
        case 2 -> System.out.println("Resta");
        case 3, 4 -> System.out.println("Multiplica o divide");
        default -> System.out.println("Opción inválida");
    }
}
```

Otros operadores que necesitas: `&&` (y), `||` (o), `!` (no), `%` (residuo), `!=` (distinto).

### 1.4 Bucles: `for` vs `while`

```java
// for: cuando sabes cuántas veces
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}

// while: cuando depende del usuario
java.util.Scanner sc = new java.util.Scanner(System.in);
int opc = -1;
while (opc != 0) {
    System.out.print("Digite 0 para salir: ");
    opc = sc.nextInt();
}

// for-each: para recorrer arreglos/listas (lo usarás muchísimo)
int[] notas = {4, 5, 3, 2};
for (int n : notas) {
    System.out.println(n);
}
```

### 1.5 Arreglos

```java
void main() {
    int[] notas = new int[3]; // crea 3 espacios: [0,0,0]
    notas[0] = 5;
    notas[1] = 4;
    notas[2] = 3;
    // notas[3] = 5; // ERROR: ArrayIndexOutOfBounds

    System.out.println("Tamaño: " + notas.length);
    System.out.println("Primera: " + notas[0]);
}
```
Limitación clave: un arreglo NO crece. Por eso luego veremos `ArrayList`.

### 1.6 Métodos: deja de meter todo en `main()`

Tu código actual: todo en `main()`. Código profesional: `main()` de 5 líneas que llama métodos.

```java
public class Calculadora {
    // método que recibe 2 ints y devuelve un int
    static int sumar(int a, int b) {
        return a + b;
    }

    static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(sumar(5, 3));      // 8
        System.out.println(dividir(7, 2));    // 3.5
    }
}
```

Entiende esto: `static` = "puedo llamarlo sin crear objeto". Por ahora usa `static` en todo. En POO entenderás cuándo quitarlo.

### 1.7 String: `==` vs `.equals()`

```java
void main() {
    String a = new String("hola");
    String b = new String("hola");
    System.out.println(a == b);       // false (compara DIRECCIÓN en memoria, MAL)
    System.out.println(a.equals(b));  // true (compara CONTENIDO, BIEN)

    String nombre = "  Sebas OC  ";
    System.out.println(nombre.trim().toLowerCase()); // "sebas oc"
    System.out.println(nombre.length()); // incluye espacios
    System.out.println("Hola Sebas".contains("Sebas")); // true
}
```
Regla: **Strings siempre se comparan con `.equals()`, nunca con `==`.**

### ✅ Retos Fase 1

**R1 - Par o impar mejorado:** Pide 10 números en un `for`, cuenta cuántos pares e impares hay, muestra el mayor. No uses 10 variables, usa bucle + 3 variables.

**R2 - Validador de nota:** Pide nota (0.0 a 5.0). Si está fuera de rango, vuelve a pedirla (`while`). Luego di si aprobó (>=3.0), habilita (>=2.0) o perdió. Extrae la lógica a un método `static String clasificar(double nota)`.

**R3 - El bug de Scanner:** Haz un programa que pida edad (`nextInt`) y luego nombre completo (`nextLine`) y dirección (`nextLine`). Haz que funcione sin saltarse nada. Si lo logras sin mirar el ejemplo, pasas.

**R4 - Array invertido:** Pide 5 números, guárdalos en arreglo, imprímelos al revés. Luego intenta pedir 6 y entiende el error.

---

## FASE 2 — POO Parte 1: pensar en objetos (el salto mental)

Aquí es donde la mayoría se pierde porque memoriza definiciones. No lo hagas. Entiende esto:

> **Clase = molde / plano. Objeto = cosa real hecha con ese molde.**
> `Clase Estudiante` -> objetos `sebas`, `ana`, `luis`, cada uno con sus propios datos.

### 2.1 Tu primera clase de verdad

Crea un archivo `Estudiante.java`:

```java
public class Estudiante {
    // 1. ATRIBUTOS (qué TIENE)
    String nombre;
    double promedio;

    // 2. CONSTRUCTOR (cómo NACE)
    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;       // this = "este objeto"
        this.promedio = promedio;
    }

    // 3. MÉTODOS (qué HACE)
    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    boolean aprueba() {
        return promedio >= 3.0;
    }
}
```

Úsala desde `Main`:

```java
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Sebas", 4.2);
        Estudiante e2 = new Estudiante("Ana", 2.5);

        e1.saludar(); // Hola, soy Sebas
        System.out.println(e1.aprueba()); // true
        System.out.println(e2.aprueba()); // false

        // e1 y e2 son independientes: cambiar e1 no afecta e2
        e1.promedio = 5.0;
    }
}
```

Ejecuta mentalmente: `new` = "fabrica un objeto nuevo en memoria". `e1` es solo la dirección para encontrarlo.

### 2.2 Encapsulamiento: `private` + getters/setters

Problema: `e1.promedio = -99;` es válido y absurdo. Solución: prohibir acceso directo.

```java
public class Estudiante {
    private String nombre;    // solo esta clase puede tocarlos
    private double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        setPromedio(promedio); // reutiliza la validación
    }

    // GETTER: leer
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }

    // SETTER: escribir con reglas
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 5.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido: " + promedio);
        }
    }

    // toString: cómo se imprime el objeto
    @Override
    public String toString() {
        return nombre + " (" + promedio + ")";
    }
}
```

> Encapsulamiento en 1 frase: **"mis atributos son privados, si quieres cambiarlos pasa por mis reglas (setters)".**

### 2.3 Separa en archivos como un profesional

- `Estudiante.java` -> solo el molde.
- `Main.java` -> solo prueba/usa.

Nunca pongas 5 clases públicas en 1 archivo. 1 archivo = 1 clase pública del mismo nombre.

### ✅ Retos Fase 2

**R5 - CuentaBanco:** Clase con `titular` y `saldo` (privados). Métodos `depositar(cantidad)`, `retirar(cantidad)` (no dejar saldo negativo), `mostrar()`. Constructor que no acepte saldo inicial negativo. Pruébala creando 2 cuentas en `main`.

**R6 - Libro:** Atributos `titulo`, `autor`, `paginas`, `leido` (boolean). Métodos `marcarLeido()`, `toString()` bonito. Crea 3 libros y muéstralos con `System.out.println(libro)` (debe usar tu `toString` automáticamente).

**R7 - Refactor:** Toma tu `calculadoraSimple` y conviértela en clase `Calculadora` con métodos `sumar/restar/multiplicar/dividir`. El `main` solo debe pedir datos y llamar métodos. Si tu `main` tiene más de 20 líneas, está mal.

Criterio de logrado: puedes explicar sin mirar qué es `this`, por qué `private`, y qué hace `new`.

---

## FASE 3 — POO Parte 2: lo que te preguntan en parciales

### 3.1 `static` vs instancia

```java
public class Contador {
    static int totalObjetos = 0; // UNO solo para TODA la clase
    String nombre;               // UNO por cada objeto

    public Contador(String nombre) {
        this.nombre = nombre;
        totalObjetos++;
    }
}
// Uso:
Contador a = new Contador("A");
Contador b = new Contador("B");
System.out.println(Contador.totalObjetos); // 2 (se accede por la CLASE)
System.out.println(a.nombre); // "A" (se accede por el OBJETO)
```
Regla: `static` = de la clase (ej: `Math.random()`). Sin `static` = de cada objeto (ej: `e1.getNombre()`).

### 3.2 Herencia: `extends` (ES-UN)

```java
// Padre / Superclase
public class Persona {
    protected String nombre; // protected = lo ven los hijos
    public Persona(String nombre) { this.nombre = nombre; }
    public void presentarse() { System.out.println("Soy " + nombre); }
}

// Hija / Subclase: Estudiante ES-UNA Persona
public class EstudianteUni extends Persona {
    private String carrera;
    public EstudianteUni(String nombre, String carrera) {
        super(nombre); // llama al constructor del padre, SIEMPRE primero
        this.carrera = carrera;
    }
    @Override
    public void presentarse() {
        System.out.println("Soy " + nombre + ", estudio " + carrera);
    }
}
```

### 3.3 Polimorfismo: 1 variable, muchas formas

```java
Persona p1 = new Persona("Carlos");
Persona p2 = new EstudianteUni("Sebas", "Sistemas"); // ¡válido! Un estudiante ES persona

p1.presentarse(); // "Soy Carlos"
p2.presentarse(); // "Soy Sebas, estudio Sistemas" <- Java elige el método del HIJO
```
> Polimorfismo en 1 frase: **"pido algo genérico (`Persona`), Java ejecuta lo específico (`EstudianteUni`)".** Esto es lo que permite listas mixtas y GUIs (un `JButton` ES-UN `Component`).

### 3.4 Clases abstractas e Interfaces (no las confundas)

```java
// Abstracta: "molde incompleto, no se puede instanciar"
abstract class Figura {
    abstract double area(); // los hijos ESTÁN OBLIGADOS a implementarlo
    void describir() { System.out.println("Soy una figura"); } // puede tener código
}
class Cuadrado extends Figura {
    double lado;
    Cuadrado(double lado) { this.lado = lado; }
    @Override double area() { return lado * lado; }
}

// Interfaz: "contrato de habilidades"
interface Dibujable {
    void dibujar(); // solo firma, sin código
}
class Circulo extends Figura implements Dibujable {
    double radio;
    Circulo(double r) { this.radio = r; }
    @Override double area() { return Math.PI * radio * radio; }
    @Override public void dibujar() { System.out.println("○ dibujando círculo..."); }
}
```
Truco de parcial: **heredas de 1 sola clase (`extends`), pero implementas varias interfaces (`implements`).** Ej: `class Boton extends Component implements Clickeable, Dibujable`.

### 3.5 `ArrayList`: el arreglo que sí crece (lo usarás en GUI)

```java
import java.util.ArrayList;

void main() {
    ArrayList<String> tareas = new ArrayList<>();
    tareas.add("Estudiar POO");
    tareas.add("Hacer GUI");
    tareas.remove(0);
    // tareas.remove("Hacer GUI"); // también por valor

    System.out.println(tareas.size()); // 1
    for (String t : tareas) {
        System.out.println("- " + t);
    }
}
```
Y con tus objetos: `ArrayList<Estudiante> curso = new ArrayList<>();`

### 3.6 Excepciones: que no se rompa el programa

```java
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Digite un número: ");
        int n = Integer.parseInt(sc.nextLine()); // puede fallar si escriben "abc"
        System.out.println("10 / n = " + (10 / n)); // puede fallar si n=0
    } catch (NumberFormatException e) {
        System.out.println("Eso no es un número.");
    } catch (ArithmeticException e) {
        System.out.println("No dividas por cero.");
    }
}
```
En GUI esto es vital: si el usuario deja un campo vacío y divides, la app no debe cerrarse.

### ✅ Retos Fase 3

**R8 - Herencia real:** `Vehiculo` (marca, modelo, `mostrar()`) <- `Carro` (numPuertas) y `Moto` (cilindraje). Sobrescribe `mostrar()` en hijas llamando `super.mostrar()`. Crea `ArrayList<Vehiculo>` con 2 carros y 2 motos e imprímelos en bucle (polimorfismo).

**R9 - Figuras:** Implementa `Figura` abstracta + `Cuadrado`, `Circulo`, `Triangulo` con `area()`. Crea lista, calcula área total. No debe poder hacerse `new Figura()`.

**R10 - Lista de estudiantes blindada:** `ArrayList<Estudiante>`, menú con `while`: 1.Agregar 2.Listar 3.Buscar por nombre 0.Salir. Usa `try/catch` para que promedio inválido o entrada mala no tumbe el programa.

**R11 - Mini-proyecto consola (obligatorio antes de GUI):** Sistema de biblioteca: clase `Libro` + `ArrayList<Libro>` + menú agregar/prestar/devolver/listar. `prestar()` no debe prestar si ya está prestado. Este diseño lo reutilizarás en GUI.

---

## FASE 4 — Programas Gráficos con Swing (la meta)

Swing viene con Java, no instalas nada. Es viejo pero perfecto para aprender eventos y POO visual.

Concepto clave: **todo es un objeto.** `JFrame` es la ventana, dentro pones `JPanel` (lienzo), dentro `JButton`, `JLabel`, `JTextField`. Y reaccionas con **eventos** (clicks).

### 4.1 Tu primera ventana (5 líneas)

```java
import javax.swing.*;

public class Ventana1 {
    public static void main(String[] args) {
        JFrame v = new JFrame("Mi primera ventana");
        v.setSize(400, 300); // ancho x alto
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar = terminar
        v.setLocationRelativeTo(null); // centrar en pantalla
        v.setVisible(true);
    }
}
```
> Todo Swing debe crearse en el hilo de eventos. Forma 100% correcta (úsala desde ahora):
```java
public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new MiVentana());
}
```

### 4.2 Componentes + Layout (orden)

```java
import javax.swing.*;
import java.awt.*;

public class Ventana2 extends JFrame {
    public Ventana2() {
        setTitle("Login simple");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10)); // filas, columnas, espacio

        add(new JLabel("Usuario:"));
        JTextField txtUser = new JTextField();
        add(txtUser);

        add(new JLabel("Clave:"));
        JPasswordField txtPass = new JPasswordField();
        add(txtPass);

        JButton btn = new JButton("Entrar");
        add(new JLabel()); // relleno
        add(btn);

        btn.addActionListener(e -> {
            String u = txtUser.getText();
            JOptionPane.showMessageDialog(this, "Hola " + u);
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ventana2());
    }
}
```

Layouts que necesitas:
- `FlowLayout()` = uno al lado del otro (default de JPanel).
- `GridLayout(filas, cols)` = rejilla, perfecto para formularios/calculadora.
- `BorderLayout()` = NORTH/SOUTH/EAST/WEST/CENTER, ideal para ventana principal.

### 4.3 Eventos: el corazón de GUI

```java
boton.addActionListener(e -> {
    // este código corre CUANDO hacen click
    etiqueta.setText("Click!");
});
```
`e -> {...}` es una **lambda**: método corto sin nombre. `e` es el evento. Todo botón, menú y timer usa esto.

Leer/escribir campos:
```java
String texto = campo.getText();
campo.setText("");
etiqueta.setText("Hola " + texto);
Double.parseDouble(campo.getText()); // String -> número (rodear con try/catch)
```

### 4.4 Dibujar: `JPanel` + `paintComponent` (para juegos/dibujo)

```java
import javax.swing.*;
import java.awt.*;

class Lienzo extends JPanel {
    int x = 50, y = 50;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // siempre primero (borra)
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 60, 60); // círculo
        g.setColor(Color.BLACK);
        g.drawString("Mi primer dibujo", 20, 20);
    }
}
public class VentanaDibujo extends JFrame {
    public VentanaDibujo() {
        setTitle("Dibujo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Lienzo());
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaDibujo());
    }
}
```
Con esto + `Timer` puedes animar: un `Timer` que cada 16ms cambia `x` y llama `repaint()`.

### ✅ Retos Fase 4 (en orden, no te los saltes)

**R12 - Ventana + botón:** Ventana 400x300 centrada. Un `JLabel` "Hola" y un `JButton` "Saludar" que al click cambie el label a "Hola, [tu nombre]". Usa `BorderLayout`.

**R13 - Contador:** Label con número `0`, botones `+` y `-`. El `-` no debe bajar de 0. Aquí practicas variables de instancia vs locales (el contador debe ser atributo, no variable del método).

**R14 - Calculadora GUI:** 2 `JTextField` + 4 botones (+ - * /) + `JLabel` resultado. Usa `try/catch` para texto no numérico y división por cero con `JOptionPane.showMessageDialog` de error. Layout `GridLayout`. *Este es tu R7 pero gráfico: reutiliza la clase `Calculadora`.*

**R15 - Lista de tareas GUI:** `JTextField` + botón Agregar + `JList`/`JTextArea` + botón Borrar. Por dentro usa `DefaultListModel<String>` o `ArrayList<String>`. No debe aceptar tareas vacías.

**R16 - Atrapa el botón (mini-juego):** `JPanel` con un botón que cada vez que lo intentas clickear se mueve a posición aleatoria (`setLocation` + layout `null`). Cuenta puntos en un `JLabel`. Practica `Random` + eventos + `Timer` si quieres límite de 30 seg.

**R17 - Mini-Paint:** `JPanel` donde al arrastrar el mouse (`MouseMotionListener`) dibujas círculos. Agrega botón "Limpiar" y 3 botones de color. Este usa `paintComponent` + `ArrayList` de puntos. Si lo logras, ya entiendes POO gráfica.

Ejemplo base para R17 (complétalo):
```java
// Pista: guarda los puntos
ArrayList<Point> puntos = new ArrayList<>();
ArrayList<Color> colores = new ArrayList<>();
// en mouseDragged: puntos.add(e.getPoint()); repaint();
// en paintComponent: recorre puntos y dibuja
```

---

## 🏁 Proyectos finales (elige 1 para entregar / portafolio)

**Opción A - Calculadora completa (fácil-media):**
Display + botones 0-9 + operaciones + `=` + `C`. Usa `GridLayout(4,4)`. Lógica en clase separada `ModeloCalculadora`, GUI en `VentanaCalculadora`.

**Opción B - Gestión de Estudiantes (media, la más universitaria):**
Formulario (nombre, carrera, promedio) + tabla/lista + botones Guardar/Eliminar/Buscar + guardar en archivo `.txt` (`Files.write`). Demuestra POO + ArrayList + GUI + excepciones. Ideal para mostrar al profe.

**Opción C - Snake simplificado o Breakout (difícil, la más divertida):**
`JPanel` + `Timer(100ms)` + `KeyListener` (flechas) + `ArrayList<Point>` serpiente. Si haces esto sin tutorial copiado, ya estás por encima del promedio de 2do semestre.

Estructura recomendada para cualquier proyecto:
```
MiProyecto/
  src/
    Main.java        // solo lanza la ventana
    Modelo.java      // clases POO puras (Estudiante, Calculadora...)
    Ventana.java     // solo Swing, llama al modelo
```

---

## ⚠️ Errores que te van a pasar (guárdalo)

1. `Exception in thread "main" java.util.InputMismatchException` -> pediste `nextInt` y escribieron letra. Solución: lee con `nextLine` + `Integer.parseInt` + `try/catch`.
2. Se salta el `nextLine()` -> falta `sc.nextLine()` limpiador después de `nextInt()`.
3. `NullPointerException` -> usaste un objeto sin `new`. Ej: `JButton b; b.setText("x");` // b es null.
4. `NumberFormatException` en GUI -> `Double.parseDouble("")` con campo vacío. Valida antes.
5. Ventana no aparece / aparece vacía -> olvidaste `setVisible(true)` o agregar componentes antes de mostrar.
6. Todo `static` en POO -> si todo es static no hay objetos. `static` solo para utilidades y `main`.
7. Comparar Strings con `==` en login -> siempre usa `.equals()`.
8. División `int/int` da `0` -> `5/9 = 0`. Usa `5.0/9`.

## ✅ Checklist final — ¿ya sabes Java básico?

- [ ] Explico diferencia clase/objeto sin leer.
- [ ] Creo clase con private + constructor + getters/setters + toString.
- [ ] Uso herencia + `@Override` + polimorfismo con ArrayList de padres.
- [ ] Uso ArrayList, no solo `[]`.
- [ ] Mi `main` es corto, la lógica está en métodos/clases.
- [ ] Manejo errores con try/catch, mi programa no se cae con entrada mala.
- [ ] Hago JFrame con botones, campos, layouts y eventos lambda.
- [ ] Hice R14 (calculadora GUI) y uno entre R15-R17.

Si marcas todo: pasa a JavaFX (más moderno que Swing), archivos + `HashMap`, y luego bases de datos + Git.

## 📚 Para seguir (cuando termines)

- Documentación oficial: `docs.oracle.com/javase/tutorial/uiswing/`
- Practica POO: inventa clases de todo (Universidad, Playlist, InventarioTienda).
- Siguiente paso universitario: relaciones entre clases (un `Curso` TIENE `ArrayList<Estudiante>`), archivos, y pruebas unitarias con JUnit.

---
*Hecho para ti: ve a tu ritmo, pero no avances de fase sin completar sus retos. El que hace 15 programas pequeños aprende más que el que lee 500 páginas.*
