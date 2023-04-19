package com.plataformasHeterogeneas.proyectoAPI.controller;
import model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api")
public class ApiDemo {
    static ArrayList<Alumno> alumnos = new ArrayList<>();
    @GetMapping("saludar")
    public String saludar(){

        return "Este es un demo de api";
    }
    @GetMapping("/llenar")
    public String llenar(){
        alumnos.add(new Alumno(1,"Hector","Alexanderson",
                "Estudiante de Ingeniería en Ciencias Computacionales", "Estudiante de ciencias computacionales altamente motivado, hábil en programación, desarrollo web " +
                "y resolución de proplemas. Base sólida en estrucutura de datos, algoritmos y gestión de bases de datos. Comunicador efectivo con alto rendimiento trabajando en equipo. " +
                "Emocionado de constribuir a proyectos del mundo real como pasante.",
                "6861762917","alexanderson.chacon@gmail.com","Resolución de Problemas","Comunicación y Colaboración","Pensamiento Crítico",
                "Trabajo en Equipo","Alto conocimiento en lenguajes de programación", "Tesla",
                "Participé en el sector de inteligencia artifiial para el piloto automático.",
                "Gulfstream", "blablabla", "Google",
                "Blalala", "CETYS Universisdad", "Ago 2020 - Presente", "Promedio de 9.6"));

        return "todos llenos";
    }

    @GetMapping("/all")
    public ArrayList<Alumno> getAllAlumno(){
        return alumnos;
    }
    @GetMapping("/find/{id}")
    public Alumno getAlumnoById(@PathVariable("id")long id) {
        Alumno alumno = null;
        for (Alumno a : alumnos) {
            if (a.getId() == id) {
                alumno = a;

            }
        }
        return alumno;
    }

    @PostMapping ("/save")
    public Alumno insertAlumno(@RequestBody Alumno alumno) throws Exception
    {
        if(getAlumnoById(alumno.getId())!=null)
            return alumno;

        alumnos.add(alumno);
        return alumnos.get(alumnos.size()-1);


    }
    @DeleteMapping("/delete/{id}")
    public Alumno deleteAlumno(@PathVariable("id") long id)
    {
        Alumno alumno = getAlumnoById(id);
        alumnos.remove(alumno);
        return alumno;
    }

    @PutMapping("/update/{id}/name/{name}")
    public Alumno updateNombreById(@PathVariable("id")long id, @PathVariable("name")String nombre)
    {
        Alumno alumno = null;
        for (Alumno a: alumnos)
        {
            if (a.getId()==id)
            {
                a.setNombre(nombre);
                alumno=a;
            }
        }
        return alumno;
    }

    @PutMapping ("/update")
    public Alumno update(@RequestBody Alumno alumno) throws Exception
    {
        Alumno al = deleteAlumno(alumno.getId());
        if(al!=null)
            return insertAlumno(alumno);
        else
            return al;

    }

@GetMapping("/saveToFile")
public void save()
{
    try{
        FileOutputStream fout = new FileOutputStream("temporal.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject((alumnos));
        fout.close();
    }catch (Exception ex){
        ex.printStackTrace();
    }
}

@GetMapping("/readFromFile")
public void read() throws IOException, ClassNotFoundException {
    FileInputStream fin = new FileInputStream("temporal.txt");
    ObjectInputStream ois = new ObjectInputStream(fin);
    alumnos = (ArrayList<Alumno>) ois.readObject();
    fin.close();
}






}





