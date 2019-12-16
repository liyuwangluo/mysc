package com.liyu;

import java.util.Collection;

public interface StudentRepositoy {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
