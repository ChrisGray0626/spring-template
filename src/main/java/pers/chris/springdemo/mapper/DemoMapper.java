package pers.chris.springdemo.mapper;


import org.mapstruct.factory.Mappers;
import pers.chris.springdemo.pojo.DemoDO;
import pers.chris.springdemo.pojo.DemoVO;

@org.mapstruct.Mapper
public interface DemoMapper {

    DemoMapper INSTANCE = Mappers.getMapper(DemoMapper.class);

    DemoVO DO2VO(DemoDO demoDO);
}