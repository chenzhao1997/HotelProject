package cn.chenzhao.entity.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    /*
    * queIdint(11) NOT NULL
titlevarchar(200) NOT NULL
detailDescvarchar(200) NULL
answerCountint(11) NOT NULL
lastModifieddatetime NOT NULL*/

    private Integer queId;
    private String title;
    private String detailDesc;
    private Integer answerCount;
    private String lastModified;
}
