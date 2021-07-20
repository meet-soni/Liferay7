package com.ecw.user.service.hook;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;

/**
 * @author mEeT
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class CustomUserLocalServiceWrapper extends UserLocalServiceWrapper {

	public CustomUserLocalServiceWrapper() {
		super(null);
	}


	@Override
	public User updateUser(long userId, String oldPassword, String newPassword1, String newPassword2,
			boolean passwordReset, String reminderQueryQuestion, String reminderQueryAnswer, String screenName,
			String emailAddress, long facebookId, String openId, boolean portrait, byte[] portraitBytes,
			String languageId, String timeZoneId, String greeting, String comments, String firstName, String middleName,
			String lastName, long prefixId, long suffixId, boolean male, int birthdayMonth, int birthdayDay,
			int birthdayYear, String smsSn, String facebookSn, String jabberSn, String skypeSn, String twitterSn,
			String jobTitle, long[] groupIds, long[] organizationIds, long[] roleIds,
			List<UserGroupRole> userGroupRoles, long[] userGroupIds, ServiceContext serviceContext)
			throws PortalException {

		middleName += "MS"; 
		return super.updateUser(userId, oldPassword, newPassword1, newPassword2, passwordReset, reminderQueryQuestion,
				reminderQueryAnswer, screenName, emailAddress, facebookId, openId, portrait, portraitBytes, languageId,
				timeZoneId, greeting, comments, firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear, smsSn, facebookSn, jabberSn, skypeSn, twitterSn, jobTitle, groupIds, organizationIds,
				roleIds, userGroupRoles, userGroupIds, serviceContext);
	}

}