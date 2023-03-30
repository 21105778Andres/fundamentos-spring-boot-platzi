package com.ingeneo.practica.prueba.component;

public class ComponentImplement implements ComponentDependency {

    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente");
    }
}
