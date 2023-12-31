package br.unipar.observed;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author larissa.lima
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observerList){
            observer.update();
        }
    }

}
