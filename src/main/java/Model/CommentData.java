package Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CommentsData")
public class CommentData {

    @Id
    private String id;
    private String commentName;

    public CommentData(){}

    public CommentData(String commentName) {
        this.commentName = commentName;
    }

    public String getId() {
        return id;
    }

    public String getCommentName() {
        return commentName;
    }

}


