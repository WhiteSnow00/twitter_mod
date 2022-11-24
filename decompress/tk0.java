import android.graphics.Typeface;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tk0 implements Runnable
{
    public final TextView F0;
    public final Typeface G0;
    public final int H0;
    
    public tk0(final TextView f0, final Typeface g0, final int h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        this.F0.setTypeface(this.G0, this.H0);
    }
}
