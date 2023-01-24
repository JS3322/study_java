package pattern.templatemethod;

public class KakaoMapView extends MapView {

    @Override
    protected void connectMapServer() {
        System.out.println("kakao map server connecting");
    };
    @Override
    protected void showMapOnScreen() {
        System.out.println("show kakao map");
    };
    @Override
    protected void moveToCurrentLocation() {
        System.out.println("move to current coordinates on Kakao Map");
    };
}