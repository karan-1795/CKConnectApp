package karanbatra.com.ckconnect.Services.Codekamp;

import karanbatra.com.ckconnect.Models.Contact;
import karanbatra.com.ckconnect.Models.ItemResponse;
import karanbatra.com.ckconnect.Models.ListResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Karan Batra on 11-05-2016.
 */
public interface CodekampServiceInterface {

    @GET("contacts")
    Call<ListResponse<Contact>> listContacts(@Header("Authorization") String accessToken, @Query("page") int page);

    @GET("contacts/{id}")
    Call<ItemResponse<Contact>> getContact(@Header("Authorization") String accesstoken, @Path("id") int contactId);

    @GET("contacts")
    Call<ItemResponse<Contact>> createContact(@Header("Authorization") String accessToken, @Field("first_name") String firstName);

    @POST("contacts/")
    Call<Contact> storeContact(@Header("Authorization") String accessToken, @Field("first_name") String firstName, @Field("last_name") String lastName,
                               @Field("emails") String emails[], @Field("birthday") String birthday, @Field("facebook_id") String facebookId,
                               @Field("linkedin_id") String linkedinId,
                               @Field("ug_college_id") String ug_college_id, @Field("ug_course_id") String ug_course_id,
                               @Field("ug_entry_year") String ug_entry_year,
                               @Field("pg_college_id") String pg_college_id, @Field("pg_course_id") String pg_course_id,
                               @Field("pg_entry_year") String pg_entry_year, @Field("phones") String phones[]);

}
