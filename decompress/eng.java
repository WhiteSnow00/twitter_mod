import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eng implements ugj
{
    public final int D0;
    public final View E0;
    public final int F0;
    
    public eng(final int d0, final View e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final opx c(View view, final opx opx) {
        final int b = opx.d(7).b;
        if (this.D0 >= 0) {
            this.E0.getLayoutParams().height = this.D0 + b;
            view = this.E0;
            view.setLayoutParams(view.getLayoutParams());
        }
        view = this.E0;
        view.setPadding(view.getPaddingLeft(), this.F0 + b, this.E0.getPaddingRight(), this.E0.getPaddingBottom());
        return opx;
    }
}
