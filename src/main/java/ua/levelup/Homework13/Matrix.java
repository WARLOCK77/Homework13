package ua.levelup.Homework13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix <T extends Number> {

    T[][] matrix;

    public Matrix(Class<T> itemClass, int rows, int columns){
        T[] array = (T[])Array.newInstance(itemClass, columns);
        matrix = (T[][]) Array.newInstance(array.getClass(), rows);
        for (int i=0; i<rows; i++){
            matrix [i]=array;
        }
    }

    public Matrix(Generator<T> generator, int rows, int columns){
       matrix=(T[][])Array.newInstance(generator.getType(), rows, columns);
       fillMatrix(generator);
    }

    public static void main(String[] args) {
        Matrix<Integer> matrix=new Matrix<>(new IntegerGenerator(), 3, 3);
        matrix.print();

    }

    public void fillMatrix(Generator<T> generator){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j]= generator.getNextRandAlt();
            }
        }
    }

    public void print (){
        System.out.println(Arrays.deepToString(matrix));
    }
}
