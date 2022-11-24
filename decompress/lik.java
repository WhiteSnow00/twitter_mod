import android.widget.Magnifier$Builder;
import android.widget.Magnifier;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lik implements jik
{
    public static final lik a;
    
    static {
        a = new lik();
    }
    
    @Override
    public final iik a(final bgg bgg, final View view, final rp8 rp8, final float initialZoom) {
        e0e.f((Object)bgg, "style");
        e0e.f((Object)view, "view");
        e0e.f((Object)rp8, "density");
        Objects.requireNonNull(bgg.Companion);
        a a;
        if (e0e.a((Object)bgg, (Object)bgg.h)) {
            a = new a(new Magnifier(view));
        }
        else {
            final long c0 = rp8.C0(bgg.b);
            final float t0 = rp8.t0(bgg.c);
            final float t2 = rp8.t0(bgg.d);
            final Magnifier$Builder magnifier$Builder = new Magnifier$Builder(view);
            Objects.requireNonNull(aeq.Companion);
            if (c0 != aeq.c) {
                magnifier$Builder.setSize(jb2.B0(aeq.d(c0)), jb2.B0(aeq.b(c0)));
            }
            if (!Float.isNaN(t0)) {
                magnifier$Builder.setCornerRadius(t0);
            }
            if (!Float.isNaN(t2)) {
                magnifier$Builder.setElevation(t2);
            }
            if (!Float.isNaN(initialZoom)) {
                magnifier$Builder.setInitialZoom(initialZoom);
            }
            magnifier$Builder.setClippingEnabled(bgg.e);
            final Magnifier build = magnifier$Builder.build();
            e0e.e((Object)build, "Builder(view).run {\n    \u2026    build()\n            }");
            a = new a(build);
        }
        return (iik)a;
    }
    
    @Override
    public final boolean b() {
        return true;
    }
    
    public static final class a extends kik.a
    {
        public a(final Magnifier magnifier) {
            super(magnifier);
        }
        
        @Override
        public final void b(final long n, final long n2, final float zoom) {
            if (!Float.isNaN(zoom)) {
                super.a.setZoom(zoom);
            }
            if (kqe.Z(n2)) {
                super.a.show(kgj.d(n), kgj.e(n), kgj.d(n2), kgj.e(n2));
            }
            else {
                super.a.show(kgj.d(n), kgj.e(n));
            }
        }
    }
}
