package cn.com.study.exception;

/**
 * @Author: yangyl
 * @Date: 2019/11/19 13:53
 * 自定义异常类
 */
public class SysException extends Exception {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public SysException(String msg) {
        this.msg = msg;
    }
}
