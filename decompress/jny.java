import java.util.Iterator;
import com.google.android.gms.internal.measurement.zzd;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jny
{
    public final m2z a;
    public z6z b;
    public final gay c;
    public final b100 d;
    
    public jny() {
        final m2z a = new m2z();
        this.a = a;
        this.b = a.b.c();
        this.c = new gay();
        this.d = new b100();
        a.d.a("internal.registerCallback", (Callable)new mby((Object)this, 1));
        a.d.a("internal.eventLogger", (Callable)new xhy((Object)this, 0));
    }
    
    public final void a(final q9z q9z) throws zzd {
        try {
            this.b = this.a.b.c();
            if (!(this.a.a(this.b, (eaz[])q9z.u().toArray(new eaz[0])) instanceof vby)) {
                for (final k9z k9z : q9z.s().v()) {
                    final List u = k9z.u();
                    final String t = k9z.t();
                    final Iterator iterator2 = u.iterator();
                    while (iterator2.hasNext()) {
                        final pey a = this.a.a(this.b, new eaz[] { (eaz)iterator2.next() });
                        if (!(a instanceof udy)) {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                        final z6z b = this.b;
                        lcy lcy;
                        if (!b.i(t)) {
                            lcy = null;
                        }
                        else {
                            final pey f = b.f(t);
                            if (!(f instanceof lcy)) {
                                throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(t)));
                            }
                            lcy = (lcy)f;
                        }
                        if (lcy == null) {
                            throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(t)));
                        }
                        lcy.a(this.b, (List)Collections.singletonList(a));
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
    
    public final boolean c(final x9y a) throws zzd {
        try {
            final gay c = this.c;
            c.a = a;
            c.b = a.a();
            c.c.clear();
            this.a.c.h("runtime.counter", (pey)new jcy(Double.valueOf(0.0)));
            this.d.a(this.b.c(), this.c);
            final gay c2 = this.c;
            return (c2.b.equals((Object)c2.a) ^ true) || (this.c.c.isEmpty() ^ true);
        }
        finally {
            final Throwable t;
            throw new zzd(t);
        }
    }
}
