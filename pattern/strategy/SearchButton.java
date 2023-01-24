package pattern.strategy;

public class SearchButton {

    private Program myProgram;

    public SearchButton (Program _myProgram) {
        myProgram = _myProgram;
    }

    private SearchStrategy searchStrategy = new SearchStratagyAll();

    public void setSearchStrategy (SearchStrategy _searchStrategy) {
        searchStrategy = _searchStrategy;
    }

    public void onClick () {
        searchStrategy.search();
    }
}