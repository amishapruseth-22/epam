package Optional;

import java.util.Optional;

public class Task {
    public static void main(String[] args) {
        Optional<String> optional=Optional.ofNullable("amisha@22");
        optional.ifPresent(System.out::println);
        Optional<Optional<Integer>> opt=Optional.of(Optional.of(10));
        Optional<Integer> result=opt.flatMap(b->b.map(a->a+5));
        result.ifPresent(System.out::println);


    }
}
