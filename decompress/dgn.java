import android.widget.TextView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgn extends gue implements rtb<ihn, oyv>
{
    public final /* synthetic */ yfn C0;
    
    public dgn(final yfn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ihn ihn = (ihn)o;
        zzd.f((Object)ihn, "$this$distinct");
        final String a = ihn.a;
        if (a != null && a.length() != 0) {
            ((TextView)this.C0.Q0).setText((CharSequence)ihn.a);
        }
        else {
            final lh5 m = ihn.m;
            String s = null;
            Label_0121: {
                if (m == null || (s = m.k) == null) {
                    final x21 i = ihn.i;
                    if (i != null) {
                        final List a2 = i.a;
                        if (a2 != null) {
                            final w21 w21 = (w21)or4.I1(a2);
                            if (w21 != null) {
                                s = w21.c();
                                break Label_0121;
                            }
                        }
                    }
                    s = null;
                }
            }
            if (s != null) {
                final yfn c0 = this.C0;
                ((TextView)c0.Q0).setText((CharSequence)c0.C0.getContext().getString(2131953882, new Object[] { s }));
            }
        }
        return oyv.a;
    }
}
