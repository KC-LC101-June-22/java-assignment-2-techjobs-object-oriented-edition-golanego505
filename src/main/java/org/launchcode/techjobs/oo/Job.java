package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {


    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public int getId() {
        return id;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String name;
        String employer;
        String location;
        String positionType;
        String coreCompetency;
        if(getName() == null){
            name = "Data not available";
        }else {name = getName();}
        if(getEmployer().getValue() == null){
            employer = "Data not available";
        }else employer = getEmployer().getValue();
        if(getLocation().getValue() == null){
            location = "Data not available";
        }else location = getLocation().getValue();
        if(getPositionType().getValue() == null){
            positionType = "Data not available";
        }else positionType = getPositionType().getValue();
        if(getCoreCompetency().getValue() == null){
            coreCompetency = "Data not available";
        }else coreCompetency = getCoreCompetency().getValue();

        return ("\nID: " + getId() + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + "\n");
    }

}
