import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class Functional {
  private Functional() { }

  private static final int MIN_LENGTH = 20;

  public static void main(String[] args) throws IOException {
    var input = Paths.get(args[0]);

    long start = System.nanoTime();

    int n = Files.lines(input)
        .filter(line -> !line.trim().isEmpty())
        .mapToInt(String::length)
        .filter(length -> length >= MIN_LENGTH)
        .sum();

    long stop = System.nanoTime();

    System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
  }
}