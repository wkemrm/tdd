package study.tdd;

public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
