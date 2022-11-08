import java.util.Iterator;
import com.google.android.gms.internal.measurement.zzd;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tmy
{
    public final x1z a;
    public k6z b;
    public final q9y c;
    public final q000 d;
    
    public tmy() {
        final x1z a = new x1z();
        this.a = a;
        this.b = a.b.a();
        this.c = new q9y();
        this.d = new q000();
        a.d.a("internal.registerCallback", (Callable)new way((Object)this, 1));
        a.d.a("internal.eventLogger", (Callable)new ghy((Object)this, 0));
    }
    
    public final void a(final b9z b9z) throws zzd {
        try {
            this.b = this.a.b.a();
            if (!(this.a.a(this.b, (p9z[])b9z.u().toArray(new p9z[0])) instanceof fby)) {
                for (final v8z v8z : b9z.s().v()) {
                    final List u = v8z.u();
                    final String t = v8z.t();
                    final Iterator iterator2 = u.iterator();
                    while (iterator2.hasNext()) {
                        final aey a = this.a.a(this.b, new p9z[] { (p9z)iterator2.next() });
                        if (!(a instanceof edy)) {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                        final k6z b = this.b;
                        vby vby;
                        if (!b.g(t)) {
                            vby = null;
                        }
                        else {
                            final aey d = b.d(t);
                            if (!(d instanceof vby)) {
                                throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(t)));
                            }
                            vby = (vby)d;
                        }
                        if (vby == null) {
                            throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(t)));
                        }
                        vby.a(this.b, (List)Collections.singletonList(a));
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        }
        finally {
            final Throwable t2;
            throw new zzd(t2);
        }
    }
    
    public final void b(final String s, final Callable callable) {
        this.a.d.a(s, callable);
    }
    
    public final boolean c(final h9y a) throws zzd {
        try {
            final q9y c = this.c;
            c.a = a;
            c.b = a.a();
            c.c.clear();
            this.a.c.f("runtime.counter", (aey)new tby(Double.valueOf(0.0)));
            this.d.a(this.b.a(), this.c);
            final q9y c2 = this.c;
            return (c2.b.equals(c2.a) ^ true) || (this.c.c.isEmpty() ^ true);
        }
        finally {
            final Throwable t;
            throw new zzd(t);
        }
    }
}
