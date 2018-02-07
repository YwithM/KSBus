package mike.cn.ksbus.config;

/**
 * @author Mike
 * @project KSBus
 * @date 06/09/2017, 6:28 PM
 * @e-mail mike@mikecoder.cn
 */

public class Config {
    public static final String CSS = "#header_in{display:none}"
                                     + "#footer{display:none} "
                                     + " #gotoTop{display:none!important} "
                                     + "#body_in{min-width:320px}"
                                     + "marquee{border-radius:4px;background:0 0;color:#000;font-size:10px}"
                                     + "#weather_index{display:none!important}";

    public static final String CSS_URL = "http://47.92.122.133/KSBus/clean.css";

    public static final String MIKE_SPEC_URLS[] = {
            "http://wap.ksbus.com.cn/lineGps/26/upOrDown/1/station/-1/order/-1",
            "http://wap.ksbus.com.cn/lineGps/531/upOrDown/0/station/-1/order/-1",
            "http://wap.ksbus.com.cn/lineGps/31/upOrDown/1/station/-1/order/-1",
            "http://wap.ksbus.com.cn/lineGps/33/upOrDown/1/station/-1/order/-1"
    };

    public static final String MIKE_SPEC_DESCS[] = {
            "一路",
            "24路",
            "11路",
            "15路"
    };
}
