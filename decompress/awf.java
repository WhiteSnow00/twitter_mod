import com.twitter.ui.tweet.inlineactions.InlineActionBar$b;
import java.util.EnumMap;
import android.view.View;
import com.twitter.ui.tweet.inlineactions.InlineActionView;
import com.twitter.ui.tweet.inlineactions.d;
import com.twitter.ui.tweet.inlineactions.InlineActionBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awf implements rk6
{
    public static final awf G0;
    public static final awf H0;
    public static final awf I0;
    public static final awf J0;
    public static final awf K0;
    public static final awf L0;
    public final int F0;
    
    static {
        G0 = new awf(0);
        H0 = new awf(1);
        I0 = new awf(2);
        J0 = new awf(3);
        K0 = new awf(4);
        L0 = new awf(5);
    }
    
    public awf(final int f0) {
        this.F0 = f0;
    }
    
    public final void accept(final Object o) {
        switch (this.F0) {
            default: {
                final InlineActionBar inlineActionBar = (InlineActionBar)o;
                final EnumMap l0 = inlineActionBar.L0;
                final ddu g0 = ddu.G0;
                final d d = l0.get(g0);
                final InlineActionView inlineActionView = (InlineActionView)d.e;
                if (((View)inlineActionView).isShown()) {
                    final fod fod = new fod(fod$a.G0, g0, inlineActionBar.P0, (View)inlineActionView, cdu.L0);
                    inlineActionBar.e(d, false, fod, new y06());
                    final InlineActionBar$b y0 = inlineActionBar.Y0;
                    if (y0 != null) {
                        y0.b(fod);
                    }
                }
                return;
            }
            case 4: {
                fc0.c(((n8x)o).getHeldView());
                return;
            }
            case 3: {
                final Throwable t = (Throwable)o;
                return;
            }
            case 2: {
                r9a.d((Throwable)o);
                return;
            }
            case 1: {
                final kni kni = (kni)o;
                final int s2 = hfm.s2;
                ehk.c().c(2131953385, 0);
                return;
            }
            case 0: {
                r9a.d((Throwable)o);
            }
        }
    }
}
