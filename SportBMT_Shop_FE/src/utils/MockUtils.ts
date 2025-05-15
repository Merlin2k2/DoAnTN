import { ClientCategoryResponse, ClientListedProductResponse } from 'types';

class MockUtils {
  static featuredCategories: ClientCategoryResponse[] = [
    {
      categoryName: 'Vợt cầu lông',
      categorySlug: 'vot-cau-long',
      categoryChildren: [],
    },
    {
      categoryName: 'Giầy cầu lông',
      categorySlug: 'giay-cau-long',
      categoryChildren: [],
    },
    {
      categoryName: 'Bộ quần áo cầu lông',
      categorySlug: 'bo-quan-ao-cau-long',
      categoryChildren: [],
    },
    {
      categoryName: 'Balo cầu lông',
      categorySlug: 'balo-cau-long',
      categoryChildren: [],
    },
    {
      categoryName: 'Cầu lông',
      categorySlug: 'cau-long',
      categoryChildren: [],
    },
    {
      categoryName: 'Phụ kiện cầu lông',
      categorySlug: 'phu-kien-cau-long',
      categoryChildren: [],
    },
  ];
}

export default MockUtils;
