public class Main {
    public static void main(String[] args) {
        OrganizationService orgService = new OrganizationService();

        Employee employer = new Employee("Alice", Role.EMPLOYER);
        Employee deptHead = new Employee("Bob", Role.DEPARTMENT_HEAD);
        Employee teamLeader = new Employee("Charlie", Role.TEAM_LEADER);
        Employee worker = new Employee("David", Role.EMPLOYEE);

        Department securityDept = new Department("Security");
        orgService.createDepartment(employer, securityDept);

        SubDepartment nightShift = new SubDepartment("Night Shift");
        orgService.createSubDepartment(deptHead, securityDept, nightShift);

        Team alphaTeam = new Team("Alpha Team");
        orgService.createTeam(deptHead, nightShift, alphaTeam);

        Position guard = new Position("Security Guard");
        orgService.createPosition(deptHead, alphaTeam, guard);

        orgService.assignEmployeeToTeam(teamLeader, worker, alphaTeam);

        orgService.viewOwnProfile(worker);
    }
}
