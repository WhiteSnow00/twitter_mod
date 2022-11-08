import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsx
{
    public static final String e;
    public final rdf a;
    public final Map<wqx, b> b;
    public final Map<wqx, a> c;
    public final Object d;
    
    static {
        e = y9g.g("WorkTimer");
    }
    
    public hsx(final rdf a) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = a;
    }
    
    public final void a(final wqx wqx) {
        synchronized (this.d) {
            if (this.b.remove(wqx) != null) {
                final y9g e = y9g.e();
                final String e2 = hsx.e;
                final StringBuilder sb = new StringBuilder();
                sb.append("Stopping timer for ");
                sb.append(wqx);
                e.a(e2, sb.toString());
                this.c.remove(wqx);
            }
        }
    }
    
    public interface a
    {
        void b(final wqx p0);
    }
    
    public static final class b implements Runnable
    {
        public final hsx C0;
        public final wqx D0;
        
        public b(final hsx c0, final wqx d0) {
            this.C0 = c0;
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            synchronized (this.C0.d) {
                if (this.C0.b.remove(this.D0) != null) {
                    final a a = this.C0.c.remove(this.D0);
                    if (a != null) {
                        a.b(this.D0);
                    }
                }
                else {
                    y9g.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.D0));
                }
            }
        }
    }
}
