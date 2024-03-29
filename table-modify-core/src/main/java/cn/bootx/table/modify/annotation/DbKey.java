package cn.bootx.table.modify.annotation;

import java.lang.annotation.*;

/**
 * 标志该字段为主键 也可通过注解：DbColumn的isKey属性实现
 *
 * @author sunchenbin
 * @version 2020年5月26日 下午6:13:15
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DbKey {

}
