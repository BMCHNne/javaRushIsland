class Animals {
}

public abstract class Animal {
    protected int weight; // вес
    protected int maxCountOnCell; // максимальное количество животных на клетке
    protected int moveSpeed; // скорость
    protected int foodNeeded; // требуемое количество еды
    protected Specifications.Location currentLocation; // текущее местоположение
    protected boolean isAlive; // жив ли животное

    public Animal(int weight, int maxCountOnCell, int moveSpeed, int foodNeeded, Specifications.Location currentLocation) {
        this.weight = weight;
        this.maxCountOnCell = maxCountOnCell;
        this.moveSpeed = moveSpeed;
        this.foodNeeded = foodNeeded;
        this.currentLocation = currentLocation;
        this.isAlive = true;
    }

    public abstract void eat(Specifications.Location location);

    public abstract void reproduce(Specifications.Location location);

    public abstract void move(Specifications.Location[][] island);

    public void checkIsAlive() {
        if (!isAlive) {
            currentLocation.removeAnimal(this);
        }
    }

    public void printInfo() {
        System.out.println(this.getClass().getSimpleName() + ": " + "Вес: " + weight + ", Текущая локация: " + currentLocation.getX() + "," + currentLocation.getY());
    }

    public void checkAlive() {
    }
}