import java.util.Objects;
import com.google.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/*Домашнее задание
Условие:
Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код,
использующий эти зависимости.
Пример решения:
1. Создайте новый Maven или Gradle проект, через Intellj IDEA.
2. Добавьте зависимости org.apache.commons:commons-lang3:3.14.0 и com.google.code.gson:gson:2.10.1.
3. Создайте класс Person с полями firstName, lastName и age.
4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.*/
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstName",firstName)
                .append("lastName",lastName)
                .append("age",age).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return new EqualsBuilder().
                append(firstName,person.firstName).
                append(lastName,person.lastName).
                append(age,person.age).
                isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().
                append(firstName).
                append(lastName).
                append(age).
                toHashCode();
    }
}
