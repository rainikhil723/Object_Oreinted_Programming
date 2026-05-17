package Interfaces;

public interface Engine {

    final int PRICE = 200000;
    //ussually interface me variables are final so no one can override

    void start();

    void stop();

    void acc();
}
