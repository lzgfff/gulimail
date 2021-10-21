package com.atgugui.gulimall.product;

import com.atguigu.gulimall.product.GulimallProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimallProductApplication.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("test描述");
        brandEntity.setName("test华为");
        brandService.save(brandEntity);

        System.out.println("保存成功");
    }


    @Test
    public void update(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("test欧朋");

        brandService.updateById(brandEntity);
    }

}
