import sun.plugin.javascript.navig.Array;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        int i = 4444444;
//        int ii = 222332233;
//     int iii = 1332233;
//        System.out.println("是正确格式的手机号:"+isMobile("13496215263"));
        Long l = 126L;
        Long i = 126L;
        System.out.println(l==i);
        Long a = 555L;
        Long A = 555L;
        System.out.println(a==A);
        System.out.println(a.longValue()==A.longValue());


        Long aa = 129L;
        Long Aa = 129L;
        System.out.println(aa.longValue()==Aa.longValue());
        System.out.println(aa.longValue()==Aa.longValue());
        System.out.println(aa.longValue()==Aa.longValue());

//        System.out.println("Hello World!");
//        System.out.println("22");
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
//        List<Book> students = new ArrayList<>();

//        students.add(new Book(3,"张三","90"));
//        students.add(new Book(2,"李四","90"));
//        students.add(new Book(4,"王五","90"));
//        students.add(new Book(4,"赵六","90"));
//        for(Book book:students){
//            if(4==book.getReleaseYear()){
//                System.out.println("xixixix");
//                break;
//            }
//        }
//        throw new NullPointerException();
//        List<Integer> list1=new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//
//        List<Integer> list2=new ArrayList<>();
//        list2.add(3);
////        list2.add(4);
////        list2.add(5);
//
//        System.out.println("====求交集===");
//
//        List<Integer> list=list1.stream().filter(t->list2.contains(t)).collect(Collectors.toList());
//        list.stream().forEach(System.out::println);
//
//
//
//
//        System.out.println("====求差集===");
//        list=list1.stream().filter(t-> !list2.contains(t)).collect(Collectors.toList());
//        list.stream().forEach(System.out::println);
//
//
//        System.out.println("====求并集===");
//
//        list.addAll(list1);
//        list.addAll(list2);
//        list=list.stream().distinct().collect(Collectors.toList());
//        list.stream().forEach(System.out::println);
//        int studentId = 3;
//        Book student = students.stream().filter(o -> o.getReleaseYear() == studentId).findAny().orElse(null);
//        System.out.println(student);
//        System.out.println(completion(7773,2));
//        String[] a = new String[]{"1","5","4","3","2"};
//        toObject(Arrays.asList(a));
//        Map<Integer, Book> BookMap = new HashMap<>();
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(new Book(1955,"The Return of the King",  "0618129111"));
//        bookList.add(new Book(1954, "The Fellowship of the Ring", "0395489318"));
//        bookList.add(new Book(1954, "The Two Towers", "0345339711"));
//        List<Integer> merchantIdList = new ArrayList<>();
//
//        bookList.forEach(item -> {
//            merchantIdList.add(item.getReleaseYear());
//            BookMap.put(item.getReleaseYear(), item);
//        });
//        get(BookMap);
//
//        if(true){
//            BookMap.get(1955).setName("TROTK");
//        }
//        get(bookList);
    }

    public static boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        String s2="^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$";// 验证手机号
//        if(StringUtils.isNotBlank(str)){
            p = Pattern.compile(s2);
            m = p.matcher(str);
            b = m.matches();
//        }
        return b;
    }

    private static void get(Map<Integer, Book> BookMap){
        BookMap.forEach((k,v) -> System.out.println("key : " + k + "; value : " + v));
    }

    private static void get(List<Book> BookList){
        BookList.forEach(k -> System.out.println(k.getName()));
    }

    private static void toObject(Object... objects) {
        System.out.println(objects[0].toString());
    }

    private static String completion(int value, int length) {
        String result = String.valueOf(value);
        int valueLength = result.length();
        if (valueLength < length) {
            result = completion(result, length);
        } else if(valueLength > length) {
            result = result.substring(valueLength - length);
        }

        return result;
    }

    private static String completion(String value, int length) {
        int valueLength = value.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length - valueLength; i++) {
            result.append("0");
        }
        result.append(value);
        return result.toString();
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
