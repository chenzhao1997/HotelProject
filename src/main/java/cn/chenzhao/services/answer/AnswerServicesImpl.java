package cn.chenzhao.services.answer;

import cn.chenzhao.dao.answer.AnswerMapper;
import cn.chenzhao.entity.answer.Answer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AnswerServicesImpl implements AnswerServices {
    @Resource
    private AnswerMapper answerMapper;

    @Override
    public List<Answer> queryAll(Integer queId) {
        return answerMapper.queryAll(queId);
    }

    @Override
    public Integer queryCountAnswer(Integer queId) {
        return answerMapper.queryCountAnswer(queId);
    }

    @Override
    public Integer addAnswer(Answer answer) {
        return answerMapper.addAnswer(answer);
    }
}
