package com.figurine.service;

import com.figurine.dao.CommodityDao;
import com.figurine.dao.OrderTableDao;
import com.figurine.entity.Commodity;
import com.figurine.entity.request.*;
import com.figurine.entity.result.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class OrderTableService {


    @Autowired
    private OrderTableDao orderTableDao;


    /**
     * 查询全部
     *
     * @param
     * @return
     */
    public Result<String> selectByUserId(OrderTableRequestModel orderTableRequestModel) {
        List<Commodity> conclusion = orderTableDao.selectByUserId(orderTableRequestModel);
        return Result.success(conclusion);
    }

    /**
     * 删除
     * @param requestModel
     * @return
     */
    public Result<String> delete(OrderTableDeleteRequestModel requestModel) {
        orderTableDao.deleteOrder(requestModel);
        return Result.success();
    }

    /**
     * 插入
     * @param requestModel
     * @return
     */
    public Result<String> insert(OrderTableInsertRequestModel requestModel) {
        orderTableDao.insertOrder(requestModel);
        return Result.success();
    }
    /**
     * 插入
     * @param requestModel
     * @return
     */
    public Result<String> select(OrderTableSubmitRequestModel requestModel) {
        orderTableDao.selectOrder(requestModel);
        return Result.success();
    }
}
