import android.view.ViewTreeObserver$OnPreDrawListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class emo extends a1c
{
    public boolean t1;
    public final qti u1;
    
    public emo(final ybv ybv, final qti u1, final fxe<e1c> fxe, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final alj alj, final jev jev, final g0t g0t) {
        super(ybv, fxe, aws, qrs, zh7, udf, dsb, rpd, zoi, context, uc, exs, g0t, x3e, pca, adx, alj, jev);
        this.u1 = u1;
    }
    
    @Override
    public final void O0(final i4e<nws> i4e) {
        super.O0(i4e);
        if (!i4e.isEmpty() && !this.t1) {
            this.t1 = true;
            super.X0.H0.m((ViewTreeObserver$OnPreDrawListener)new dmo(this));
        }
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        lcv$b.a = "rux";
        return lcv$b;
    }
}
