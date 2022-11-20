import android.widget.CompoundButton;
import android.widget.RadioButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c33 extends ste implements qsb<i33, fzv>
{
    public final m23 D0;
    
    public c33(final m23 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final i33 i33 = (i33)o;
        czd.f((Object)i33, "$this$distinct");
        final RadioButton p = this.D0.P0;
        final uj6 f = i33.f;
        final uj6 d0 = uj6.D0;
        final boolean b = false;
        ((CompoundButton)p).setChecked(f == d0);
        ((CompoundButton)this.D0.Q0).setChecked(i33.f == uj6.E0);
        final RadioButton r0 = this.D0.R0;
        boolean checked = b;
        if (i33.f == uj6.F0) {
            checked = true;
        }
        ((CompoundButton)r0).setChecked(checked);
        return fzv.a;
    }
}
