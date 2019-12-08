package com.example.demo.dto;

import com.example.demo.utils.Date2LongSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
//在类上边添加@JsonIgnoreProperties注释，为空的时候不序列化

@JsonIgnoreProperties
public class QuestionBankDTO {
    private Integer questionId;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    private String questionContent;
    //    private List<String> questionOption;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    //是list是因为要把questionOption题目选项切割为数组对象
    private List questionOption;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    //是list是因为要把questionAnswer题目答案切割为数组对象
    private List questionAnswer;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    private String questionType;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    private String questionSubject;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    private String questionStatus;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    //题目解析，该字段来自AnswerAnalysis表
    private String analysisContent;
    @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
    //题目分数，该字段来自QuestionScore表
    private String questionScore;
    //使用@JsonSerialize注解，让返回的JSON对象中Date类型的数据显示的时间戳精确到秒
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    //使用@JsonSerialize注解，让返回的JSON对象中Date类型的数据显示的时间戳精确到秒
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

}
