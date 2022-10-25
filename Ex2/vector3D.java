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

    public void getX(){ return x; }
    public void getY(){ return y; }
    public void getZ(){ return z; }

    public static void Addition (vector3D Addition)
    {
        x+=Addition.x;
        y+=Addition.y;
        z+=Addition.z;
    }

    public static void Subtraction (vector3D Subtractiion)
    {
        x-=Subtractiion.x;
        y-=Subtractiion.y;
        z-=Subtractiion.z;
    }

    public static double ScalarMultiplication (vector3D ScalarMultiplication) //Скалярное произведение векторов
    {
        return x * ScalarMultiplication.x + y * ScalarMultiplication.y + z * ScalarMultiplication.z;
    }

    public static void MultiplicationVectorOnScalar (vector3D MultiplicationVectorOnScalar, double value_scalar) //Произведение векторов на скаляр
    {
        vector3D.setX(vector3D.getX()*value_scalar);
        vector3D.setY(vector3D.getY()*value_scalar);
        vector3D.setZ(vector3D.getZ()*value_scalar);
    }

    public static double VectorLenght(vector3D VectorLenght)
    {
        return Math.sqrt((VectorLenght.x * VectorLenght.x) + VectorLenght.y * VectorLenght.y + VectorLenght.z * VectorLenght.z);
    }

    public static String VectorsComparison(vector3D VectorsComparison)
    {
        if (VectorLenght(VectorsComparison.x)<VectorLenght(VectorsComparison.y))
    }

    public static String VectorsComparison(vector3D VectorsComparison)
    {
        if (VectorLenght(VectorsComparison.x) < VectorLenght(VectorsComparison.y)) { return "Первый вектор меньше второго"; }
        else if (VectorLenght(VectorsComparison.x) < VectorLenght(VectorsComparison.y)) { return "Первый вектор больше второго"; }
        return "Первый и второй векторы равны";
    }

    public static vector3D AdditionTwoVectors(vector3D Vector1, vector3D Vector2) { return new vector3D(Vector1.x + Vector2.x, Vector1.y + Vector2.y, Vector1.z + Vector2.z); }
    public static vector3D SubtractionTwoVectors(vector3D Vector1, vector3D Vector2) { return new vector3D(Vector1.x - Vector2.x, Vector1.y - Vector2.y, Vector1.z - Vector2.z); }
    public static double MultiplicationTwoVectors(vector3D Vector1, vector3D Vector2) { return Vector1.x * Vector2.x + Vector1.y * Vector2.y + Vector1.z * Vector2.z; }


}