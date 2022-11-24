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

public abstract class sb<T, INFO> implements te9, dm8$a
{
    public static final Map<String, Object> s;
    public static final Map<String, Object> t;
    public static final Class<?> u;
    public final ue9 a;
    public final dm8 b;
    public final Executor c;
    public rq6<INFO> d;
    public smb<INFO> e;
    public nop f;
    public Drawable g;
    public String h;
    public Object i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public v88<T> o;
    public T p;
    public boolean q;
    public Drawable r;
    
    static {
        s = med.of((Object)"component_tag", (Object)"drawee");
        t = med.of((Object)"origin", (Object)"memory_bitmap", (Object)"origin_sub", (Object)"shortcut");
        u = sb.class;
    }
    
    public sb(final dm8 b, final Executor c) {
        ue9 b2;
        if (ue9.c) {
            b2 = new ue9();
        }
        else {
            b2 = ue9.b;
        }
        this.a = b2;
        this.e = (smb<INFO>)new smb();
        this.q = true;
        this.b = b;
        this.c = c;
        this.o(null, null);
    }
    
    public abstract void A(final T p0);
    
    public final void B(final v88<T> v88, final INFO info) {
        this.d().e(this.h, this.i);
        this.e.d(this.h, this.i, this.s(v88, info, this.n()));
    }
    
    public final void C(final String s, final T t, final v88<T> v88) {
        final INFO m = this.m(t);
        final rq6<INFO> d = this.d();
        final Drawable r = this.r;
        Animatable animatable;
        if (r instanceof Animatable) {
            animatable = (Animatable)r;
        }
        else {
            animatable = null;
        }
        d.d(s, (Object)m, animatable);
        this.e.a(s, (Object)m, this.s(v88, m, null));
    }
    
    public final void D() {
        rrb.b();
        final T c = this.c();
        if (c != null) {
            rrb.b();
            this.o = null;
            this.k = true;
            this.l = false;
            this.a.a(ue9$a.X0);
            this.B(this.o, this.m(c));
            this.w(this.h, c);
            this.x(this.h, this.o, c, 1.0f, true, true, true);
            rrb.b();
            rrb.b();
            return;
        }
        this.a.a(ue9$a.O0);
        this.f.a(0.0f, true);
        this.k = true;
        this.l = false;
        this.B(this.o = this.e(), null);
        if (fr0.I(2)) {
            fr0.j0("controller %x %s: submitRequest: dataSource: %x", (Object)System.identityHashCode(this), (Object)this.h, (Object)System.identityHashCode(this.o));
        }
        this.o.c((b98<T>)new ok1<T>(this, this.h, this.o.a()) {
            public final String a;
            public final boolean b;
            public final sb c;
            
            public final void b(final v88<T> v88) {
                final nb nb = (nb)v88;
                final boolean g = nb.g();
                final float b = nb.b();
                final sb c = this.c;
                if (!c.p(this.a, nb)) {
                    c.q();
                    nb.close();
                }
                else if (!g) {
                    c.f.a(b, false);
                }
            }
            
            public final void e(final v88<T> v88) {
                final sb c = this.c;
                final String a = this.a;
                final nb nb = (nb)v88;
                c.v(a, nb, nb.f(), true);
            }
            
            public final void f(final v88<T> v88) {
                final nb nb = (nb)v88;
                final boolean g = nb.g();
                final float b = nb.b();
                final Object d = nb.d();
                if (d != null) {
                    this.c.x(this.a, nb, d, b, g, this.b, false);
                }
                else if (g) {
                    this.c.v(this.a, nb, new NullPointerException(), true);
                }
            }
        }, this.c);
        rrb.b();
    }
    
    public final void a(final rq6<? super INFO> d) {
        Objects.requireNonNull(d);
        final rq6<INFO> d2 = this.d;
        if (d2 instanceof b) {
            ((b)d2).g(d);
            return;
        }
        if (d2 != null) {
            rrb.b();
            final b d3 = new b();
            ((rq6<INFO>)d3).g((rq6<? super INFO>)d2);
            ((rq6<INFO>)d3).g(d);
            rrb.b();
            this.d = (rq6<INFO>)d3;
            return;
        }
        this.d = (rq6<INFO>)d;
    }
    
    public abstract Drawable b(final T p0);
    
    public T c() {
        return null;
    }
    
    public final rq6<INFO> d() {
        Object o;
        if ((o = this.d) == null) {
            o = zj1.a;
        }
        return (rq6<INFO>)o;
    }
    
