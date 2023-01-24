package pattern.strategy;

interface SearchStrategy {
    public void search ();
}

class SearchStratagyAll implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH ALL");

    }
}

class SearchStratagyImage implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH IMAGE");

    }
}

class SearchStratagyNews implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH NEWS");

    }
}

class SearchStratagyMap implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH MAP");
      
    }
}