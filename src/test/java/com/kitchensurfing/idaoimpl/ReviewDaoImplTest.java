package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.po.Review;

public class ReviewDaoImplTest {

	private static ReviewDaoImpl ds;
	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				KitchenSuringServiceConfig.class);
		ds = ctx.getBean(ReviewDaoImpl.class);
		ctx.close();
	}
    @Ignore
	@Test
	public void test() {
		Review review =ds.getReview(1);
		System.out.println(review.getChefId());
	}
    @Test
    public void testCount(){
    	System.out.println(ds.getReviewCount(1));
    }
}
