import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
  /*      int i = 4444444;
        int ii = 333333;
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));

        Map<Integer,Book> maps = bookList.stream().collect(Collectors.toMap(Book::getReleaseYear,Function.identity(),(key1, key2) -> key1));
//        Map<Long, CarModelStyleOVO> carModelStyleOVOMap = carModelStyleOVOList.stream().collect(Collectors.toMap(CarModelStyleOVO::getId, Function.identity(),
//                (key1, key2) -> key2));
        for (Map.Entry<Integer,Book> entry:maps.entrySet()){
            int iI = entry.getKey();
            Book value = entry.getValue();
            System.out.println(iI);
            System.out.println(value);
        }*/
//        DateTime.now().plusSeconds(5).toDate();
//        if (true&&true){
//            System.out.println("33");
//
//        }else {
//            System.out.println("22");
//
//        }
//        System.out.println(128!=128);
        List<Book> students = new ArrayList<>();

        students.add(new Book(1,"张三","90"));
        students.add(new Book(2,"李四","90"));
        students.add(new Book(4,"王五","90"));
        students.add(new Book(4,"赵六","90"));

        int studentId = 3;
        Book student = students.stream().filter(o -> o.getReleaseYear() == studentId).findAny().orElse(null);
        System.out.println(student);

    }
    public static String getCode(int digit) {
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < digit; i++) {
            result.append(random.nextInt(10));
        }
        return result.toString();
    }
}
