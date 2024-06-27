# Arquetipo de API Rest

Este repositorio contiene un un arquetipo de API Rest con las siguientes características:
●	Spring Boot
●	Maven
●	Java 17

## Instrucciones mínimas para poner en ejecución el proyecto

- Java Development Kit, (específicamente, se utiliza Amazon Corretto 17)
- Apache NetBeans IDE 21 (Opcional)
- Tomcat9
- Proyecto Spring Boot creado a través del servicio web [spring.io](http://start.spring.io/).

## Introduction
1. Se implementa un método que recibe como parámetro un número entero e implemente la secuencia de Collatz
   - En la clase serieCollatz.java
     - Se puede probar con http://localhost:8080/collatz/19 y con http://localhost:8080/collatz?n=19

2. Se implementa un método que recibe como parámetro un número entero e implemente la secuencia de FizzBuzz
   - En la clase serieCollatz.java
     - Se puede probar con http://localhost:8080/fizzbuzz/15 y con http://localhost:8080/fizzbuzz?n=15

3. Se implementa un endpoint en el API que responde a las siguientes características:
   - Path: /api/sequence/collatz/{input}
     - Se puede probar con http://localhost:8080/fizzbuzz/15 y con http://localhost:8080/fizzbuzz?n=15
   - Métodos: PUT, GET (además del método PUT original, se agrega un método GET para la misma ruta)
   - Respuesta: Se devuelve un objeto Map que contiene la secuencia de Collatz como una cadena JSON
   - Se ha agregado un método GET adicional
     - Responde a la ruta /api/sequence/collatz sin parámetro input
     - Devuelve la secuencia de Collatz para un valor predeterminado.