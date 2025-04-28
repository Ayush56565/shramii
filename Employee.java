public class Employee {
    private String name;
    private Role role;
    private Department department;
    private SubDepartment subDepartment;
    private Team team;
    private Position position;

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void assignToDepartment(Department department) {
        this.department = department;
    }

    public void assignToSubDepartment(SubDepartment subDepartment) {
        this.subDepartment = subDepartment;
    }

    public void assignToTeam(Team team) {
        this.team = team;
    }

    public void assignToPosition(Position position) {
        this.position = position;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}
