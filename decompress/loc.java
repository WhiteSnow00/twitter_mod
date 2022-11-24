import java.util.Iterator;
import android.util.Log;
import java.util.Map;
import com.twitter.media.NativeCrashHandler;
import com.twitter.media.NativeInit;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loc implements rk6
{
    public final int F0;
    public final r9a G0;
    
    public loc(final r9a g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        switch (this.F0) {
            default: {
                final r9a g0 = this.G0;
                final UserIdentifier userIdentifier = (UserIdentifier)o;
                if (NativeInit.a) {
                    final Map a = ((hyo$b)g0.a.g((Iterable)null)).a;
                    final long id = userIdentifier.getId();
                    synchronized (NativeCrashHandler.class) {
                        if (NativeInit.a) {
                            try {
                                NativeCrashHandler.nativeSetCrashlyticsUserId(String.valueOf(id));
                                for (final Map.Entry<String, V> entry : a.entrySet()) {
                                    NativeCrashHandler.nativeSetCrashlyticsCustomKey((String)entry.getKey(), String.valueOf(entry.getValue()));
                                }
                            }
                            catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                                Log.e("filters", "Failed NativeCrashHandler#setGlobalContext", (Throwable)unsatisfiedLinkError);
                            }
                        }
                    }
                }
                return;
            }
            case 0: {
                this.G0.f((Throwable)o);
            }
        }
    }
}
