import java.util.*;

public class ShuffleSeasonIterator implements EpisodeIterator {
    private List<Episode> shuffled;
    private int index = 0;

    public ShuffleSeasonIterator(List<Episode> episodes) {
        shuffled = new ArrayList<>(episodes);
        Collections.shuffle(shuffled, new Random(42)); // фиксированный сид
    }

    public boolean hasNext() {
        return index < shuffled.size();
    }

    public Episode next() {
        return shuffled.get(index++);
    }
}
