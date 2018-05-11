package ml.study.model;

import lombok.Data;

/**
 * @author hemingliang-1291
 * @date 2018/5/11 18:22
 */
@Data
public class User {

    private Long id;

    private String uuid;

    /**
     * 登录账号 --> USER_NAME
     */
    private String userName;

    /**
     * 登录密码 --> PASSWORD
     */
    private String password;

    /**
     * 真实名称 --> REAL_NAME
     */
    private String realName;
}
