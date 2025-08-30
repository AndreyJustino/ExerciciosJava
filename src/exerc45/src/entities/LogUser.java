package entities;

import java.time.Instant;
import java.util.Objects;

public class LogUser {
    private String name;
    private Instant instant;

    public LogUser() {
    }

    public LogUser(String name, Instant instant) {
        this.name = name;
        this.instant = instant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogUser logUser = (LogUser) o;
        return Objects.equals(name, logUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
