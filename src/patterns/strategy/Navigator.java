package patterns.strategy;

public class Navigator {
    private RoouteStrategy rs;

    public void setRouteStrategy(RoouteStrategy desejado) {
        rs = desejado;
    }

    public void buildRoute(A routeA, B routeB) {
        rs.buildRoute(routeA, routeB);
    }

    public static void main(String[] args) {
        WalkingStrategy walkingStrategy = new WalkingStrategy();
        Navigator nav = new Navigator();
        nav.setRouteStrategy(walkingStrategy);
        nav.buildRoute(new A(), new B());

        RoadStrategy roadStrategy = new RoadStrategy();
        nav.setRouteStrategy(roadStrategy);
        nav.buildRoute(new A(), new B());
    }
}
