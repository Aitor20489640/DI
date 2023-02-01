class Persona {
    constructor(nombre, edad, genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    nombre;
    edad;
    genero;
    obtDetalles() {
        console.log("nombre: " + this.nombre + ", edad: " + this.edad + ", genero: " + this.genero);
    }
}

class Estudiante extends Persona {
    constructor(nombre, edad, genero, curso, grupo) {
        super(nombre, edad, genero);
        this.curso = curso;
        this.grupo = grupo;
    }

    curso;
    grupo;

    registrar() {
        console.log("El alumno se ha registrado");
    }
}

class Profesor extends Persona {
    constructor(nombre, edad, genero, asignatura, nivel) {
        super(nombre, edad, genero);
        this.asignatura = asignatura;
        this.nivel = nivel;
    }

    asignatura;
    nivel;

    asignar() {
        console.log("El profesor a sido asignado");
    }
}

const persona = new Persona("Persona", 18, "masculino");
persona.obtDetalles();
const estudiante = new Estudiante("Estudiante", 21, "Femenino", 2, "A");
estudiante.obtDetalles();
estudiante.registrar();
const profesor = new Profesor("Profesor", 43, "Masculino", "Sociales", "C2");
profesor.obtDetalles();
profesor.asignar();