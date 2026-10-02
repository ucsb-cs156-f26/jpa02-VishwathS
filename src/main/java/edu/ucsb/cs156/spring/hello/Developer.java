package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Vishwath";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGitHubId_returns_correct_githubId() {
        // TODO: Change this to your github id
        return "VishwathS";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name
        Team team = new Team("f26-14");
        team.addMember("Heloisa");
        team.addMember("Aylin");
        team.addMember("Ray");
        team.addMember("Ryan");
        team.addMember("Krithi");
        team.addMember("Vishwath");
        return team;
    }
}
