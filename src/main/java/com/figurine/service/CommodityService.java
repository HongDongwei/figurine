package com.figurine.service;

import com.figurine.dao.CommodityDao;
import com.figurine.entity.Commodity;
import com.figurine.entity.request.CommodityAllRequestModel;
import com.figurine.entity.request.CommodityRequestModel;
import com.figurine.entity.request.CommoditySubmitRequestModel;
import com.figurine.entity.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {


    @Autowired
    private CommodityDao conclusionDao;


    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    public Result<String> select(CommodityRequestModel requestModel) {
        Commodity conclusion = conclusionDao.selectById(requestModel);
        return Result.success(conclusion);
    }

    /**
     * 查询全部
     *
     * @param
     * @return
     */
    public Result<String> selectAll(CommodityAllRequestModel commodityAllRequestModel) {
        List<Commodity> conclusion = conclusionDao.selectAll(commodityAllRequestModel);
        return Result.success(conclusion);
    }


    /**
     * 查询
     *
     * @param requestModel
     * @return
     */
    public Result<String> submit(CommoditySubmitRequestModel requestModel) {
        conclusionDao.submit(requestModel);
        return Result.success();
    }
}
