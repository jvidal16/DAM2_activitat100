# Activitat 1.00 Manipulació d’arxius i directòris

## Objectius
Conèixer classes per a la manipulació d’arxius i directòris en Java

## Enunciats
1. Crear un programa en Java que permeti
  * crear directòris
  * crear arxius
  * crear arxius temporals
  * Escriure dades d’alumne en un arxiu en format “csv”.
  * Llistar un directori (tipus dir o ls)
  * Llistar el contingut de tots els arxius “csv”

*Atenció*: De moment feu que les funcions retornin un valor booleà: true per si s’acaba correctament, false per si s’ha produït algun error

*Atenció*: Gestiona les excepcions que siguin necessàries. Però, de moment, no cal afegir-ne de noves

## Exemple

```java
public static void main(String[] args) {
   crearDir("E:/test");
}


public static boolean crearDir(String dir) {
   File file = new File(dir);
   ...
}
```

## Entrega
Un pdf amb el codi ben formatat i amb sintaxis colorejada.

## Avaluació
Aquesta activitat no puntua, però sí s’ha d’entregar obligatòriament.
