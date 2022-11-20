import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.async.http.HttpRequestResultException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmq extends ste implements qsb<Throwable, fzv>
{
    public final pmq D0;
    
    public rmq(final pmq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        final smq d = this.D0.d;
        czd.e((Object)t, "it");
        final s2b$b a = s2b$b.a;
        Objects.requireNonNull(d);
        if (!(t instanceof HttpRequestResultException) || !((HttpRequestResultException)t).F0) {
            final h8a h8a = new h8a((Throwable)d.a(t, "Fleets: TimelineRequest failed"));
            ((HashMap<String, String>)h8a.a).put("cachedThreadsCount", String.valueOf(d.a.d((s2b)a).size()));
            String s;
            if (czd.a((Object)a, (Object)a)) {
                s = "fleetline";
            }
            else if (a instanceof s2b$c) {
                s = "multiUserThreads";
            }
            else {
                if (!(a instanceof s2b$d)) {
                    throw new NoWhenBranchMatchedException();
                }
                s = "userThread";
            }
            ((HashMap<String, String>)h8a.a).put("context", s);
            m8a.c(h8a);
        }
        return fzv.a;
    }
}
