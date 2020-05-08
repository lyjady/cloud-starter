package org.augustus.payment.entries;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
* @author LinYongJin
* @date 2020/5/4 16:36
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String serial;

    private static final long serialVersionUID = 1L;
}