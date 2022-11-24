import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tb<BUILDER extends tb<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO>
{
    public static final rq6<Object> k;
    public static final NullPointerException l;
    public static final AtomicLong m;
    public final Set<rq6> a;
    public final Set<qq6> b;
    public Object c;
    public REQUEST d;
    public REQUEST[] e;
    public boolean f;
    public zzr<v88<IMAGE>> g;
    public rq6<? super INFO> h;
    public boolean i;
    public te9 j;
    
    static {
        tb.k = new tb$a();
        l = new NullPointerException("No image request was specified!");
        m = new AtomicLong();
    }
    
    public tb(final Context context, final Set<rq6> a, final Set<qq6> b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = true;
        this.h = null;
        this.i = false;
        this.j = null;
    }
    
    public final sb a() {
        final REQUEST[] e = this.e;
        final boolean b = true;
        xd.N(e == null || this.d == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        boolean b2 = b;
        if (this.g != null) {
            b2 = (this.e == null && this.d == null && b);
        }
        xd.N(b2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        if (this.d == null) {
            final REQUEST[] e2 = this.e;
        }
        rrb.b();
        final sb d = this.d();
        d.m = false;
        d.n = null;
        final Set<rq6> a = this.a;
        if (a != null) {
            final Iterator<rq6<? super INFO>> iterator = a.iterator();
            while (iterator.hasNext()) {
                d.a(iterator.next());
            }
        }
        final Set<qq6> b3 = this.b;
        if (b3 != null) {
            for (final qq6 qq6 : b3) {
                final smb<INFO> e3 = d.e;
                synchronized (e3) {
                    e3.F0.add(qq6);
                    continue;
                }
                break;
            }
        }
        final rq6<? super INFO> h = this.h;
        if (h != null) {
            d.a(h);
        }
        if (this.i) {
            d.a((rq6)tb.k);
        }
        rrb.b();
        return d;
    }
    
    public abstract v88<IMAGE> b(final te9 p0, final String p1, final REQUEST p2, final Object p3, final b p4);
    
    public final zzr<v88<IMAGE>> c(final te9 te9, final String s, final REQUEST request) {
        return (zzr<v88<IMAGE>>)new ub(this, te9, s, request, this.c, tb.b.F0);
    }
    
    public abstract sb d();
    
    public final zzr<v88<IMAGE>> e(final te9 te9, final String s) {
        final zzr<v88<IMAGE>> g = this.g;
        if (g != null) {
            return g;
        }
        q1b c = null;
        final REQUEST d = this.d;
        if (d != null) {
            c = (q1b)this.c(te9, s, d);
        }
        else {
            final REQUEST[] e = this.e;
            if (e != null) {
                final boolean f = this.f;
                final ArrayList list = new ArrayList<zzr<v88<Object>>>(e.length * 2);
                int i;
                final int n = i = 0;
                if (f) {
                    int n2 = 0;
                    while (true) {
                        i = n;
                        if (n2 >= e.length) {
                            break;
                        }
                        list.add(new ub(this, te9, s, e[n2], this.c, tb.b.G0));
                        ++n2;
                    }
                }
                while (i < e.length) {
                    list.add((zzr<v88<Object>>)this.c(te9, s, e[i]));
                    ++i;
                }
                c = new q1b<IMAGE>(list);
            }
        }
        Object o;
        if ((o = c) == null) {
            o = new z88();
        }
        return (zzr<v88<IMAGE>>)o;
    }
    
    public enum b
    {
        F0, 
        G0;
        
        public static final b[] H0;
    }
}
