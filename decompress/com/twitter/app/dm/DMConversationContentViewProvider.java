// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import java.util.HashSet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.os.BaseBundle;
import java.util.concurrent.TimeUnit;
import android.view.View$OnClickListener;
import com.twitter.errordialogs.api.RateLimitDialogContentViewArgs;
import android.content.Intent;
import android.app.Dialog;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import java.util.Map;
import androidx.fragment.app.p;
import com.twitter.dm.widget.UntrustedConversationComposer;
import android.os.Parcelable;
import java.util.Iterator;
import android.view.Menu;
import com.twitter.app.dm.widget.DMConversationMessageComposer;
import java.util.UUID;
import java.util.Collections;
import com.twitter.app.common.args.ContentViewArgs;
import android.content.res.Resources;
import com.twitter.ui.view.DraggableDrawerLayout;
import com.twitter.subsystem.composer.TweetBox;
import com.twitter.app.dm.widget.MessageMeCardComposer;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.twitter.gallerygrid.api.GalleryGridMediaAttachedResult;
import com.twitter.report.subsystem.ReportFlowWebViewResultForAction;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Activity;
import java.util.Collection;
import android.net.Uri;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$e;
import com.twitter.dm.widget.UntrustedConversationComposer$a;
import android.os.Looper;
import android.view.ViewStub;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView$a;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView$a$b;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView;
import java.util.List;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.card.common.preview.b;
import com.twitter.app.dm.conversation.DMConversationComposerHostView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import android.os.Handler;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.alttext.AltTextActivityContentViewResult;
import com.twitter.alttext.AltTextActivityContentViewArgs;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewResult;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewArgs;
import com.twitter.gallerygrid.api.GalleryGridContentViewResult;
import com.twitter.gallerygrid.api.GalleryGridContentViewArgs;
import com.twitter.report.subsystem.ReportFlowWebViewResult;
import java.util.Set;
import com.twitter.dm.network.SendDMRequest;

@a91
public class DMConversationContentViewProvider extends acv<lt6> implements et7, sn1$a, ho8$a, gjj, du7, gai, mw8
{
    public static final cda A3;
    public static final tba B3;
    public static final tba C3;
    public static final tba D3;
    public static final String[] E3;
    public long[] A1;
    public kj7 A2;
    public boolean B1;
    public blw B2;
    public boolean C1;
    public cef C2;
    public boolean D1;
    public String D2;
    public qt6 E1;
    public sn1 E2;
    public kq6 F1;
    public final gis F2;
    public ck7 G1;
    public final azb G2;
    public uom H1;
    public final bzb H2;
    public aav I1;
    public final um7 I2;
    public cb0 J1;
    public final bpx J2;
    public b6h K1;
    public s34 K2;
    public ba9 L1;
    public final ocw L2;
    public boolean M1;
    public t9j<xmv> M2;
    public boolean N1;
    public t9j<t48> N2;
    public boolean O1;
    public t9j<qo8> O2;
    public boolean P1;
    public t9j<l57> P2;
    public hr7 Q1;
    public t9j<zim> Q2;
    public boolean R1;
    public t9j<zim> R2;
    public x5m S1;
    public t9j<llr> S2;
    public boolean T1;
    public t9j<s09> T2;
    public boolean U1;
    public t9j<yl7> U2;
    public xei V1;
    public t9j<jk7> V2;
    public boolean W1;
    public t9j<ul7> W2;
    public boolean X1;
    public t9j<few> X2;
    public boolean Y1;
    public t9j<zkg> Y2;
    public boolean Z1;
    public t9j<z12> Z2;
    public boolean a2;
    public t9j<m3w> a3;
    public jp7 b1;
    public boolean b2;
    public t9j<SendDMRequest> b3;
    public Set<String> c1;
    public boolean c2;
    public t9j<wsm> c3;
    public String d1;
    public boolean d2;
    public xn6<sjm, ReportFlowWebViewResult> d3;
    public String e1;
    public boolean e2;
    public xn6<GalleryGridContentViewArgs, GalleryGridContentViewResult> e3;
    public String f1;
    public boolean f2;
    public xn6<SensitiveMediaActivityContentViewArgs, SensitiveMediaActivityContentViewResult> f3;
    public lmv$a g1;
    public lmv g2;
    public xn6<AltTextActivityContentViewArgs, AltTextActivityContentViewResult> g3;
    public boolean h1;
    public mfk<wmv> h2;
    public xn6<p6k, PermissionContentViewResult> h3;
    public boolean i1;
    public mfk<l49> i2;
    public xn6<p6k, PermissionContentViewResult> i3;
    public boolean j1;
    public zml<String> j2;
    public xn6<p6k, PermissionContentViewResult> j3;
    public boolean k1;
    public DMConversationContentViewProvider.DMConversationContentViewProvider$f k2;
    public y4m k3;
    public boolean l1;
    public Handler l2;
    public p39 l3;
    public boolean m1;
    public b0m m2;
    public Context m3;
    public boolean n1;
    public boolean n2;
    public bra<jp7, String> n3;
    public boolean o1;
    public boolean o2;
    public w99 o3;
    public boolean p1;
    public wf6 p2;
    public qk7 p3;
    public boolean q1;
    public View q2;
    public sei q3;
    public boolean r1;
    public TextView r2;
    public ubc r3;
    public boolean s1;
    public TextView s2;
    public ul7$b s3;
    public boolean t1;
    public View t2;
    public daq<ov6, i4e<lt6>> t3;
    public boolean u1;
    public cyl u2;
    public co1 u3;
    public boolean v1;
    public an7 v2;
    public boolean v3;
    public long w1;
    public ct7 w2;
    public long w3;
    public boolean x1;
    public y6k x2;
    public long x3;
    public long y1;
    public r9x y2;
    public long y3;
    public int z1;
    public DMConversationComposerHostView z2;
    public boolean z3;
    
    static {
        A3 = (cda)zca.a("messages", "thread");
        B3 = (tba)rba.c("messages", "thread", "dm_compose_bar", "untrusted_interstitial");
        C3 = (tba)rba.c("messages", "top_request", "dm_compose_bar", "untrusted_interstitial");
        D3 = (tba)rba.c("messages", "thread", "dm_compose_bar", "accept_muted_dialog");
        E3 = hr4.J(new Object[] { "android.permission.RECORD_AUDIO" });
    }
    
