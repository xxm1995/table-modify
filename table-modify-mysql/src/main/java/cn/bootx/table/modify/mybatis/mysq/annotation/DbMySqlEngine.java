package cn.bootx.table.modify.mybatis.mysq.annotation;

import cn.bootx.table.modify.mybatis.mysq.constants.MySqlEngineEnum;

import java.lang.annotation.*;

/**
 * MYSQL引擎类型
 * @author xxm
 * @date 2023/4/7
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DbMySqlEngine {

    MySqlEngineEnum value() default MySqlEngineEnum.DEFAULT;

}
