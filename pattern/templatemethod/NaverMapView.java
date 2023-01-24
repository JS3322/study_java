package pattern.templatemethod;

public class NaverMapView extends MapView {

    @Override
    protected void connectMapServer() {
        System.out.println("naver map server connecting");
    };
    @Override
    protected void showMapOnScreen() {
        System.out.println("show naver map");
    };
    @Override
    protected void moveToCurrentLocation() {
        System.out.println("move to current coordinates on naver Map");
    };
}