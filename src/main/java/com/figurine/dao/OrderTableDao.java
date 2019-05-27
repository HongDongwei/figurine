package com.figurine.dao;


import com.figurine.entity.Commodity;
import com.figurine.entity.request.*;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface OrderTableDao {

    /**
     * 查询全部
     *
     * @param
     * @return
     */
    List<Commodity> selectByUserId(OrderTableRequestModel orderTableRequestModel);

    /**
     * 删除
     *
     * @param requestModel
     */
    void deleteOrder(OrderTableDeleteRequestModel requestModel);

    /**
     * 插入数据
     *
     * @param requestModel
     */
    void insertOrder(OrderTableInsertRequestModel requestModel);

    /**
     * 修改数据
     *
     * @param requestModel
     */
    void selectOrder(OrderTableSubmitRequestModel requestModel);


}
