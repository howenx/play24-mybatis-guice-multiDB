package mapper;


import domain.Cate;

import java.util.HashMap;
import java.util.List;

/**
 * CatesMapping.xml for CateMapper interface.
 *
 * <p>
 *
 * @author Howen Xiong
 */
public interface CateMapper {

		/**
		 * get all parents item categories.
		 * @return List cates entity.
		 */
		List<Cate> getParentCates();

		/**
		 * get category by cateId or parentCateId or cateId,parentCateId.
		 * @param hashMap key(String),value(Integer) (cateId,parentCateId).
		 * @return List cates entity.
		 */
		List<Cate> getSubCates(HashMap<String, Integer> hashMap);
}
