package objects;

import java.util.List;

public class Student {
    String name;
    String id;
    List<ParentDM> parent;
    List<ParentDM> national;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ParentDM> getParent() {
        return parent;
    }

    public void setParent(List<ParentDM> parent) {
        this.parent = parent;
    }

    public List<ParentDM> getNational() {
        return national;
    }

    public void setNational(List<ParentDM> national) {
        this.national = national;
    }
}
