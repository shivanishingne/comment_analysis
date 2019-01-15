package Dao;

import Model.CommentData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDataDao extends MongoRepository<CommentData,String> {
    long count();
}
