package ml.study.mapper;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author hemingliang-1291
 * @date 2018/5/11 18:31
 * 被继承的Mapper，一般业务Mapper继承它
 */
// 过滤该类的注入
@ConditionalOnMissingClass("tk.mybatis.mapper.common.Mapper")
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}