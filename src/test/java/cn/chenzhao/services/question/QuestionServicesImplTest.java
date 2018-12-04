package cn.chenzhao.services.question;

import cn.chenzhao.entity.question.Question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class QuestionServicesImplTest {

    @Resource
    private QuestionServices questionServices;

    @Test
    public void queryAll() {
        List<Question> questionList = questionServices.queryAll();
        for (Question question : questionList) {
            System.out.println(question);
        }
    }

    @Test
    public void addQuestion() {
        //为什么控制台返回null,但是数据库可以添加
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss");
        Question question = new Question();
        question.setTitle("帮忙找一首歌");
        question.setDetailDesc("随便写点什么");
        question.setLastModified(sdf.format(date));
        question.setAnswerCount(0);

        Integer count = questionServices.addQuestion(question);
        System.out.println(count);
    }
}