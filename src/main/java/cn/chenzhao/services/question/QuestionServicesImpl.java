package cn.chenzhao.services.question;

import cn.chenzhao.dao.question.QuestionMapper;
import cn.chenzhao.entity.question.Question;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class QuestionServicesImpl implements QuestionServices {
    @Resource
    private QuestionMapper questionMapper;

    @Override
    public List<Question> queryAll() {
        return questionMapper.queryAll();
    }

    @Override
    public Integer addQuestion(Question question) {
        return questionMapper.addQuestion(question);
    }

    @Override
    public Question detailQuestion(Integer pk) {
        return questionMapper.detailQuestion(pk);
    }

    @Override
    public Integer updateQuestion(Question question) {
        return questionMapper.updateQuestion(question);
    }
}
