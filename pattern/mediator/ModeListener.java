package pattern.mediator;

public interface ModeListener {
    public void onModeChange (Mode mode);
}

class ListView implements ModeListener {
    @Override
    public void onModeChange(Mode mode) {
        System.out.println(
                "list view " + (mode == Mode.LIST ? "show" : "hidden")
        );
    }
}

class GalleryView implements ModeListener {
    @Override
    public void onModeChange(Mode mode) {
        System.out.println(
                "gallery view " + (mode == Mode.GALLERY ? "show" : "hidden")
        );
    }
}

class DataDownloader implements ModeListener {
    @Override
    public void onModeChange(Mode mode) {
        System.out.println(
                (mode == Mode.LIST ? "list" : "gallery")
                        + "view data download");
    }
}