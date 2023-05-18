package cn.bootx.mybatis.table.modify.mybatis.mysq.handler;

import cn.bootx.mybatis.table.modify.constants.DatabaseType;
import cn.bootx.mybatis.table.modify.constants.UpdateType;
import cn.bootx.mybatis.table.modify.handler.TableHandlerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;

/**
 * 启动时进行处理的实现类
 *
 * @author chenbin.sun
 *
 */
@Slf4j
@RequiredArgsConstructor
public class StartUpHandler {

    private final List<TableHandlerService> tableHandlerServices;

    /**
     * 建表开始
     */
    public void startHandler() {
        // 获取配置信息
        DatabaseType databaseType = mybatisTableModifyProperties.getDatabaseType();
        // 执行mysql的处理方法
            if (tableHandlerService.getDatabaseType() == databaseType){
                // 自动创建模式：update表示更新，create表示删除原表重新创建
                UpdateType updateType = mybatisTableModifyProperties.getUpdateType();

                // 不做任何事情
                if (Objects.isNull(updateType)) {
                    log.warn("配置mybatis.table.updateType错误无法识别，当前配置只支持[none/update/create/add]三种类型!");
                    return;
                }

                // 不做任何事情
                if (updateType == UpdateType.NONE) {
                    return;
                }
                // 开始处理
                tableHandlerService.startModifyTable();
            }
        }
    }

}
