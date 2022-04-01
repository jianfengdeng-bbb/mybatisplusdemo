package com.djf.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djf.mybatisplusdemo.pojo.Student;
import com.djf.mybatisplusdemo.service.StudentService;
import com.djf.mybatisplusdemo.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




