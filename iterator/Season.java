import java.util.*;

public class Season implements Iterable<Episode> {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    public EpisodeIterator iteratorNormal() {
        return new SeasonIterator(episodes);
    }

    public EpisodeIterator iteratorReverse() {
        return new ReverseSeasonIterator(episodes);
    }

    public EpisodeIterator iteratorShuffle() {
        return new ShuffleSeasonIterator(episodes);
    }

    @Override
    public Iterator<Episode> iterator() {
        return episodes.iterator();
    }
}
