package cn.chenzhao.services.answer;

import cn.chenzhao.entity.answer.Answer;
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
public class AnswerServicesImplTest {
    @Resource
    private AnswerServices answerServices;
    @Test
    public void queryAll() {
        List<Answer> answerList = answerServices.queryAll(8);
        for (Answer answer : answerList) {
            System.out.println(answer);
        }
    }

    @Test
    public void addAnswer() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss");
        Integer count = answerServices.addAnswer(new Answer(null, "sdlfja", sdf.format(date), 2));
        System.out.println(count);
    }
}