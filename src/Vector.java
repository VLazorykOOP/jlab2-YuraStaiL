import java.lang.Math;
public class Vector {
    private double x;
    private double y;
    private double z;

    Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getMagnitude()
    {
        return Math.sqrt(
                this.x * this.x
                + this.y * this.y
                + this.z * this.z
        );
    }

    public Vector multiplicationOnNumber(double value)
    {
        return new Vector(this.x += value, this.y += value, this.z += value);
    }

    public Vector addition(Vector vector)
    {
        return new Vector(this.x += vector.x, this.y += vector.y, this.z += vector.z);
    }

    public Vector dotProduct(Vector vector)
    {
        return new Vector(this.x *= vector.x, this.y *= vector.y, this.z *= vector.z);
    }

    public Vector crossProduct(Vector vector)
    {
        return new Vector(
                this.y * vector.z - this.z * vector.x,
                this.z * vector.x - this.x * vector.z,
                this.x * vector.y - this.y * vector.x
        );
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}