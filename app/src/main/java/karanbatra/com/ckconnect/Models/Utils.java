package karanbatra.com.ckconnect.Models;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Karan Batra on 16-05-2016.
 */
public class Utils {

    public static boolean isNetwork(Context context)
    {
        ConnectivityManager connectivityManage=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManage.getActiveNetworkInfo();
        return networkInfo!=null && networkInfo.isConnectedOrConnecting();
    }
}
