package dk.kb.netarchivesuite.solrwayback.util;

/**
 * Represents the type of action recorded in a user's navigation history.
 */
public enum NavigationHistoryAction {
    QUERY("QUERY"),
    SEARCH_RESULT_CLICKED("SEARCH RESULT CLICKED"),
    PLAYBACK_LINK_CLICKED("PLAYBACK LINK CLICKED");

    private final String label;

    NavigationHistoryAction(String label) {
        this.label = label.toUpperCase();
    }

    @Override
    public String toString() {
        return label;
    }
}
