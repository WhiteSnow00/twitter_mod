import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import android.view.ViewGroup;
import java.util.Collection;
import com.google.android.exoplayer2.ui.SubtitleView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oj4 implements y94
{
    public final eh3 C0;
    public final rd6 D0;
    public final zi8 E0;
    public final SubtitleView F0;
    public u4 G0;
    public Collection<e2> H0;
    public int I0;
    public boolean J0;
    public float K0;
    public rv1<Boolean> L0;
    public int M0;
    public float N0;
    public t71 O0;
    public dj4 P0;
    
    public oj4(final ViewGroup viewGroup, final eh3 eh3) {
        final SubtitleView subtitleView = (SubtitleView)((View)viewGroup).findViewById(2131432627);
        pf8.r(subtitleView);
        this(subtitleView, eh3, 0);
    }
    
    public oj4(final ViewGroup viewGroup, final eh3 eh3, final int n) {
        final SubtitleView subtitleView = (SubtitleView)((View)viewGroup).findViewById(2131432627);
        pf8.r(subtitleView);
        this(subtitleView, eh3, n);
    }
    
    public oj4(final SubtitleView f0, final eh3 c0, final int i0) {
        final zi8 d0 = zi8.D0;
        this.D0 = new rd6();
        this.K0 = 1.0f;
        this.L0 = (rv1<Boolean>)rv1.e((Object)Boolean.FALSE);
        this.P0 = null;
        this.E0 = d0;
        this.C0 = c0;
        this.F0 = f0;
        this.I0 = i0;
        this.O0 = t71.a;
    }
    
    public final b5j<Boolean> a() {
        return (b5j<Boolean>)((b5j)this.L0).hide();
    }
    
    public final void b(final float n) {
        final int i0 = this.I0;
        final int n2 = 1;
        float n4 = 0.0f;
        Label_0163: {
            float n5 = 0.0f;
            Label_0157: {
                if (i0 != 1 && i0 != 2 && i0 != 4 && (i0 != 3 || ((View)this.F0).getResources().getConfiguration().orientation != 2)) {
                    int n3;
                    if (this.I0 == 3 && ((View)this.F0).getResources().getConfiguration().orientation == 1) {
                        n3 = n2;
                    }
                    else {
                        n3 = 0;
                    }
                    if (n3 != 0) {
                        if (n < 1.0f) {
                            n4 = n;
                            break Label_0163;
                        }
                    }
                    else {
                        final int i2 = this.I0;
                        if (i2 == 5) {
                            n5 = 0.1f;
                            break Label_0157;
                        }
                        n4 = n;
                        if (i2 != 8) {
                            break Label_0163;
                        }
                        if (n < 1.0f) {
                            n4 = n;
                            break Label_0163;
                        }
                    }
                    n4 = n - 0.5f;
                    break Label_0163;
                }
                n5 = 0.4f;
            }
            n4 = n + n5;
        }
        this.F0.setFractionalTextSize(n4 * 0.0533f);
    }
    
    public final void c() {
        final float n0 = this.N0;
        if (n0 >= 0.0f) {
            ((View)this.F0).setY(n0);
        }
        if (this.M0 > 0) {
            ((View)this.F0).getLayoutParams().height = this.M0;
            ((View)this.F0).requestLayout();
        }
        final int dimensionPixelSize = ((View)this.F0).getResources().getDimensionPixelSize(2131165467);
        ((View)this.F0).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.b(this.K0);
    }
    
    public final void g(u4 g0) {
        this.G0 = g0;
        final int type = g0.b.b1.getType();
        if (this.I0 == 0) {
            int i0;
            if (z6.h(type)) {
                i0 = 5;
            }
            else {
                i0 = 1;
            }
            this.I0 = i0;
        }
        if (this.P0 == null) {
            final dg8 p = new dg8(new ej4(this.I0, (b5j)this.a(), this.G0, this.C0, this.E0));
            final dj4 p2 = this.P0;
            if (p2 != null) {
                p2.g();
            }
            this.P0 = (dj4)p;
        }
        g0 = this.G0;
        final List w = ijf.w((Object)new xx0(g0, (xx0$a)new lj4(this)), (Object[])new e2[] { (e2)new p87((p87$a)new lo((Object)this, 6)), (e2)new cvh((cvh$a)new fj4((Object)this, 7)), (e2)new vnk((vnk$a)new mj4(this)), (e2)new v9x((v9x$a)new p4w((Object)this, 7)), (e2)new yww((yww$a)new cg8((Object)this, 8)), (e2)new nj4(this) });
        this.H0 = w;
        g0.e.k((Collection)w);
        g0 = this.G0;
        if (g0.a() != null) {
            final String c0 = g0.a().C2().C0;
            final rd6 d0 = this.D0;
            final n9q value = this.O0.a().get((Object)c0);
            final g71 l0 = g71.L0;
            Objects.requireNonNull(value);
            d0.a(((log)new zog((ubq)value, (ptk)l0)).p((fk6)new ij4(this, 1), (fk6)jj4.E0, (rj)jvb.c));
        }
        this.F0.setBottomPaddingFraction(0.7f);
    }
    
    public final void h() {
        this.F0.setCues((List)Collections.emptyList());
        ((View)this.F0).setY(0.0f);
    }
    
    public final void unbind() {
        final u4 g0 = this.G0;
        if (g0 != null) {
            final List h0 = this.H0;
            if (h0 != null) {
                g0.e.Z((Collection)h0);
            }
        }
        this.D0.dispose();
        final dj4 p0 = this.P0;
        if (p0 != null) {
            p0.g();
        }
    }
}
