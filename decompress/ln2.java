import java.util.Objects;
import tv.periscope.android.api.service.hydra.HydraGuestServiceApi;
import okhttp3.Interceptor;
import tv.periscope.android.api.service.AuthorizationTokenDelegate;
import tv.periscope.android.api.service.BackendServiceInterceptor;
import tv.periscope.android.api.BackendServiceName;
import tv.periscope.android.api.RestClient$Builder;
import okhttp3.logging.HttpLoggingInterceptor$Level;
import java.util.concurrent.Executor;
import android.content.Context;
import tv.periscope.android.api.service.GuestServiceApi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ln2 implements wqa<GuestServiceApi>
{
    public static GuestServiceApi a(final Context context, final Executor executor, final HttpLoggingInterceptor$Level httpLoggingInterceptor$Level, final zf1 zf1) {
        final int a = gn2.a;
        final GuestServiceApi guestServiceApi = (GuestServiceApi)new RestClient$Builder().context(context).executor(executor).endpoint(djr.h()).logLevel(httpLoggingInterceptor$Level).addInterceptor((Interceptor)new BackendServiceInterceptor(BackendServiceName.GUEST, (AuthorizationTokenDelegate)zf1)).addNetworkInterceptor(e7b.a()).build().getService((Class)HydraGuestServiceApi.class);
        Objects.requireNonNull(guestServiceApi, "Cannot return null from a non-@Nullable @Provides method");
        return guestServiceApi;
    }
}
