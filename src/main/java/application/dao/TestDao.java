package application.dao;

import com.alibaba.fastjson.JSONArray;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class TestDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public String getBlogList(){
        String sql = " select * from blog ";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return JSONArray.toJSONString(maps);
    }
}
