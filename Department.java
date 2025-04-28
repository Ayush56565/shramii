import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<SubDepartment> subDepartments = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addSubDepartment(SubDepartment subDepartment) {
        subDepartments.add(subDepartment);
    }

    public String getName() {
        return name;
    }
}
