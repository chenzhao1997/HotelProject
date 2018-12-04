package cn.chenzhao.dao.answer;

import cn.chenzhao.entity.answer.Answer;

import java.util.List;

public interface AnswerMapper {

    List<Answer> queryAll(Integer queId);

    Integer queryCountAnswer(Integer queId);

    Integer addAnswer(Answer answer);
}
