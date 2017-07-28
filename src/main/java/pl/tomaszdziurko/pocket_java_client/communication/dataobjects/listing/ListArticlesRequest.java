package pl.tomaszdziurko.pocket_java_client.communication.dataobjects.listing;

import com.google.common.base.Preconditions;
import org.joda.time.DateTime;
import pl.tomaszdziurko.pocket_java_client.communication.dataobjects.AbstractPocketRequest;
import java.util.Date;

public class ListArticlesRequest extends AbstractPocketRequest {

    public ListArticlesRequest(String consumer_key, String access_token) {
        super(consumer_key, access_token);
        state = ArticleState.UNREAD;
    }

    private ArticleState state;
    private Boolean favorite;
    private String tag;
    private ArticleContentType contentType;
    private ArticleSorting sort;
    private ArticleDetailType detailType;
    private String search;
    private String domain;
    private String since;
    private Integer count;
    private Integer offset;

    public ListArticlesRequest withSince(DateTime dateTime) {
        since = String.valueOf(dateTime.getMillis()/1000L);
        return this;
    }

    public ListArticlesRequest withSince(Date date) {
        since = String.valueOf(date.getTime()/1000L);
        return this;
    }

    public ListArticlesRequest withState(ArticleState state) {
        this.state = state;
        return this;
    }

    public ListArticlesRequest withSort(ArticleSorting sort) {
        this.sort = sort;
        return this;
    }

    public ListArticlesRequest withDetailType(ArticleDetailType detailType) {
        this.detailType = detailType;
        return this;
    }

    public ListArticlesRequest withContentType(ArticleContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    public ListArticlesRequest withCountAndOffset(Integer count, Integer offset) {
        this.count = count;
        this.offset = offset;
        return this;
    }
}
