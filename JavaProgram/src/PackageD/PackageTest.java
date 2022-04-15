/*
* 1、package语句必须在源程序第一行
*    只能写一个
* 2、语法结构：package 包名;
* 3、命名规范：
*   公司域名倒叙 + 项目名 + 模块名 + 功能名;
*   采用这种方式重名的几率较低，公司域名具有全球唯一性
*   例如：
*       com.bjpowernode.oa.user.service;
* 4、包名要求全部小写，包名也是标识符，必须遵循标识符的命名规则
* 5、一个包将来对应一个目录
* 6、使用了package机制后，类名就变成了 包名.原类名
*
* package com.bjpowernode.oa.user.service;  此行代表5个目录，目录之间用.隔开
*
 */
package PackageD;
//不是java.lang包下，并且不在同一包下的时候，需要使用import进行引入
//导入指定包中的指定类
import DuoTai.Animal;
//导入该包中的所有类
import DuoTai.*;

public class PackageTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.move();
        //不同包，且不导入包的情况下，需要这样写代码
        DuoTai.Animal a2 = new DuoTai.Animal();
        a2.move();
    }
}
