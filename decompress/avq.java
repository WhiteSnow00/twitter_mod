import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avq extends pue implements stb<ivq, vzv>
{
    public final suq F0;
    
    public avq(final suq f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ivq ivq = (ivq)o;
        e0e.f((Object)ivq, "$this$distinct");
        ((TextView)this.F0.L0).setText((CharSequence)ivq.a);
        return vzv.a;
    }
}
