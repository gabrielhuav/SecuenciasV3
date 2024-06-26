# Arquetipo de API Rest

Este repositorio contiene un un arquetipo de API Rest con las siguientes características:
●	Spring Boot
●	Maven
●	Java 17

## Instrucciones mínimas para poner en ejecución el proyecto

- Java Development Kit, (específicamente, se utiliza Amazon Corretto 17)
- Apache NetBeans IDE 21
- Tomcat9 configurado con Apache NetBeans IDE 21
- Proyecto Spring Boot creado a través del servicio web [spring.io](http://start.spring.io/).

## Introduction

Se implementa un método que recibe como parámetro un número entero e implemente la secuencia de Collatz en la clase serieCollatz.java
Se implementa un método que recibe como parámetro un número entero e implemente la secuencia de FizzBuzz en la clase serieFizzBuzz.java
Se implementa un endpoint en el API que responde a las siguientes características:

- Path: /api/sequence/collatz/{input}
- Métodos: PUT, GET (además del método PUT original, se agrega un método GET para la misma ruta)
- Respuesta: Se devuelve un objeto Map que contiene la secuencia de Collatz como una cadena JSON
- El parámetro input se puede enviar por la ruta (path) como un parámetro de ruta (@PathVariable)
- Se ha agregado un método GET adicional que responde a la ruta /api/sequence/collatz sin parámetro input, que devuelve la secuencia de Collatz para un valor predeterminado.
