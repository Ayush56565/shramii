public class OrganizationService {

    public void createDepartment(Employee creator, Department department) {
        if (creator.getRole() == Role.EMPLOYER) {
            System.out.println("Department " + department.getName() + " created.");
        } else {
            System.out.println("Access denied: Only Employer can create departments.");
        }
    }

    public void createSubDepartment(Employee creator, Department department, SubDepartment subDepartment) {
        if (creator.getRole() == Role.EMPLOYER || creator.getRole() == Role.DEPARTMENT_HEAD) {
            department.addSubDepartment(subDepartment);
            System.out.println("Sub-Department " + subDepartment.getName() + " added under Department " + department.getName());
        } else {
            System.out.println("Access denied: Only Employer or Department Head can create sub-departments.");
        }
    }

    public void createTeam(Employee creator, SubDepartment subDepartment, Team team) {
        if (creator.getRole() == Role.EMPLOYER || creator.getRole() == Role.DEPARTMENT_HEAD || creator.getRole() == Role.SUB_DEPARTMENT_HEAD) {
            subDepartment.addTeam(team);
            System.out.println("Team " + team.getName() + " added under Sub-Department " + subDepartment.getName());
        } else {
            System.out.println("Access denied: Insufficient privileges to create teams.");
        }
    }

    public void createPosition(Employee creator, Team team, Position position) {
        if (creator.getRole() == Role.EMPLOYER || creator.getRole() == Role.DEPARTMENT_HEAD || creator.getRole() == Role.SUB_DEPARTMENT_HEAD) {
            team.addPosition(position);
            System.out.println("Position " + position.getName() + " added to Team " + team.getName());
        } else {
            System.out.println("Access denied: Insufficient privileges to create positions.");
        }
    }

    public void assignEmployeeToTeam(Employee manager, Employee employee, Team team) {
        if (manager.getRole() == Role.EMPLOYER || manager.getRole() == Role.DEPARTMENT_HEAD || manager.getRole() == Role.SUB_DEPARTMENT_HEAD || manager.getRole() == Role.TEAM_LEADER) {
            team.addEmployee(employee);
            employee.assignToTeam(team);
            System.out.println("Employee " + employee.getName() + " assigned to Team " + team.getName());
        } else {
            System.out.println("Access denied: Insufficient privileges to assign employees.");
        }
    }

    public void viewOwnProfile(Employee employee) {
        System.out.println("Profile of " + employee.getName() + " [Role: " + employee.getRole() + "]");
    }
}
