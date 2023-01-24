/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.templatemethod
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: TemplateExample.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.templatemethod;

public class TemplateExample {
    public static void main(String[] args) {
        new NaverMapView().initMap();
        new KakaoMapView().initMap();
    }
}