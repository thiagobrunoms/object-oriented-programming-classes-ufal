package patterns.adapter;

import patterns.adapter.project2.OtherLocationManagement;

public class GoogleLocationAdapter implements LocationManagement {
    OtherLocationManagement otherLocationManagement;

    public GoogleLocationAdapter(OtherLocationManagement other) {
        this.otherLocationManagement = other;
    }

    @Override
    public Location getLocation() {
        return otherLocationManagement.getLocation();
    }

}
