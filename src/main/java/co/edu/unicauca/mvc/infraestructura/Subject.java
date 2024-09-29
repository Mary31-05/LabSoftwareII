package co.edu.unicauca.mvc.infraestructura;

import java.util.ArrayList;

/**
 * Representa un sujeto abstracto en el patrón de diseño Observer.
 * Esta clase mantiene una lista de observadores y proporciona métodos
 * para agregar observadores y notificarles sobre cambios en el estado del sujeto.
 */
public abstract class Subject {

    // Lista de observadores que observan este sujeto
    ArrayList<Observer> observers;

    /**
     * Constructor por defecto para la clase Subject.
     */
    public Subject() {
        // La lógica del constructor puede añadirse aquí si es necesario
    }

    /**
     * Agrega un observador a la lista de observadores.
     *
     * @param obs el observador a ser agregado
     */
    public void addObserver(Observer obs) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(obs);
    }

    /**
     * Notifica a todos los observadores registrados sobre un cambio en el sujeto.
     * Se llama al método de actualización de cada observador con este sujeto como argumento.
     */
    public void notifyAllObserves() {
        for (Observer each : observers) {
            each.update(this);
        }
    }
}
