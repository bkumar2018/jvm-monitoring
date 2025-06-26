import java.util.ArrayList;
import java.util.List;

public class MemoryApp {
    public static void main(String[] args) throws InterruptedException {
        List<byte[]> memoryHog = new ArrayList<>();
        System.out.println("JVM App started. Simulating memory usage...");

        while (true) {
            // Allocate ~1MB every second
            memoryHog.add(new byte[1024 * 1024]);
            Thread.sleep(1000);
        }
    }
}