    public DMConversationContentViewProvider(final ybv ybv, final jev y0, final p9s p9s, final hr7 q1, final an7 v2, final ct7 w2, final blw b2, final mbi<?> z, final p39 l3, final Context m3, final w99 o3, final lce n, final tr7 o4, final sr7 p40, final cef c2, final nu6 r, final b6h k1, final kq6$a kq6$a, final b01 w3, final gid x, final b b3, final y4m k2, final bra<jp7, String> n2, final pca<p4h> pca, final pca<bo> pca2, final sei q2, final qk7 p41, final ubc r2, final daq<String, snj<x99>> daq, final ul7$b s3, final daq<ov6, i4e<lt6>> t3, final cb0 j1, final gis f2, final azb g2, final bzb h2, final s34 k3, final um7 i2, final ocw l4, final bpx j2, final co1 u3) {
        super(ybv);
        this.w1 = -1L;
        this.y3 = -1L;
        final Bundle q3 = ybv.q;
        final kk7 i3 = this.i1();
        final long t4 = i3.t();
        this.w3 = t4;
        this.x3 = t4;
        this.v3 = (t4 != -1L);
        this.s3 = s3;
        this.t3 = t3;
        this.J1 = j1;
        this.F2 = f2;
        this.G2 = g2;
        this.H2 = h2;
        this.I2 = i2;
        this.L2 = l4;
        this.J2 = j2;
        this.u3 = u3;
        this.m3 = m3;
        final View inflate = LayoutInflater.from(this.r0()).inflate(2131624361, (ViewGroup)null);
        this.q2 = inflate;
        this.r2 = (TextView)inflate.findViewById(2131428762);
        this.t2 = this.q2.findViewById(2131428767);
        this.s2 = (TextView)this.q2.findViewById(2131428761);
        this.U1 = amy.z();
        synchronized (ba9.class) {
            if (ba9.F0 == null) {
                ba9.F0 = new ba9(0);
                nds.a((Class)ba9.class);
            }
            final ba9 f3 = ba9.F0;
            monitorexit(ba9.class);
            this.L1 = f3;
            super.Y0 = y0;
            this.l2 = new Handler();
            this.x1 = (q3 != null);
            final x28 a = u28.a(super.F0);
            this.I1 = a.o();
            this.H1 = a.N4();
            this.S1 = new x5m((Runnable)new nsl((Object)this, 5), 10000L);
            this.m2 = new b0m();
            this.p2 = y70.a().s().b();
            final cyl u4 = new cyl(this.r0());
            this.u2 = u4;
            final wf6 p42 = this.p2;
            zzd.f((Object)p42, "configurationCollection");
            u4.F0.a((List)p42.a, (rtb)new dyl(u4));
            this.u2.I0 = (gjj)this;
            this.x2 = y6k.d();
            super.T0.setTitle((CharSequence)"");
            this.r2.setText((CharSequence)this.r0().getString(2131954815));
            final jn6 c3 = this.c();
            pf8.r(c3);
            this.z2 = (DMConversationComposerHostView)c3.getView().findViewById(2131428730);
            this.k3 = k2;
            this.l3 = l3;
            this.n3 = n2;
            this.o3 = o3;
            this.p3 = p41;
            this.q3 = q2;
            this.r3 = r2;
            if (poa.C0(l4)) {
                final HorizonInlineCalloutView horizonInlineCalloutView = (HorizonInlineCalloutView)this.c().getView().findViewById(2131428624);
                ((View)horizonInlineCalloutView).setVisibility(0);
                final String string = this.z0().getString(2131953224, new Object[] { pjr.l(l4.b()) });
                final HorizonInlineCalloutView$a$b d = HorizonInlineCalloutView$a$b.d;
                zzd.f((Object)d, "style");
                HorizonInlineCalloutView.e(horizonInlineCalloutView, (HorizonInlineCalloutView$a)d, (CharSequence)string, 16);
            }
            ((ViewStub)this.c().getView().findViewById(2131428773)).setLayoutResource(2131625505);
            ((ViewStub)this.c().getView().findViewById(2131431090)).setLayoutResource(2131625552);
            this.M2 = (t9j<xmv>)p9s.a((Class)xmv.class);
            this.N2 = (t9j<t48>)p9s.a((Class)t48.class);
            this.O2 = (t9j<qo8>)p9s.a((Class)qo8.class);
            this.P2 = (t9j<l57>)p9s.a((Class)l57.class);
            this.R2 = (t9j<zim>)p9s.b((Class)zim.class, "NotSpam");
            final t9j b4 = p9s.b((Class)zim.class, "Spam");
            this.Q2 = (t9j<zim>)b4;
            f.j(b4.a(), (u93)vi7.a, (raa)super.O0);
            final t9j a2 = p9s.a((Class)llr.class);
            this.S2 = (t9j<llr>)a2;
            f.j(a2.a(), (u93)new oj7(this, 1), (raa)super.O0);
            final t9j a3 = p9s.a((Class)s09.class);
            this.T2 = (t9j<s09>)a3;
            f.j(a3.a(), (u93)wcu.c, (raa)super.O0);
            this.U2 = (t9j<yl7>)p9s.a((Class)yl7.class);
            final t9j a4 = p9s.a((Class)jk7.class);
            this.V2 = (t9j<jk7>)a4;
            f.j(a4.a(), (u93)new sj7(this, 1), (raa)super.O0);
            final t9j a5 = p9s.a((Class)ul7.class);
            this.W2 = (t9j<ul7>)a5;
            f.j(a5.a(), (u93)new rj7(this, 1), (raa)super.O0);
            final t9j a6 = p9s.a((Class)few.class);
            this.X2 = (t9j<few>)a6;
            f.j(a6.a(), (u93)new qj7(this, 2), (raa)super.O0);
            this.Y2 = (t9j<zkg>)p9s.a((Class)zkg.class);
            this.Z2 = (t9j<z12>)p9s.a((Class)z12.class);
            this.a3 = (t9j<m3w>)p9s.a((Class)m3w.class);
            final t9j a7 = p9s.a((Class)SendDMRequest.class);
            this.b3 = (t9j<SendDMRequest>)a7;
            f.j(a7.a(), (u93)new pj7(this, 1), (raa)super.O0);
            final t9j a8 = p9s.a((Class)wsm.class);
            this.c3 = (t9j<wsm>)a8;
            f.j(a8.a(), (u93)new ril((Object)this, 6), (raa)super.O0);
            final DMConversationContentViewProvider$c dmConversationContentViewProvider$c = new DMConversationContentViewProvider$c(this);
            this.y2 = new r9x();
            new Handler(Looper.getMainLooper()).post((Runnable)new jsl((Object)this, (Object)dmConversationContentViewProvider$c, (Object)b3, 1));
            this.z2.F0.setInterstitialActionListener((UntrustedConversationComposer$a)new DMConversationContentViewProvider$d(this));
            this.Q1 = q1;
            this.v2 = v2;
            this.w2 = w2;
            final Fragment h3 = this.w0().H("TAG_USERS_BOTTOM_SHEET");
            if (h3 instanceof blw && q3 != null) {
                this.B2 = (blw)h3;
                final long[] longArray = ((BaseBundle)q3).getLongArray("participants_sheet_user_ids");
                if (longArray != null) {
                    this.B2.i2(longArray);
                }
                final String string2 = ((BaseBundle)q3).getString("participants_sheet_title");
                if (string2 != null && !string2.isEmpty()) {
                    this.B2.T1 = string2;
                }
            }
            else {
                this.B2 = b2;
            }
            final wf6 b5 = y70.a().s().b();
            this.C2 = c2;
            this.K1 = k1;
            final giw a9 = ncw.b(super.F0).A();
            final jev y2 = super.Y0;
            pf8.r(y2);
            final t9y h4 = new t9y(Long.valueOf(super.F0.getId()));
            this.K1.c = (fo7)new dk7(this);
            final ek7 e = new ek7(this);
            final ck7 ck7 = new ck7(this);
            this.G1 = ck7;
            kq6$a.a = (Activity)super.C0;
            kq6$a.z = z;
            kq6$a.b = (uh7)ck7;
            kq6$a.e = (i2p)e;
            kq6$a.d = this.Q1;
            kq6$a.u = this.v2;
            kq6$a.m = a9.j;
            kq6$a.i = new ij7(this);
            kq6$a.c = y2;
            kq6$a.k = a9;
            kq6$a.l = poa.g0();
            kq6$a.g = this.K1;
            kq6$a.h = h4;
            kq6$a.f = this.J1;
            kq6$a.j = (et7)this;
            kq6$a.n = n;
            kq6$a.o = o4;
            kq6$a.p = p40;
            kq6$a.q = this.C2;
            kq6$a.r = r;
            kq6$a.s = q3;
            kq6$a.t = b5;
            kq6$a.v = (View$OnClickListener)new yrf((Object)this, 3);
            kq6$a.w = w3;
            kq6$a.x = x;
            this.F1 = (kq6)((h4j)kq6$a).e();
            this.Q1.b = (hr7$a)new yga((Object)this, 10);
            super.X0.H0.c((gnf$b)new tj7(this));
            final mt6 mt6 = new mt6(super.F0.getId(), h4, n);
            final c4e c4e = new c4e((y4e)mt6, (x3e)this.F1.i(), super.O0);
            super.X0.Z1((RecyclerView$e)c4e, (l4e<T>)mt6);
            final z5m z5m = new z5m((RecyclerView$e)c4e);
            final k6m h5 = super.X0.H0;
            final int a10 = w4j.a;
            ((LinearLayoutManager)h5.u()).K1(true);
            final k6m h6 = super.X0.H0;
            if (h6 instanceof k6m) {
                h6.b.h((RecyclerView$l)new dsd(this.z0().getDimensionPixelOffset(2131165662)));
            }
            this.F1.j((g4e)z5m);
            final qt6$a qt6$a = new qt6$a();
            qt6$a.a = this.r0();
            qt6$a.b = super.F0;
            final gob c4 = super.C0;
            Objects.requireNonNull(c4);
            qt6$a.c = g3g.b((lbf)c4);
            qt6$a.d = this.F1;
            qt6$a.e = (zid$a)new o71((Object)this, (Object)dmConversationContentViewProvider$c, 7);
            qt6$a.f = (dyj$a)new DMConversationContentViewProvider$e(this);
            qt6$a.g = (i7k$a)new fj7(this);
            this.E1 = (qt6)((h4j)qt6$a).e();
            final boolean r3 = q3 != null;
            this.R1 = r3;
            if (r3) {
                n8r.restoreFromBundle(this, q3);
                if (this.d1 == null && this.b1 == null) {
                    this.R1 = false;
                }
            }
            this.Z1 = i3.z();
            this.a2 = i3.w();
            this.b2 = i3.v();
            this.d2 = i3.y();
            this.c2 = i3.x();
            this.O1 = ((zl1)i3).a.getBoolean("is_from_external_url");
            this.v1 = i3.B();
            this.z1 = i3.p();
            this.j1 = i3.m();
            this.i3 = z.g(PermissionContentViewResult.class, asm.a((Class)PermissionContentViewResult.class), "AttachMediaPermissions");
            boolean b9;
            if (this.R1) {
                pf8.r(q3);
                final zl1 zl1 = new zl1(q3);
                final ArrayList parcelableArrayList = zl1.a.getParcelableArrayList("canceled_pending_attachments");
                final Uri uri = (Uri)zl1.a.getParcelable("media_uri");
                final wqg wqg = (wqg)tkp.a(zl1.c("media_attachment"), (alp)wqg$a.b);
                final b0m m4 = this.m2;
                pf8.r(q3);
                Objects.requireNonNull(m4);
                Object b6;
                if ((b6 = q3.getParcelableArrayList("state_participants")) == null) {
                    b6 = v2a.C0;
                }
                m4.b = (List)b6;
                final boolean b7 = c6e.b((Iterable)b6, (otk)y69.f);
                Object a11;
                if (b7) {
                    a11 = m4.b;
                }
                else {
                    a11 = med.D0;
                }
                m4.a = (Collection)a11;
                this.u1(wqg, uri, this.e1, false, parcelableArrayList, (rx0)dmConversationContentViewProvider$c, o3);
                if (poa.p0() && this.x2.a((Context)super.C0, DMConversationContentViewProvider.E3)) {
                    this.x1();
                }
                final jp7 b8 = this.b1;
                b9 = b7;
                if (b8 != null) {
                    this.S1(b8, true);
                    b9 = b7;
                }
            }
            else {
                final String n3 = i3.n();
                this.d1 = n3;
                this.l3.d = n3;
                this.M1(o48.g(i3));
                final boolean a12 = i3.A();
                final jp7 o5 = i3.o();
                final boolean m5 = o5 != null && o5.o;
                if (this.l1 != a12) {
                    this.l1 = a12;
                    this.m1 = m5;
                    this.F1.c(a12);
                    super.T0.invalidate();
                }
                this.h1 = i3.A();
                this.e1 = ((kk1)i3).i();
                final Uri q4 = i3.q();
                final boolean boolean1 = ((zl1)i3).a.getBoolean("is_keyboard_open");
                this.n1 = true;
                this.s1 = false;
                this.c1 = iuh.a(0);
                final long[] r4 = i3.r();
                if (r4 != null && r4.length != 0) {
                    final dw0 a13 = dw0.a();
                    final gob c5 = super.C0;
                    final UserIdentifier f4 = super.F0;
                    final w47 w4 = new w47((Context)c5, f4, this.d1, r4, u28.a(f4).U1());
                    Objects.requireNonNull(a13);
                    a13.d((cw0<Object>)new cw0((fw0)w4));
                }
                if (this.a2 && this.c2) {
                    final lev lev = new lev();
                    lev.v = "dynamic_shortcut_share";
                    final zf4 zf4 = new zf4(super.F0);
                    zf4.q(new String[] { "messages:thread::external_share:impression" });
                    zf4.i((szo)lev);
                    saw.b((okm)zf4);
                }
                else {
                    final zf4 zf5 = new zf4(super.F0);
                    zf5.q(new String[] { "messages:thread:::impression" });
                    saw.b((okm)zf5);
                }
                this.u1(null, q4, this.e1, boolean1, null, (rx0)dmConversationContentViewProvider$c, o3);
                if (poa.p0() && this.x2.a((Context)super.C0, DMConversationContentViewProvider.E3)) {
                    this.x1();
                }
                b9 = false;
            }
            final fai f5 = super.T0.f();
            pf8.r(f5);
            final wj d2 = f5.d();
            d2.J(this.z0().getDimensionPixelSize(2131165528));
            d2.E(this.q2);
            this.w1();
            final x28 a14 = u28.a(super.F0);
            if (this.O1() && !dli.G(this.d1)) {
                this.N2.d((kmm)new t48(this.m3, super.F0, this.d1, i3.u(), a14.s7(), i2));
            }
            if (this.v3) {
                this.g1();
                f.j(i2.w().observeOn(h6q.L()), (u93)new mj7(this, 1), (raa)super.O0);
            }
            this.V1 = new xei(this.c().getView(), super.F0, (xei.a)new yqx((Object)this, 13), (xei.b)new ue8((Object)this, 18));
            this.F1.h(this.h1);
            if (b9) {
                final kq6 f6 = this.F1;
                final b0m m6 = this.m2;
                vt6 b10;
                if (hr4.s((Iterable)m6.a)) {
                    b10 = vt6.b;
                }
                else {
                    b10 = new vt6(m6.a);
                }
                f6.f(b10);
            }
            if (this.d2 && !this.s1) {
                final DMConversationComposerHostView z2 = this.z2;
                final evl s4 = i3.s();
                final String e2 = this.e1;
                final String string3 = ((BaseBundle)((zl1)i3).a).getString("hint_text");
                final xno listener = new xno((Object)this, (Object)i3, 9);
                Objects.requireNonNull(z2);
                if (s4 != null) {
                    z2.G0.setListener((com.twitter.app.dm.widget.b.a)listener);
                    final MessageMeCardComposer g3 = z2.G0;
                    g3.setQuotedTweet(s4);
                    g3.Q0.setQuoteData(s4);
                    g3.R0.setVisibility(0);
                    if (pjr.g((CharSequence)e2)) {
                        g3.F0.k(e2, (int[])null);
                    }
                    final TweetBox f7 = g3.F0;
                    final String string4 = ((View)g3).getResources().getString(2131951860);
                    String hintText;
                    if ((hintText = string3) == null) {
                        hintText = string4;
                    }
                    f7.setHintText(hintText);
                }
            }
            final lo7 lo7 = (lo7)r9x.h((Activity)super.C0, (Class)lo7.class);
            pf8.r(lo7);
            final DraggableDrawerLayout u5 = lo7.u();
            final Resources z3 = this.z0();
            this.A2 = new kj7(this, u5, z3.getDisplayMetrics().heightPixels - z3.getDimensionPixelSize(2131167569));
            this.c().getView().getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.A2);
            this.z2.E0.setQuickReplyDrawerHost(new dt7(this.r0(), u5, (dt7$a)this));
            final String d3 = this.d1;
            if (d3 != null) {
                this.u3.a(super.F0, d3);
            }
            final jp7 o6 = i3.o();
            if (o6 != null) {
                final boolean r5 = this.R1;
                if (!r5) {
                    this.S1(o6, r5);
                }
            }
            if (!this.l1 || this.k1) {
                this.R1();
            }
            final xn6<zm, ReportFlowWebViewResult> h7 = z.h(ReportFlowWebViewResult.class, asm.a((Class)ReportFlowWebViewResult.class));
            this.d3 = (xn6<sjm, ReportFlowWebViewResult>)h7;
            f.i(h7.c().ofType((Class)ReportFlowWebViewResultForAction.class).filter((ptk)vno.L0), (u93)new sj7(this, 0));
            final xn6<ContentViewArgs, GalleryGridContentViewResult> a15 = z.a(GalleryGridContentViewResult.class);
            this.e3 = (xn6<GalleryGridContentViewArgs, GalleryGridContentViewResult>)a15;
            f.i(a15.c().ofType((Class)GalleryGridMediaAttachedResult.class), (u93)new cmu((Object)this, (Object)o3, 2));
            final xn6<ContentViewArgs, SensitiveMediaActivityContentViewResult> a16 = z.a(SensitiveMediaActivityContentViewResult.class);
            this.f3 = (xn6<SensitiveMediaActivityContentViewArgs, SensitiveMediaActivityContentViewResult>)a16;
            f.i((b5j)a16.c(), (u93)new qj7(this, 0));
            final xn6<ContentViewArgs, AltTextActivityContentViewResult> a17 = z.a(AltTextActivityContentViewResult.class);
            this.g3 = (xn6<AltTextActivityContentViewArgs, AltTextActivityContentViewResult>)a17;
            f.i((b5j)a17.c(), (u93)new pj7(this, 0));
            final xn6<zm, PermissionContentViewResult> g4 = z.g(PermissionContentViewResult.class, asm.a((Class)PermissionContentViewResult.class), "GalleryPermissions");
            this.h3 = (xn6<p6k, PermissionContentViewResult>)g4;
            f.i(g4.c().filter((ptk)h71.M0), (u93)new k3((Object)this, 8));
            f.i((b5j)this.i3.c(), (u93)new mj7(this, 0));
            this.j3 = z.g(PermissionContentViewResult.class, asm.a((Class)PermissionContentViewResult.class), "AudioPermissions");
            f.i(this.j3.c().filter((ptk)asx.P0), (u93)new oj7(this, 0));
            if (q3 != null) {
                final String string5 = ((BaseBundle)q3).getString("message_text");
                if (string5 != null) {
                    this.z2.setCurrentComposerMessage(string5);
                }
            }
            f.i((b5j)super.S0.l(), (u93)new nj7(this, 0));
            f.i(xd.H((pca)pca, (Class)p4h.a.class), (u93)new rj7(this, 0));
            f.i(pca2.v0(), (u93)new qj7(this, 1));
            final String d4 = this.d1;
            if (d4 != null) {
                f.h(daq.S((Object)d4), (u93)new ui7((Object)this, (Object)dmConversationContentViewProvider$c, 0));
            }
            this.K2 = k3;
        }
    }
    
    public final void A1() {
        final Context r0 = this.r0();
        final String[] t2 = ixb.t2;
        if (mxb.a(r0)) {
            this.e3.d(new GalleryGridContentViewArgs("dm_composition", (uvw)uvw$d.h, 1));
        }
        else {
            this.h3.d(this.B1(2131954188, "media", ixb.t2));
        }
    }
    
    public final void B(final long n) {
        this.H1(n, false);
    }
    
    public final p6k B1(final int n, final String s, final String... array) {
        final p6k$a a = p6k.a(this.z0().getString(n), (Context)super.C0, array);
        a.s(rba.c("messages", "thread", "dm_compose_bar", s));
        return (p6k)((h4j)a).e();
    }
    
    public final void C1(final String c, final evl h, final nk1 i) {
        if (i == null) {
            this.t1();
        }
        final DMConversationComposerHostView z2 = this.z2;
        final wqg g = z2.C0.g;
        String s = null;
        Label_0165: {
            Label_0160: {
                if (g != null) {
                    final l1h g2 = g.b.G0;
                    if (g2 != null) {
                        final int ordinal = ((Enum)g2).ordinal();
                        if (ordinal == 1) {
                            s = "photo";
                            break Label_0165;
                        }
                        if (ordinal == 2) {
                            s = "gif";
                            break Label_0165;
                        }
                        if (ordinal == 3) {
                            s = "video";
                            break Label_0165;
                        }
                        if (ordinal != 5) {
                            break Label_0160;
                        }
                        s = "voice";
                        break Label_0165;
                    }
                }
                if (h != null) {
                    s = "tweet";
                    break Label_0165;
                }
                if (z2.E0.getCardUrl() != null) {
                    s = "card";
                    break Label_0165;
                }
                if (c != null && !c.isEmpty()) {
                    s = "text";
                    break Label_0165;
                }
            }
            s = "unknown";
        }
        final zf4 zf4 = new zf4(super.F0);
        zf4.T = nca.f((ada)DMConversationContentViewProvider.A3, "", s, "send_dm").toString();
        final int a = w4j.a;
        zf4.w0 = this.d1;
        zf4.C0 = this.b1.h.size();
        zf4.B0 = (this.i1 ? 1 : 0);
        zf4.I0 = this.m1();
        if (this.j1) {
            zf4.J(Collections.singletonList(hl7.C0));
        }
        final boolean b = this.s1 ^ true;
        if (this.a2 && this.c2 && b) {
            final lev lev = new lev();
            lev.v = "dynamic_shortcut_share";
            zf4.i((szo)lev);
        }
        saw.b((okm)zf4);
        this.s1 = true;
        this.M1 = true;
        this.Q1.d = true;
        final d c2 = this.z2.C0;
        c2.e = c2.d;
        if (c2.d()) {
            final wqg g3 = this.z2.C0.g;
            if (g3 == null || !g3.b()) {
                return;
            }
        }
        final String string = UUID.randomUUID().toString();
        this.c1.add(string);
        ((ejg)j28.A(string, super.a1)).h();
        final cb0 j1 = this.J1;
        Objects.requireNonNull(j1);
        zzd.f((Object)string, "requestId");
        j1.a = string;
        j99 b2;
        if (h == null && i == null && this.z2.E0.getCardUrl() == null && g != null) {
            b2 = g.b;
            xw0.c((rj)new ej7((Object)this, (Object)b2, 0));
        }
        else {
            b2 = null;
        }
        if (b2 != null) {
            this.H2.b("messages", "thread", "", Collections.singletonList(b2));
        }
        final sei$a$a sei$a$a = new sei$a$a();
        sei$a$a.a = this.d1;
        sei$a$a.b = string;
        sei$a$a.c = c;
        sei$a$a.d = b2;
        sei$a$a.e = this.f1;
        sei$a$a.f = this.z2.E0.getCardUrl();
        sei$a$a.g = null;
        sei$a$a.h = h;
        sei$a$a.i = i;
        this.n0(this.q3.a((sei$a)((h4j)sei$a$a).e()).G((fk6)new a7w((Object)this, (Object)string, (Object)b2, 1), (fk6)jvb.e));
        final UserIdentifier f0 = super.F0;
        final hc6 f2 = hc6.F0;
        Object o;
        if (b2 == null) {
            o = Collections.emptyList();
        }
        else {
            o = Collections.singletonList(b2);
        }
        sb6.d(f0, f2, (List)o);
        final DMConversationContentViewProvider.DMConversationContentViewProvider$f k2 = this.k2;
        if (k2 != null) {
            k2.k.incrementAndGet();
        }
        if (b) {
            this.R1();
        }
        final DMConversationComposerHostView z3 = this.z2;
        final d c3 = z3.C0;
        c3.c();
        c3.e();
        c3.g = null;
        c3.d = null;
        c3.e = null;
        final DMConversationMessageComposer e0 = z3.E0;
        e0.F0.k("", (int[])null);
        final y4m z4 = e0.Z0;
        if (z4 != null) {
            z4.f(true);
        }
        final MessageMeCardComposer g4 = z3.G0;
        g4.F0.k("", (int[])null);
        g4.Q0.setQuoteData((evl)null);
        g4.R0.setVisibility(8);
        this.G1();
        xw0.c((rj)new aq1((Object)this, 9));
    }
    
    public final void D1() {
        this.w2.c.a();
        final ct7 w2 = this.w2;
        final jp7 b1 = this.b1;
        Objects.requireNonNull(w2);
        zzd.f((Object)b1, "inboxItem");
        if (!b1.j && b1.l && poa.p0() && w2.d.c()) {
            final fit$b d2 = fit.d2(this.r0(), 2131430917);
            d2.a(0);
            d2.b(2131953547);
            d2.d = (fit$c)new jj7(this);
            d2.d(this.w0(), "VoiceMessageEducationTooltip", true);
        }
    }
    
    public final void E1() {
        ((View)super.X0.H0.b).post((Runnable)new h16((Object)this, 7));
    }
    
    public final void F1() {
        final d c0 = this.z2.C0;
        final wqg g = c0.g;
        Uri e0;
        if (g != null) {
            e0 = g.b.E0;
        }
        else {
            e0 = null;
        }
        c0.g = null;
        c0.d = null;
        if (e0 != null) {
            c0.f(e0);
        }
        this.G1();
    }
    
    public final void G1() {
        final d c0 = this.z2.C0;
        ((DMConversationMessageComposer)c0.a).Q0.setVisibility(0);
        final View r0 = ((DMConversationMessageComposer)c0.a).R0;
        if (r0 != null) {
            r0.setVisibility(0);
        }
        c0.g(null);
        ((View)((DMConversationMessageComposer)c0.a).T0).setVisibility(8);
        ((DMConversationMessageComposer)c0.a).S0.setVisibility(8);
        final DMConversationMessageComposer e0 = this.z2.E0;
        final TweetBox f0 = e0.F0;
        f0.i(f0.U0 = false);
        if (poa.p0()) {
            e0.q();
        }
        else {
            e0.n();
        }
    }
    
    public final void H1(final long n, final boolean b) {
        this.M1 = true;
        this.c3.d((kmm)new wsm((Context)super.C0, super.F0, n, b, this.I2, (nu7)new ou7(((rp1)this.I1).T()), u28.a(super.F0).s6()));
    }
    
    public final void I1(final m3w$a m3w$a) {
        final hfv o1 = this.o1();
        this.a3.d((kmm)new m3w(super.F0, this.I2, o1.C0, m3w$a, this.d1, u28.a(super.F0).M2(), (m3w$c)new DMConversationContentViewProvider$b(this, m3w$a, o1, m3w$a == m3w$a.C0)));
    }
    
    public final void J(final long w1, final long n, final String s) {
        final jp7 b1 = this.b1;
        String s2;
        if (b1 != null && b1.l) {
            s2 = "inbox_timeline";
        }
        else {
            s2 = "requests_timeline";
        }
        final zf4.a a = new zf4.a(super.F0);
        a.o("messages", "thread", s2, s, "report");
        saw.b((okm)a.e());
        final sjm sjm = new sjm();
        sjm.s("reportdmconversation");
        sjm.m(this.d1);
        ((dj1)sjm).mIntent.putExtra("reported_direct_message_id", w1);
        sjm.t(n);
        sjm.r();
        this.d3.d(sjm);
        this.w1 = w1;
    }
    
    public final void J1(final boolean b) {
        if (this.s1()) {
            final k6m h0 = super.X0.H0;
            h0.b.stopNestedScroll();
            h0.b.F0();
            h0.B(new dnf(h0.getCount() - 1, 0), b);
        }
    }
    
    public final void K() {
        final zf4 zf4 = new zf4(super.F0);
        zf4.T = nca.f((ada)DMConversationContentViewProvider.A3, "reaction_picker", "", "dismiss").toString();
        final int a = w4j.a;
        saw.b((okm)zf4);
    }
    
    public final void K1(final i4e<lt6> i4e) {
        final hr7 q1 = this.Q1;
        Objects.requireNonNull(q1);
        int n = 0;
        Label_0068: {
            if (i4e != null && !i4e.C0) {
                final i4e$b i4e$b = new i4e$b((i4e)i4e);
                n = 0;
                while (i4e$b.hasNext()) {
                    if (((lt6)((bgz)i4e$b).next()).g == q1.e) {
                        break Label_0068;
                    }
                    ++n;
                }
            }
            n = -1;
        }
        if (n == -1) {
            return;
        }
        if (n < this.s0() - 1) {
            super.X0.V1(n + 1, (int)(this.c().getView().getHeight() * 0.2), false);
        }
        else {
            this.J1(false);
        }
        this.t1 = true;
    }
    
    @Override
    public final void L0() {
        this.l2.removeCallbacksAndMessages((Object)null);
        final kq6 f1 = this.F1;
        if (f1 != null) {
            f1.destroy();
        }
        final b6h k1 = this.K1;
        if (k1 != null) {
            k1.c = null;
        }
        if (this.A2 != null) {
            final View view = this.c().getView();
            pf8.r(view);
            view.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.A2);
        }
        super.L0();
    }
    
    public final void L1(final String g0) {
        if (!g0.equals(this.d1)) {
            this.d1 = g0;
            this.l3.d = g0;
            final qt6 e1 = this.E1;
            e1.a.H0 = g0;
            e1.b.H0 = g0;
            e1.d.G0 = g0;
            if (!this.f2) {
                this.v1();
            }
            this.u3.a(super.F0, this.d1);
            this.w1();
            this.U0(false);
        }
    }
    
    @Override
    public final void M0() {
        super.M0();
        this.S1.a();
    }
    
    public final void M1(final boolean i) {
        if (this.i1 != i) {
            this.i1 = i;
            final DMConversationContentViewProvider.DMConversationContentViewProvider$f k2 = this.k2;
            if (k2 != null) {
                k2.o = i;
            }
            this.F1.d(i);
            this.k3.i = i;
            super.T0.invalidate();
        }
    }
    
    public final void N1(final boolean k1) {
        if (this.k1 != k1) {
            this.k1 = k1;
            this.F1.l(k1);
            super.T0.invalidate();
            this.R1();
        }
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        fai.z(2131689486, menu);
        return true;
    }
    
    @Override
    public final void O0(final i4e<lt6> i4e) {
        final int n = 0;
        this.x1 = false;
        final boolean z1 = this.z1(2);
        final long j1 = this.j1();
        final boolean b = this.F0() ^ true;
        super.O0(i4e);
        if (((y4e)this.v0()).a() == 0) {
            if (!dli.G(this.d1) && !this.N1 && !this.B1) {
                this.h1();
                this.N1 = true;
            }
            else if (this.v3 && !this.C1) {
                this.g1();
            }
        }
        else {
            ((ejg)n9t.z("dm:conversation_load", mag.f(), (u9h$b)u9h.j)).i();
            final String d1 = this.d1;
            if (d1 != null && !dli.G(d1)) {
                final t9j<zkg> y2 = this.Y2;
                final gob c0 = super.C0;
                final UserIdentifier f0 = super.F0;
                y2.d((kmm)new zkg((Context)c0, f0, this.d1, this.I2, u28.a(f0).M2()));
            }
            Label_0848: {
                if (!this.v3 && (this.w3 == -1L || !this.z3)) {
                    if (!this.z3) {
                        if (this.D1) {
                            this.D1 = false;
                            if (!this.u1) {
                                ((View)super.X0.H0.b).post((Runnable)new j01((Object)this, (Object)i4e, 5));
                            }
                        }
                        else {
                            final hr7 q1 = this.Q1;
                            final boolean c2 = q1.c;
                            if (!c2 && !q1.d && q1.b != null) {
                                if (!i4e.isEmpty()) {
                                    q1.c = true;
                                    if (q1.f <= 0) {
                                        lt6 lt7 = null;
                                        Label_0491: {
                                            if (!i4e.isEmpty()) {
                                                final lt6 lt6 = i4e.m(0);
                                                if (lt6 != null) {
                                                    int n2;
                                                    if (!lt6.e && lt6.h.F()) {
                                                        n2 = 1;
                                                    }
                                                    else {
                                                        n2 = 0;
                                                    }
                                                    final i4e$b i4e$b = new i4e$b((i4e)i4e);
                                                    while (i4e$b.hasNext()) {
                                                        lt7 = (lt6)((bgz)i4e$b).next();
                                                        if (n2 != 0 && lt7.e) {
                                                            break Label_0491;
                                                        }
                                                        if (lt7.e || !lt7.h.F()) {
                                                            continue;
                                                        }
                                                        n2 = 1;
                                                    }
                                                }
                                            }
                                            lt7 = null;
                                        }
                                        if (lt7 != null) {
                                            q1.e = lt7.h.getId();
                                            final Iterator e = o48.e((i4e)i4e, lt7.g);
                                            int b2;
                                            if (e != null) {
                                                b2 = o48.b(e, q1.a);
                                            }
                                            else {
                                                b2 = 0;
                                            }
                                            q1.f = b2;
                                            if (b2 > 0) {
                                                ((DMConversationContentViewProvider)((yga)q1.b).D0).F1.a();
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.M1) {
                                this.J1(this.M1 = false);
                            }
                            else if (this.Q1.a() && (c2 ^ true)) {
                                this.K1(this.v0().f());
                            }
                            else {
                                Label_0736: {
                                    if (z1) {
                                        if (this.j1() <= j1) {
                                            final lmv g2 = this.g2;
                                            if (g2 == null || !g2.f() || this.g2.g()) {
                                                break Label_0736;
                                            }
                                        }
                                        if (this.w3 == -1L) {
                                            this.J1(false);
                                            break Label_0848;
                                        }
                                    }
                                }
                                if (b) {
                                    this.E1();
                                }
                            }
                        }
                    }
                }
                else if (b) {
                    final long w3 = this.w3;
                    Objects.requireNonNull(i4e);
                    final i4e$b i4e$b2 = new i4e$b((i4e)i4e);
                    int n3 = 0;
                    while (true) {
                        while (i4e$b2.hasNext()) {
                            if (((lt6)((bgz)i4e$b2).next()).g == w3) {
                                if (n3 == -1) {
                                    break Label_0848;
                                }
                                super.X0.V1(n3, 0, false);
                                break Label_0848;
                            }
                            else {
                                ++n3;
                            }
                        }
                        n3 = -1;
                        continue;
                    }
                }
            }
            final xei v1 = this.V1;
            Objects.requireNonNull(v1);
            final Iterator e2 = o48.e((i4e)i4e, j1);
            int b3 = n;
            if (e2 != null) {
                if (!((i4e$b)e2).hasNext()) {
                    b3 = n;
                }
                else {
                    ((bgz)e2).next();
                    b3 = o48.b(e2, v1.a);
                }
            }
            if (b3 > 0 && (((DMConversationContentViewProvider)((ue8)v1.e).D0).z1(b3 + 2) ^ true) && !((View)v1.c).isShown()) {
                v1.c.e();
                if (v1.b && ((View)v1.d).isShown()) {
                    ((FloatingActionButton)v1.d).i();
                }
                saw.b((okm)new zf4(y38.c));
            }
            this.o1 = true;
            this.K2.a(2);
        }
        super.T0.invalidate();
        if (!this.f2) {
            this.v1();
        }
    }
    
    public final boolean O1() {
        final boolean k1 = this.k1;
        final boolean l1 = this.l1;
        final boolean h1 = this.h1;
        final int j0 = DMConversationComposerHostView.J0;
        boolean b = true;
        if (k1 || (!l1 && !h1) || this.i1 || dli.M(this.d1)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final void P0(final zmf zmf) {
        this.J1(false);
        final StringBuilder g = w48.g("Position restoration failed due to missing item position: ");
        g.append(zmf.a);
        e9a.d((Throwable)new IllegalStateException(g.toString()));
    }
    
    public final void P1(final boolean b) {
        super.X0.c2(b);
    }
    
    @Override
    public final void Q0(final Bundle bundle) {
        super.Q0(bundle);
        bundle.putParcelableArrayList("canceled_pending_attachments", new ArrayList((Collection<? extends E>)this.z2.C0.i));
        bundle.putParcelable("media_uri", (Parcelable)this.z2.C0.d);
        bundle.putByteArray("media_attachment", tkp.e((Object)this.z2.C0.g, (alp)wqg$a.b));
        final String currentComposerMessage = this.z2.getCurrentComposerMessage();
        if (currentComposerMessage != null) {
            ((BaseBundle)bundle).putString("message_text", currentComposerMessage);
        }
        ((n8r)new DMConversationContentViewProvider$SavedState(this)).saveToBundle(bundle);
    }
    
    public final void Q1() {
        saw.b((okm)this.p1("report"));
        final sjm sjm = new sjm();
        sjm.s("reportdmconversation");
        sjm.m(this.d1);
        sjm.r();
        if (!this.i1) {
            sjm.t(this.y1);
        }
        this.d3.d(sjm);
    }
    
    @Override
    public final void R0() {
        this.K2.a(4);
        final lmv g2 = this.g2;
        if (g2 != null) {
            final qmv i = g2.i;
            if (i != null && i.d != null) {
                i.o = false;
            }
            this.g2 = null;
        }
        final kq6 f1 = this.F1;
        if (f1 != null) {
            f1.b(null);
        }
        final zj7 h2 = this.h2;
        if (h2 != null) {
            ((u29)h2).dispose();
            this.h2 = null;
        }
        final ak7 i2 = this.i2;
        if (i2 != null) {
            ((u29)i2).dispose();
            this.i2 = null;
        }
        final zml<String> j2 = this.j2;
        if (j2 != null) {
            j2.onComplete();
            this.j2 = null;
        }
        final DMConversationContentViewProvider.DMConversationContentViewProvider$f k2 = this.k2;
        if (k2 != null) {
            ((i1g)k2).a();
        }
        this.f2 = false;
        ((Dialog)this.u2).dismiss();
        final b81 h3 = super.H0;
        if (h3.G0.b()) {
            h3.e();
        }
    }
    
    public final void R1() {
        final DMConversationComposerHostView z2 = this.z2;
        final boolean k1 = this.k1;
        final boolean l1 = this.l1;
        final boolean h1 = this.h1;
        final boolean i1 = this.i1;
        final boolean d2 = this.d2;
        final boolean s1 = this.s1;
        final jp7 b1 = this.b1;
        boolean b2 = false;
        final boolean a1 = b1 != null && b1.s;
        if (k1) {
            z2.b(2);
        }
        else if (!l1 && !h1) {
            final UntrustedConversationComposer f0 = z2.F0;
            boolean b3;
            if (f0.Z0 != i1) {
                f0.Z0 = i1;
                b3 = true;
            }
            else {
                b3 = false;
            }
            if (f0.a1 != a1) {
                f0.a1 = a1;
                b2 = true;
            }
            if (b3 || b2) {
                f0.z();
            }
            z2.b(1);
        }
        else if (d2 && !s1) {
            z2.b(3);
        }
        else {
            z2.b(0);
        }
    }
    
    @Override
    public final void S0() {
        final DMConversationComposerHostView z2 = this.z2;
        if (z2 != null) {
            final x99 x99 = new x99(z2.E0.getMessageText(), this.f1);
            final dw0 a = dw0.a();
            final y1w y1w = new y1w((Context)super.C0, super.F0, this.d1, x99);
            Objects.requireNonNull(a);
            a.d((cw0<Object>)new cw0((fw0)y1w));
        }
        this.S1.b();
        this.t1();
        super.S0();
    }
    
    public final void S1(final jp7 b1, final boolean b2) {
        if (w4j.a((Object)this.b1, (Object)b1) && !b2) {
            return;
        }
        if (!b2) {
            this.b1 = b1;
            this.L1(b1.a);
        }
        this.M1(b1.g);
        final boolean l = b1.l;
        final boolean o = b1.o;
        if (this.l1 != l) {
            this.l1 = l;
            this.m1 = o;
            this.F1.c(l);
            super.T0.invalidate();
        }
        this.R1();
        super.T0.invalidate();
        this.W1();
        this.F1.k(b1.d);
        final jp7 b3 = this.b1;
        if (b3 != null && b3.l && !b3.j) {
            final an7 v2 = this.v2;
            final long p2 = b1.p;
            Objects.requireNonNull(v2);
            if (p2 > 0L && v2.b < 0L) {
                v2.b = p2;
            }
        }
        this.N1(b1.j);
        final boolean t1 = this.T1;
        final long n = -1L;
        if (!t1) {
            this.T1 = true;
            if (this.k1) {
                final zwj zwj = (zwj)hr4.q(b1.h);
                long c0;
                if (zwj != null) {
                    c0 = zwj.C0;
                }
                else {
                    c0 = -1L;
                }
                this.n0(((omm)new rf3(this.r0(), super.F0, this.I2)).S((Object)new rf3$a(c0)).G((fk6)new wi7(this, 0), (fk6)jvb.e));
            }
        }
        if (this.w2.d(b1)) {
            final p w0 = this.w0();
            ubc r3;
            if ((r3 = (ubc)w0.H("VoiceMessageEducationDialog")) == null) {
                r3 = this.r3;
                ((cl1)r3).e2(w0, "VoiceMessageEducationDialog");
            }
            ((cl1)r3).Q1 = (jw8)new aj7(this);
            final int a = w4j.a;
            ((cl1)r3).T1 = (mw8)new bj7((Object)this, 0);
        }
        final hfv o2 = this.o1();
        long c2 = n;
        if (o2 != null) {
            c2 = o2.C0;
        }
        this.y1 = c2;
    }
    
    public final void T1(final wqg wqg) {
        final int a = wqg.a;
        boolean b = true;
        if (a != 0) {
            if (a != 1) {
                this.z2.C0.f = false;
                this.F1();
                if (this.D0()) {
                    String s;
                    if (wqg.a == 4) {
                        s = djr.g(this.r0());
                    }
                    else {
                        s = this.z0().getString(2131954813);
                    }
                    p88.f().e((CharSequence)s, 1);
                }
            }
            else {
                this.z2.C0.h(wqg);
            }
        }
        else if (!((HashSet)this.z2.C0.i).remove(wqg.b.E0)) {
            final d c0 = this.z2.C0;
            c0.f = false;
            if (!c0.d() || c0.e != c0.d) {
                b = false;
            }
            final d c2 = this.z2.C0;
            c2.d = null;
            c2.h(wqg);
            if (this.y1()) {
                this.E1();
            }
            if (b) {
                this.C1(this.z2.E0.getMessageText().trim(), null, null);
            }
        }
    }
    
    public final void U(final long n, final String s) {
        final j99 j99 = ((Map)this.L1.E0).remove(s);
        if (j99 != null) {
            j99.c((j99)null);
        }
        final oei oei = ((Map)this.L1.D0).get(s);
        if (oei != null) {
            ((cw0)oei).H(true);
        }
        xw0.c((rj)new lj7(this, new WeakReference((T)super.C0), super.F0, n));
        if (this.c1.contains(s)) {
            p88.f().b(2131955033, 0);
        }
    }
    
    @Override
    public final void U0(final boolean b) {
        super.U0(b);
        this.E1.a();
    }
    
    public final void U1() {
        if (this.v3) {
            final long x3 = this.x3;
            if (x3 != -1L) {
                final long y3 = this.y3;
                if (y3 != -1L) {
                    f.h(this.t3.S((Object)new ov6(x3, y3)).y(h6q.L()), (u93)new nj7(this, 1));
                }
            }
        }
    }
    
    public final void V1(final jp7 jp7) {
        final String text = (String)this.n3.a((Object)jp7);
        if (pjr.g((CharSequence)text)) {
            this.r2.setText((CharSequence)text);
        }
        final String c = jp7.c;
        final boolean g = pjr.g((CharSequence)c);
        if (g) {
            this.s2.setText((CharSequence)c);
        }
        final TextView s2 = this.s2;
        int visibility;
        if (g) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)s2).setVisibility(visibility);
    }
    
    public final void W1() {
        final jp7 b1 = this.b1;
        if (b1 != null && this.p1) {
            this.V1(b1);
            final jp7 b2 = this.b1;
            final boolean i = o48.i(b2.g, b2.h);
            final View t2 = this.t2;
            int visibility;
            if (i) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            t2.setVisibility(visibility);
        }
    }
    
    public final void a0(final uxl uxl) {
        final UserIdentifier f0 = super.F0;
        this.O2.d((kmm)new qo8(f0, this.r0(), uxl, this.I2, u28.a(f0).p7()));
    }
    
    @Override
    public final void c1() {
        if (!this.v3) {
            super.c1();
        }
    }
    
    public final void d1() {
        if (pjr.g((CharSequence)this.f1)) {
            final om7 m = u28.a(super.F0).M();
            final w99 o3 = this.o3;
            final String f1 = this.f1;
            Objects.requireNonNull(o3);
            Object o4;
            if (pjr.g((CharSequence)f1)) {
                o4 = o3.b.a(f1, o3.a);
            }
            else {
                o4 = sz5.C0;
            }
            this.n0(((iz5)new qz5((h06)((iz5)o4).n(yvo.c()).d((h06)iz5.k((rj)new ti7((Object)this, (Object)m, 0))), (rj)new ut1((Object)this, 7))).p());
        }
    }
    
    public final int d2(final fai fai) {
        final MenuItem item = fai.findItem(2131430005);
        pf8.r(item);
        final MenuItem menuItem = item;
        int title;
        if (this.i1) {
            title = 2131953211;
        }
        else {
            title = 2131953212;
        }
        menuItem.setTitle(title);
        return 2;
    }
    
    public final void e(final lk1 c) {
        final jp7 b1 = this.b1;
        final String m1 = this.m1();
        final String c2 = c.C();
        final int r2 = ho8.r2;
        final go8 go8 = new go8();
        ((xil$a)go8).H(2131953077);
        ((xil$a)go8).A(2131953075);
        ((xil$a)go8).F(2131953054);
        ((xil$a)go8).C(2131952375);
        go8.c = c;
        go8.d = (ho8$a)this;
        go8.e = b1;
        go8.f = m1;
        go8.g = c2;
        final ho8 ho8 = (ho8)((dl1$a)go8).w();
        ((cl1)ho8).k2((Fragment)super.D0);
        ((cl1)ho8).e2(this.A0(), (String)null);
    }
    
    public final void e0() {
        final RecyclerView b = super.X0.H0.b;
        if (b instanceof RecyclerView) {
            b.setLayoutFrozen(false);
        }
    }
    
    public final void e1() {
        if (this.v3) {
            this.v3 = false;
            this.W1 = false;
            this.c1();
            this.f1();
        }
    }
    
    public final void f1() {
        if (this.v3) {
            return;
        }
        final uom h1 = this.H1;
        this.n0(h1.a().w((qtb)new tom((Object)h1, (Object)this.d1, 0)).G((fk6)new j0p((Object)this, 10), (fk6)jvb.e));
    }
    
    public final void g1() {
        if (!this.e2) {
            final String d1 = this.d1;
            if (d1 != null) {
                if (this.v3) {
                    if (!this.r1) {
                        this.r1 = true;
                    }
                    this.D1 = false;
                    final long y3 = this.y3;
                    ul7 ul7;
                    if (y3 == -1L) {
                        ul7 = this.s3.a(d1, this.x3, Integer.valueOf(10));
                    }
                    else {
                        ul7 = this.s3.a(d1, y3, (Integer)null);
                    }
                    super.X0.b2(true);
                    this.C1 = true;
                    this.W2.d((kmm)ul7);
                }
            }
        }
    }
    
    public final void h1() {
        if (!this.e2 && this.d1 != null) {
            if (!this.W1) {
                if (!this.q1) {
                    this.q1 = true;
                    if (!this.Y1) {
                        this.D1 = true;
                    }
                }
                final x28 a = u28.a(super.F0);
                final gob c0 = super.C0;
                final UserIdentifier f0 = super.F0;
                final String d1 = this.d1;
                final um7 i2 = this.I2;
                final cu6 s7 = a.s7();
                long x3;
                if (this.v3) {
                    x3 = this.x3;
                }
                else {
                    x3 = -1L;
                }
                final jk7 jk7 = new jk7((Context)c0, f0, d1, i2, s7, x3);
                this.P1(true);
                this.B1 = true;
                this.V2.d((kmm)jk7);
            }
        }
    }
    
    public final void i() {
        this.Q1.d = true;
        this.t1();
    }
    
    public final kk7 i1() {
        return new kk7(((Fragment)super.D0).I0);
    }
    
    public final void j(final lk1 lk1, final String s) {
        final lcv<T> x0 = super.X0;
        final View b = x0.H0.b(x0.I1(((ls6)lk1).getId()));
        if (b == null) {
            return;
        }
        final Rect a = r6h.Companion.a(b.findViewById(2131427655), b.findViewById(2131427961));
        final sn1 e2 = this.E2;
        if (e2 != null) {
            ((cw8)e2).Z1(false, false);
        }
        this.G1.b(lk1, a, ((ls6)lk1).B(super.F0.getId()), s, "long_press_menu");
    }
    
    public final long j1() {
        lt6 lt6;
        if (this.F0()) {
            lt6 = (lt6)hr4.y((Iterable)this.v0().f());
        }
        else {
            lt6 = null;
        }
        if (lt6 == null) {
            return 0L;
        }
        return lt6.g;
    }
    
    public final long k1(final boolean b, long n, final long n2) {
        if (n2 == -1L) {
            return n;
        }
        if (n == -1L) {
            return n2;
        }
        if (b) {
            n = Math.min(n, n2);
        }
        else {
            n = Math.max(n, n2);
        }
        return n;
    }
    
    public final void l0(final Dialog dialog, final int n, final int n2) {
        if (n == 11 && n2 == -1) {
            final hfv o1 = this.o1();
            if (o1 != null) {
                this.Z2.d((kmm)new z12(this.r0(), super.F0, o1.C0, (hil)null, 1));
                this.N1(true);
            }
        }
    }
    
    public final uxl l1(final lk1<? extends lk1.b> lk1) {
        final List e = hr4.e((Iterable)lk1.j(), (otk)new g7c(super.F0, 1));
        uxl uxl;
        if (!e.isEmpty()) {
            uxl = e.get(e.size() - 1);
        }
        else {
            uxl = null;
        }
        return uxl;
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        lcv$b.c = 2131624303;
        lcv$b.a = "dm_conversation";
        lcv$b.f = 2131624724;
        lcv$b.k = false;
        lcv$b.d = 2131624304;
        return lcv$b;
    }
    
    public final String m1() {
        final jp7 b1 = this.b1;
        if (b1 != null && !b1.g && this.o1() != null) {
            return o48.d(this.o1().H1);
        }
        return "not_applicable";
    }
    
    public final void o(final yf6 yf6, final lk1<? extends lk1.b> lk1) {
        final uxl l1 = this.l1(lk1);
        if (l1 != null && yf6.b.equals(l1.g.a)) {
            this.a0(l1);
        }
        else {
            final UserIdentifier f0 = super.F0;
            this.P2.d((kmm)new l57(f0, lk1.k(), ((ls6)lk1).getConversationId(), yf6.b, u28.a(f0).p7(), this.I2, this.b1, this.j1, this.m1(), lk1.C(), this.D2));
        }
    }
    
    public final hfv o1() {
        final jp7 b1 = this.b1;
        if (b1 != null && !b1.g) {
            return (hfv)hr4.q(o48.f(b1.h, super.F0.getId()));
        }
        return null;
    }
    
    public final zf4 p1(String j0) {
        final zf4 zf4 = new zf4(super.F0);
        zf4.T = nca.e((sba)DMConversationContentViewProvider.B3, j0).toString();
        final int a = w4j.a;
        zf4.w0 = this.d1;
        zf4.C0 = this.b1.h.size();
        zf4.B0 = (this.i1 ? 1 : 0);
        zf4.I0 = this.m1();
        zf4.M0 = "request_action_sheet";
        if (this.b1.o) {
            j0 = "low_quality";
        }
        else {
            j0 = "request";
        }
        zf4.J0 = j0;
        zf4.y = this.z1;
        return zf4;
    }
    
    @Override
    public final boolean q(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131430005) {
            final rnd d0 = super.D0;
            final Intent intent = new Intent((Context)super.C0, (Class)DMConversationSettingsActivity.class);
            final Bundle w = zi.w("intent_type", 2);
            ((BaseBundle)w).putString("conversation_id", this.d1);
            final int a = w4j.a;
            yvj.k(w, "inbox_item", (Object)this.b1, (alp)jp7.w);
            ((BaseBundle)w).putLongArray("participant_ids", this.A1);
            ((BaseBundle)w).putInt("inbox_item_position", this.z1);
            ((Fragment)d0).W1(intent.putExtras(((zl1)new kk7(w)).a), 8, (Bundle)null);
            return true;
        }
        return false;
    }
    
    public final void q1() {
        final lo7 lo7 = (lo7)r9x.h((Activity)super.C0, (Class)lo7.class);
        pf8.r(lo7);
        lo7.n0();
        this.e2 = true;
        final DMConversationComposerHostView z2 = this.z2;
        if (z2 != null) {
            z2.E0.d();
        }
        if (this.D0()) {
            ((Activity)super.C0).finish();
        }
    }
    
    public final void r1(final SendDMRequest sendDMRequest) {
        final tsc t = ((ksc)sendDMRequest).T();
        final boolean b = !t.b && f1v.a((tsc<?, ?>)t, 326);
        if (!sendDMRequest.m0()) {
            final j28 a = j28.A(((g4w)sendDMRequest).f0(), super.a1);
            String a2;
            if (t.b) {
                a2 = "dm:send_success";
            }
            else {
                a2 = "dm:send_failure";
            }
            ((u9h)a).a = a2;
            ((ejg)a).i();
        }
        if (t.b) {
            final xsc d = t.d();
            int a3;
            if (d != null) {
                a3 = d.a;
            }
            else {
                a3 = 0;
            }
            if (a3 != 200) {
                if (a3 == 202) {
                    final xrc f = t.f;
                    String j;
                    if (f == null) {
                        j = null;
                    }
                    else {
                        j = f.j("retry-after");
                    }
                    final long o = pjr.o(j, 0L);
                    if (o > 0L) {
                        this.l2.postDelayed((Runnable)new rpb((Object)this, (Object)sendDMRequest, 7), o * 1000L);
                    }
                }
            }
            else {
                final String f2 = sendDMRequest.f1;
                if (f2 != null) {
                    this.L1(f2);
                }
                final Object g = t.g;
                pf8.r(g);
                final int a4 = w4j.a;
                final tei tei = (tei)g;
                final x47 f3 = tei.f();
                if (f3 != null) {
                    this.c1.remove(f3.l);
                    this.F1.a();
                }
                if (!tei.e.isEmpty()) {
                    int n;
                    if (((fn7)tei).b.isEmpty()) {
                        n = 2131953191;
                    }
                    else {
                        n = 2131953192;
                    }
                    p88.f().b(n, 0);
                }
                if (this.v1) {
                    if (this.b1 != null) {
                        final Intent intent = new Intent();
                        yvj.c(intent, "extra_dm_inbox_item", (Object)this.b1, (alp)jp7.w);
                        if (this.D0()) {
                            ((Activity)super.C0).setResult(-1, intent);
                        }
                    }
                    this.q1();
                }
                else {
                    this.f1();
                }
            }
        }
        else if (!b) {
            final int c = t.c;
            if (c != 400) {
                if (c != 420 && c != 429) {
                    if (c != 403) {
                        if (c != 404) {
                            final t4g h1 = sendDMRequest.h1;
                            long c2;
                            if (h1 == null) {
                                c2 = -1L;
                            }
                            else {
                                c2 = h1.c;
                            }
                            if (!((cw0)sendDMRequest).N() && c2 != -1L) {
                                final boolean b2 = sendDMRequest instanceof wsm;
                                if (this.n1 || b2) {
                                    final xil$b xil$b = new xil$b(774);
                                    ((xil$a)xil$b).H(2131953121);
                                    ((xil$a)xil$b).A(2131955821);
                                    ((xil$a)xil$b).F(2131957162);
                                    ((xil$a)xil$b).C(2131952375);
                                    final cl1 w = ((dl1$a)xil$b).w();
                                    w.T1 = (mw8)new dj7(this, c2);
                                    final int a5 = w4j.a;
                                    w.l2(this.A0());
                                    this.n1 = false;
                                }
                            }
                        }
                        else {
                            p88.f().b(2131953253, 0);
                        }
                    }
                    else {
                        final Set g2 = sendDMRequest.g1;
                        if (g2 == null) {
                            p88.f().b(2131953248, 0);
                        }
                        else if (g2.contains(349)) {
                            p88.f().b(2131953255, 0);
                            this.N1(true);
                        }
                        else if (g2.contains(150)) {
                            p88.f().b(2131953256, 0);
                            this.N1(true);
                        }
                        else if (g2.contains(226)) {
                            p88.f().b(2131953202, 0);
                        }
                        else if (g2.contains(344)) {
                            c4c.a().b((ContentViewArgs)RateLimitDialogContentViewArgs.INSTANCE);
                        }
                        else if (g2.contains(354)) {
                            p88.f().b(2131953252, 0);
                        }
                        else {
                            p88.f().b(2131953248, 0);
                        }
                    }
                }
                else {
                    p88.f().b(2131953254, 0);
                }
            }
            else {
                p88.f().b(2131953248, 0);
            }
        }
    }
    
    public final boolean s1() {
        return this.F0() && ((y4e)this.v0()).a() > 0;
    }
    
    public final void t1() {
        this.z2.E0.i(true);
    }
    
    public final void u1(final wqg wqg, final Uri uri, final String s, final boolean b, final Collection<Uri> collection, final rx0 rx0, final w99 w99) {
        if (this.U1) {
            final DMConversationMessageComposer e0 = this.z2.E0;
            final View r0 = e0.R0;
            if (r0 != null) {
                r0.setVisibility(0);
                e0.R0.setOnClickListener((View$OnClickListener)e0);
            }
        }
        this.z2.D0 = new yqg((Context)super.C0, (on)new cg8((Object)this, 17), "dm_composition", l1h.N0, super.F0, super.S0, super.O0, 1);
        final DMConversationComposerHostView z2;
        z2.C0 = new d((d.b)(z2 = this.z2).E0, (d.a)new DMConversationContentViewProvider$a(this, rx0, w99), rx0, wqg, uri, collection, ((kk1)this.i1()).k());
        new Handler(Looper.getMainLooper()).post((Runnable)new j0l((Object)this, (Object)s, b, 1));
        final Context r2 = this.r0();
        final String[] t2 = ixb.t2;
        final boolean a = mxb.a(r2);
        if (!a && this.z2.C0.d()) {
            this.i3.d(this.B1(2131954188, "media", ixb.t2));
        }
        final d c0 = this.z2.C0;
        if (c0.d()) {
            if (a) {
                c0.b();
            }
            if (!((com.twitter.media.ui.image.d)((DMConversationMessageComposer)c0.a).V0).f1) {
                c0.g(null);
            }
        }
        else {
            final wqg g = c0.g;
            if (g != null && !c0.f) {
                c0.a(g);
            }
        }
    }
    
    public final void v1() {
        if (dta.c().b("livepipeline_client_enabled", true) && dta.c().b("livepipeline_dm_features_enabled", true)) {
            final String d1 = this.d1;
            if (d1 != null && !dli.G(d1) && this.F0()) {
                final DMConversationContentViewProvider.DMConversationContentViewProvider$f k2 = new DMConversationContentViewProvider.DMConversationContentViewProvider$f();
                this.k2 = k2;
                k2.o = this.i1;
                this.g2 = new lmv(new hn6(this.r0().getContentResolver()), this.d1, (kmv)this.k2, this.g1);
                if (this.A1 != null) {
                    n9q.v((Object)new WeakReference(this.g2)).y(yvo.c()).G((fk6)new i0p((Object)this, 14), (fk6)jvb.e);
                }
                if (this.g1 != null) {
                    final lmv g2 = this.g2;
                    Objects.requireNonNull(g2);
                    final ijf h = ijf.H();
                    final Iterator iterator = g2.a.a.keySet().iterator();
                    while (iterator.hasNext()) {
                        h.p((Object)g2.j((UserIdentifier)iterator.next()));
                    }
                    final Iterator iterator2 = ((List)((h4j)h).e()).iterator();
                    while (iterator2.hasNext()) {
                        this.n0((j29)iterator2.next());
                    }
                    this.g1 = null;
                }
                this.F1.b(this.g2);
                this.h2 = new zj7(this);
                this.n0((j29)cfk.a().d(this.d1).filter((ptk)new ij7(this)).observeOn(h6q.L()).subscribeWith((wbj)this.h2));
                this.i2 = new ak7(this);
                this.n0((j29)cfk.a().b(this.d1).filter((ptk)new fj7(this)).observeOn(h6q.L()).subscribeWith((wbj)this.i2));
                final zml j2 = new zml();
                this.j2 = (zml<String>)j2;
                this.n0(((b5j)j2).throttleFirst(2000L, TimeUnit.MILLISECONDS).subscribe((fk6)new xi7(this, 1)));
                this.f2 = true;
            }
        }
    }
    
    public final void w1() {
        if (!this.o2) {
            final String d1 = this.d1;
            if (d1 != null) {
                final qt6 e1 = this.E1;
                e1.a.H0 = d1;
                e1.b.H0 = d1;
                e1.d.G0 = d1;
                e1.a();
                this.o2 = true;
            }
        }
    }
    
    public final void x1() {
        this.z2.E0.setRecordAudioController(this.k3);
    }
    
    public final boolean y1() {
        return this.z1(8);
    }
    
    public final void z(final String s) {
        final j99 j99 = ((Map)this.L1.E0).remove(s);
        if (j99 != null) {
            j99.c((j99)null);
        }
        this.Q1.d = true;
    }
    
    public final boolean z1(final int n) {
        final k6m h0 = super.X0.H0;
        final int count = h0.getCount();
        final int d = h0.d();
        final k6m$c m = h0.m;
        boolean b = false;
        int size;
        if (m != null) {
            size = m.H0.size();
        }
        else {
            size = 0;
        }
        final int n2 = count - d - size;
        int n3;
        if (n2 == 0) {
            n3 = 0;
        }
        else {
            final lcv<T> x0 = super.X0;
            int c = x0.E1().c;
            final int n4 = ((ViewGroup)x0.H0.b).getChildCount() + c - 1;
            new(zmf.class)();
            final k6m h2 = x0.H0;
            if (n4 <= x0.F1()) {
                c = n4;
            }
            h2.t(c);
            n3 = n2 - n4;
        }
        if (n3 <= n) {
            b = true;
        }
        return b;
    }
}
