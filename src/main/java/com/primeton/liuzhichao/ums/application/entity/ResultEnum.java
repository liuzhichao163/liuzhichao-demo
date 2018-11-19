package com.primeton.liuzhichao.ums.application.entity;
/**
 * 自定义异常枚举类
 * @author ASUS
 *
 */
public enum ResultEnum {
	UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(200, "成功"),
    ERROR_USERNAME(401, "用户名被占用"),
    ERROR_NAME_FORMAT(402, "用户名不正确"),
    ERROR_ID_EMPTY(403,"请选择用户"),
    ERROR_ID_DELETE(406,"此用户不可删除,可能含有下级员工"),
    ERROR_NAME_UNQUALIFIED(407,"用户名格式错误"),
    ERROR_PWD_FORMT(501, "密码不正确"),
    ERROR_PWD_MODIFY(502,"密码修改失败"),
    ERROR_PWD_VALIDATA(503,"密码验证不成功"),
    ERROR_PWD_UNQUALIFIED(504,"密码格式错误"),
    ERROR_POWER_LOW(601,"权限太低"),
	ERROR_USER_LOGIN(701,"请登录"),
	ERROR_DEPT_NAME(801,"此部门名被占用"),
	ERROR_DEPT_NONE(802,"此部门不存在"),
    ERROR_DEPT_LOWER(803,"此部门无下级部门"),
    ERROR_DEPT_DELETE(804,"此部门不可删除，可能含有下级部门"),
    ERROR_DEPT_NOEMP(805,"此部门没有员工"),
    ERROR_DEPT_FAILURE(806,"删除部门失败"),
    ERROR_USER_FAILURE(807,"删除员工失败"),
    
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}