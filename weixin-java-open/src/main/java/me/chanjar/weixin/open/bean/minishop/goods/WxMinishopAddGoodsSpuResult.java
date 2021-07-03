package me.chanjar.weixin.open.bean.minishop.goods;

import lombok.Data;

import java.io.Serializable;

@Data
public class WxMinishopAddGoodsSpuResult<T> implements Serializable {
  private Integer errcode;

  private String errmsg;

  private T data;
}
