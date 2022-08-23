package ua.levelup.Homework13;

public interface Generator <T extends Number>{
    T getNextRand();
    T getNextRandAlt();
    Class<T> getType();
}
