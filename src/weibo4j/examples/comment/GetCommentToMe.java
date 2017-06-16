package weibo4j.examples.comment;

import weibo4j.Comments;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.CommentWapper;
import weibo4j.model.WeiboException;

public class GetCommentToMe {

	public static void main(String[] args) {
		String access_token = "2.00D3QzeCC78mPCcb24c61111WvmfVE";
		Comments cm = new Comments(access_token);
		try {
			CommentWapper comment = cm.getCommentToMe();
			Log.logInfo(comment.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
