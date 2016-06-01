package karanbatra.com.ckconnect.Services.Codekamp;

import karanbatra.com.ckconnect.Models.*;
import karanbatra.com.ckconnect.Models.Error;

/**
 * Created by Karan Batra on 11-05-2016.
 */
public interface Callback<T> {

    void onSuccess(T response);

    void onFailure(Error error);
}
