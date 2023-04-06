package sem_2.model;

public interface Param {
    double lengthVector();

    double scalarMulti(Heir vector2);

    Vector vectorMulti(Heir vector2);

    double cosVector(Heir vector2);

    Vector sumVector(Heir vector2);

    Vector diffVector(Heir vector2);
}
