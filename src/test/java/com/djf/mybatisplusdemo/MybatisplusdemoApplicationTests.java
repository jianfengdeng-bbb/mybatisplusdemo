package com.djf.mybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.djf.mybatisplusdemo.mapper.StudentMapper;
import com.djf.mybatisplusdemo.pojo.Student;
import com.djf.mybatisplusdemo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.writer.UpdaterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class MybatisplusdemoApplicationTests {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentService studentService;
    @Test
    void contextLoads() {

    }

    @Test
    public void testInsert(){
        Student student = new Student();
        student.setSName("张三");
        student.setAge(10);
        student.setGender("1");
        student.setPhone("13388888888");
        int i = studentMapper.insert(student);
        System.out.println(i);
    }
    @Test
    public void PageTest(){
        Page page = new Page(1,2);
        studentMapper.selectPage(page,null);
        List<Student> list = page.getRecords();
        list.forEach(System.out::println);
        log.info("当前页数"+page.getCurrent());
        log.info("当前页面数据"+page.getSize());
        log.info("总页数"+page.getPages());
        log.info(("总记录数"+page.getTotal()));
    }

    @Test
    public void queryStudent(){
        Student student = new Student();
        student.setSid(1L);
        Student findStudent = studentMapper.selectOne(new QueryWrapper<Student>(student));
        System.out.println(findStudent);
        System.out.println(findStudent.toString());
    }

}
