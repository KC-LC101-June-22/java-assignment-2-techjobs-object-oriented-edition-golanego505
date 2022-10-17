package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.nio.charset.CoderResult;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job test_job1 = new Job();
        assertNotEquals(test_job.getId(), test_job1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        //Employer employer = new Employer("ACME");
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.getName() instanceof String);
        assertEquals(test_job.getName(),"Product tester");

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals(test_job.getEmployer().getValue(), "ACME");

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals(test_job.getLocation().getValue(),"Desert");

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals(test_job.getPositionType().getValue(), "Quality control");

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job.equals(test_job1));

    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String data = test_job.toString();
        int length = data.length();

        assertEquals(data.substring(0,1).charAt(0), '\n');
        assertEquals(data.substring(length - 1, length).charAt(0), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String data = test_job.toString();
        assertEquals(data, "\nID: 4\n" + "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n");
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String data = test_job.toString();
        //System.out.println(data);
        assertEquals(data, "\nID: 3\n" + "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n");
    }
}
