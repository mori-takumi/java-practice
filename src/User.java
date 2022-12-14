import java.time.LocalDate;
import java.util.Objects;

public class User {
    private final String name;

    private final LocalDate birthdate;

    public User(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getName().equals(user.getName()) && getBirthdate().equals(user.getBirthdate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirthdate());
    }
}

