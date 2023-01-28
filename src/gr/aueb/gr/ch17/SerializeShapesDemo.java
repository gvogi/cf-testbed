package gr.aueb.gr.ch17;

import gr.aueb.gr.ch17.exercise.Circle;
import gr.aueb.gr.ch17.exercise.Line;
import gr.aueb.gr.ch17.exercise.Rectangle;

import java.io.*;

public class SerializeShapesDemo {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/trainee.ser"))){

            Rectangle r1 = new Rectangle(5, 8);
            Circle c1 = new Circle(5);
            Line l1 = new Line(3);

            oos.writeObject(r1);
            oos.writeObject(c1);
            oos.writeObject(l1);

            System.out.println("Success in Serialization");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Serializable Exception" + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException" + e2);
            e2.printStackTrace();
        }
    }
}
