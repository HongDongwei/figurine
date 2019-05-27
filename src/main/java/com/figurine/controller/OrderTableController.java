package com.figurine.controller;


import com.figurine.entity.request.*;
import com.figurine.entity.result.Result;
import com.figurine.service.CommodityService;
import com.figurine.service.OrderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class OrderTableController {

    @Autowired
    private OrderTableService orderTableService;


    /**
     * 查询全部
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/order/table/select")
    public Result<String> select(@RequestBody OrderTableRequestModel requestModel) {
        return orderTableService.selectByUserId(requestModel);
    }

    /**
     * 删除
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/order/table/delete")
    public Result<String> delete(@RequestBody OrderTableDeleteRequestModel requestModel) {
        return orderTableService.delete(requestModel);
    }

    /**
     * 插入
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/order/table/insert")
    public Result<String> insert(@RequestBody OrderTableInsertRequestModel requestModel) {
        return orderTableService.insert(requestModel);
    }


    /**
     * 修改
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/order/table/submit")
    public Result<String> submit(@RequestBody OrderTableSubmitRequestModel requestModel) {
        return orderTableService.select(requestModel);
    }
}
