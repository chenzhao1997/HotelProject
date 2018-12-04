package cn.chenzhao.dao.question;

import cn.chenzhao.entity.question.Question;

import java.util.List;

public interface QuestionMapper {

    List<Question> queryAll();

    Integer addQuestion(Question question);

    Question detailQuestion(Integer pk);

    Integer updateQuestion(Question question);

}
