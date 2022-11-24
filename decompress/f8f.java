import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import android.os.Build$VERSION;
import com.twitter.util.user.UserIdentifier;
import android.view.MenuItem;
import org.webrtc.SurfaceViewRenderer;
import android.graphics.Bitmap;
import java.util.Map;
import com.twitter.notifications.settings.persistence.MissingSettingsDataException;
import java.util.Objects;
import java.util.Set;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.w$c;
import com.twitter.media.av.ui.control.VideoControlView;
import com.google.android.exoplayer2.j;
import tv.periscope.model.b;
import org.webrtc.EglRenderer$FrameListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f8f implements esg$a, l4x$a, ouk, n2$b, m5$a, esk$b, ddq, mf4$b, jil$a, EglRenderer$FrameListener, er9$a, pn0$d, hw1
{
    public final int F0;
    public final Object G0;
    
    public f8f(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public void a() {
        final kr9 kr9 = (kr9)this.G0;
        kr9.b.a();
        kr9.e.a();
        final b a = kr9.d.a();
        if (a != null) {
            final Long o = a.O();
            final Long p = a.P();
            kr9.f.e(shw.J(kr9.a.getResources(), a));
            if (o != null) {
                kr9.f.d((long)o);
            }
            if (p != null) {
                kr9.f.c((long)p);
            }
        }
    }
    
    public Object b(final Object o, final Object o2) {
        switch (this.F0) {
            default: {
                final jma jma = (jma)this.G0;
                final dma c = (dma)o;
                final dma dma = (dma)o2;
                e0e.f((Object)jma, "this$0");
                e0e.f((Object)c, "oldSettings");
                e0e.f((Object)dma, "newSettings");
                if (jma.c == null) {
                    jma.c = c;
                }
                return dma;
            }
            case 4: {
                final hub hub = (hub)this.G0;
                e0e.f((Object)hub, "$tmp0");
                return hub.invoke(o, o2);
            }
            case 3: {
                final hub hub2 = (hub)this.G0;
                e0e.f((Object)hub2, "$tmp0");
                return hub2.invoke(o, o2);
            }
            case 2: {
                final hub hub3 = (hub)this.G0;
                e0e.f((Object)hub3, "$tmp0");
                return hub3.invoke(o, o2);
            }
            case 1: {
                final hub hub4 = (hub)this.G0;
                e0e.f((Object)hub4, "$tmp0");
                return hub4.invoke(o, o2);
            }
            case 0: {
                final hub hub5 = (hub)this.G0;
                e0e.f((Object)hub5, "$tmp0");
                return hub5.invoke(o, o2);
            }
        }
    }
    
    public void d(final j j) {
        final e00 e00 = (e00)this.G0;
        e0e.f((Object)e00, "$listener");
        e0e.f((Object)j, "it");
        j.r0(e00);
    }
    
    public void e(final kgs kgs) {
        final d6w d6w = (d6w)this.G0;
        final sjs sjs = (sjs)kgs;
        e0e.f((Object)d6w, "$uriNavigator");
        e0e.f((Object)sjs, "textEntity");
        final String f0 = sjs.F0;
        e0e.e((Object)f0, "textEntity.linkUrl");
        d6w.c(f0);
    }
    
    public void f(final a3 a3, final beq beq) {
        final u8f u8f = (u8f)this.G0;
        ((View)u8f.K0).requestLayout();
        final VideoControlView g0 = u8f.G0;
        if (g0 != null) {
            ((View)g0).requestLayout();
        }
    }
    
    public void h(final w$c w$c) {
        final PlaybackException ex = (PlaybackException)this.G0;
        e0e.f((Object)ex, "$error");
        e0e.f((Object)w$c, "it");
        w$c.o0(ex);
    }
    
    public void m(final pn0$c pn0$c, final Set set) {
        e0e.f((Object)this.G0, "this$0");
        e0e.f((Object)pn0$c, "selectedAudioDevice");
        Objects.toString(set);
        pn0$c.toString();
    }
    
    public void o(final fcq fcq) {
        switch (this.F0) {
            default: {
                final jvi jvi = (jvi)this.G0;
                Objects.requireNonNull(jvi);
                try {
                    final irp h = jvi.b.h(jvi.a);
                    final Map c = jvi.b.c(jvi.a);
                    final String d = jvi.b.d(jvi.a);
                    jvi.a(true);
                    ((mbq$a)fcq).b((Object)new hrl(h, d, c));
                }
                catch (final MissingSettingsDataException ex) {
                    jvi.a(false);
                    ((mbq$a)fcq).a((Throwable)ex);
                }
                return;
            }
            case 9: {
                ((asl)this.G0).c.a((k1b.a)new bkd((Object)fcq, 2));
            }
        }
    }
    
    public void onFrame(final Bitmap bitmap) {
        final s0d s0d = (s0d)this.G0;
        e0e.f((Object)s0d, "this$0");
        if (s0d.f != bitmap.getWidth() || s0d.g != bitmap.getHeight()) {
            s0d.f = bitmap.getWidth();
            s0d.g = bitmap.getHeight();
            s0d.a();
        }
        final SurfaceViewRenderer c = s0d.c;
        if (c != null) {
            c.addFrameListener((EglRenderer$FrameListener)new f8f(s0d, 14), 1.0f);
        }
    }
    
    public boolean onMenuItemClick(final MenuItem menuItem) {
        final qpg qpg = (qpg)this.G0;
        e0e.f((Object)qpg, "$emitter");
        ((hpg$a)qpg).b((Object)vzv.a);
        return true;
    }
    
    public void r(final b6 g) {
        final ihv ihv = (ihv)this.G0;
        final ihv$a companion = ihv.Companion;
        e0e.f((Object)ihv, "this$0");
        e0e.f((Object)g, "progress");
        final d51 b = ((hhv)ihv).b;
        final d51 g2 = d51.G0;
        if (b == g2) {
            final b6 g3 = ihv.g;
            int n = 0;
            if (g3 != null) {
                n = n;
                if (g3.c == g.c) {
                    n = 1;
                }
            }
            if (n == 0) {
                ihv.b(ihv.g = g);
                return;
            }
        }
        if (b != g2) {
            ihv.b((b6)null);
        }
    }
    
    public void s(final a3 n0) {
        switch (this.F0) {
            default: {
                final s5x s5x = (s5x)this.G0;
                s5x.N0 = n0;
                final zvj o0 = s5x.O0;
                if (o0 != null) {
                    final Object a = ((z2j)o0).a;
                    vmw.g(a);
                    if (n0.equals(a)) {
                        final a3 n2 = s5x.N0;
                        final Object b = ((z2j)s5x.O0).b;
                        vmw.g(b);
                        s5x.e(n2, (int)b);
                        s5x.O0 = null;
                    }
                }
                final dhq f0 = s5x.G0.F0;
                final int d = s5x.K0.d(n0);
                if (((q4x)f0).I0 != d) {
                    ((q4x)f0).I0 = d;
                    ((q4x)f0).a();
                }
                return;
            }
            case 0: {
                final g8f g8f = (g8f)this.G0;
                Objects.requireNonNull(g8f);
                if (!d4j.a0(n0)) {
                    final long s = qds.s(n0);
                    ((View)g8f.S0).setAlpha(0.0f);
                    final aok t0 = g8f.T0;
                    if (!t0.c) {
                        t0.c = true;
                        t0.a();
                    }
                    g8f.I0.w(xof.f(g8f.F0), Long.valueOf(s));
                    g8f.I0.d();
                }
            }
        }
    }
    
    public boolean test(final Object o) {
        final int f0 = this.F0;
        boolean b = false;
        final boolean b2 = false;
        switch (f0) {
            default: {
                final UserIdentifier userIdentifier = (UserIdentifier)this.G0;
                final UserIdentifier userIdentifier2 = (UserIdentifier)o;
                if (!userIdentifier2.isDefined() || userIdentifier2.equals((Object)userIdentifier)) {
                    b = true;
                }
                return b;
            }
            case 8: {
                final bti bti = (bti)this.G0;
                final fgr fgr = (fgr)o;
                boolean b3 = b2;
                if (bti.z != null) {
                    final boolean b4 = Build$VERSION.SDK_INT >= 24;
                    b3 = b2;
                    if (b4) {
                        final List s = bti.s;
                        final Set a = cvh.a(0);
                        final ojf h = ojf.H();
                        for (final pid pid : s) {
                            final String d = pid.d;
                            if (d == null) {
                                h.p((Object)pid);
                            }
                            else {
                                final HashSet set = (HashSet)a;
                                if (set.contains(d)) {
                                    continue;
                                }
                                set.add(pid.d);
                                h.p((Object)pid);
                            }
                        }
                        b3 = b2;
                        if (((List)((z4j)h).e()).size() > 1) {
                            b3 = true;
                        }
                    }
                }
                return b3;
            }
            case 3: {
                final xi1 xi1 = (xi1)this.G0;
                final Long n = (Long)o;
                return xi1.i();
            }
        }
    }
}
