import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Position> positions = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getName() {
        return name;
    }
}
