package weibo4j.examples.favorites;

import java.io.File;
import java.io.IOException;
import java.util.List;

import weibo4j.Favorite;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.Favorites;
import weibo4j.model.WeiboException;
import weibo4j.util.FileUtil;

public class GetFavorites {

	public static void main(String[] args) {
		String access_token = "2.00D3QzeCC78mPCcb24c61111WvmfVE";
		Favorite fm = new Favorite(access_token);
		try {
			List<Favorites> favors = fm.getFavorites();
			for (Favorites s : favors) {
				// Log.logInfo(s.getStatus().toString());
				try {
					String filePath = "D:/微博收藏/" + s.getStatus().getUser().getName() + File.separator
							+ s.getStatus().getMid().toString() + ".txt";
					FileUtil.outText(filePath, s.getStatus().getText());
				} catch (NullPointerException e1) {
					// TODO: handle exception
				}
			}
		} catch (WeiboException | IOException e) {
			e.printStackTrace();
		}
	}

}
