package pattern.proxy;

interface Thumbnail {
    public void showTitle ();
    public void showPreview ();
}

class RealThumbnail implements Thumbnail {
    private String title;
    private String movieUrl;

    public RealThumbnail (String _title, String _movieUrl) {
        title = _title;
        movieUrl = _movieUrl;

        System.out.println(movieUrl + "processing " + title + " video data down");
    }
    public void showTitle () {
        System.out.println("title:" + title);
    }
    public void showPreview () {
        System.out.println(title + "preview ");
    }
}

class ProxyThumbnail implements Thumbnail {
    private String title;
    private String movieUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbnail (String _title, String _movieUrl) {
        title = _title;
        movieUrl = _movieUrl;
    }

    public void showTitle () {
        System.out.println("title:" + title);
    }

    public void showPreview () {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, movieUrl);
        }
        realThumbnail.showPreview();
    }
}