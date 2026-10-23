import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        while (true) {
            System.out.print("Номер задания (2-5, 0 - выход): ");
            int task = sc.nextInt();
            if (task == 0) break;

            switch (task) {
                case 1:{
                    Path path = Paths.get("test.txt");
                    Files.writeString(path,"Любимый праздник новый год с ним ступает рождество и подарки нам дает", StandardCharsets.UTF_8);
                    System.out.println(Files.readAllLines(path,StandardCharsets.UTF_8));
                    break;
                }
                case 2: {
                    Path f = Paths.get("f.txt");
                    List<String> lines = new ArrayList<>();
                    System.out.println("Введите 10 целых чисел:");
                    for (int i = 0; i < 10; i++) lines.add(String.valueOf(sc.nextInt()));
                    Files.write(f, lines, StandardCharsets.UTF_8);

                    int count = 0;
                    System.out.println("Числа из файла:");
                    for (String s : Files.readAllLines(f, StandardCharsets.UTF_8)) {
                        int x = Integer.parseInt(s.trim());
                        System.out.print(x + " ");
                        if (x > 0 && x < 100) count++;
                    }
                    System.out.println("\nКоличество (0 < x < 100): " + count);
                    break;
                }
                case 3: {
                    Path f = Paths.get("f.txt"), g = Paths.get("g.txt"), h = Paths.get("h.txt");
                    List<String> src = new ArrayList<>();
                    for (int i = 0; i < 20; i++) src.add(String.valueOf(rnd.nextInt(200) - 50));
                    Files.write(f, src, StandardCharsets.UTF_8);

                    List<String> div6 = new ArrayList<>(), other = new ArrayList<>();
                    for (String s : Files.readAllLines(f, StandardCharsets.UTF_8)) {
                        int x = Integer.parseInt(s.trim());
                        if (x % 6 == 0) div6.add(s); else other.add(s);
                    }
                    Files.write(g, div6, StandardCharsets.UTF_8);
                    Files.write(h, other, StandardCharsets.UTF_8);

                    System.out.println("f: " + src);
                    System.out.println("g (кратные 6): " + div6);
                    System.out.println("h (остальные): " + other);
                    break;
                }
                case 4: {
                    Path f = Paths.get("power.txt");
                    sc.useLocale(java.util.Locale.US);
                    List<String> lines = new ArrayList<>();
                    System.out.println("Введите 12 значений мощности:");
                    for (int i = 0; i < 12; i++) lines.add(String.valueOf(sc.nextDouble()));
                    Files.write(f, lines, StandardCharsets.UTF_8);

                    double sum = 0;
                    List<String> read = Files.readAllLines(f, StandardCharsets.UTF_8);
                    for (String s : read) sum += Double.parseDouble(s.trim());
                    System.out.println("Средняя мощность: " + (sum / read.size()));
                    break;
                }
                case 5: {
                    Path f = Paths.get("f.txt");
                    List<String> lines = new ArrayList<>();
                    for (int i = 0; i < 10; i++) lines.add(String.valueOf(rnd.nextInt(200) - 50));
                    Files.write(f, lines, StandardCharsets.UTF_8);

                    int count = 0;
                    System.out.println("Числа в файле:");
                    for (String s : Files.readAllLines(f, StandardCharsets.UTF_8)) {
                        int x = Integer.parseInt(s.trim());
                        System.out.print(x + " ");
                        if (x % 9 == 0) count++;
                    }
                    System.out.println("\nКратных 9: " + count);
                    break;
                }
                default:
                    System.out.println("Нет такого задания");
            }
            System.out.println();
        }
    }
}