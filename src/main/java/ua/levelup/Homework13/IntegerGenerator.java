package ua.levelup.Homework13;

import java.util.Random;

public class IntegerGenerator implements Generator <Integer>{
    private final Random random=new Random();

    @Override
    public Integer getNextRand() {
        return random.nextInt(100);
    }

    @Override
    public Integer getNextRandAlt() {
        return (int) (Math.random()*100);
    }

    @Override
    public Class<Integer> getType() {
        return Integer.class;
    }


}
