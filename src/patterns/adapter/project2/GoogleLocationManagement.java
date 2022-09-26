package patterns.adapter.project2;

import patterns.adapter.Location;

public class GoogleLocationManagement implements OtherLocationManagement {

    @Override
    public Location getLocation() {
        System.out.println("google package");
        return new Location(5.0, 7.0);
    }

}
