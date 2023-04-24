package com.ysk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Store {
    //店的id
    private Integer id;

    //用于展示的数据
    private String name;//店的名字
    private String address;//店的地址

    //用于计算的数据
    private Double size;//店的面积

    private Double preDivisorValue;//开店前准备除数的权值

    private Integer freePopulationNum;//店空闲时需要的人数

    private Double aftDivisorValue;//关店后准备除数的权值
    private Integer aftAddValue;//关店后准备加数的权值

    private Integer prePrepareHourNum;//开店之前需要做几小时准备工作
    private Integer aftPrepareHourNum;//关门之后需要做几小时准备工作

    private Double passFlowDivisorValue;//人流量对应店员数的除数权值
}
