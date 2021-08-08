package com.yt.springbootmybatis.mapper;

import com.yt.springbootmybatis.model.PaymentChannel;
import com.yt.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @USER: Young
 * @DATETIME: 2021/2/5
 * @DESCRIPTION:
 **/
@Repository
public interface PaymentChannelMapper {

    PaymentChannel getById(@Param("id") Integer id);

    PaymentChannel getByChannelId(@Param("channelId") String channelId);

}
