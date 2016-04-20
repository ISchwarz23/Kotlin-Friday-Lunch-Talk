package org.fridaylunchtalk.kotlin.dataclass;

/**
 * Example of a data class in java.
 */
public class DataClassInJava {

    private int id;
    private String name;
    private String nickname;

    public DataClassInJava(int id, String name) {
        this(id, name, "Nick");
    }

    public DataClassInJava(int id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataClassInJava that = (DataClassInJava) o;

        if (id != that.id) return false;
        if (!name.equals(that.name)) return false;
        return nickname != null ? nickname.equals(that.nickname) : that.nickname == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DataClassInJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
