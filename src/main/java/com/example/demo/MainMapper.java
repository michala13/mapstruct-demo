package com.example.demo;

import objects.Parent;
import objects.ParentDM;
import objects.Student;
import objects.StudentInfo;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(uses = {InnerMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MainMapper {
    public InnerMapper innerMapper = new InnerMapperImpl() ;

    @Mapping(target = "parent", expression = "java(innerMapper.map(filter(student.getParent())))")
    @Mapping(target = "national", expression = "java(innerMapper.map(filter(student.getNational())))")
    StudentInfo map(Student student);

     default List<ParentDM> filter(List<ParentDM> parents) {
        return parents;
    }
}
