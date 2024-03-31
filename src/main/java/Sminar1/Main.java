
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

    Person person = new Person("Валентин","Дубов",23);
    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    String json = gson.toJson(person);
        System.out.println(json);
    }
}
