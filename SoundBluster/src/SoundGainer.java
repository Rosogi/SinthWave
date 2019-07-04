import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.awt.event.ActionListener;

public class SoundGainer {
    private static final int SAMPLE_RATE = 16 * 1024;
    private static final int FREQ = 50;

    public static void main(String[] args) throws LineUnavailableException {
        final AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, true);
        try(SourceDataLine line = AudioSystem.getSourceDataLine(af)) {
            line.open(af, SAMPLE_RATE);
            line.start();
            play(line);
            line.drain();
        }
    }

    public static void play(SourceDataLine line) {
        byte[] arr = getData();
        line.write(arr, 0, arr.length);
    }

    private static byte[] getData() {
        final int LENGTH = SAMPLE_RATE * 100;//длинна звучания
        final byte[] arr = new byte[LENGTH];
        for(int i = 0; i < arr.length; i++) {
            double angle = (2.0 * Math.PI * i) / (SAMPLE_RATE/FREQ);
            arr[i] = (byte) (Math.sin(angle) * 127);
        }
        return arr;
    }
}
