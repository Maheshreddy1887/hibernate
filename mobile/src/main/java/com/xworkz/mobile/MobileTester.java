package com.xworkz.mobile;

import com.xworkz.mobile.hibernate.dao.MobileDAO;

public class MobileTester {

	public static void main(String[] args) {

		MobileDAO mobileDAOImpl = new MobileImplDAO();

		// mobileDAOImpl.saveMobileEntity();

		// mobileDAOImpl.getMobileEntity();

		// mobileDAOImpl.updateMobileEntity();

		mobileDAOImpl.deleteMobileEntity();

	}
}
