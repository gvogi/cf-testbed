package gr.aueb.gr.ch17;

import gr.aueb.gr.ch17.exercise.Circle;
import gr.aueb.gr.ch17.exercise.Line;
import gr.aueb.gr.ch17.exercise.Rectangle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeShapesDemo {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/trainee.ser"))) {

            Rectangle r1;
            Circle c1;
            Line l1;

            r1 = (Rectangle) ois.readObject();
            c1 = (Circle) ois.readObject();
            l1 = (Line) ois.readObject();

            System.out.println(r1);
            System.out.println(c1);
            System.out.println(l1);
            System.out.println("Success in deserialization");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e1) {
            System.out.println("Class Not Found Exception" + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException" + e2);
            e2.printStackTrace();
        }
    }
}
