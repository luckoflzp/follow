package com.G.follow.potting;

import com.G.follow.dao.ProcedureInterface;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 封装model类
 */
@Component
public class FollowModel extends ModelAndView {
    //存储的属性
    private Map<String,String> map = new HashMap<>();
    private boolean tage = false;
    private StringBuffer stringBuffer = new StringBuffer();

    /**
     * 配置存储执行语句
     * @param string
     * @return 实现流
     */
    public FollowModel append(String string){
        stringBuffer.append(string);
        return this;
    }
    /**
     *配置存储方法
     * @param procedure
     * @return 实现流
     */
    public FollowModel setProcedure(String procedure){
        StringBuffer action = new StringBuffer();
        StringBuffer newSb = new StringBuffer();
        if (stringBuffer.length() > 0) {
            action.append("<main>");
            action.append("<FUNCTION>" + procedure + "</FUNCTION>");
            action.append(stringBuffer.toString());
            action.append("</main>");
            map.put("action",action.toString());
            tage = true;
        }
        return this;
    }

    /**
     *执行存储过程
     * @param procedureInterface
     * @return 返回结果
     */
    public List excust(ProcedureInterface procedureInterface){
        if(tage){
            return procedureInterface.operaProcedure(map);
        }
       return null;
    }
}
