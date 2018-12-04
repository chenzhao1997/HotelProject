package cn.chenzhao.action.question;

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
import java.util.List;

@Controller
@RequestMapping("question")
public class QuestionController {
    @Resource
    private QuestionServices questionServices;
    @Resource
    private AnswerServices answerServices;
    @RequestMapping("list")
    public String list(Model model){
        List<Question> questionList = questionServices.queryAll();
        model.addAttribute("questionList", questionList);
        return "listQuestion";
    }
    @RequestMapping("toAddQuestion")
    public String toAddQuestion(){
        return "addQuestion";
    }


    @RequestMapping("doAddQuestion")
    public String doAddQuestion(Question question){
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss");
        questionServices.addQuestion(new Question(null,question.getTitle(),question.getDetailDesc(),0,sdf.format(date)));
        return "forward:/question/list";
    }

    @RequestMapping("datailQuestion")
    public String datailQuestion(Integer queId,Model model){
        Question question = questionServices.detailQuestion(queId);
        List<Answer> answerList = answerServices.queryAll(queId);
        model.addAttribute("answerList", answerList);
        model.addAttribute("question", question);
        return "datailQuestion";
    }

}
