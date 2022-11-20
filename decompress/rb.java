import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.os.Looper;
import java.util.Objects;
import android.net.Uri;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class rb<T, INFO> implements qd9, a
{
    public static final Map<String, Object> s;
    public static final Map<String, Object> t;
    public static final Class<?> u;
    public final rd9 a;
    public final yk8 b;
    public final Executor c;
    public lp6<INFO> d;
    public rlb<INFO> e;
    public qnp f;
    public Drawable g;
    public String h;
    public Object i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public t78<T> o;
    public T p;
    public boolean q;
    public Drawable r;
    
    static {
        s = mdd.of((Object)"component_tag", (Object)"drawee");
        t = mdd.of((Object)"origin", (Object)"memory_bitmap", (Object)"origin_sub", (Object)"shortcut");
        u = rb.class;
    }
    
    public rb(final yk8 b, final Executor c) {
        rd9 b2;
        if (rd9.c) {
            b2 = new rd9();
        }
        else {
            b2 = rd9.b;
        }
        this.a = b2;
        this.e = (rlb<INFO>)new rlb();
        this.q = true;
        this.b = b;
        this.c = c;
        this.o(null, null);
    }
    
    public abstract void A(final T p0);
    
    public final void B(final t78<T> t78, final INFO info) {
        this.d().e(this.h, this.i);
        this.e.d(this.h, this.i, this.s(t78, info, this.n()));
    }
    
    public final void C(final String s, final T t, final t78<T> t2) {
        final INFO m = this.m(t);
        final lp6<INFO> d = this.d();
        final Drawable r = this.r;
        Animatable animatable;
        if (r instanceof Animatable) {
            animatable = (Animatable)r;
        }
        else {
            animatable = null;
        }
        d.d(s, (Object)m, animatable);
        this.e.a(s, (Object)m, this.s(t2, m, null));
    }
    
    public final void D() {
        pqb.b();
        final T c = this.c();
        if (c != null) {
            pqb.b();
            this.o = null;
            this.k = true;
            this.l = false;
            this.a.a(rd9.a.V0);
            this.B(this.o, this.m(c));
            this.w(this.h, c);
            this.x(this.h, this.o, c, 1.0f, true, true, true);
            pqb.b();
            pqb.b();
            return;
        }
        this.a.a(rd9.a.M0);
        this.f.a(0.0f, true);
        this.k = true;
        this.l = false;
        this.B(this.o = this.e(), null);
        if (xli.f0(2)) {
            xli.E0("controller %x %s: submitRequest: dataSource: %x", (Object)System.identityHashCode(this), (Object)this.h, (Object)System.identityHashCode(this.o));
        }
        this.o.c((z78)new rb$a(this, this.h, this.o.a()), this.c);
        pqb.b();
    }
    
    public final void a(final lp6<? super INFO> d) {
        Objects.requireNonNull(d);
        final lp6<INFO> d2 = this.d;
        if (d2 instanceof rb.rb$b) {
            ((slb)d2).g((lp6)d);
            return;
        }
        if (d2 != null) {
            pqb.b();
            final rb.rb$b d3 = new rb.rb$b();
            ((slb)d3).g((lp6)d2);
            ((slb)d3).g((lp6)d);
            pqb.b();
            this.d = (lp6<INFO>)d3;
            return;
        }
        this.d = (lp6<INFO>)d;
    }
    
    public abstract Drawable b(final T p0);
    
    public T c() {
        return null;
    }
    
    public final lp6<INFO> d() {
        Object o;
        if ((o = this.d) == null) {
            o = vj1.a;
        }
        return (lp6<INFO>)o;
    }
    
    public abstract t78<T> e();
    
    public int f(final T t) {
        return System.identityHashCode(t);
    }
    
    @Override
    public final void g() {
        pqb.b();
        if (xli.f0(2)) {
            System.identityHashCode(this);
        }
        this.a.a(rd9.a.K0);
        final int n = 0;
        this.j = false;
        final zk8 zk8 = (zk8)this.b;
        Objects.requireNonNull(zk8);
        Label_0148: {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                this.release();
                break Label_0148;
            }
            synchronized (zk8.b) {
                if (zk8.d.contains(this)) {
                    monitorexit(zk8.b);
                }
                else {
                    zk8.d.add(this);
                    int n2 = n;
                    if (zk8.d.size() == 1) {
                        n2 = 1;
                    }
                    monitorexit(zk8.b);
                    if (n2 != 0) {
                        zk8.c.post((Runnable)zk8.f);
                    }
                }
                pqb.b();
            }
        }
    }
    
    @Override
    public final void h() {
        pqb.b();
        if (xli.f0(2)) {
            final int identityHashCode = System.identityHashCode(this);
            final String h = this.h;
            String s;
            if (this.k) {
                s = "request already submitted";
            }
            else {
                s = "request needs submit";
            }
            xli.E0("controller %x %s: onAttach: %s", (Object)identityHashCode, (Object)h, (Object)s);
        }
        this.a.a(rd9.a.J0);
        Objects.requireNonNull(this.f);
        this.b.a((yk8.a)this);
        this.j = true;
        if (!this.k) {
            this.D();
        }
        pqb.b();
    }
    
    @Override
    public void i(final sd9 sd9) {
        if (xli.f0(2)) {
            xli.E0("controller %x %s: setHierarchy: %s", (Object)System.identityHashCode(this), (Object)this.h, (Object)sd9);
        }
        final rd9 a = this.a;
        rd9.a a2;
        if (sd9 != null) {
            a2 = rd9.a.D0;
        }
        else {
            a2 = rd9.a.E0;
        }
        a.a(a2);
        if (this.k) {
            this.b.a((yk8.a)this);
            this.release();
        }
        final qnp f = this.f;
        if (f != null) {
            f.f((Drawable)null);
            this.f = null;
        }
        if (sd9 != null) {
            fli.m(Boolean.valueOf(sd9 instanceof qnp));
            (this.f = (qnp)sd9).f(this.g);
        }
    }
    
    @Override
    public final sd9 j() {
        return (sd9)this.f;
    }
    
    @Override
    public final boolean k(final MotionEvent motionEvent) {
        if (xli.f0(2)) {
            xli.E0("controller %x %s: onTouchEvent %s", (Object)System.identityHashCode(this), (Object)this.h, (Object)motionEvent);
        }
        return false;
    }
    
    @Override
    public final Animatable l() {
        final Drawable r = this.r;
        Animatable animatable;
        if (r instanceof Animatable) {
            animatable = (Animatable)r;
        }
        else {
            animatable = null;
        }
        return animatable;
    }
    
    public abstract INFO m(final T p0);
    
    public Uri n() {
        return null;
    }
    
    public final void o(final String h, final Object i) {
        synchronized (this) {
            pqb.b();
            this.a.a(rd9.a.I0);
            if (!this.q) {
                final yk8 b = this.b;
                if (b != null) {
                    b.a((yk8.a)this);
                }
            }
            this.j = false;
            this.z();
            this.m = false;
            final lp6<INFO> d = this.d;
            Label_0091: {
                if (d instanceof rb.rb$b) {
                    final rb.rb$b rb$b = (rb.rb$b)d;
                    synchronized (rb$b) {
                        ((slb)rb$b).a.clear();
                        break Label_0091;
                    }
                }
                this.d = null;
            }
            final qnp f = this.f;
            if (f != null) {
                f.c();
                this.f.f((Drawable)null);
                this.f = null;
            }
            this.g = null;
            if (xli.f0(2)) {
                xli.E0("controller %x %s -> %s: initialize", (Object)System.identityHashCode(this), (Object)this.h, (Object)h);
            }
            this.h = h;
            this.i = i;
            pqb.b();
        }
    }
    
    public final boolean p(final String s, final t78<T> t78) {
        boolean b = true;
        if (t78 == null && this.o == null) {
            return true;
        }
        if (!s.equals(this.h) || t78 != this.o || !this.k) {
            b = false;
        }
        return b;
    }
    
    public final void q() {
        if (xli.f0(2)) {
            System.identityHashCode(this);
        }
    }
    
    public final void r(final String p0, final T p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    xli.f0:(I)Z
        //     4: ifeq            18
        //     7: aload_0        
        //     8: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //    11: pop            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokevirtual   rb.f:(Ljava/lang/Object;)I
        //    17: pop            
        //    18: return         
        //    Signature:
        //  (Ljava/lang/String;TT;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final void release() {
        this.a.a(rd9.a.L0);
        final qnp f = this.f;
        if (f != null) {
            f.c();
        }
        this.z();
    }
    
    public final kp6.a s(final t78<T> t78, final INFO info, final Uri uri) {
        Map extras;
        if (t78 == null) {
            extras = null;
        }
        else {
            extras = t78.getExtras();
        }
        return this.t(extras, (Map)this.u(info));
    }
    
    public final kp6.a t(final Map<String, Object> c, final Map<String, Object> d, final Uri uri) {
        final qnp f = this.f;
        final boolean b = f instanceof kzb;
        final Rect rect = null;
        if (b) {
            final kzb kzb = (kzb)f;
            Object h0;
            if (!(kzb.k(2) instanceof ruo)) {
                h0 = null;
            }
            else {
                h0 = kzb.l(2).H0;
            }
            String.valueOf(h0);
            final kzb kzb2 = (kzb)this.f;
            if (kzb2.k(2) instanceof ruo) {
                final PointF j0 = kzb2.l(2).J0;
            }
        }
        final Map<String, Object> s = rb.s;
        final Map<String, Object> t = rb.t;
        final qnp f2 = this.f;
        Rect bounds;
        if (f2 == null) {
            bounds = rect;
        }
        else {
            bounds = ((sd9)f2).getBounds();
        }
        final Object i = this.i;
        final kp6.a a = new kp6.a();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        a.e = i;
        a.c = c;
        a.d = d;
        a.b = t;
        a.a = s;
        return a;
    }
    
    @Override
    public String toString() {
        final e5j$a b = e5j.b((Object)this);
        b.b("isAttached", this.j);
        b.b("isRequestSubmitted", this.k);
        b.b("hasFetchFailed", this.l);
        b.a("fetchedImage", this.f(this.p));
        b.c("events", (Object)this.a.toString());
        return b.toString();
    }
    
    public abstract Map<String, Object> u(final INFO p0);
    
    public final void v(final String s, final t78<T> t78, final Throwable t79, final boolean b) {
        pqb.b();
        if (!this.p(s, t78)) {
            this.q();
            t78.close();
            pqb.b();
            return;
        }
        final rd9 a = this.a;
        rd9.a a2;
        if (b) {
            a2 = rd9.a.P0;
        }
        else {
            a2 = rd9.a.Q0;
        }
        a.a(a2);
        if (b) {
            this.q();
            this.o = null;
            this.l = true;
            Label_0114: {
                if (this.m) {
                    final Drawable r = this.r;
                    if (r != null) {
                        this.f.d(r, 1.0f, true);
                        break Label_0114;
                    }
                }
                this.f.e();
            }
            final kp6.a s2 = this.s(t78, null, null);
            this.d().b(this.h, t79);
            this.e.c(this.h, t79, s2);
        }
        else {
            this.q();
            this.d().f(this.h, t79);
            Objects.requireNonNull(this.e);
        }
        pqb.b();
    }
    
    public void w(final String s, final T t) {
    }
    
    public final void x(final String s, t78<T> m, final T p7, final float n, final boolean b, final boolean b2, final boolean b3) {
        try {
            pqb.b();
            if (!this.p(s, m)) {
                this.r((Object)p7);
                this.A(p7);
                m.close();
                return;
            }
            final rd9 a = this.a;
            rd9.a a2;
            if (b) {
                a2 = rd9.a.N0;
            }
            else {
                a2 = rd9.a.O0;
            }
            a.a(a2);
            try {
                final Drawable b4 = this.b(p7);
                final T p8 = this.p;
                final Drawable r = this.r;
                this.p = p7;
                this.r = b4;
                Label_0137: {
                    if (!b) {
                        break Label_0137;
                    }
                    try {
                        this.r((Object)p7);
                        this.o = null;
                        this.f.d(b4, 1.0f, b2);
                        this.C(s, p7, m);
                    }
                    finally {
                        if (r != null && r != b4) {
                            this.y(r);
                        }
                        if (p8 != null && p8 != p7) {
                            this.r((Object)p8);
                            this.A(p8);
                        }
                        while (true) {
                            this.y(r);
                            Label_0234: {
                                iftrue(Label_0257:)(p8 == null || p8 == p7);
                            }
                            this.r((Object)p8);
                            this.A(p8);
                            return;
                            iftrue(Label_0171:)(!b3);
                            Block_9: {
                                break Block_9;
                                Label_0257:
                                return;
                            }
                            this.r((Object)p7);
                            this.f.d(b4, 1.0f, b2);
                            this.C(s, p7, m);
                            iftrue(Label_0234:)(r == null || r == b4);
                            continue;
                        }
                        Label_0171: {
                            this.r((Object)p7);
                        }
                        this.f.d(b4, n, b2);
                        m = this.m(p7);
                        this.d().a(s, (Object)m);
                        Objects.requireNonNull(this.e);
                    }
                }
            }
            catch (final Exception ex) {
                this.r((Object)p7);
                this.A(p7);
                this.v(s, m, ex, b);
            }
        }
        finally {
            pqb.b();
        }
    }
    
    public abstract void y(final Drawable p0);
    
    public final void z() {
        final boolean k = this.k;
        this.k = false;
        this.l = false;
        final t78<T> o = this.o;
        Map<String, Object> u = null;
        Map extras;
        if (o != null) {
            extras = o.getExtras();
            this.o.close();
            this.o = null;
        }
        else {
            extras = null;
        }
        final Drawable r = this.r;
        if (r != null) {
            this.y(r);
        }
        if (this.n != null) {
            this.n = null;
        }
        this.r = null;
        final T p = this.p;
        if (p != null) {
            u = this.u(this.m(p));
            this.r((Object)this.p);
            this.A(this.p);
            this.p = null;
        }
        if (k) {
            this.d().c(this.h);
            this.e.b(this.h, this.t(extras, (Map)u));
        }
    }
}
