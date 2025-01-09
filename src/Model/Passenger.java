
package Model;

public class Passenger {
    
    private String passenger_id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String bdate;
    private String gender;

    //-------------------------------------------------------\\
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(String passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }
    
}
