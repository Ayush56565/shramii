import java.util.ArrayList;
import java.util.List;

public class SubDepartment {
    private String name;
    private List<Team> teams = new ArrayList<>();

    public SubDepartment(String name) {
        this.name = name;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public String getName() {
        return name;
    }
}
