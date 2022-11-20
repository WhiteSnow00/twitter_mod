import java.util.List;
import java.util.Collections;
import okhttp3.Protocol;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient$Builder;
import okhttp3.Interceptor;
import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5s extends ffk
{
    public a5s(final woo woo, final drc drc, final Dns dns, final Interceptor interceptor) {
        super(woo, drc, dns, interceptor);
    }
    
    public final OkHttpClient$Builder e(final drc drc) {
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        return super.e(drc).connectionPool(new ConnectionPool(0, 1L, milliseconds)).connectTimeout(5000L, milliseconds).retryOnConnectionFailure(false).cache((Cache)null).protocols((List)Collections.singletonList(Protocol.HTTP_1_1)).pingInterval(0L, milliseconds);
    }
}
