package cn.chenzhao.services.answer;

import cn.chenzhao.entity.answer.Answer;

import java.util.List;

public interface AnswerServices {

    List<Answer> queryAll(Integer queId);

    Integer queryCountAnswer(Integer queId);

    Integer addAnswer(Answer answer);
}