    public abstract v88<T> e();
    
    public int f(final T t) {
        return System.identityHashCode(t);
    }
    
    @Override
    public final void g() {
        rrb.b();
        if (fr0.I(2)) {
            System.identityHashCode(this);
        }
        this.a.a(ue9$a.M0);
        final int n = 0;
        this.j = false;
        final em8 em8 = (em8)this.b;
        Objects.requireNonNull(em8);
        Label_0148: {
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                this.release();
                break Label_0148;
            }
            synchronized (em8.b) {
                if (em8.d.contains(this)) {
                    monitorexit(em8.b);
                }
                else {
                    em8.d.add((dm8$a)this);
                    int n2 = n;
                    if (em8.d.size() == 1) {
                        n2 = 1;
                    }
                    monitorexit(em8.b);
                    if (n2 != 0) {
                        em8.c.post((Runnable)em8.f);
                    }
                }
                rrb.b();
            }
        }
    }
    
    @Override
    public final void h() {
        rrb.b();
        if (fr0.I(2)) {
            final int identityHashCode = System.identityHashCode(this);
            final String h = this.h;
            String s;
            if (this.k) {
                s = "request already submitted";
            }
            else {
                s = "request needs submit";
            }
            fr0.j0("controller %x %s: onAttach: %s", (Object)identityHashCode, (Object)h, (Object)s);
        }
        this.a.a(ue9$a.L0);
        Objects.requireNonNull(this.f);
        this.b.a((dm8$a)this);
        this.j = true;
        if (!this.k) {
            this.D();
        }
        rrb.b();
    }
    
    @Override
    public void i(final ve9 ve9) {
        if (fr0.I(2)) {
            fr0.j0("controller %x %s: setHierarchy: %s", (Object)System.identityHashCode(this), (Object)this.h, (Object)ve9);
        }
        final ue9 a = this.a;
        ue9$a ue9$a;
        if (ve9 != null) {
            ue9$a = ue9$a.F0;
        }
        else {
            ue9$a = ue9$a.G0;
        }
        a.a(ue9$a);
        if (this.k) {
            this.b.a((dm8$a)this);
            this.release();
        }
        final nop f = this.f;
        if (f != null) {
            f.f(null);
            this.f = null;
        }
        if (ve9 != null) {
            xd.D(ve9 instanceof nop);
            (this.f = (nop)ve9).f(this.g);
        }
    }
    
    @Override
    public final ve9 j() {
        return this.f;
    }
    
    @Override
    public final boolean k(final MotionEvent motionEvent) {
        if (fr0.I(2)) {
            fr0.j0("controller %x %s: onTouchEvent %s", (Object)System.identityHashCode(this), (Object)this.h, (Object)motionEvent);
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
            rrb.b();
            this.a.a(ue9$a.K0);
            if (!this.q) {
                final dm8 b = this.b;
                if (b != null) {
                    b.a((dm8$a)this);
                }
            }
            this.j = false;
            this.z();
            this.m = false;
            final rq6<INFO> d = this.d;
            Label_0091: {
                if (d instanceof b) {
                    final b b2 = (b)d;
                    synchronized (b2) {
                        b2.a.clear();
                        break Label_0091;
                    }
                }
                this.d = null;
            }
            final nop f = this.f;
            if (f != null) {
                f.b();
                this.f.f(null);
                this.f = null;
            }
            this.g = null;
            if (fr0.I(2)) {
                fr0.j0("controller %x %s -> %s: initialize", (Object)System.identityHashCode(this), (Object)this.h, (Object)h);
            }
            this.h = h;
            this.i = i;
            rrb.b();
        }
    }
    
    public final boolean p(final String s, final v88<T> v88) {
        boolean b = true;
        if (v88 == null && this.o == null) {
            return true;
        }
        if (!s.equals(this.h) || v88 != this.o || !this.k) {
            b = false;
        }
        return b;
    }
    
    public final void q() {
        if (fr0.I(2)) {
            System.identityHashCode(this);
        }
    }
    
    public final void r(final String p0, final T p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    fr0.I:(I)Z
        //     4: ifeq            18
        //     7: aload_0        
        //     8: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //    11: pop            
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokevirtual   sb.f:(Ljava/lang/Object;)I
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
    
    public final void release() {
        this.a.a(ue9$a.N0);
        final nop f = this.f;
        if (f != null) {
            f.b();
        }
        this.z();
    }
    
    public final qq6$a s(final v88<T> v88, final INFO info, final Uri uri) {
        Map extras;
        if (v88 == null) {
            extras = null;
        }
        else {
            extras = v88.getExtras();
        }
        return this.t(extras, (Map)this.u(info));
    }
    
    public final qq6$a t(final Map<String, Object> c, final Map<String, Object> d, final Uri uri) {
        final nop f = this.f;
        final boolean b = f instanceof l0c;
        final Rect rect = null;
        if (b) {
            final l0c l0c = (l0c)f;
            Object j0;
            if (!(l0c.k(2) instanceof lvo)) {
                j0 = null;
            }
            else {
                j0 = l0c.l(2).J0;
            }
            String.valueOf(j0);
            final l0c l0c2 = (l0c)this.f;
            if (l0c2.k(2) instanceof lvo) {
                final PointF l0 = l0c2.l(2).L0;
            }
        }
        final Map<String, Object> s = sb.s;
        final Map<String, Object> t = sb.t;
        final nop f2 = this.f;
        Rect bounds;
        if (f2 == null) {
            bounds = rect;
        }
        else {
            bounds = f2.getBounds();
        }
        final Object i = this.i;
        final qq6$a qq6$a = new qq6$a();
        if (bounds != null) {
            bounds.width();
            bounds.height();
        }
        qq6$a.e = i;
        qq6$a.c = c;
        qq6$a.d = d;
        qq6$a.b = t;
        qq6$a.a = s;
        return qq6$a;
    }
    
    @Override
    public String toString() {
        final q5j$a b = q5j.b((Object)this);
        b.b("isAttached", this.j);
        b.b("isRequestSubmitted", this.k);
        b.b("hasFetchFailed", this.l);
        b.a("fetchedImage", this.f(this.p));
        b.c("events", (Object)this.a.toString());
        return b.toString();
    }
    
    public abstract Map<String, Object> u(final INFO p0);
    
    public final void v(final String s, final v88<T> v88, final Throwable t, final boolean b) {
        rrb.b();
        if (!this.p(s, v88)) {
            this.q();
            v88.close();
            rrb.b();
            return;
        }
        final ue9 a = this.a;
        ue9$a ue9$a;
        if (b) {
            ue9$a = ue9$a.R0;
        }
        else {
            ue9$a = ue9$a.S0;
        }
        a.a(ue9$a);
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
            final qq6$a s2 = this.s(v88, null, null);
            this.d().b(this.h, t);
            this.e.c(this.h, t, s2);
        }
        else {
            this.q();
            this.d().f(this.h, t);
            Objects.requireNonNull(this.e);
        }
        rrb.b();
    }
    
    public void w(final String s, final T t) {
    }
    
    public final void x(final String s, v88<T> m, final T p7, final float n, final boolean b, final boolean b2, final boolean b3) {
        try {
            rrb.b();
            if (!this.p(s, m)) {
                this.r((Object)p7);
                this.A(p7);
                m.close();
                return;
            }
            final ue9 a = this.a;
            ue9$a ue9$a;
            if (b) {
                ue9$a = ue9$a.P0;
            }
            else {
                ue9$a = ue9$a.Q0;
            }
            a.a(ue9$a);
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
                        Label_0171: {
                            this.r((Object)p7);
                        }
                        this.f.d(b4, n, b2);
                        m = this.m(p7);
                        this.d().a(s, (Object)m);
                        Objects.requireNonNull(this.e);
                        Label_0234: {
                            while (true) {
                                break Label_0216;
                                iftrue(Label_0171:)(!b3);
                                Block_9: {
                                    break Block_9;
                                    Label_0257:
                                    return;
                                    iftrue(Label_0234:)(r == null || r == b4);
                                    this.y(r);
                                    break Label_0234;
                                }
                                this.r((Object)p7);
                                this.f.d(b4, 1.0f, b2);
                                this.C(s, p7, m);
                                continue;
                            }
                            this.r((Object)p8);
                            this.A(p8);
                            return;
                        }
                        iftrue(Label_0257:)(p8 == null || p8 == p7);
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
            rrb.b();
        }
    }
    
    public abstract void y(final Drawable p0);
    
    public final void z() {
        final boolean k = this.k;
        this.k = false;
        this.l = false;
        final v88<T> o = this.o;
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
            this.e.b(this.h, this.t((Map)extras, (Map)u));
        }
    }
    
    public static final class b<INFO> extends tmb<INFO>
    {
    }
}
