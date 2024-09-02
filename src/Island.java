import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Island {
    private final int width;
    private final int height;
    private final Specifications.Location[][] island;

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
        this.island = new Specifications.Location[height][width];

    }

    public void runSimulation() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


        scheduler.scheduleAtFixedRate(() -> {

        }, 0, 1, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    Specifications.Location currentLocation = island[i][j];

                    for (Animal animal : currentLocation.getAnimals()) {
                        animal.eat(currentLocation);
                        animal.reproduce(currentLocation);
                        animal.move(island);
                        animal.checkAlive();
                    }
                }
            }
        }, 0, 1, TimeUnit.SECONDS);

        // Задание для вывода статистики
        scheduler.scheduleAtFixedRate(() -> {
            // Логика вывода статистики (количество животных каждого вида, растений и т.д.)
        }, 0, 1, TimeUnit.SECONDS);
    }
}