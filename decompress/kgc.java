import android.os.Looper;
import com.twitter.database.schema.GlobalSchema;
import com.twitter.android.liveevent.landing.toolbar.a;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import java.util.List;
import android.net.Uri;
import android.app.Activity;
import java.io.Closeable;
import java.util.Objects;
import tv.periscope.android.view.WaitingTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgc implements sj
{
    public final int F0;
    public final Object G0;
    
    public kgc(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void run() {
        switch (this.F0) {
            default: {
                final mgu mgu = (mgu)this.G0;
                e0e.f((Object)mgu, "this$0");
                mgu.J0.dispose();
                return;
            }
            case 25: {
                final blj blj = (blj)this.G0;
                e0e.f((Object)blj, "this$0");
                blj.d.dispose();
                return;
            }
            case 24: {
                ((WaitingTextView)this.G0).K0 = false;
                return;
            }
            case 23: {
                final xun xun = (xun)this.G0;
                final ape[] y0 = xun.Y0;
                xun.h();
                return;
            }
            case 22: {
                final njt njt = (njt)this.G0;
                e0e.f((Object)njt, "$tooltip");
                njt.Z1(true);
                return;
            }
            case 21: {
                final gko gko = (gko)this.G0;
                final gko$a companion = gko.Companion;
                e0e.f((Object)gko, "this$0");
                gko.I0 = null;
                gko.L0 = null;
                gko.K0 = null;
                gko.J0 = null;
                gko.M0.e();
                return;
            }
            case 20: {
                final ve6 ve6 = (ve6)this.G0;
                Objects.requireNonNull(ve6);
                j2e.a((Closeable)ve6);
                return;
            }
            case 19: {
                final xck xck = (xck)this.G0;
                Objects.requireNonNull(xck);
                j2e.a((Closeable)xck);
                return;
            }
            case 18: {
                final z5c z5c = (z5c)this.G0;
                e0e.f((Object)z5c, "this$0");
                z5c.e.dispose();
                return;
            }
            case 17: {
                final hi6 hi6 = (hi6)this.G0;
                e0e.f((Object)hi6, "this$0");
                if ((hi6.d.isEmpty() ^ true) && hi6.c.h()) {
                    final zb7 c = hi6.c;
                    final String e = hi6.e;
                    if (c.f()) {
                        final gc7 d = c.d(e, (yp2)null, (Activity)null);
                        if (d != null) {
                            c.L0.d(d, Uri.parse(e), (List)null);
                        }
                    }
                }
                return;
            }
            case 16: {
                e0e.f((Object)this.G0, "this$0");
                return;
            }
            case 15: {
                final dxg dxg = (dxg)this.G0;
                final Looper n = dxg.n;
                dxg.a();
                return;
            }
            case 14: {
                final VideoContainerHost videoContainerHost = (VideoContainerHost)this.G0;
                e0e.f((Object)videoContainerHost, "$host");
                videoContainerHost.getAutoPlayableItem().a1();
                return;
            }
            case 13: {
                final jsb jsb = (jsb)this.G0;
                e0e.f((Object)jsb, "this$0");
                jsb.a(true);
                return;
            }
            case 12: {
                final icd icd = (icd)this.G0;
                e0e.f((Object)icd, "$viewDelegate");
                ((rfs)icd).G0.setExpandCollapseClickListener((wha)null);
                return;
            }
            case 11: {
                final sqj sqj = (sqj)this.G0;
                e0e.f((Object)sqj, "this$0");
                sqj.d.dispose();
                return;
            }
            case 10: {
                final oad oad = (oad)this.G0;
                e0e.f((Object)oad, "this$0");
                final q4 g0 = oad.G0;
                if (g0 != null) {
                    final by0 e2 = g0.e;
                    if (e2 != null) {
                        e2.W((d2)oad.a());
                    }
                }
                ((tlp)oad.I0.getValue()).dispose();
                return;
            }
            case 9: {
                final j3l j3l = (j3l)this.G0;
                e0e.f((Object)j3l, "this$0");
                j3l.k.dispose();
                return;
            }
            case 8: {
                final vc3 vc3 = (vc3)this.G0;
                vc3.l1.onNext((Object)kni.a);
                vc3.y();
                return;
            }
            case 7: {
                final ms2 ms2 = (ms2)this.G0;
                final ms2$b companion2 = ms2.Companion;
                e0e.f((Object)ms2, "this$0");
                if (ms2.i) {
                    ms2.a.registerReceiver((BroadcastReceiver)new ms2$a(), new IntentFilter(ms2.j));
                }
                return;
            }
            case 6: {
                final qf1 qf1 = (qf1)this.G0;
                synchronized (qf1) {
                    if (!qf1.d(qf1.b.a())) {
                        for (zvj zvj = qf1.b(); zvj != null; zvj = qf1.b()) {
                            final mts e3 = qf1.e;
                            final Object a = ((z2j)zvj).a;
                            vmw.g(a);
                            final int a2 = o5j.a;
                            e3.a((Object)a);
                        }
                        qf1.i = false;
                    }
                }
            }
            case 5: {
                j2e.a((Closeable)((cyh)this.G0).a);
                return;
            }
            case 4: {
                final gwb gwb = (gwb)this.G0;
                e0e.f((Object)gwb, "this$0");
                gwb.s1.c((r69)gwb.L1);
                return;
            }
            case 3: {
                final clg g2 = ((t1t)this.G0).g;
                if (g2 != null) {
                    g2.e();
                }
                return;
            }
            case 2: {
                final a a3 = (a)this.G0;
                e0e.f((Object)a3, "this$0");
                a3.e.a();
                a3.c.e();
                return;
            }
            case 1: {
                final qpa$a qpa$a = (qpa$a)this.G0;
                qpa$a.G0.b(wjt.G0, new wtn$b("", 2131958392), qpa$a.I0, (String)null, 2131430230, 0, 0);
                return;
            }
            case 0: {
                final ogc ogc = (ogc)this.G0;
                ((orm)ogc.b1).J0.a();
                final o09 k0 = ((orm)ogc.b1).K0;
                if (k0 != null) {
                    k0.a();
                }
                final hre i0 = ((orm)ogc.b1).I0;
                if (i0 != null) {
                    i0.a();
                }
                qjh.c((oxo)((sp1)ogc.c1).T()).b((Class)ggc$b.class);
                ogc.a1.b().y(iqs.j()).G((rk6)new bes((Object)ogc, 3), (rk6)lvb.e);
            }
        }
    }
}
