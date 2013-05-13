package pl.tomaszdziurko.pocket_java_client.communication.dataobjects.listing;

public enum ArticleContentType {

    ARTICLE,
    VIDEO,
    IMAGE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
