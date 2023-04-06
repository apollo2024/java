package sem_2.model;

public class Heir extends Vector implements Param{
    public Heir(Double x, Double y, Double z) {
        super(x, y, z);
    }
    /**
     * @return длинну вектора
     */
    public double lengthVector() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    /**
     * @param vector2 второй вектор для произведения
     * @return скалярное произведение
     */
    public double scalarMulti(Heir vector2) {
        return this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
    }

    public Vector vectorMulti(Heir vector2) {
        return new Vector(this.y * vector2.z - this.z * vector2.y,
                this.z * vector2.x - this.x * vector2.z,
                this.x * vector2.y - this.y * vector2.x);
    }
    /**
     *
     * @param vector2 второй вектор
     * @return косинус угла между векторами
     */
    public double cosVector(Heir vector2) {
        return scalarMulti(vector2) / (lengthVector() * vector2.lengthVector);
    }
    /**
     * @param vector2 второй вектор для произведения
     * @return сумма вектаров
     */
    public Vector sumVector(Heir vector2){
        return new Vector( this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
    }
    /**
     * @param vector2 второй вектор для произведения
     * @return разность вектаров
     */
    public Vector diffVector(Heir vector2) {
        return new Vector(this.x - vector2.x, this.y - vector2.y, this.z - vector2.z);
    }

}
