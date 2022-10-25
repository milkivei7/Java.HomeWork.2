public class Laba2 {
    public static void main(String[] args) {
        vector3D Vector1 = new vector3D (1,2,3);
        vector3D Vector2 = new vector3D (3,2,1);

        System.out.println("Текущие вектора " + Vector1 + " " + Vector2);
        vector3D Additions = vector3D.AdditionTwoVectors(Vector1, Vector2);
        System.out.println("Cложение векторов = " + Additions);
        vector3D Subtraction = vector3D.SubtractionTwoVectors(Vector1,Vector2);
        System.out.println("Вычитание векторов = " + Subtraction);
        double Multiplication = vector3D.MultiplicationTwoVectors(Vector1,Vector2);
        System.out.println("Скaлярное произведение векторов = " + Multiplication);
    }
}