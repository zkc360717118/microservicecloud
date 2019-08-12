package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true) //允许链式操作
public class Dept  implements Serializable { //隐射mysql的Dept表  //必须要实现序列化接口，方便网络传输
    private Long deptno;
    private String dname; //部门名称
    private String db_source; //来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，统一而信息被存到不同数据库

    public Dept(String dname){
        super();
        this.dname = dname;
    }
}
