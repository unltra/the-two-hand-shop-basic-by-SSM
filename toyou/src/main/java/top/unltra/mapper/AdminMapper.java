package top.unltra.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.unltra.domain.Admin;

/**
 * UserMapper接口
 * */
public interface AdminMapper {
	
	/**
	 * 根据登录名和密码查询admin
	 * @param String aname
	 * @param String apw
	 * @return 找到返回Admin对象，没有找到返回null
	 * */
	@Select("select * from lp_admin where aname = #{aname} and apw = #{apw}")
	Admin findWithAnameAndApw(@Param("aname")String aname,
			@Param("apw") String apw);

}
