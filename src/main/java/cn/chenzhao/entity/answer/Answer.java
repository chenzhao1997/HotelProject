package cn.chenzhao.entity.answer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    /*
FieldTypeComment
ansIdint(11) NOT NULL
ansContentvarchar(200) NOT NULL
ansDatedate NOT NULL
queIdbigint(20) NOT NULL*/
    private Integer ansId;
    private String ansContent;
    private String ansDate;
    private Integer queId;
}
