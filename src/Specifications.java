import java.util.ArrayList;
import java.util.List;
public class Specifications {
    public static class Location {
        private int x;
        private int y;
        private List<Animal> animals = new ArrayList<>();
        private int plantsCount;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void addAnimal(Animal animal) {
            animals.add(animal);
        }

        public void removeAnimal(Animal animal) {
            animals.remove(animal);
        }

        public void addPlants(int count) {
            plantsCount += count;
        }

        public void removePlants(int count) {
            plantsCount -= count;
        }

        public List<Animal> getAnimals() {
            return animals;
        }

        public int getPlantsCount() {
            return plantsCount;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;

        }
    }
}