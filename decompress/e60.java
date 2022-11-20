import android.view.ViewGroup;
import android.content.Context;
import java.util.ArrayList;
import android.view.View;
import java.util.List;
import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e60 extends xzm implements rcm
{
    public final boolean E0;
    public final float F0;
    public final m8r<nq4> G0;
    public final m8r<pzm> H0;
    public final uzm I0;
    public final hwj J0;
    public final hwj K0;
    public long L0;
    public int M0;
    public final nsb<fzv> N0;
    
    public e60(final boolean e0, final float f0, final m8r g0, final m8r h0, final uzm i0, final rf8 rf8) {
        super(e0, h0);
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (m8r<nq4>)g0;
        this.H0 = (m8r<pzm>)h0;
        this.I0 = i0;
        this.J0 = (hwj)blz.Q(null);
        this.K0 = (hwj)blz.Q(Boolean.TRUE);
        Objects.requireNonNull(ddq.Companion);
        this.L0 = ddq.b;
        this.M0 = -1;
        this.N0 = new d60(this);
    }
    
    public final void a() {
    }
    
    public final void b(final yk6 yk6) {
        czd.f((Object)yk6, "<this>");
        this.L0 = ((tc9)yk6).c();
        int m0;
        if (Float.isNaN(this.F0)) {
            m0 = zyz.n(tzm.a((lo8)yk6, this.E0, ((tc9)yk6).c()));
        }
        else {
            m0 = ((lo8)yk6).S(this.F0);
        }
        this.M0 = m0;
        final long a = ((nq4)this.G0.getValue()).a;
        final float d = ((pzm)this.H0.getValue()).d;
        yk6.E0();
        this.f((tc9)yk6, this.F0, a);
        final ag3 b = ((tc9)yk6).u0().b();
        ((Boolean)this.K0.getValue()).booleanValue();
        final wzm wzm = (wzm)this.J0.getValue();
        if (wzm != null) {
            wzm.e(((tc9)yk6).c(), this.M0, a, d);
            ((View)wzm).draw(f20.a(b));
        }
    }
    
    public final void c() {
        this.h();
    }
    
    public final void d() {
        this.h();
    }
    
    public final void e(final bxk bxk, final cy6 cy6) {
        czd.f((Object)bxk, "interaction");
        czd.f((Object)cy6, "scope");
        final uzm i0 = this.I0;
        Objects.requireNonNull(i0);
        final iz g0 = i0.G0;
        Objects.requireNonNull(g0);
        wzm value = ((Map)g0.D0).get(this);
        if (value == null) {
            final ArrayList f0 = i0.F0;
            czd.f((Object)f0, "<this>");
            Object remove;
            if (f0.isEmpty()) {
                remove = null;
            }
            else {
                remove = f0.remove(0);
            }
            if ((value = (wzm)remove) == null) {
                if (i0.H0 > s9i.o(i0.E0)) {
                    final Context context = ((View)i0).getContext();
                    czd.e((Object)context, "context");
                    value = new wzm(context);
                    ((ViewGroup)i0).addView((View)value);
                    i0.E0.add(value);
                }
                else {
                    final wzm wzm = i0.E0.get(i0.H0);
                    final iz g2 = i0.G0;
                    Objects.requireNonNull(g2);
                    czd.f((Object)wzm, "rippleHostView");
                    final e60 e60 = ((Map)g2.E0).get(wzm);
                    value = wzm;
                    if (e60 != null) {
                        e60.J0.setValue((Object)null);
                        i0.G0.l(e60);
                        wzm.c();
                        value = wzm;
                    }
                }
                final int h0 = i0.H0;
                if (h0 < i0.D0 - 1) {
                    i0.H0 = h0 + 1;
                }
                else {
                    i0.H0 = 0;
                }
            }
            final iz g3 = i0.G0;
            Objects.requireNonNull(g3);
            ((Map)g3.D0).put(this, value);
            ((Map)g3.E0).put(value, this);
        }
        value.b(bxk, this.E0, this.L0, this.M0, ((nq4)this.G0.getValue()).a, ((pzm)this.H0.getValue()).d, (nsb)this.N0);
        this.J0.setValue((Object)value);
    }
    
    public final void g(final bxk bxk) {
        czd.f((Object)bxk, "interaction");
        final wzm wzm = (wzm)this.J0.getValue();
        if (wzm != null) {
            wzm.d();
        }
    }
    
    public final void h() {
        final uzm i0 = this.I0;
        Objects.requireNonNull(i0);
        this.J0.setValue((Object)null);
        final iz g0 = i0.G0;
        Objects.requireNonNull(g0);
        final wzm wzm = ((Map)g0.D0).get(this);
        if (wzm != null) {
            wzm.c();
            i0.G0.l(this);
            i0.F0.add(wzm);
        }
    }
}
