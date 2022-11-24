import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yng implements ihj
{
    public final int F0;
    public final View G0;
    public final int H0;
    
    public yng(final int f0, final View g0, final int h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final fqx a(View view, final fqx fqx) {
        final int b = fqx.d(7).b;
        if (this.F0 >= 0) {
            this.G0.getLayoutParams().height = this.F0 + b;
            view = this.G0;
            view.setLayoutParams(view.getLayoutParams());
        }
        view = this.G0;
        view.setPadding(view.getPaddingLeft(), this.H0 + b, this.G0.getPaddingRight(), this.G0.getPaddingBottom());
        return fqx;
    }
}
