import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$j;
import android.view.ViewGroup;
import android.net.Uri;
import com.twitter.media.ui.image.d;
import tv.periscope.android.ui.broadcast.replay.c$a;
import tv.periscope.android.ui.broadcast.replay.ReplayScrubView$f;
import java.util.Iterator;
import android.animation.TimeInterpolator;
import android.util.Log;
import androidx.fragment.app.strictmode.Violation;
import java.util.Random;
import android.os.Handler;
import androidx.profileinstaller.ProfileInstallerInitializer$b;
import android.os.Looper;
import android.os.Build$VERSION;
import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.l;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import java.text.DecimalFormat;
import com.twitter.util.user.UserIdentifier;
import com.twitter.users.TabbedVitFollowersContentViewArgs;
import androidx.appcompat.app.a;
import android.view.View;
import com.twitter.media.transcode.TranscoderException;
import com.twitter.media.ui.image.d$a;
import tv.periscope.android.ui.broadcast.ChatRoomView$e;
import tv.periscope.android.ui.broadcast.replay.c;
import tv.periscope.android.ui.broadcast.replay.ReplayScrubView;
import androidx.recyclerview.widget.RecyclerView$c0;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class opb implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public opb(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        final int f0 = this.F0;
        int g1 = 1;
        final boolean b = false;
        switch (f0) {
            default: {
                final mjx mjx = (mjx)this.G0;
                final ArrayList list = (ArrayList)this.H0;
                final TimeInterpolator s = mjx.s;
                Objects.requireNonNull(mjx);
                for (final RecyclerView$c0 recyclerView$c0 : list) {
                    final pbx c = b7x.c(recyclerView$c0.F0);
                    mjx.o.add(recyclerView$c0);
                    c.a(1.0f);
                    c.l(0.0f);
                    c.e(((RecyclerView$j)mjx).c);
                    c.g((rbx)new ijx(mjx, recyclerView$c0, c));
                    c.j();
                }
                list.clear();
                mjx.l.remove(list);
                return;
            }
            case 11: {
                final ReplayScrubView replayScrubView = (ReplayScrubView)this.G0;
                final c5r c5r = (c5r)this.H0;
                final int d1 = ReplayScrubView.d1;
                ((View)replayScrubView).setVisibility(0);
                c5r.d(1.0);
                final ReplayScrubView$f c2 = replayScrubView.c1;
                if (c2 != null) {
                    final c$a h = ((c)c2).h;
                    if (h != null) {
                        final com.twitter.media.av.broadcast.view.fullscreen.c c3 = (com.twitter.media.av.broadcast.view.fullscreen.c)h;
                        if (c3.V0 != null) {
                            c3.P0.b();
                            if (c3.V0.e()) {
                                c3.V0.j(2);
                                c3.K0.f();
                                c3.M0.J();
                                final r24 n0 = c3.N0;
                                if (!n0.e) {
                                    n0.e = true;
                                    n0.a();
                                }
                                c3.L0.setBottomTrayState(ChatRoomView$e.F0);
                                c3.H0.setDraggable(false);
                            }
                            c3.O0.setVisible(false);
                        }
                    }
                }
                return;
            }
            case 10: {
                final om1 om1 = (om1)this.G0;
                final rfd$b rfd$b = (rfd$b)this.H0;
                e0e.f((Object)om1, "this$0");
                e0e.f((Object)rfd$b, "$dismissReason");
                if (om1.d(om1)) {
                    om1.a.removeView(om1.b);
                    om1.f(rfd$b);
                }
                else {
                    final pbx k = om1.k;
                    if (k != null) {
                        k.b();
                    }
                    om1.b.post((Runnable)new esm((Object)om1, (Object)rfd$b, 14));
                }
                return;
            }
            case 9: {
                final d$a d$a = (d$a)this.G0;
                if (((z8d)this.H0).a((bsm)d$a.F0.Y0)) {
                    final d f2 = d$a.F0;
                    f2.S0 /= 2.0f;
                    f2.w();
                }
                return;
            }
            case 8: {
                final h5x h5x = (h5x)this.G0;
                final TranscoderException[] array = (TranscoderException[])this.H0;
                final int t = h5x.t;
                Objects.requireNonNull(h5x);
                try {
                    h5x.k.makeCurrent();
                    Object o = h5x.k;
                    synchronized (o) {
                        Surface surface = null;
                        Label_0550: {
                            if (((j5x)o).b != null) {
                                final gfk c4 = ((j5x)o).c;
                                if (c4 != null) {
                                    if (!c4.a.isEmpty()) {
                                        surface = c4.a.get(0).d();
                                    }
                                    else {
                                        surface = null;
                                    }
                                    monitorexit(o);
                                    break Label_0550;
                                }
                            }
                            surface = ((j5x)o).a;
                            monitorexit(o);
                        }
                        h5x.k.b();
                        o = ((wq1)h5x).e;
                        ((btg)o).d(((wq1)h5x).d, surface, (btg$a)new i5x(h5x));
                    }
                }
                catch (final TranscoderException ex) {
                    ((wq1)h5x).e.stop();
                    ((wq1)h5x).e.release();
                    array[0] = ex;
                }
                return;
            }
            case 7: {
                final yz1 yz1 = (yz1)this.G0;
                final View view = (View)this.H0;
                final int n2 = yz1.n1;
                final zai g2 = ((u9)yz1).G4();
                vmw.g((Object)g2);
                g2.d().M(view, new a.a(-2, -1, 8388613));
                ((u9)yz1).F4().setTitle(2131952193);
                return;
            }
            case 6: {
                final t9l t9l = (t9l)this.G0;
                final vjl vjl = (vjl)this.H0;
                final Uri a4 = t9l.a4;
                ((bl1)vjl).l2(((u9)t9l).I4());
                return;
            }
            case 5: {
                final pas pas = (pas)this.G0;
                final TabbedVitFollowersContentViewArgs tabbedVitFollowersContentViewArgs = (TabbedVitFollowersContentViewArgs)this.H0;
                final Uri c5 = pas.c1;
                final UserIdentifier m0 = ((u9)pas).M0;
                final int followersCount = tabbedVitFollowersContentViewArgs.getFollowersCount();
                final boolean currentUser = UserIdentifier.isCurrentUser(m0);
                final StringBuilder sb = new StringBuilder(((Activity)((u9)pas).G0).getTitle());
                if (currentUser && ita.b().b("followers_count_for_title_enabled", false) && followersCount >= ita.b().f("followers_count_for_title_minimum", 10000)) {
                    final String format = new DecimalFormat("#,###").format(followersCount);
                    ((kcv)pas).U4(format);
                    sb.append(' ');
                    sb.append(format);
                    final fg4 fg4 = new fg4();
                    ((o1p)fg4).q(new String[] { "followers:::vit_verified_followers_subtitle:impression" });
                    sbw.b((tlm)fg4);
                }
                final ViewGroup k2 = ((u9)pas).K4();
                if (k2 != null) {
                    ((View)k2).setContentDescription((CharSequence)sb.toString());
                }
                return;
            }
            case 4: {
                final v2r v2r = (v2r)this.G0;
                final SurfaceTexture l0 = (SurfaceTexture)this.H0;
                final SurfaceTexture l2 = v2r.L0;
                final Surface m2 = v2r.M0;
                final Surface m3 = new Surface(l0);
                v2r.L0 = l0;
                v2r.M0 = m3;
                final Iterator<v2r.b> iterator2 = v2r.F0.iterator();
                while (iterator2.hasNext()) {
                    ((v2r.b)iterator2.next()).g(m3);
                }
                if (l2 != null) {
                    l2.release();
                }
                if (m2 != null) {
                    m2.release();
                }
                return;
            }
            case 3: {
                final l i = (l)this.G0;
                final qcp qcp = (qcp)this.H0;
                Object d2;
                if (i.W0 == null) {
                    d2 = qcp;
                }
                else {
                    d2 = new qcp.b(-9223372036854775807L);
                }
                i.d1 = (qcp)d2;
                i.e1 = qcp.h();
                boolean f3 = b;
                if (i.k1 == -1L) {
                    f3 = b;
                    if (qcp.h() == -9223372036854775807L) {
                        f3 = true;
                    }
                }
                if (i.f1 = f3) {
                    g1 = 7;
                }
                i.g1 = g1;
                ((m)i.L0).w(i.e1, qcp.f(), i.f1);
                if (!i.a1) {
                    i.A();
                }
                return;
            }
            case 2: {
                final ldn$d f4 = ((ltl)this.H0).F0;
                Collections.emptyList();
                f4.a();
                return;
            }
            case 1: {
                final ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer)this.G0;
                final Context context = (Context)this.H0;
                Objects.requireNonNull(profileInstallerInitializer);
                Handler a5;
                if (Build$VERSION.SDK_INT >= 28) {
                    a5 = ProfileInstallerInitializer$b.a(Looper.getMainLooper());
                }
                else {
                    a5 = new Handler(Looper.getMainLooper());
                }
                a5.postDelayed((Runnable)new f26((Object)context, 2), (long)(new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            }
            case 0: {
                final String s2 = (String)this.G0;
                final Violation violation = (Violation)this.H0;
                e0e.f((Object)violation, "$violation");
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Policy violation with PENALTY_DEATH in ");
                sb2.append(s2);
                Log.e("FragmentStrictMode", sb2.toString(), (Throwable)violation);
                throw violation;
            }
        }
    }
}
