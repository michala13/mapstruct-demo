package objects;

import java.util.List;

public class StudentInfo {

    private String id;
    private String name;
    private List<Parent> parent;
    private List<Parent> national;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Parent> getParent() {
        return parent;
    }

    public void setParent(List<Parent> parents) {
        this.parent = parents;
    }

    public List<Parent> getNational() {
        return national;
    }

    public void setNational(List<Parent> national) {
        this.national = national;
    }
}
