package org.augustus.exception;

/**
 * @author LinYongJin
 * @date 2020/5/4 16:28
 */
public class CloudException extends RuntimeException{

    private final int code;


    public CloudException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
