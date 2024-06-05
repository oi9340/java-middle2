package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.set(10);
        Integer integer = integerGenericBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("hello");
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(1.23);
        Double aDouble = doubleGenericBox.get();
        System.out.println("aDouble = " + aDouble);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        //자바 컴파일러가 타입을 추론할 수 있는 상황에서만 가능하다.
        GenericBox<Integer> objectGenericBox = new GenericBox<>();
    }
}
