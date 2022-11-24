import android.view.View;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import java.util.Objects;
import androidx.compose.ui.platform.AndroidComposeView;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfm implements mrj
{
    public static final b Companion;
    public static final hub<fv8, Matrix, vzv> R0;
    public final AndroidComposeView F0;
    public stb<? super ah3, vzv> G0;
    public ptb<vzv> H0;
    public boolean I0;
    public final fqj J0;
    public boolean K0;
    public boolean L0;
    public b50 M0;
    public final uve<fv8> N0;
    public final dh3 O0;
    public long P0;
    public final fv8 Q0;
    
    static {
        Companion = new b();
        zfm.R0 = zfm$a.F0;
    }
    
    public zfm(final AndroidComposeView f0, final stb<? super ah3, vzv> g0, final ptb<vzv> h0) {
        e0e.f((Object)f0, "ownerView");
        e0e.f((Object)g0, "drawBlock");
        e0e.f((Object)h0, "invalidateParentLayer");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.J0 = new fqj(f0.getDensity());
        this.N0 = (uve<fv8>)new uve((hub)zfm.R0);
        this.O0 = new dh3(0);
        Objects.requireNonNull(ozt.Companion);
        this.P0 = ozt.b;
        Object q0;
        if (Build$VERSION.SDK_INT >= 29) {
            q0 = new xfm(f0);
        }
        else {
            q0 = new wfm(f0);
        }
        ((fv8)q0).H();
        this.Q0 = (fv8)q0;
    }
    
    @Override
    public final void a(final avh avh, final boolean b) {
        if (b) {
            final float[] a = this.N0.a((Object)this.Q0);
            if (a == null) {
                avh.a = 0.0f;
                avh.b = 0.0f;
                avh.c = 0.0f;
                avh.d = 0.0f;
            }
            else {
                rog.c(a, avh);
            }
        }
        else {
            rog.c(this.N0.b((Object)this.Q0), avh);
        }
    }
    
    @Override
    public final void b(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final long p17, final asp asp, final boolean b, final long n11, final long n12, final cwe cwe, final rp8 rp8) {
        e0e.f((Object)asp, "shape");
        e0e.f((Object)cwe, "layoutDirection");
        e0e.f((Object)rp8, "density");
        this.P0 = p17;
        final boolean l = this.Q0.L();
        final boolean b2 = false;
        final boolean b3 = l && !(this.J0.i ^ true);
        this.Q0.l(n);
        this.Q0.t(n2);
        this.Q0.b(n3);
        this.Q0.y(n4);
        this.Q0.h(n5);
        this.Q0.E(n6);
        this.Q0.S(yru.I(n11));
        this.Q0.V(yru.I(n12));
        this.Q0.s(n9);
        this.Q0.o(n7);
        this.Q0.p(n8);
        this.Q0.n(n10);
        this.Q0.P(ozt.b(p17) * this.Q0.getWidth());
        this.Q0.Q(ozt.c(p17) * this.Q0.getHeight());
        this.Q0.U(b && asp != x6m.a);
        this.Q0.B(b && asp == x6m.a);
        this.Q0.r();
        final boolean d = this.J0.d(asp, this.Q0.a(), this.Q0.L(), this.Q0.W(), cwe, rp8);
        this.Q0.R(this.J0.b());
        int n13 = b2 ? 1 : 0;
        if (this.Q0.L()) {
            n13 = (b2 ? 1 : 0);
            if (!(this.J0.i ^ true)) {
                n13 = 1;
            }
        }
        if ((b3 ? 1 : 0) == n13 && (n13 == 0 || !d)) {
            if (Build$VERSION.SDK_INT >= 26) {
                tux.a.a(this.F0);
            }
            else {
                ((View)this.F0).invalidate();
            }
        }
        else {
            this.invalidate();
        }
        if (!this.L0 && this.Q0.W() > 0.0f) {
            final ptb<vzv> h0 = this.H0;
            if (h0 != null) {
                h0.invoke();
            }
        }
        this.N0.c();
    }
    
    @Override
    public final long c(long n, final boolean b) {
        if (b) {
            final float[] a = this.N0.a((Object)this.Q0);
            if (a != null) {
                n = rog.b(a, n);
            }
            else {
                Objects.requireNonNull(kgj.Companion);
                n = kgj.c;
            }
        }
        else {
            n = rog.b(this.N0.b((Object)this.Q0), n);
        }
        return n;
    }
    
    @Override
    public final void d(long g) {
        final int n = (int)(g >> 32);
        final int b = nud.b(g);
        final fv8 q0 = this.Q0;
        final float b2 = ozt.b(this.P0);
        final float n2 = (float)n;
        q0.P(b2 * n2);
        final fv8 q2 = this.Q0;
        final float c = ozt.c(this.P0);
        final float n3 = (float)b;
        q2.Q(c * n3);
        final fv8 q3 = this.Q0;
        if (q3.C(q3.A(), this.Q0.J(), this.Q0.A() + n, this.Q0.J() + b)) {
            final fqj j0 = this.J0;
            g = jty.g(n2, n3);
            if (!aeq.a(j0.d, g)) {
                j0.d = g;
                j0.h = true;
            }
            this.Q0.R(this.J0.b());
            this.invalidate();
            this.N0.c();
        }
    }
    
    @Override
    public final void destroy() {
        if (this.Q0.G()) {
            this.Q0.D();
        }
        this.G0 = null;
        this.H0 = null;
        this.K0 = true;
        this.j(false);
        final AndroidComposeView f0 = this.F0;
        f0.a1 = true;
        f0.O((mrj)this);
    }
    
    @Override
    public final void e(final stb<? super ah3, vzv> g0, final ptb<vzv> h0) {
        e0e.f((Object)g0, "drawBlock");
        e0e.f((Object)h0, "invalidateParentLayer");
        this.j(false);
        this.K0 = false;
        this.L0 = false;
        Objects.requireNonNull(ozt.Companion);
        this.P0 = ozt.b;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final boolean f(final long n) {
        final float d = kgj.d(n);
        final float e = kgj.e(n);
        final boolean i = this.Q0.I();
        boolean b = true;
        if (i) {
            if (0.0f > d || d >= this.Q0.getWidth() || 0.0f > e || e >= this.Q0.getHeight()) {
                b = false;
            }
            return b;
        }
        return !this.Q0.L() || this.J0.c(n);
    }
    
    @Override
    public final void g(final ah3 ah3) {
        e0e.f((Object)ah3, "canvas");
        final Canvas a = f20.a;
        final Canvas a2 = ((e20)ah3).a;
        final boolean hardwareAccelerated = a2.isHardwareAccelerated();
        boolean l0 = false;
        if (hardwareAccelerated) {
            this.i();
            if (this.Q0.W() > 0.0f) {
                l0 = true;
            }
            this.L0 = l0;
            if (l0) {
                ah3.j();
            }
            this.Q0.z(a2);
            if (this.L0) {
                ah3.q();
            }
        }
        else {
            final float n = (float)this.Q0.A();
            final float n2 = (float)this.Q0.J();
            final float n3 = (float)this.Q0.T();
            final float n4 = (float)this.Q0.O();
            if (this.Q0.a() < 1.0f) {
                b50 m0;
                if ((m0 = this.M0) == null) {
                    m0 = new b50();
                    this.M0 = m0;
                }
                m0.b(this.Q0.a());
                a2.saveLayer(n, n2, n3, n4, m0.a);
            }
            else {
                ah3.p();
            }
            ah3.b(n, n2);
            ah3.r(this.N0.b((Object)this.Q0));
            if (this.Q0.L() || this.Q0.I()) {
                this.J0.a(ah3);
            }
            final stb<? super ah3, vzv> g0 = this.G0;
            if (g0 != null) {
                g0.invoke((Object)ah3);
            }
            ah3.c();
            this.j(false);
        }
    }
    
    @Override
    public final void h(final long n) {
        final int a = this.Q0.A();
        final int j = this.Q0.J();
        final hud$a companion = hud.Companion;
        final int n2 = (int)(n >> 32);
        final int c = hud.c(n);
        if (a != n2 || j != c) {
            this.Q0.N(n2 - a);
            this.Q0.F(c - j);
            if (Build$VERSION.SDK_INT >= 26) {
                tux.a.a(this.F0);
            }
            else {
                ((View)this.F0).invalidate();
            }
            this.N0.c();
        }
    }
    
    @Override
    public final void i() {
        if (this.I0 || !this.Q0.G()) {
            this.j(false);
            c0k g = null;
            Label_0064: {
                if (this.Q0.L()) {
                    final fqj j0 = this.J0;
                    if (!(j0.i ^ true)) {
                        j0.e();
                        g = j0.g;
                        break Label_0064;
                    }
                }
                g = null;
            }
            final stb<? super ah3, vzv> g2 = this.G0;
            if (g2 != null) {
                this.Q0.K(this.O0, g, (stb)g2);
            }
        }
    }
    
    @Override
    public final void invalidate() {
        if (!this.I0 && !this.K0) {
            ((View)this.F0).invalidate();
            this.j(true);
        }
    }
    
    public final void j(final boolean i0) {
        if (i0 != this.I0) {
            this.I0 = i0;
            this.F0.L((mrj)this, i0);
        }
    }
    
    public static final class b
    {
    }
}
