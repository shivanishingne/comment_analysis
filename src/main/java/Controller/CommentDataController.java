package Controller;

import Dao.CommentDataDao;
import Model.CommentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping("/comments")
public class CommentDataController {

    @Autowired
    private CommentDataDao commentDataDao;

    @GetMapping("/all")
    public List<CommentData> getAll() {
        List<CommentData> comments = commentDataDao.findAll();

        return comments;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CommentData insert(@RequestBody CommentData comment) {

        commentDataDao.insert(comment);
        return comment;

    }
}

/*
@GetMapping("/{id}")
public QuestionData getById(@PathVariable("id") String id) {
Optional questionOpt =  questionDataDao.findById(id);
QuestionData questionData = (QuestionData)questionOpt.get();
return questionData;
}
@PutMapping(produces= MediaType.APPLICATION_JSON_VALUE)
public QuestionData updateQuestion(@RequestBody QuestionData question ){
questionDataDao.save(question);
return question;
}
*/
