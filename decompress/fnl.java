import java.util.Objects;
import tv.periscope.android.api.ApiRunnable;
import tv.periscope.android.api.ApiEventHandler;
import tv.periscope.android.event.RetryEvent;
import tv.periscope.android.api.DefaultEventHandler;
import android.os.Handler;
import tv.periscope.android.api.PublicApiService;
import tv.periscope.android.api.AuthedApiService;
import android.content.Context;
import tv.periscope.android.api.PublicApiManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnl extends PublicApiManager
{
    public final fnl$a a;
    public final xv0 b;
    
    public fnl(final Context context, final u9a u9a, final AuthedApiService authedApiService, final PublicApiService publicApiService, final hf2 hf2, final l9w l9w, final Handler handler, final xv0 b) {
        super(context, u9a, authedApiService, publicApiService);
        this.b = b;
        this.registerApiEventHandler((ApiEventHandler)(this.a = new DefaultEventHandler(this, context, hf2, l9w, u9a, handler) {
            public final Handler a;
            public final fnl b;
            
            public void onEventMainThread(final RetryEvent retryEvent) {
                this.a.postDelayed((Runnable)new nob((Object)this, (Object)retryEvent, 8), ((stm)retryEvent.a).currentBackoff());
            }
        }));
    }
    
    public final void bind() {
    }
    
    public final String execute(final ApiRunnable apiRunnable) {
        final xv0 b = this.b;
        final hh0 hh0 = new hh0(apiRunnable);
        Objects.requireNonNull(b);
        return b.d(hh0.c()).D0;
    }
    
    public final void unbind() {
    }
}
