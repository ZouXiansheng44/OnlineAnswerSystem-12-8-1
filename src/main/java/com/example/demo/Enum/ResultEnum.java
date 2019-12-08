package com.example.demo.Enum;

import lombok.Getter;

@Getter
public enum ResultEnum
{

    SUCCESS(0,"成功"),
    PARAM_ERROR(1,"参数不正确"),
    USER_LOGIN_FAIL(2, "用户登录失败"),
    PRODUCT_STOCK_ERROR(3,"商品的库存异常"),
    ORDER_NOT_EXIST(4,"订单不存在"),
//    ORDERDETAIL_NOT_EXIST(5,"订单详情不存在"),
    ORDER_STATUS_ERROR(6,"订单状态不正确"),
    ORDER_UPDATE_FAIL(7,"订单更新失败"),
    ORDER_PAY_STATUS_ERROR(8,"订单支付状态不正确"),
    CART_EMPTY(9,"购物车为空"),
    ORDER_OWNER_ERROR(10,"该订单不属于当前用户"),
    ORDER_FINISH_SUCCESS(11,"订单完结成功"),
    ORDER_DETAIL_NOT_EXIST(12,""),
    ODDER_STATUS_ERROR(13,"添加状态错误"),
    ORDER_UPDATE_FATL(14,"订单修改"),
    LOGOUT_SUCCESS(15,"登陆成功")
    ;

    private String msg;
    private Integer code;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
