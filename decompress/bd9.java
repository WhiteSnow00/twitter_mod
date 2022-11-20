import android.graphics.Canvas;
import kotlin.NoWhenBranchMatchedException;
import android.os.Build$VERSION;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bd9 extends hvj implements rcm
{
    public final Drawable I0;
    public final hwj J0;
    public final hwj K0;
    public final n4s L0;
    
    public bd9(final Drawable i0) {
        this.I0 = i0;
        this.J0 = (hwj)blz.Q(0);
        this.K0 = (hwj)blz.Q(new ddq(cd9.a(i0)));
        this.L0 = (n4s)pps.n((nsb)new bd9$a(this));
        if (i0.getIntrinsicWidth() >= 0 && i0.getIntrinsicHeight() >= 0) {
            i0.setBounds(0, 0, i0.getIntrinsicWidth(), i0.getIntrinsicHeight());
        }
    }
    
    public final void a() {
        this.I0.setCallback((Drawable$Callback)this.L0.getValue());
        this.I0.setVisible(true, true);
        final Drawable i0 = this.I0;
        if (i0 instanceof Animatable) {
            ((Animatable)i0).start();
        }
    }
    
    public final boolean b(final float n) {
        this.I0.setAlpha(rrz.p(zyz.n(n * 255), 0, 255));
        return true;
    }
    
    public final void c() {
        this.d();
    }
    
    public final void d() {
        final Drawable i0 = this.I0;
        if (i0 instanceof Animatable) {
            ((Animatable)i0).stop();
        }
        this.I0.setVisible(false, false);
        this.I0.setCallback((Drawable$Callback)null);
    }
    
    public final boolean e(final qq4 qq4) {
        final Drawable i0 = this.I0;
        ColorFilter a;
        if (qq4 != null) {
            a = qq4.a;
        }
        else {
            a = null;
        }
        i0.setColorFilter(a);
        return true;
    }
    
    public final boolean f(final fve fve) {
        czd.f((Object)fve, "layoutDirection");
        final int sdk_INT = Build$VERSION.SDK_INT;
        int layoutDirection = 0;
        if (sdk_INT >= 23) {
            final Drawable i0 = this.I0;
            final int ordinal = ((Enum)fve).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutDirection = 1;
            }
            return i0.setLayoutDirection(layoutDirection);
        }
        return false;
    }
    
    public final long h() {
        return ((ddq)this.K0.getValue()).a;
    }
    
    public final void j(final tc9 tc9) {
        czd.f((Object)tc9, "<this>");
        final ag3 b = tc9.u0().b();
        ((Number)this.J0.getValue()).intValue();
        this.I0.setBounds(0, 0, zyz.n(ddq.d(tc9.c())), zyz.n(ddq.b(tc9.c())));
        try {
            b.p();
            final Drawable i0 = this.I0;
            final Canvas a = f20.a;
            i0.draw(((e20)b).a);
        }
        finally {
            b.c();
        }
    }
}
