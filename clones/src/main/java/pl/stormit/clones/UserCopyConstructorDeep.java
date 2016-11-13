package pl.stormit.clones;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tw
 */
public class UserCopyConstructorDeep {

    private String name;

    private Integer age;

    private List<Interest> interests;

    public UserCopyConstructorDeep() {
    }

    public UserCopyConstructorDeep(UserCopyConstructorDeep userCopyConstructor) {
        name = userCopyConstructor.name;
        age = userCopyConstructor.age;
        interests = new ArrayList<>();
        for (Interest interest : userCopyConstructor.getInterests()) {
            interests.add(new Interest(interest.getName()));
        }
    }

    public UserCopyConstructorDeep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.age);
        hash = 23 * hash + Objects.hashCode(this.interests);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserCopyConstructorDeep other = (UserCopyConstructorDeep) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.interests, other.interests)) {
            return false;
        }
        return true;
    }
}
