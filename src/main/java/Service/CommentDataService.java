package Service;

import Model.CommentData;

import java.util.List;

public interface CommentDataService {
    public List<CommentData> getAllComments();

    public void deleteAll();

    public void saveAll(List<CommentData> questionsData);

    public void save(CommentData questionData);
}

