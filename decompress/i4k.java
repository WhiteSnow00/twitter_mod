import android.view.View;
import androidx.recyclerview.widget.RecyclerView$e;
import org.webrtc.MediaStreamTrack;
import tv.periscope.model.chat.Message$a;
import android.opengl.EGLContext;
import org.webrtc.VideoTrack;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.VideoSource;
import android.app.Activity;
import tv.periscope.android.api.GetHeartThemeAssetsResponse;
import tv.periscope.model.chat.c;
import tv.periscope.model.chat.a$a;
import tv.periscope.model.chat.Message;
import java.util.ArrayList;
import java.util.HashMap;
import com.twitter.app.dynamicdelivery.manager.DynamicDeliveryInstallManager;
import tv.periscope.android.graphics.a;
import tv.periscope.android.hydra.exceptions.HydraException;
import org.webrtc.EglBase$Context;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i4k implements lj6
{
    public final int D0;
    public final u4k E0;
    
    public i4k(final u4k e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void accept(final Object o) {
        final int d0 = this.D0;
        final int n = 2;
        switch (d0) {
            default: {
                final u4k e0 = this.E0;
                final gmx$a gmx$a = (gmx$a)o;
                Objects.requireNonNull(e0);
                if (gmx$a instanceof gmx$a$a) {
                    final z4k z4k = new z4k(e0, (oj)new hin((Object)e0, 4));
                    Object o2;
                    if (e0.j2) {
                        o2 = sy5.u(1L, TimeUnit.SECONDS).n(h60.b());
                    }
                    else {
                        o2 = cz5.D0;
                    }
                    final wc6 r1 = e0.r1;
                    ((sy5)o2).b((nz5)z4k);
                    r1.a((t19)z4k);
                    e0.I2 = null;
                    e0.t1.a();
                    final to2 m0 = e0.M0;
                    if (m0.U0 != null) {
                        final buc v0 = m0.V0;
                        if (v0 != null) {
                            v0.b(true);
                            m0.V0 = null;
                        }
                        m0.U0.c();
                        final Activity d2 = m0.D0;
                        final w83 p = m0.P0;
                        final qzc u0 = m0.U0;
                        jee.l((Object)u0);
                        final cb3 b1 = m0.b1;
                        final a d3 = m0.d1;
                        final zwc n2 = m0.N0;
                        final l9w o3 = m0.O0;
                        final yxc t0 = m0.T0;
                        jee.l((Object)t0);
                        final ytc s0 = m0.S0;
                        final j9c e2 = m0.e1;
                        final mt6 mt6 = new mt6(m0.b1, m0.d1);
                        czd.f((Object)d2, "context");
                        czd.f((Object)p, "params");
                        czd.f((Object)u0, "streamPresenter");
                        czd.f((Object)n2, "guestStatusCache");
                        czd.f((Object)o3, "userCache");
                        czd.f((Object)t0, "hydraMetricsManager");
                        czd.f((Object)s0, "hydraBroadcasterAnalyticsDelegate");
                        czd.f((Object)e2, "guestServiceSessionRepository");
                        Objects.requireNonNull(xn2.Companion);
                        final buc v2 = new buc((Context)d2, p, u0, b1, d3, n2, o3, t0, s0, e2, mt6, (xn2)xn2$a.b, (EglBase$Context)null, false, false, (v5o)null, (wj2)null);
                        m0.V0 = v2;
                        final String n3 = v2.g.n();
                        if (n3 == null) {
                            m8a.d((Throwable)new HydraException("Own user ID cannot be null"));
                        }
                        else {
                            final txk a = new txk(v2.c);
                            final mt6 k = v2.k;
                            k6k e3;
                            if (k != null) {
                                e3 = new k6k((cb3)k.D0, (a)k.E0, (k6k$b)a);
                            }
                            else {
                                e3 = null;
                            }
                            final VideoSource videoSource = v2.c().createVideoSource();
                            if (e3 != null) {
                                e3.D0 = videoSource.getCapturerObserver();
                            }
                            final lm2$a companion = lm2.Companion;
                            final int width = companion.a().getWidth();
                            final int height = companion.a().getHeight();
                            final AtomicReference a2 = y7g.a;
                            if (e3 != null) {
                                e3.startCapture(width, height, 30);
                            }
                            final VideoTrack videoTrack = v2.c().createVideoTrack("1", videoSource);
                            ((MediaStreamTrack)videoTrack).setEnabled(true);
                            v2.z = videoTrack;
                            v2.E = e3;
                            a.b = videoTrack;
                            a.b();
                            v2.A = a;
                            v2.c.g(n3, (xzc)new mmx(videoTrack));
                        }
                    }
                    final qzc u2 = m0.U0;
                    if (u2 != null) {
                        m0.Z0.c(u2.e().subscribe((lj6)new d7f((Object)m0, 25)));
                    }
                    if (m0.Y0 == null) {
                        final EGLContext d4 = m0.d1.d;
                        jee.l((Object)d4);
                        final EglBase$Context eglBaseContext = npe.K(d4).getEglBaseContext();
                        jee.l((Object)eglBaseContext);
                        m0.Y0 = eglBaseContext;
                        final izc r2 = m0.R0;
                        jee.l((Object)r2);
                        final EglBase$Context y0 = m0.Y0;
                        Objects.requireNonNull(r2);
                        czd.f((Object)y0, "eglContext");
                        r2.p = y0;
                    }
                    yvl.k(e0.H2);
                    final buc v3 = e0.M0.V0;
                    Object o4;
                    if (v3 != null) {
                        o4 = v3.v;
                    }
                    else {
                        o4 = h5j.empty();
                    }
                    e0.H2 = ((h5j)o4).observeOn(h60.b()).subscribe((lj6)new o4k(e0, 3));
                    e0.N1.c(((h5j)e0.M0.M0).subscribe((lj6)new t4k(e0, 3)));
                    e0.H();
                }
                else if (gmx$a instanceof gmx$a$b) {
                    final Throwable a3 = ((gmx$a$b)gmx$a).a;
                    czd.f((Object)a3, "throwable");
                    int n4 = n;
                    if (a3 instanceof DynamicDeliveryInstallManager.DynamicDeliveryException) {
                        n4 = n;
                        if (((DynamicDeliveryInstallManager.DynamicDeliveryException)a3).D0 == -10) {
                            n4 = 1;
                        }
                    }
                    m1f.e().c(oqf.g(n4), 1);
                    e0.e1.h((l4c)l4c$h.b);
                }
                return;
            }
            case 1: {
                final u4k e4 = this.E0;
                final zwc$i zwc$i = (zwc$i)o;
                final v47 a4 = e4.A2;
                if (a4 != null) {
                    if (e4.c2 != null) {
                        if (a4.d().a() != null) {
                            final String a5 = zwc$i.a;
                            final zwc$h b2 = zwc$i.b;
                            final zwc$h c = zwc$i.c;
                            final int ordinal = ((Enum)b2).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1 && ordinal != 2) {
                                    if (ordinal != 9) {
                                        if (ordinal == 13) {
                                            if (c.e() || c.f()) {
                                                e4.n(a5);
                                            }
                                            e4.C(a5);
                                        }
                                    }
                                    else {
                                        e4.C(a5);
                                    }
                                }
                                else {
                                    e4.K1.a(a5);
                                    final boolean b3 = zwc$i instanceof zwc$f;
                                    if (b3) {
                                        final zwc$f zwc$f = (zwc$f)zwc$i;
                                        final String d5 = zwc$f.d;
                                        if (e4.p2 != null) {
                                            final wzc$b a6 = e4.C1.a(a5);
                                            if (a6 != null) {
                                                final uuc p2 = e4.p2;
                                                Objects.requireNonNull(p2);
                                                final v2c c2 = p2.c;
                                                Objects.requireNonNull(c2);
                                                final ruc ruc = new ruc(a6);
                                                if (!((HashMap)c2.E0).containsKey(a6.a)) {
                                                    ((ArrayList)c2.D0).add(ruc);
                                                }
                                                ((HashMap)c2.E0).put(a6.a, ruc);
                                                ((RecyclerView$e)p2.d).f();
                                                final wuc a7 = p2.a;
                                                ((View)a7.i).setVisibility(0);
                                                a7.g.setVisibility(8);
                                                p2.a.c.setVisibility(0);
                                                p2.c();
                                                if (e4.c2 != null && okr.b((CharSequence)d5)) {
                                                    e4.c2.u(a5, d5);
                                                }
                                            }
                                        }
                                        czd.f((Object)a5, "userId");
                                        Message a8 = null;
                                        Label_0636: {
                                            if (b3) {
                                                final long e5 = zwc$f.e;
                                                final String g = zwc$f.g;
                                                final String h = zwc$f.h;
                                                if (jee.h0(new Object[] { g, h, zwc$f.f, e5 })) {
                                                    final long n5 = wa2.n();
                                                    final Message$a g2 = Message.g();
                                                    final String r3 = Message.R();
                                                    final a$a a$a = (a$a)g2;
                                                    a$a.g = r3;
                                                    a$a.c = a5;
                                                    a$a.T = a5;
                                                    a$a.i = g;
                                                    a$a.U = g;
                                                    a$a.j = g;
                                                    a$a.l = h;
                                                    a$a.e = e5;
                                                    a$a.b(tv.periscope.model.chat.c.o1);
                                                    a$a.S = 1;
                                                    a$a.R = 3L;
                                                    a$a.f = Message.N(n5);
                                                    a$a.v = Message.N(n5);
                                                    a$a.Q = null;
                                                    a8 = a$a.a();
                                                    break Label_0636;
                                                }
                                            }
                                            a8 = null;
                                        }
                                        if (a8 != null) {
                                            e4.N0.c(a8);
                                        }
                                        else {
                                            e4.v1.i("There was an error showing call-in request message.", false);
                                        }
                                    }
                                }
                            }
                            else {
                                e4.C(a5);
                            }
                        }
                    }
                }
                return;
            }
            case 0: {
                final u4k e6 = this.E0;
                ffz.W(e6.D0, e6.p1, (GetHeartThemeAssetsResponse)o);
            }
        }
    }
}
