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

public final class ee9 extends wvj implements ddm
{
    public final Drawable K0;
    public final wwj L0;
    public final wwj M0;
    public final h5s N0;
    
    public ee9(final Drawable k0) {
        this.K0 = k0;
        this.L0 = (wwj)zzz.W((Object)0);
        this.M0 = (wwj)zzz.W((Object)new aeq(fe9.a(k0)));
        this.N0 = (h5s)jty.N((ptb)new ptb<de9>(this) {
            public final ee9 F0;
            
            public final Object invoke() {
                return new de9(this.F0);
            }
        });
        if (k0.getIntrinsicWidth() >= 0 && k0.getIntrinsicHeight() >= 0) {
            k0.setBounds(0, 0, k0.getIntrinsicWidth(), k0.getIntrinsicHeight());
        }
    }
    
    public final void a() {
        this.K0.setCallback((Drawable$Callback)this.N0.getValue());
        this.K0.setVisible(true, true);
        final Drawable k0 = this.K0;
        if (k0 instanceof Animatable) {
            ((Animatable)k0).start();
        }
    }
    
    public final boolean b(final float n) {
        this.K0.setAlpha(jb2.F(jb2.B0(n * 255), 0, 255));
        return true;
    }
    
    public final void c() {
        this.d();
    }
    
    public final void d() {
        final Drawable k0 = this.K0;
        if (k0 instanceof Animatable) {
            ((Animatable)k0).stop();
        }
        this.K0.setVisible(false, false);
        this.K0.setCallback((Drawable$Callback)null);
    }
    
    public final boolean e(final vr4 vr4) {
        final Drawable k0 = this.K0;
        ColorFilter a;
        if (vr4 != null) {
            a = vr4.a;
        }
        else {
            a = null;
        }
        k0.setColorFilter(a);
        return true;
    }
    
    public final boolean f(final cwe cwe) {
        e0e.f((Object)cwe, "layoutDirection");
        final int sdk_INT = Build$VERSION.SDK_INT;
        int layoutDirection = 0;
        if (sdk_INT >= 23) {
            final Drawable k0 = this.K0;
            final int ordinal = ((Enum)cwe).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutDirection = 1;
            }
            return k0.setLayoutDirection(layoutDirection);
        }
        return false;
    }
    
    public final long h() {
        return ((cjq<aeq>)this.M0).getValue().a;
    }
    
    public final void j(final wd9 wd9) {
        e0e.f((Object)wd9, "<this>");
        final ah3 b = wd9.u0().b();
        ((cjq<Number>)this.L0).getValue().intValue();
        this.K0.setBounds(0, 0, jb2.B0(aeq.d(wd9.c())), jb2.B0(aeq.b(wd9.c())));
        try {
            b.p();
            final Drawable k0 = this.K0;
            final Canvas a = f20.a;
            k0.draw(((e20)b).a);
        }
        finally {
            b.c();
        }
    }
}
