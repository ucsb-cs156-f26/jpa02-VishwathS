package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object_returns_true() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_different_class_returns_false() {
        assertFalse(team.equals("not a team"));
    }

    @Test
    public void equals_same_name_same_members_returns_true() {
        Team other = new Team("test-team");
        assertTrue(team.equals(other));
    }

    @Test
    public void equals_same_name_different_members_returns_false() {
        Team other = new Team("test-team");
        other.addMember("Vishwath");

        assertFalse(team.equals(other));
    }

    @Test
    public void equals_different_name_returns_false() {
        Team other = new Team("different-team");

        assertFalse(team.equals(other));
    }

    @Test
    public void hashCode_same_content_returns_same_hashCode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");

        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_returns_correct_hashCode() {
        Team t = new Team();
        t.setName("foo");
        t.addMember("bar");

        int result = t.hashCode();
        int expectedResult = 130294;

        assertEquals(expectedResult, result);
    }

}
