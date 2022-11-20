import android.view.View;
import com.twitter.app.common.inject.view.ViewObjectGraph;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.net.Uri;
import com.twitter.ui.navigation.drawer.implementation.di.NavigationDrawerViewObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vrf implements oj
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    
    public vrf(final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void run() {
        switch (this.D0) {
            default: {
                final amr amr = (amr)this.E0;
                final w19 w19 = (w19)this.F0;
                czd.f((Object)amr, "$this_completeWhen");
                czd.f((Object)w19, "$disposable");
                ((ccj)amr).onComplete();
                w19.a();
                return;
            }
            case 6: {
                final mai mai = (mai)this.E0;
                final qsb qsb = (qsb)this.F0;
                final int y1 = mai.Y1;
                czd.f((Object)mai, "this$0");
                czd.f((Object)qsb, "$onDrawerInstantiated");
                final ViewObjectGraph n = ((x9)((umd)mai).b1()).n();
                czd.e((Object)n, "getViewObjectGraph<Navig\u2026nDrawerViewObjectGraph>()");
                qsb.invoke((Object)((NavigationDrawerViewObjectGraph)n).D0());
                return;
            }
            case 5: {
                final a9p$f a9p$f = (a9p$f)this.E0;
                final nm6 nm6 = (nm6)this.F0;
                Object g2 = ((ok1)a9p$f.E0.l1).G2();
                ((lzr)g2).G0();
                try {
                    final int u = ((lzr)g2).U("search_queries", "type=? OR type=? OR type=?", (Object[])new String[] { String.valueOf(0), String.valueOf(2), String.valueOf(12) });
                    ((lzr)g2).z();
                    ((lzr)g2).A();
                    if (u > 0 && nm6 != null) {
                        nm6.a(new Uri[] { gap$a.a });
                    }
                    g2 = new af4(a9p$f.E0.J0);
                    ((u0p)g2).T = vba.g("search", "search", "search_box", "recent", "clear").toString();
                    final int a = c5j.a;
                    cbw.b((elm)g2);
                    nm6.b();
                    a9p$f.E0.m();
                }
                finally {
                    ((lzr)g2).A();
                }
            }
            case 4: {
                ((NavigationHandler)this.E0).d((pqd)this.F0, (String)null);
                return;
            }
            case 3: {
                final xvj xvj = (xvj)this.E0;
                final Map.Entry entry = (Map.Entry)this.F0;
                czd.f((Object)xvj, "this$0");
                czd.f((Object)entry, "$dnsRecord");
                final Object key = entry.getKey();
                czd.e(key, "dnsRecord.key");
                final String s = (String)key;
                final Object value = entry.getValue();
                czd.e(value, "dnsRecord.value");
                ((d49)xvj).b(s, (List<? extends InetAddress>)value, (qsb<? super String, fzv>)new wvj(xvj));
                final Object key2 = entry.getKey();
                czd.e(key2, "dnsRecord.key");
                ((w39)xvj).e.remove((Object)key2);
                return;
            }
            case 2: {
                final t19 t19 = (t19)this.E0;
                final bmj bmj = (bmj)this.F0;
                czd.f((Object)bmj, "this$0");
                t19.dispose();
                bmj.c().onComplete();
                return;
            }
            case 1: {
                final i52 i52 = (i52)this.E0;
                final mws mws = (mws)this.F0;
                czd.f((Object)i52, "this$0");
                czd.f((Object)mws, "$timelineIdentifier");
                i52.h.n(mws);
                return;
            }
            case 0: {
                final wrf wrf = (wrf)this.E0;
                final xrf xrf = (xrf)this.F0;
                Objects.requireNonNull(wrf.e);
                xrf.E0.setOverlayDrawable((Drawable)null);
                xrf.l0();
                ((View)xrf.K0).setOnClickListener((View$OnClickListener)null);
                ((View)xrf.K0).setTag(2131428123, (Object)null);
            }
        }
    }
}
