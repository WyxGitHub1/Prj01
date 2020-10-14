package utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;

public class WebUtil {

    public static void copyParamToBean(HttpServletRequest req,Object bean){
        try {
            BeanUtils.populate(bean,req.getParameterMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
