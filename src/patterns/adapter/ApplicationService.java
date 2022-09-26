package patterns.adapter;

public class ApplicationService {
    LocationManagement locationManagement;

    ApplicationService(LocationManagement locationManagement) {
        this.locationManagement = locationManagement;
    }

    public Location getLocation() {
        return locationManagement.getLocation();
    }
}
