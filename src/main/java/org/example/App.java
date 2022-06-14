package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {

    public static final String TEST_1 = "test1";
    public static final String TEST_2 = "test2";
    public static final String TEST_3 = "test3";
    public static final String TEST = "test";


    public static void main(String[] args) {
        final Map<Point, String> map = new HashMap<>();

        final Point point1 = new Point(1L, "Name");
        final Point point2 = new Point(1L, "Name1");
        final Point point3 = new Point(1L, "Name2");

        map.put(point1, TEST_1);
        map.put(point2, TEST_2);
        map.put(point3, TEST_3);

        List<Character> characters = TEST.chars().mapToObj(o -> (char) o).toList();

//        Collections.reverse(characters);
        System.out.println(TEST);

        List<Character> characters1 = Collections.unmodifiableList(characters);
        final List<Character> characters2 = new ArrayList<>(characters1);
        characters2.add('c');
        final List<Object> objects = Collections.emptyList();



        System.out.println(objects);


//        System.out.println(map.entrySet().size());
//        map.entrySet().forEach(System.out::println);
//        System.out.println(map.get(point2));


//        final Map<String, String> hashMap = new HashMap<>();
//        hashMap.put("test", "test1");
//        hashMap.put("test", "test2");
//        hashMap.put("test", "test3");
//        System.out.println(hashMap.entrySet().size());
//        System.out.println(hashMap.get("test"));
        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);

        System.out.println(points.size());

//        points.stream().forEach(System.out::println);
        final List<Point> points1 = points.stream().peek(System.out::println).toList();


    }
}

class Point {
    Long id;
    String name;

    public Point(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(id, point.id) && Objects.equals(name, point.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
