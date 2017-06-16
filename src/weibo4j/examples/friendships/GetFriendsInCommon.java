package weibo4j.examples.friendships;

import weibo4j.Friendships;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.User;
import weibo4j.model.UserWapper;
import weibo4j.model.WeiboException;

//Insufficient app permissions
public class GetFriendsInCommon {

	public static void main(String[] args) {
		String access_token = "2.00D3QzeCC78mPCcb24c61111WvmfVE";
		String uid = "2437919983";
		Friendships fm = new Friendships(access_token);
		try {
			UserWapper users = fm.getFriendsInCommon(uid);
			for (User u : users.getUsers()) {
				Log.logInfo(u.toString());
			}
			System.out.println(users.getNextCursor());
			System.out.println(users.getPreviousCursor());
			System.out.println(users.getTotalNumber());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
