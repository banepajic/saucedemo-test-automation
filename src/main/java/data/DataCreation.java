package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataCreation {
    private static Faker faker = new Faker(new Locale("en-GB"));
    public static String fakeUsername(){
        return faker.name().username();
    }
    public static String fakePassword(){
        return faker.internet().password(8,12);
    }
    public static String fakeFirstName() {
        return  faker.name().firstName();
    }
    public static String fakeLastName() {
        return faker.name().lastName();
    }
    public static String fakePostalCode(){
        return faker.address().zipCode();
    }
}
