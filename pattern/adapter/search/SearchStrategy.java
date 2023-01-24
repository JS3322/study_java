package pattern.adapter.search;

interface SearchStrategy {
    public void search ();
}

class SearchStratagyAll implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH ALL");
        // all search
    }
}

class SearchStratagyImage implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH IMAGE");
        // image search
    }
}

class SearchStratagyNews implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH NEWS");
        // news search
    }
}

class SearchStratagyMap implements SearchStrategy {
    public void search () {
        System.out.println("SEARCH MAP");
        // map search
    }

    class SearchFindAdapter implements SearchStrategy {
        private FindAlgorithm findAlgorithm;

        public SearchFindAdapter (FindAlgorithm _findAlgorithm) {
            findAlgorithm = _findAlgorithm;
        }
        public void search () {
            findAlgorithm.find(true);
        }
    }
}