package mapper;

import domain.Brand;

import java.util.List;

/**
 * BrandMapper interface.
 *
 * <p>
 *
 * @author Howen Xiong
 */

public interface BrandMapper {

		/**
		 * get brand by brandId.
		 * @param brandId Integer
		 * @return Brand entity
		 */
		Brand getBrands(Integer brandId);

		/**
		 * get all brands.
		 * @return List of Brand entity
		 */
		List<Brand> getAllBrands();
}
