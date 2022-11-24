import java.util.List;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wci<T> implements d00
{
    public final s00<T> a;
    
    public wci(final s00<T> a) {
        e0e.f((Object)a, "analyticsLogFlusher");
        this.a = a;
    }
    
    public final boolean a(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "owner");
        final s00<T> a = this.a;
        Objects.requireNonNull(a);
        int n = 30;
        boolean b = true;
        int i;
        boolean b2;
        do {
            final String p = flr.p(6);
            final int n2 = 0;
            i = 0;
            try {
                final List f = a.a.f(userIdentifier, p, n);
                if (f.isEmpty()) {
                    b2 = b;
                    i = n2;
                }
                else {
                    b2 = ((i = (a.a(userIdentifier, f, p) ? 1 : 0)) != 0);
                }
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                r9a.d((Throwable)outOfMemoryError);
                if (n != 5) {
                    if (a.c) {
                        nag.a("AnalyticsLogFlusher", "OOM while flush user logs, tune down the log size");
                    }
                    n = 5;
                    i = 1;
                }
                else {
                    if (a.c) {
                        nag.a("AnalyticsLogFlusher", "OOM while flush user logs, abort");
                    }
                    b = false;
                }
                a.a.d(userIdentifier, p);
                b2 = b;
            }
            b = b2;
        } while (i != 0);
        return b2;
    }
}
