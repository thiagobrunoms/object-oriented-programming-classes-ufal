package patterns.adapter;

public class TerceiroPeriodoLocationManagement implements LocationManagement {

    @Override
    public Location getLocation() {
        return new Location(1.0, 2.0);
    }

}
