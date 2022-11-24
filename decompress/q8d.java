import com.facebook.common.memory.PooledByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import android.graphics.Bitmap$Config;
import android.app.ActivityManager;
import java.util.Objects;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8d implements r8d
{
    public static q8d.q8d$c x;
    public final zzr<l4h> a;
    public final y02 b;
    public final d83 c;
    public final Context d;
    public final y09 e;
    public final zzr<l4h> f;
    public final mga g;
    public final p6d h;
    public final zzr<Boolean> i;
    public final p09 j;
    public final x4h k;
    public final idi l;
    public final crk m;
    public final faq n;
    public final Set<ypm> o;
    public final Set<xpm> p;
    public final boolean q;
    public final p09 r;
    public final c7d s;
    public final s8d t;
    public final boolean u;
    public final d4j v;
    public final xz6 w;
    
    static {
        q8d.x = new q8d.q8d$c();
    }
    
    public q8d(final q8d.q8d$b q8d$b) {
        rrb.b();
        this.t = new s8d(q8d$b.k);
        Object a;
        if ((a = q8d$b.a) == null) {
            final Object systemService = q8d$b.c.getSystemService("activity");
            Objects.requireNonNull(systemService);
            a = new yf8((ActivityManager)systemService);
        }
        this.a = (zzr<l4h>)a;
        this.b = new y02();
        final Bitmap$Config argb_8888 = Bitmap$Config.ARGB_8888;
        Object c;
        if ((c = q8d$b.b) == null) {
            c = eg8.X();
        }
        this.c = (d83)c;
        final Context c2 = q8d$b.c;
        Objects.requireNonNull(c2);
        this.d = c2;
        this.e = new y09(new tqb());
        zzr d;
        if ((d = q8d$b.d) == null) {
            d = new qh8();
        }
        this.f = d;
        Object h;
        if ((h = q8d$b.f) == null) {
            synchronized (jmi.class) {
                if (jmi.a == null) {
                    h = (jmi.a = new jmi());
                }
                h = jmi.a;
            }
        }
        this.h = (p6d)h;
        this.i = new zzr<Boolean>() {
            @Override
            public final /* bridge */ Object get() {
                return Boolean.TRUE;
            }
        };
        Object g;
        if ((g = q8d$b.g) == null) {
            final Context c3 = q8d$b.c;
            try {
                rrb.b();
                g = new p09$b(c3);
                g = new p09((p09$b)g);
            }
            finally {
                rrb.b();
            }
        }
        this.j = (p09)g;
        Object k;
        if ((k = q8d$b.h) == null) {
            k = lmi.j();
        }
        this.k = (x4h)k;
        rrb.b();
        Object i;
        if ((i = q8d$b.i) == null) {
            i = new ftc();
        }
        this.l = (idi)i;
        rrb.b();
        final crk m = new crk(new brk(new brk$a()));
        this.m = m;
        this.n = new faq();
        this.o = new HashSet();
        this.p = new HashSet();
        this.q = true;
        this.r = (p09)g;
        this.s = q8d$b.j;
        final int b = m.b();
        Object e;
        if ((e = q8d$b.e) == null) {
            e = new uh8(b);
        }
        this.g = (mga)e;
        this.u = q8d$b.l;
        this.v = q8d$b.m;
        this.w = new xz6();
        rrb.b();
    }
    
    @Override
    public final p6d A() {
        return this.h;
    }
    
    @Override
    public final x4h B() {
        return this.k;
    }
    
    @Override
    public final void C() {
    }
    
    @Override
    public final s8d D() {
        return this.t;
    }
    
    @Override
    public final mga E() {
        return this.g;
    }
    
    @Override
    public final Set<xpm> a() {
        return Collections.unmodifiableSet((Set<? extends xpm>)this.p);
    }
    
    @Override
    public final zzr<Boolean> b() {
        return this.i;
    }
    
    @Override
    public final idi c() {
        return this.l;
    }
    
    @Override
    public final k4h<z73, PooledByteBuffer> d() {
    }
    
    @Override
    public final p09 e() {
        return this.j;
    }
    
    @Override
    public final Set<ypm> f() {
        return Collections.unmodifiableSet((Set<? extends ypm>)this.o);
    }
    
    @Override
    public final k4h$a g() {
        return (k4h$a)this.b;
    }
    
    @Override
    public final Context getContext() {
        return this.d;
    }
    
    @Override
    public final xil h() {
        return (xil)this.n;
    }
    
    @Override
    public final p09 i() {
        return this.r;
    }
    
    @Override
    public final zz6.b<z73> j() {
    }
    
    @Override
    public final void k() {
    }
    
    @Override
    public final void l() {
    }
    
    @Override
    public final void m() {
    }
    
    @Override
    public final void n() {
    }
    
    @Override
    public final c7d o() {
        return this.s;
    }
    
    @Override
    public final boolean p() {
        return this.u;
    }
    
    @Override
    public final zzr<l4h> q() {
        return this.a;
    }
    
    @Override
    public final void r() {
    }
    
    @Override
    public final zzr<l4h> s() {
        return this.f;
    }
    
    @Override
    public final crk t() {
        return this.m;
    }
    
    @Override
    public final void u() {
    }
    
    @Override
    public final dya v() {
        return (dya)this.e;
    }
    
    @Override
    public final d4j w() {
        return this.v;
    }
    
    @Override
    public final s02 x() {
        return (s02)this.w;
    }
    
    @Override
    public final d83 y() {
        return this.c;
    }
    
    @Override
    public final boolean z() {
        return this.q;
    }
}
