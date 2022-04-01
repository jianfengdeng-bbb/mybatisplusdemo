package com.djf.mybatisplusdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_student
 */
@TableName(value ="t_student")
@Data
public class Student implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.INPUT)
    private Long sid;

    /**
     * 姓名
     */
    private String sName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 电话
     */
    private String phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}