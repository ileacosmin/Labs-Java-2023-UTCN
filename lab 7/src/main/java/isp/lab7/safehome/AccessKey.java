package isp.lab7.safehome;

import java.util.Objects;

public class AccessKey {
    private String pin;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public AccessKey(String pin) {
        this.pin = pin;
    }

    public AccessKey() {
    }

    @Override
    public String toString() {
        return "AccessKey{" +
                "pin='" + pin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessKey accessKey = (AccessKey) o;
        return Objects.equals(pin, accessKey.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin);
    }
}
