import android.widget.TextView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhn extends pue implements stb<pin, vzv>
{
    public final ehn F0;
    
    public jhn(final ehn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pin pin = (pin)o;
        e0e.f((Object)pin, "$this$distinct");
        final String a = pin.a;
        if (a != null && a.length() != 0) {
            ((TextView)this.F0.T0).setText((CharSequence)pin.a);
        }
        else {
            final yh5 m = pin.m;
            String s = null;
            Label_0124: {
                if (m == null || (s = m.k) == null) {
                    final z21 i = pin.i;
                    if (i != null) {
                        final List a2 = i.a;
                        if (a2 != null) {
                            final y21 y21 = (y21)rr4.E1(a2);
                            if (y21 != null) {
                                s = y21.c();
                                break Label_0124;
                            }
                        }
                    }
                    s = null;
                }
            }
            if (s != null) {
                final ehn f0 = this.F0;
                ((TextView)f0.T0).setText((CharSequence)f0.F0.getContext().getString(2131953882, new Object[] { s }));
            }
        }
        return vzv.a;
    }
}
