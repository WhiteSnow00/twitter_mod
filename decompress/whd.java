import java.util.ArrayList;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import com.twitter.app.dm.DMConversationContentViewProvider;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import com.twitter.media.av.ui.AutoPlayBadgeView$a;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class whd implements rk6
{
    public static final whd G0;
    public static final whd H0;
    public static final whd I0;
    public static final whd J0;
    public static final whd K0;
    public static final whd L0;
    public static final whd M0;
    public static final whd N0;
    public static final whd O0;
    public static final whd P0;
    public static final whd Q0;
    public static final whd R0;
    public static final whd S0;
    public static final whd T0;
    public static final whd U0;
    public final int F0;
    
    static {
        G0 = new whd(0);
        H0 = new whd(1);
        I0 = new whd(2);
        J0 = new whd(3);
        K0 = new whd(4);
        L0 = new whd(5);
        M0 = new whd(6);
        N0 = new whd(7);
        O0 = new whd(8);
        P0 = new whd(9);
        Q0 = new whd(10);
        R0 = new whd(11);
        S0 = new whd(12);
        T0 = new whd(13);
        U0 = new whd(14);
    }
    
    public whd(final int f0) {
        this.F0 = f0;
    }
    
    public final void accept(Object o) {
        switch (this.F0) {
            default: {
                r9a.d((Throwable)o);
                return;
            }
            case 13: {
                ((View)o).setVisibility(8);
                return;
            }
            case 12: {
                r9a.d((Throwable)o);
                return;
            }
            case 11: {
                j0i.a(4, 2, f0i.a(((hhj)o).F0));
                return;
            }
            case 10: {
                final AutoPlayBadgeView$a autoPlayBadgeView$a = (AutoPlayBadgeView$a)o;
                final String w0 = AutoPlayBadgeView.W0;
                autoPlayBadgeView$a.a.setBackground(2131230947);
                return;
            }
            case 9: {
                final Throwable t = (Throwable)o;
                r9a.b();
                r9a.d(t);
                return;
            }
            case 8: {
                r9a.d((Throwable)o);
                return;
            }
            case 7: {
                ((l3a)o).show();
                return;
            }
            case 6: {
                final Throwable t2 = (Throwable)o;
                final sda d3 = DMConversationContentViewProvider.D3;
                final StringBuilder f = ehk.f("Ocr error: ");
                f.append(t2.getMessage());
                nag.k("TextOcrExtractor", f.toString());
                return;
            }
            case 5: {
                final dwg dwg = (dwg)o;
                final int d4 = psl.d2;
                ehk.c().c(2131956813, 1);
                return;
            }
            case 4: {
                final rmv rmv = (rmv)o;
                final qah$b a = qah.a();
                final qah$b c = new qah$b(a.a, rmv.f("perftown_very_low_priority_sampling_rate", a.b), rmv.f("perftown_low_priority_sampling_rate", a.c), rmv.f("perftown_high_priority_sampling_rate", a.d), rmv.f("metrics_periodic_reporting_interval_short", a.e), rmv.f("metrics_periodic_reporting_interval_regular", a.f), rmv.f("metrics_periodic_reporting_interval_long", a.g));
                o = qah.a;
                synchronized (o) {
                    if (qah.c.equals((Object)c)) {
                        monitorexit(o);
                        return;
                    }
                    qah.c = c;
                    afs.a((Class)qah.class);
                    monitorexit(o);
                    o = qah.b;
                    synchronized (o) {
                        final Iterator<Object> iterator = ((ArrayList<Object>)o).iterator();
                        while (iterator.hasNext()) {
                            final qah$a qah$a = iterator.next().get();
                            if (qah$a == null) {
                                iterator.remove();
                            }
                            else {
                                qah$a.a();
                            }
                        }
                    }
                }
            }
            case 3: {
                r9a.d((Throwable)o);
                return;
            }
            case 2: {
                r9a.d((Throwable)o);
                return;
            }
            case 1: {
                gid.a((View)((ayw$a)o).f);
                return;
            }
            case 0: {
                ((xhd$b)o).a.setVisibility(8);
            }
        }
    }
}
