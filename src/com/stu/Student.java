package com.stu;

/**
 * Project name(项目名称)：包
 * Package(包名): com.stu
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/7
 * Time(创建时间)： 19:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    private String name;
    private int age;
    private String sex;
    private long StudentID;

    public Student(String name, int age, String sex, long studentID)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        StudentID = studentID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public long getStudentID()
    {
        return StudentID;
    }

    public void setStudentID(long studentID)
    {
        StudentID = studentID;
    }

    public StringBuilder display()
    {
        StringBuilder s;
        s = new StringBuilder();
        s.append("姓名：").append(getName());
        s.append("\n年龄:").append(getAge());
        s.append("\n性别：").append(getSex());
        s.append("\n学号:").append(getStudentID());
        return s;
    }
}
