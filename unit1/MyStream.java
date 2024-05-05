import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {
public static void main(String[] args) {
// create a list
List<Integer> mylist1= Arrays.asList(2,5,9,4,3);

List<Integer> mylist2=new ArrayList<>();
mylist2.add(15);
mylist2.add(10);
mylist2.add(25);
mylist2.add(56);
mylist2.add(14);

//without stream
List<Integer> oddlist=new ArrayList<>();
for (int i:mylist1 ) {
if(i%2==1)
oddlist.add(i);
}
System.out.println(mylist1);
System.out.println(oddlist);

// Using Stream
Stream<Integer> stream1 = mylist1.stream();
Stream<Integer> stream2 = mylist1.stream();
List<Integer> oddlist2 = stream1.filter(i -> i % 2 == 1).collect(Collectors.toList());
List<Integer> evenlist1 = stream2.filter(i -> i % 2 == 0).collect(Collectors.toList());
System.out.println(oddlist2);
System.out.println(evenlist1);


// Stream<Object> empty1 = Stream.empty();
// empty1.forEach(e->{
// System.out.println(e);
// });

String names[]={"Rahul","Aman","Rohit","Kumar","Karan"};
Stream<String> names1 = Stream.of(names);
names1.forEach(e->{
System.out.println(e);
});
}
}