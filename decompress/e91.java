import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e91 extends c1u
{
    public final int o1;
    
    public e91(final int o1) {
        this.o1 = o1;
        if (o1 != 1) {
            this.X();
            return;
        }
        this.X();
    }
    
    public e91(final Context context, final AttributeSet set) {
        this.o1 = 0;
        super(context, set);
        this.X();
    }
    
    public final void X() {
        switch (this.o1) {
            default: {
                this.W(1);
                this.V((TimeInterpolator)new AccelerateDecelerateInterpolator());
                this.U(250L);
                this.S((g0u)new pp3());
                final c1u c1u = new c1u();
                c1u.W(0);
                c1u.S((g0u)new hra(1));
                c1u.S((g0u)new dwl());
                this.S(c1u);
                return;
            }
            case 0: {
                this.W(1);
                this.S((g0u)new hra(2));
                this.S((g0u)new fp3());
                this.S((g0u)new hra(1));
            }
        }
    }
}
