package Collections;

import java.util.*;

class Course {
    int price;
    String courseName;

    public Course(int price, String courseName) {
        this.price = price;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course [price=" + price + ", courseName=" + courseName + "]";
    }

}

public class ListToMap {
    public static void main(String[] args) {
        // List<Course> listObj= new ArrayList<>();
        // listObj.add(new Course(1000, "Java"));
        // listObj.add(new Course(2000, "python"));
        // listObj.add(new Course(3000, "c++"));
        // listObj.add(new Course(4000, "ruby"));
        // listObj.add(new Course(5000, "SpringBoot"));

        List<Course> listObj = Arrays.asList(
                new Course(1000, "Java"),
                new Course(2000, "python"),
                new Course(3000, "c++"));

        System.out.println("List is: " + listObj);

        Map<Integer, String> mapObj = new HashMap<>();
        // for (Course courseObj : listObj) {
        //     mapObj.put(courseObj.price, courseObj.courseName);
        // }

        listObj.forEach(course -> mapObj.put(course.price, course.courseName));
        System.out.println("Map is: " + mapObj);
    }
}
