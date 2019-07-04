import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import static java.lang.Math.sin;
import javax.sound.sampled.AudioFormat;

//Звук хар-ся двумя величинами - амлитудой и частотой
//Амплитуда описывает как максимально высоко может "подниматься" волна, т.е. её максимальное значение смещения
//Частота описывает сколько раз в секунду повторяеться сигнал

public class Main {

    public static void main(String[] args) {

    }

    private AudioFormat getAudioFormat(){
        float sampleRate = 8000.0F;
        int sampleSizeInBits = 16;
        int channels = 1;
        boolean signed = true;
        boolean bigEndian = false;
        return new AudioFormat(
                sampleRate,
                sampleSizeInBits,
                channels,
                signed,
                bigEndian);
    }
}






        /*int[] arrayX = new int[1000];//частота?
        byte[] arrayY = new byte[arrayX.length];
        for (int i = 0;i<=arrayX.length-1;i++){
            arrayX[i] = i;
            Random TestValue = new Random();
            arrayY[i] = (byte) TestValue.nextInt();
            System.out.println("X value = " + arrayX[i] + "; Y value = " + arrayY[i] + ";");
        }*/

    //Каждое четное значение в массиве должно быть равно среднему значению между двумя соседними нечетными

