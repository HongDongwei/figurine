package com.figurine.dao;


import com.figurine.entity.Commodity;
import com.figurine.entity.request.CommodityAllRequestModel;
import com.figurine.entity.request.CommodityRequestModel;
import com.figurine.entity.request.CommoditySubmitRequestModel;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface CommodityDao {

    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    Commodity selectById(CommodityRequestModel requestModel);

    /**
     * 查询全部
     *
     * @param
     * @return
     */
    List<Commodity> selectAll(CommodityAllRequestModel commodityAllRequestModel);

    /**
     * 查询全部
     *
     * @param
     * @return
     */
    void submit(CommoditySubmitRequestModel commoditySubmitRequestModel);

}
