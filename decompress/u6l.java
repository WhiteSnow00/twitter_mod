import android.widget.CompoundButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u6l extends pue implements ptb<Integer>
{
    public final q6l F0;
    
    public u6l(final q6l f0) {
        this.F0 = f0;
        super(0);
    }
    
    public final Object invoke() {
        int n;
        if (((CompoundButton)this.F0.R0).isChecked()) {
            n = 2131952395;
        }
        else {
            n = 2131952396;
        }
        return n;
    }
}
