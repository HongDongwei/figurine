package com.figurine.controller;


import com.figurine.entity.request.CommodityAllRequestModel;
import com.figurine.entity.request.CommodityRequestModel;
import com.figurine.entity.request.CommoditySubmitRequestModel;
import com.figurine.entity.result.Result;
import com.figurine.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CommodityController {

    @Autowired
    private CommodityService commodityService;


    /**
     * 查询单个
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/commodity/select")
    public Result<String> select(@RequestBody CommodityRequestModel requestModel) {
        return commodityService.select(requestModel);
    }

    /**
     * 查询全部
     *
     * @param
     * @return
     */
    @PostMapping("/v1/vsm/commodity/select/all")
    public Result<String> selectAll(@RequestBody CommodityAllRequestModel commodityAllRequestModel) {
        return commodityService.selectAll(commodityAllRequestModel);
    }

    /**
     * 查询单个
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/commodity/sumbit")
    public Result<String> sumbit(@RequestBody CommoditySubmitRequestModel requestModel) {
        return commodityService.submit(requestModel);
    }
}
