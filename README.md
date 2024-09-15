# Adivina la Palabra - Juego de Consola en Java

¡Bienvenido al **Juego de Adivinanza de Palabras** desarrollado en Java! 🎉

Este es un sencillo juego de consola en el que tendrás que adivinar una palabra secreta letra por letra. ¡Cuidado! Solo tienes **10 intentos** para adivinar la palabra correctamente. ¿Podrás hacerlo antes de quedarte sin oportunidades? 😬

## 🚀 Características del Juego
- La palabra secreta se muestra como un conjunto de guiones bajos (`_`) que se irán reemplazando por las letras correctas.
- Cada vez que introduces una letra, el juego te indicará si has acertado o no.
- Se permite un máximo de **10 intentos** fallidos antes de que el juego termine.
- Al final del juego, recibirás un mensaje de **"Felicidades"** si adivinaste la palabra o un temido **"Game Over"** si no lo lograste.

## 💻 Cómo jugar
1. **Clona este repositorio** o descarga los archivos.
2. Compila y ejecuta el archivo `App.java` en tu entorno de desarrollo favorito o directamente desde la terminal:
    ```bash
    javac App.java
    java App
    ```
3. El juego te pedirá que adivines la palabra secreta introduciendo una letra a la vez. Sigue las indicaciones en la pantalla.

## 🛠️ Tecnologías usadas
- **Lenguaje:** Java
- **Estructuras de control:** Bucles `for` y `while`
- **Entrada de usuario:** Clase `Scanner`

## 🤔 ¿Cómo funciona?
- **Scanner:** El programa utiliza la clase `Scanner` para leer la entrada del usuario.
- **Lógica de adivinanza:** Un bucle `while` controla el juego hasta que el usuario adivine la palabra secreta o agote los intentos disponibles.
- **Validación de letras:** Cada letra introducida se compara con la palabra secreta y, si es correcta, se actualiza la visualización de la palabra.

## Ejemplo de salida:
Palabra a adivinar: _ _ _ _ _ _ _ _ _ _ _ (11 letras) Introduce una letra, por favor: a ¡Incorrecto! Te quedan 9 intentos.

Palabra a adivinar: _ _ _ _ _ _ _ _ _ _ _ (11 letras) Introduce una letra, por favor: i Palabra a adivinar: i _ _ _ _ _ i _ _ _ _ (11 letras)

## 📜 Licencia
Este proyecto está bajo la licencia MIT. ¡Siéntete libre de utilizarlo, mejorarlo y compartirlo!

## Contribuciones
¡Las contribuciones son bienvenidas! Si tienes ideas para mejorar el juego o agregar nuevas características, no dudes en abrir un `Pull Request`. 😄

---

¡Gracias por probar el juego! 🎮 Si te ha gustado, no olvides darle una estrella ⭐ al repositorio.
