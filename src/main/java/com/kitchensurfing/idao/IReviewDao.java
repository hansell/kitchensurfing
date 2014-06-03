package com.kitchensurfing.idao;

import com.kitchensurfing.po.Review;

public interface IReviewDao {
   Review getReview(final int reviewId);
   int getReviewCount(final int userId);
}
