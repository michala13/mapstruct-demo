package com.example.demo;

import objects.Parent;
import objects.ParentDM;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface InnerMapper {

    List<Parent> map(List<ParentDM> parents);
}
