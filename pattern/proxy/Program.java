/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.proxy
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: Program.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.proxy;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Thumbnail> thumbnails = new ArrayList<Thumbnail>();

        thumbnails.add(new ProxyThumbnail("Git 강좌", "/git.mp4"));
        thumbnails.add(new ProxyThumbnail("Rest API란?", "/rest-api.mp4"));
        thumbnails.add(new ProxyThumbnail("도커 사용법", "/docker.mp4"));
        thumbnails.add(new ProxyThumbnail("객체지향 프로그래밍", "/oodp.mp4"));
        thumbnails.add(new ProxyThumbnail("블록체인의 원리", "/blockchain.mp4"));

        for (Thumbnail thumbnail : thumbnails) {
            thumbnail.showTitle();
        }


        thumbnails.get(2).showPreview();
        thumbnails.get(2).showPreview();
        thumbnails.get(4).showPreview();
        thumbnails.get(1).showPreview();

    }
}