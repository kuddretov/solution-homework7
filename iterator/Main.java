public class Main {
    public static void main(String[] args) {
        Series series = new Series();

        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1", 1200));
        season1.addEpisode(new Episode("S1E2", 1300));
        season1.addEpisode(new Episode("S1E3", 1250));

        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1", 1400));
        season2.addEpisode(new Episode("S2E2", 1500));

        series.addSeason(season1);
        series.addSeason(season2);

        System.out.println("=== Normal Order (Season 1) ===");
        EpisodeIterator normal = season1.iteratorNormal();
        while (normal.hasNext()) {
            System.out.println(normal.next());
        }

        System.out.println("\n=== Reverse Order (Season 1) ===");
        EpisodeIterator reverse = season1.iteratorReverse();
        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }

        System.out.println("\n=== Shuffle Order (Season 1) ===");
        EpisodeIterator shuffle = season1.iteratorShuffle();
        while (shuffle.hasNext()) {
            System.out.println(shuffle.next());
        }

        System.out.println("\n=== Binge All Episodes ===");
        EpisodeIterator binge = series.bingeIterator();
        while (binge.hasNext()) {
            System.out.println(binge.next());
        }
    }
}
