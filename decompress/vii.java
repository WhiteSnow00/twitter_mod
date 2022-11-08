import okhttp3.HttpUrl$Builder;
import android.net.Uri;
import okhttp3.HttpUrl;
import java.util.Objects;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.TextView;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.ViewFlipper;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vii implements okx<lji, tii, qii>
{
    public final View C0;
    public final gz8 D0;
    public final nw8 E0;
    public final mbi<?> F0;
    public final rii G0;
    public final bwm H0;
    public final ViewFlipper I0;
    public final View J0;
    public final HorizonComposeButton K0;
    public final HorizonComposeButton L0;
    public final TextView M0;
    public final TextView N0;
    public final View O0;
    public final mhh<lji> P0;
    
    public vii(final View c0, final Context context, final gz8 d0, final nw8 e0, final mbi<?> f0, final rii g0, final bwm h0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)context, "context");
        zzd.f((Object)d0, "disclaimerSpanFactory");
        zzd.f((Object)e0, "dialogNavigationDelegate");
        zzd.f((Object)f0, "navigator");
        zzd.f((Object)g0, "logger");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (ViewFlipper)c0.findViewById(2131432596);
        this.J0 = c0.findViewById(2131432419);
        final View viewById = c0.findViewById(2131428400);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026your_subscription_button)");
        this.K0 = (HorizonComposeButton)viewById;
        final View viewById2 = c0.findViewById(2131430893);
        zzd.e((Object)viewById2, "rootView.findViewById(R.id.read_sample_button)");
        this.L0 = (HorizonComposeButton)viewById2;
        this.M0 = (TextView)c0.findViewById(2131431784);
        this.N0 = (TextView)c0.findViewById(2131428974);
        final View viewById3 = c0.findViewById(2131430775);
        zzd.e((Object)viewById3, "rootView.findViewById<View>(R.id.progress_bar)");
        this.O0 = viewById3;
        this.P0 = (mhh<lji>)ajy.a0((rtb)new vii$b(this));
        final ViewParent parent = c0.getParent();
        zzd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.y((FrameLayout)((View)parent).findViewById(2131428647));
        zzd.e((Object)y, "from(bottomSheet)");
        y.H(3);
        y.t((BottomSheetBehavior.BottomSheetBehavior$c)new wii((BottomSheetBehavior)y));
    }
    
    public final void T(final oax oax) {
        final lji lji = (lji)oax;
        zzd.f((Object)lji, "state");
        this.P0.b((Object)lji);
    }
    
    public final void s(Object o) {
        final qii qii = (qii)o;
        zzd.f((Object)qii, "effect");
        final boolean b = qii instanceof qii$c;
        String value = "";
        if (b) {
            final bwm h0 = this.H0;
            final String a = ((qii$c)qii).a;
            Objects.requireNonNull(h0);
            if (a != null) {
                final HttpUrl parse = HttpUrl.Companion.parse(a);
                HttpUrl build = null;
                Label_0104: {
                    if (parse != null) {
                        final HttpUrl$Builder builder = parse.newBuilder();
                        if (builder != null) {
                            final HttpUrl$Builder addQueryParameter = builder.addQueryParameter("client", "Android");
                            if (addQueryParameter != null) {
                                final HttpUrl$Builder addQueryParameter2 = addQueryParameter.addQueryParameter("element", "read-sample-issue");
                                if (addQueryParameter2 != null) {
                                    build = addQueryParameter2.build();
                                    break Label_0104;
                                }
                            }
                        }
                    }
                    build = null;
                }
                value = String.valueOf(build);
            }
            final mbi<?> f0 = this.F0;
            final Uri parse2 = Uri.parse(value);
            zzd.e((Object)parse2, "parse(sampleUrlWithMapping)");
            f0.d((zm)new dmx(parse2));
        }
        else if (!(qii instanceof qii$a)) {
            if (qii instanceof qii$b) {
                final mbi<?> f2 = this.F0;
                final Uri parse3 = Uri.parse(((qii$b)qii).a);
                zzd.e((Object)parse3, "parse(effect.profileUrl)");
                f2.d((zm)new dmx(parse3));
            }
            else if (qii instanceof qii$j) {
                this.E0.U(-1);
                final d5s$a d5s$a = new d5s$a();
                d5s$a.e = (nfd$c)nfd$c$c.b;
                d5s$a.q(32);
                d5s$a.s(2131957244);
                d5s$a.r("");
                egd.Companion.b((zfd)((h4j)d5s$a).e());
            }
            else if (qii instanceof qii$e) {
                final rii g0 = this.G0;
                final qii$e qii$e = (qii$e)qii;
                final String a2 = qii$e.a;
                final hfv b2 = qii$e.b;
                final oii c = qii$e.c;
                final jev d = qii$e.d;
                Objects.requireNonNull(g0);
                zzd.f((Object)a2, "id");
                zzd.f((Object)b2, "profileUser");
                zzd.f((Object)c, "newsletterSource");
                if (zzd.a((Object)c.C0, (Object)"twitter-profile")) {
                    final zf4 zf4 = new zf4(nca.Companion.e("profile", "profile_modules", "newsletter_subscribe", "subscribe_btn", "click"));
                    zf4.i((szo)g0.a.e(a2, b2, c));
                    saw.b((okm)zf4);
                }
                else {
                    final nca$a companion = nca.Companion;
                    String d2 = null;
                    Label_0434: {
                        if (d != null) {
                            d2 = ((vyo)d).d;
                            if (d2 != null) {
                                break Label_0434;
                            }
                        }
                        d2 = "";
                    }
                    String e = null;
                    Label_0456: {
                        if (d != null) {
                            e = ((vyo)d).e;
                            if (e != null) {
                                break Label_0456;
                            }
                        }
                        e = "";
                    }
                    o = new zf4(companion.e(d2, e, "newsletter_subscribe", "subscribe_btn", "click"));
                    ((d0p)o).i((szo)g0.a.e(a2, b2, c));
                    saw.b((okm)o);
                }
            }
            else if (qii instanceof qii$d) {
                final rii g2 = this.G0;
                final qii$d qii$d = (qii$d)qii;
                final String a3 = qii$d.a;
                final hfv b3 = qii$d.b;
                final String c2 = qii$d.c;
                final oii d3 = qii$d.d;
                final jev e2 = qii$d.e;
                Objects.requireNonNull(g2);
                zzd.f((Object)a3, "id");
                zzd.f((Object)b3, "profileUser");
                zzd.f((Object)d3, "newsletterSource");
                final boolean a4 = zzd.a((Object)d3.C0, (Object)"twitter-profile");
                final int n = 0;
                boolean b4 = false;
                if (a4) {
                    if (c2 == null || c2.length() == 0) {
                        b4 = true;
                    }
                    if (!b4) {
                        value = c2;
                    }
                    final zf4 zf5 = new zf4(nca.Companion.e("profile", "profile_modules", "newsletter_subscribe", "sample_issue", "click"));
                    final lev$a lev$a = new lev$a();
                    lev$a.a = Long.parseLong(a3);
                    lev$a.T0 = tdy.d0(b3.H1);
                    lev$a.S0 = tdy.e0(b3.H1);
                    lev$a.t = value;
                    o = new nii$a();
                    ((nii$a)o).o(d3.C0);
                    lev$a.i1 = (nii)((h4j)o).e();
                    zf5.i((szo)((h4j)lev$a).e());
                    saw.b((okm)zf5);
                }
                else {
                    int n2 = 0;
                    Label_0785: {
                        if (c2 != null) {
                            n2 = n;
                            if (c2.length() != 0) {
                                break Label_0785;
                            }
                        }
                        n2 = 1;
                    }
                    String t = c2;
                    if (n2 != 0) {
                        t = "";
                    }
                    final nca$a companion2 = nca.Companion;
                    String d4 = null;
                    Label_0824: {
                        if (e2 != null) {
                            d4 = ((vyo)e2).d;
                            if (d4 != null) {
                                break Label_0824;
                            }
                        }
                        d4 = "";
                    }
                    String e3 = null;
                    Label_0851: {
                        if (e2 != null) {
                            e3 = ((vyo)e2).e;
                            if (e3 != null) {
                                break Label_0851;
                            }
                        }
                        e3 = "";
                    }
                    final zf4 zf6 = new zf4(companion2.e(d4, e3, "newsletter_subscribe", "sample_issue", "click"));
                    final lev$a lev$a2 = new lev$a();
                    lev$a2.a = Long.parseLong(a3);
                    lev$a2.T0 = tdy.d0(b3.H1);
                    lev$a2.S0 = tdy.e0(b3.H1);
                    final nii$a nii$a = new nii$a();
                    nii$a.o(d3.C0);
                    lev$a2.i1 = (nii)((h4j)nii$a).e();
                    lev$a2.t = t;
                    zf6.i((szo)((h4j)lev$a2).e());
                    saw.b((okm)zf6);
                }
            }
            else if (qii instanceof qii$g) {
                final rii g3 = this.G0;
                final qii$g qii$g = (qii$g)qii;
                final String a5 = qii$g.a;
                final hfv b5 = qii$g.b;
                final oii c3 = qii$g.c;
                final jev d5 = qii$g.d;
                Objects.requireNonNull(g3);
                zzd.f((Object)a5, "id");
                zzd.f((Object)b5, "profileUser");
                zzd.f((Object)c3, "newsletterSource");
                if (zzd.a((Object)c3.C0, (Object)"twitter-profile")) {
                    final zf4 zf7 = new zf4(nca.Companion.e("profile", "profile_modules", "newsletter_subscribe", "", "impression"));
                    zf7.i((szo)g3.a.e(a5, b5, c3));
                    saw.b((okm)zf7);
                }
                else {
                    final nca$a companion3 = nca.Companion;
                    String d6 = null;
                    Label_1152: {
                        if (d5 != null) {
                            d6 = ((vyo)d5).d;
                            if (d6 != null) {
                                break Label_1152;
                            }
                        }
                        d6 = "";
                    }
                    String e4 = null;
                    Label_1174: {
                        if (d5 != null) {
                            e4 = ((vyo)d5).e;
                            if (e4 != null) {
                                break Label_1174;
                            }
                        }
                        e4 = "";
                    }
                    o = new zf4(companion3.e(d6, e4, "newsletter_subscribe", "", "impression"));
                    ((d0p)o).i((szo)g3.a.e(a5, b5, c3));
                    saw.b((okm)o);
                }
            }
            else if (qii instanceof qii$f) {
                final rii g4 = this.G0;
                final qii$f qii$f = (qii$f)qii;
                g4.a(qii$f.a, qii$f.b, qii$f.c, qii$f.d);
            }
            else if (qii instanceof qii$h) {
                final rii g5 = this.G0;
                final qii$h qii$h = (qii$h)qii;
                final String a6 = qii$h.a;
                final oii b6 = qii$h.b;
                final jev c4 = qii$h.c;
                Objects.requireNonNull(g5);
                zzd.f((Object)a6, "id");
                zzd.f((Object)b6, "newsletterSource");
                if (zzd.a((Object)b6.C0, (Object)"twitter-profile")) {
                    final zf4 zf8 = new zf4(nca.Companion.e("profile", "profile_modules", "newsletter_subscribe", "success_msg", "impression"));
                    final lev$a lev$a3 = new lev$a();
                    lev$a3.a = Long.parseLong(a6);
                    final nii$a nii$a2 = new nii$a();
                    nii$a2.o(b6.C0);
                    lev$a3.i1 = (nii)((h4j)nii$a2).e();
                    zf8.i((szo)((h4j)lev$a3).e());
                    saw.b((okm)zf8);
                }
                else {
                    final nca$a companion4 = nca.Companion;
                    String d7 = null;
                    Label_1456: {
                        if (c4 != null) {
                            d7 = ((vyo)c4).d;
                            if (d7 != null) {
                                break Label_1456;
                            }
                        }
                        d7 = "";
                    }
                    String e5 = null;
                    Label_1478: {
                        if (c4 != null) {
                            e5 = ((vyo)c4).e;
                            if (e5 != null) {
                                break Label_1478;
                            }
                        }
                        e5 = "";
                    }
                    o = new zf4(companion4.e(d7, e5, "newsletter_subscribe", "success_msg", "impression"));
                    final lev$a lev$a4 = new lev$a();
                    lev$a4.a = Long.parseLong(a6);
                    final nii$a nii$a3 = new nii$a();
                    nii$a3.o(b6.C0);
                    lev$a4.i1 = (nii)((h4j)nii$a3).e();
                    ((d0p)o).i((szo)((h4j)lev$a4).e());
                    saw.b((okm)o);
                }
            }
            else if (qii instanceof qii$i) {
                final rii g6 = this.G0;
                final qii$i qii$i = (qii$i)qii;
                final String a7 = qii$i.a;
                final String b7 = qii$i.b;
                final oii c5 = qii$i.c;
                final jev d8 = qii$i.d;
                Objects.requireNonNull(g6);
                zzd.f((Object)a7, "id");
                zzd.f((Object)c5, "newsletterSource");
                if (zzd.a((Object)c5.C0, (Object)"twitter-profile")) {
                    final zf4 zf9 = new zf4(nca.Companion.e("profile", "profile_modules", "newsletter_subscribe", "error_msg", "impression"));
                    final lev$a lev$a5 = new lev$a();
                    lev$a5.a = Long.parseLong(a7);
                    final nii$a nii$a4 = new nii$a();
                    nii$a4.o(c5.C0);
                    lev$a5.i1 = (nii)((h4j)nii$a4).e();
                    lev$a5.K = b7;
                    zf9.i((szo)((h4j)lev$a5).e());
                    saw.b((okm)zf9);
                }
                else {
                    final nca$a companion5 = nca.Companion;
                    String d9 = null;
                    Label_1775: {
                        if (d8 != null) {
                            d9 = ((vyo)d8).d;
                            if (d9 != null) {
                                break Label_1775;
                            }
                        }
                        d9 = "";
                    }
                    String e6 = null;
                    Label_1797: {
                        if (d8 != null) {
                            e6 = ((vyo)d8).e;
                            if (e6 != null) {
                                break Label_1797;
                            }
                        }
                        e6 = "";
                    }
                    final zf4 zf10 = new zf4(companion5.e(d9, e6, "newsletter_subscribe", "error_msg", "impression"));
                    o = new lev$a();
                    ((lev$a)o).a = Long.parseLong(a7);
                    ((lev$a)o).K = b7;
                    final nii$a nii$a5 = new nii$a();
                    nii$a5.o(c5.C0);
                    ((lev$a)o).i1 = (nii)((h4j)nii$a5).e();
                    zf10.i((szo)((h4j)o).e());
                    saw.b((okm)zf10);
                }
            }
        }
    }
    
    public final b5j<tii> x() {
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q((View)this.K0).map((qtb)new uii((rtb)vii$c.C0, 0)), (naj)asy.q((View)this.L0).map((qtb)new zt1((rtb)vii$d.C0, 26)) });
        zzd.e((Object)mergeArray, "mergeArray(\n            \u2026IssueClicked },\n        )");
        return (b5j<tii>)mergeArray;
    }
}
