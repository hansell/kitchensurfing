package com.kitchensurfing.serviceimpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.IReviewDao;
import com.kitchensurfing.iservice.IReviewService;
@Repository
@Service("reviewService")
public class ReviewService implements Serializable, IReviewService {
    @Autowired
	private IReviewDao reviewDao;
	private static final long serialVersionUID = -9189529362281851026L;

	public int getCounts(final int chefId) {
		// TODO Auto-generated method stub
		return reviewDao.getReviewCount(chefId);
	}

}
