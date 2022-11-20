import android.graphics.Typeface;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rk0 implements Runnable
{
    public final TextView D0;
    public final Typeface E0;
    public final int F0;
    
    public rk0(final TextView d0, final Typeface e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        this.D0.setTypeface(this.E0, this.F0);
    }
}
