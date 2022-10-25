public class vector3D {
    private double x;
    private double y;
    private double z;

    public vector3D(double coordinate1, double coordinate2, double coordinate3)
    {
        x = coordinate1;
        y = coordinate2;
        z = coordinate3;
    }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }

    public double getX(){ return x; }
    public double getY(){ return y; }
    public double getZ(){ return z; }

    public void Addition (vector3D Addition)
    {
        x+=Addition.x;
        y+=Addition.y;
        z+=Addition.z;
    }

    public void Subtraction (vector3D Subtractiion)
    {
        x-=Subtractiion.x;
        y-=Subtractiion.y;
        z-=Subtractiion.z;
    }

    public double ScalarMultiplication (vector3D ScalarMultiplication) //Скалярное произведение векторов
    {
        return x * ScalarMultiplication.x + y * ScalarMultiplication.y + z * ScalarMultiplication.z;
    }

    public static void MultiplicationVectorOnScalar (vector3D vector3D, double value_scalar) //Произведение векторов на скаляр
    {
        vector3D.setX(vector3D.getX()*value_scalar);
        vector3D.setY(vector3D.getY()*value_scalar);
        vector3D.setZ(vector3D.getZ()*value_scalar);
    }

    public double VectorLength(vector3D Vector)
    {
        return Math.sqrt((Vector.x * Vector.x) + Vector.y * Vector.y + Vector.z * Vector.z);
    }


    public String equals(vector3D Vector1, vector3D Vector2)
    {
        if (VectorLength(Vector1) < VectorLength(Vector2)) { return "Первый вектор меньше второго"; }
        else if (VectorLength(Vector1) < VectorLength(Vector2)) { return "Первый вектор больше второго"; }
        return "Первый и второй векторы равны";
    }

    public static vector3D AdditionTwoVectors(vector3D Vector1, vector3D Vector2) { return new vector3D(Vector1.x + Vector2.x, Vector1.y + Vector2.y, Vector1.z + Vector2.z); }
    public static vector3D SubtractionTwoVectors(vector3D Vector1, vector3D Vector2) { return new vector3D(Vector1.x - Vector2.x, Vector1.y - Vector2.y, Vector1.z - Vector2.z); }
    public static double MultiplicationTwoVectors(vector3D Vector1, vector3D Vector2) { return Vector1.x * Vector2.x + Vector1.y * Vector2.y + Vector1.z * Vector2.z; }
    public String toString() {
        return "vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + y +
                '}';
    }
}


