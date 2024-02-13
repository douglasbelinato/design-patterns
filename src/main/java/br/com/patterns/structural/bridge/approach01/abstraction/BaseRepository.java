package br.com.patterns.structural.bridge.approach01.abstraction;

// Left side of the bridge - Abstraction
public interface BaseRepository<T> {

    void save(T type);

}
