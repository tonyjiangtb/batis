package tao.mapper;

import org.apache.ibatis.annotations.Insert;
import tao.model.Person;

public interface UserMapper {
  @Insert("INSERT INTO people(seq,name) VALUES(10, #{name})")
  void insert(Person p);
} 
