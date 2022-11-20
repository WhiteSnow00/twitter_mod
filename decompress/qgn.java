import android.widget.TextView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgn extends ste implements qsb<whn, fzv>
{
    public final lgn D0;
    
    public qgn(final lgn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final whn whn = (whn)o;
        czd.f((Object)whn, "$this$distinct");
        final String a = whn.a;
        if (a != null && a.length() != 0) {
            ((TextView)this.D0.R0).setText((CharSequence)whn.a);
        }
        else {
            final tg5 m = whn.m;
            String s = null;
            Label_0124: {
                if (m == null || (s = m.k) == null) {
                    final t21 i = whn.i;
                    if (i != null) {
                        final List<s21> a2 = i.a;
                        if (a2 != null) {
                            final s21 s2 = (s21)mq4.i0((List)a2);
                            if (s2 != null) {
                                s = s2.c();
                                break Label_0124;
                            }
                        }
                    }
                    s = null;
                }
            }
            if (s != null) {
                final lgn d0 = this.D0;
                ((TextView)d0.R0).setText((CharSequence)d0.D0.getContext().getString(2131953882, new Object[] { s }));
            }
        }
        return fzv.a;
    }
}
