package com.test;

import org.apache.log4j.Logger;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.WritableResource;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-29 21:03
 * @desc
 * @since 1.8
 */

public class WriteableResourceTest {

    private Logger logger = Logger.getLogger(this.getClass());

    @Test
    public void writeFileTest() {

        InputStream im = null;
        OutputStream om = null;

        try {

            String url = "E:\\projects\\spring-boot\\src\\main\\resources\\test.txt";

            WritableResource res1 = new PathResource(url);

            im = res1.getInputStream();
            om = res1.getOutputStream();

            om.write("test数据".getBytes("utf-8"));

            om.flush();

        } catch (Exception e) {

            logger.error("读取文件出错", e);
        } finally {

            if (om != null) {

                try {

                    om.close();
                } catch (Exception e) {

                    logger.error("关闭流出错", e);
                }
            }
        }
    }
}
