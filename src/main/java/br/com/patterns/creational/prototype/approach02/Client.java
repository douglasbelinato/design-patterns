package br.com.patterns.creational.prototype.approach02;

public class Client {

    public static void main(String[] args) {
        var user = new User("Original", 25, new Address("ABC Street", 1000));
        var cloneUser = user.cloneBuilder().withName("Cloned").now();
        var anotherUser = cloneUser.cloneBuilder()
                .withAge(100)
                .withAddress(new Address("A Street", 500))
                .now();

        System.out.println(user);
        System.out.println(cloneUser);
        System.out.println(anotherUser);
    }
}
