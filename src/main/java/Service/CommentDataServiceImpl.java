package Service;

import Dao.CommentDataDao;
import Model.CommentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentDataServiceImpl implements CommentDataService {

    @Autowired
    private CommentDataDao commentDataDao;

    private List<CommentData> comments;

    @Override
    public List<CommentData> getAllComments() {
        comments = commentDataDao.findAll();
        return comments;
    }

    public void deleteAll() {
    }

    @Override
    public void saveAll(List<CommentData> commentsData) {
        commentDataDao.saveAll(commentsData);
    }

    @Override
    public void save(CommentData commentData) {
        commentDataDao.save(commentData);
    }
}
