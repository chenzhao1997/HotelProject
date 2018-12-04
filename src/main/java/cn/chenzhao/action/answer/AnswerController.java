package cn.chenzhao.action.answer;

import cn.chenzhao.entity.answer.Answer;
import cn.chenzhao.entity.question.Question;
import cn.chenzhao.services.answer.AnswerServices;
import cn.chenzhao.services.question.QuestionServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("answer")
public class AnswerController {

    @Resource
    private AnswerServices answerServices;




    @Resource
    private QuestionServices questionServices;

    @RequestMapping("addAnswer")
    public String addAnswer(Answer answer){
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        answerServices.addAnswer(new Answer(null,answer.getAnsContent(),sdf.format(date),answer.getQueId()));
        Integer count = answerServices.queryCountAnswer(answer.getQueId());
        Question question = new Question();
        question.setAnswerCount(count);
        question.setQueId(answer.getQueId());
        question.setLastModified(sdf.format(date));
        questionServices.updateQuestion(question);

        return "forward:/question/datailQuestion";
    }

}
