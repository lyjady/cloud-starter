package org.augustus.to;

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
public class PaymentTo implements Serializable {

    private String serial;

    private static final long serialVersionUID = 1L;
}