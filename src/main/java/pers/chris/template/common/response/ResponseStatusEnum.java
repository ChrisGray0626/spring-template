package pers.chris.template.common.response;

/**
 * @Author Chris
 * @Date 2022/3/2 4:19 PM
 * @Description 返回值类型
 */
public enum ResponseStatusEnum {

    SUCCESS("200", "成功"),
    ERROR("500", "失败");

    private final String code;
    private final String msg;

    ResponseStatusEnum(String value, String msg) {
        this.code = value;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
