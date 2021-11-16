package com.xworkz.mobile;

import com.xworkz.mobile.hibernate.dao.MobileDAO;
import com.xworkz.mobile.hibernate.dao.MobileImpl;

public class MobileTester {

	public static void main(String[] args) {

		MobileDAO mobileDAOImpl = new MobileImpl();

		// mobileDAOImpl.saveMobileEntity();

		// mobileDAOImpl.getMobileEntity();

		// mobileDAOImpl.updateMobileEntity();

		mobileDAOImpl.deleteMobileEntity();

	}
}
