package Tregulov.stream;

import java.util.Arrays;

public class chainingEx {
    public static void main(String[] args) {
        int[] array = {5, 7, 9 , 3, 1, 33, 125, 6};
        int result = Arrays.stream(array).filter(e -> e%2 == 1)
                .map(e -> {
                    if (e%3==0){
                     e = e/3;
                    }return e;
                })
                .reduce((a, e) -> a+e).getAsInt();

        System.out.println(result);

//        students.Tregulov.stream().map(el -> {
//                    el.setName(el.getName().toUpperCase());
//                    return el;
//                })
//                .filter(elem -> elem.getSex()=='f')
//                .sorted((x,y) -> x.getAge() - y.getAge())
//                .forEach(el -> System.out.println(el));
    }
    }


