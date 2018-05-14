package ml.study.model;

import lombok.Data;
import lombok.val;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

/**
 * @author hemingliang-1291
 * @date 2018/5/11 18:22
 */
@Data
@Table(name = "t_user")
public class User {

    private Integer id;

    private String name;

}
