import android.app.Dialog;
import com.twitter.android.liveevent.landing.scribe.a;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;
import com.twitter.composer.view.ComposerToolbar$a;
import android.content.res.TypedArray;
import com.twitter.android.qrcodes.QRCodeContentViewProvider;
import com.twitter.app.dm.DMConversationContentViewProvider;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import com.twitter.app.profiles.api.EditVerifiedPhoneArgs;
import java.util.Objects;
import com.twitter.app.safety.mutedkeywords.composer.c;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.SettingsSearchResultsContentViewArgs;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.composer.geotag.InlinePlacePickerView;
import java.util.List;
import com.twitter.composer.view.ComposerToolbar;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class quf implements View$OnClickListener
{
    public final int F0;
    public final Object G0;
    
    public quf(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        final int f0 = this.F0;
        boolean b = true;
        final String s = "";
        switch (f0) {
            default: {
                final wb2 wb2 = (wb2)this.G0;
                e0e.f((Object)wb2, "this$0");
                ((View)wb2.I0).performClick();
                return;
            }
            case 28: {
                final eag eag = (eag)this.G0;
                e0e.f((Object)eag, "this$0");
                eag.Y4("login");
                return;
            }
            case 27: {
                final u0i u0i = (u0i)this.G0;
                final u0i$a companion = u0i.Companion;
                e0e.f((Object)u0i, "this$0");
                Object o;
                if (fbx.O()) {
                    o = q0i$l.a;
                }
                else {
                    o = q0i$h.a;
                }
                sbw.b((tlm)o);
                ((dk0)u0i).dismiss();
                return;
            }
            case 26: {
                final o92 o2 = (o92)this.G0;
                if (o2.J0 && ((Dialog)o2).isShowing()) {
                    if (!o2.M0) {
                        final TypedArray obtainStyledAttributes = ((Dialog)o2).getContext().obtainStyledAttributes(new int[] { 16843611 });
                        o2.L0 = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        o2.M0 = true;
                    }
                    if (o2.L0) {
                        ((Dialog)o2).cancel();
                    }
                }
                return;
            }
            case 25: {
                final mtc mtc = (mtc)this.G0;
                e0e.f((Object)mtc, "this$0");
                if (mtc.h == 1) {
                    mtc.a(true);
                }
                else {
                    mtc.b(true);
                }
                return;
            }
            case 24: {
                final bu7 bu7 = (bu7)this.G0;
                e0e.f((Object)bu7, "this$0");
                final bu7$e l0 = bu7.L0;
                if (l0 != null) {
                    l0.t();
                }
                return;
            }
            case 23: {
                final ComposerToolbar$a a1 = ((ComposerToolbar)this.G0).A1;
                if (a1 != null) {
                    a1.l0();
                }
                return;
            }
            case 22: {
                final ad6 ad6 = (ad6)this.G0;
                final ad6$m companion2 = ad6.Companion;
                e0e.f((Object)ad6, "this$0");
                final ArrayList c = ad6.k1.c;
                e0e.e((Object)c, "itemManager.composeItems");
                final chp chp = (chp)rr4.E1((List)c);
                if (chp != null) {
                    ad6.J3(chp);
                }
                return;
            }
            case 21: {
                final InlinePlacePickerView inlinePlacePickerView = (InlinePlacePickerView)this.G0;
                if (inlinePlacePickerView.I0 != null) {
                    if (((View)inlinePlacePickerView.H0).getVisibility() != 0 || TextUtils.equals(inlinePlacePickerView.H0.getText(), (CharSequence)((View)inlinePlacePickerView).getResources().getString(2131952745))) {
                        b = false;
                    }
                    if (b) {
                        final oa6 oa6 = (oa6)((w1c)inlinePlacePickerView.I0).J0;
                        final chp i0 = oa6.I0;
                        if (i0 != null) {
                            oa6.G0.Y0(i0);
                        }
                    }
                    else {
                        final oa6 oa7 = (oa6)((w1c)inlinePlacePickerView.I0).J0;
                        final chp i2 = oa7.I0;
                        if (i2 != null) {
                            oa7.G0.R1(i2);
                        }
                    }
                }
                return;
            }
            case 20: {
                final k47 k47 = (k47)this.G0;
                e0e.f((Object)k47, "this$0");
                jty.T(sba.e);
                final fci h0 = k47.H0;
                final Intent intent = new Intent();
                intent.putExtra("list_id", k47.I0.a);
                intent.putExtra("creator_id", k47.I0.b);
                intent.putExtra("owner_id", k47.I0.c);
                final n47 s2 = k47.S0;
                if (s2 == null) {
                    e0e.m("currentState");
                    throw null;
                }
                intent.putExtra("list_name", s2.c);
                final n47 s3 = k47.S0;
                if (s3 != null) {
                    intent.putExtra("list_description", s3.d);
                    intent.putExtra("mode", "MANAGE");
                    h0.d((cn)new wnf(intent, (xnf)null));
                    return;
                }
                e0e.m("currentState");
                throw null;
            }
            case 19: {
                final ljh ljh = (ljh)this.G0;
                e0e.f((Object)ljh, "this$0");
                ljh.I0.accept((Object)njh$a.a);
                return;
            }
            case 18: {
                final stb stb = (stb)this.G0;
                final int b2 = tg6.b1;
                e0e.f((Object)stb, "$tmp0");
                stb.invoke((Object)view);
                return;
            }
            case 17: {
                final xpp xpp = (xpp)this.G0;
                e0e.f((Object)xpp, "this$0");
                xpp.H0.b((ContentViewArgs)SettingsSearchResultsContentViewArgs.INSTANCE);
                return;
            }
            case 16: {
                final hh hh = (hh)this.G0;
                e0e.f((Object)hh, "this$0");
                final hh.a companion3 = hh.Companion;
                hh.i2(false);
                return;
            }
            case 15: {
                final t2b t2b = (t2b)this.G0;
                e0e.f((Object)t2b, "this$0");
                final Long z1 = t2b.z1;
                if (z1 != null) {
                    final long longValue = z1;
                    final tsc w1 = t2b.w1;
                    final UserIdentifier h2 = ((idv)t2b).H0;
                    e0e.e((Object)h2, "mContentOwner");
                    final xro xro = new xro(h2, longValue);
                    ((pnm)xro).U((aw0$b)new w2b(t2b));
                    w1.f((pnm)xro);
                }
                else {
                    t2b.x1.a();
                }
                return;
            }
            case 14: {
                final c c2 = (c)this.G0;
                final vn4 i3 = c.i1;
                Objects.requireNonNull(c2);
                ((bl1)z0w.n2(2, (z0w$a)c2)).e2(c2.Z0, "unmute_confirm_dialog");
                return;
            }
            case 13: {
                final z9l z9l = (z9l)this.G0;
                e0e.f((Object)z9l, "this$0");
                final ual ual = (ual)z9l.b.get();
                e0e.e((Object)view, "v");
                ual.e1(view);
                return;
            }
            case 12: {
                final lt9 lt9 = (lt9)this.G0;
                lt9.X1.d((Object)new EditVerifiedPhoneArgs(lt9.d2));
                return;
            }
            case 11: {
                final tw7 tw7 = (tw7)this.G0;
                e0e.f((Object)tw7, "this$0");
                tw7.S0.onNext((Object)pw7.f.a);
                final p18 a2 = p18.a;
                sbw.b((tlm)new fg4(p18.e));
                return;
            }
            case 10: {
                final awa awa = (awa)this.G0;
                final String trim = awa.b1.getText().toString().trim();
                if (trim.length() <= 10000) {
                    awa.d1.c(awa.f1, "comment_compose", "submit");
                    awa.c1.I0.e("text_submitted", trim);
                    final bnr bnr = new bnr((Context)awa.G0, awa.M0, awa.c1, awa.h1);
                    bnr.s1 = trim;
                    awa.e1 = true;
                    ((View)awa.Z0).setEnabled(false);
                    ((View)awa.b1).setEnabled(false);
                    awa.g1.d((pnm)bnr);
                }
                else {
                    final jng jng = new jng((Context)awa.G0, 0);
                    jng.s(2131954042);
                    jng.m(2131954043);
                    ((Dialog)jng.n(2131955542, (DialogInterface$OnClickListener)rzs.H0).create()).show();
                }
                return;
            }
            case 9: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.G0;
                final sda d3 = DMConversationContentViewProvider.D3;
                dmConversationContentViewProvider.E2.e2(((idv)dmConversationContentViewProvider).w0(), "TAG_USERS_BOTTOM_SHEET");
                return;
            }
            case 8: {
                ((y8p)this.G0).c1.c(ita.b().k("search_features_safe_search_learn_more_help_link"));
                return;
            }
            case 7: {
                final a5f a5f = (a5f)this.G0;
                a5f.I0.b((otm)a5f.J0, (Object)a5f.F0).a();
                a5f.H0.j(null);
                return;
            }
            case 6: {
                final qim qim = (qim)this.G0;
                e0e.f((Object)qim, "this$0");
                ((dk0)qim.c.getValue()).dismiss();
                return;
            }
            case 5: {
                final QRCodeContentViewProvider qrCodeContentViewProvider = (QRCodeContentViewProvider)this.G0;
                Objects.requireNonNull(qrCodeContentViewProvider);
                final fg4 fg4 = new fg4(qrCodeContentViewProvider.M0);
                ((o1p)fg4).T = dda.Companion.b(qrCodeContentViewProvider.W4(), "image_picker", "click").toString();
                final int a3 = o5j.a;
                sbw.b((tlm)fg4);
                qrCodeContentViewProvider.G0.startActivityForResult(f0h.a(), 2);
                return;
            }
            case 4: {
                final k0g k0g = (k0g)this.G0;
                final k0g$a companion4 = k0g.Companion;
                e0e.f((Object)k0g, "this$0");
                final q4 l2 = k0g.L0;
                if (l2 != null) {
                    l2.p(false);
                }
                k0g.F0.a();
                return;
            }
            case 3: {
                final uqf uqf = (uqf)this.G0;
                Objects.requireNonNull(uqf);
                final int id = view.getId();
                if (id == 2131429822) {
                    final q4 n0 = uqf.N0;
                    if (n0 != null) {
                        n0.r();
                    }
                }
                else if (id == 2131431532) {
                    final q4 n2 = uqf.N0;
                    if (n2 != null) {
                        if (n2.b.o1) {
                            n2.s();
                        }
                        else {
                            n2.f();
                        }
                    }
                }
                else if (id == 2131429817) {
                    uqf.n();
                }
                uqf.o();
                return;
            }
            case 2: {
                final bwf bwf = (bwf)this.G0;
                final zof z2 = bwf.z1;
                if (z2 != null) {
                    final gwf u1 = bwf.u1;
                    Objects.requireNonNull(u1);
                    u1.b.a(z2, "share_moment_floating_button");
                    final a d4 = u1.d;
                    Objects.requireNonNull(d4);
                    d4.o(dda.g("live_event_timeline", "", "", "share_moment_floating_button", "click"), (d1p)d4.m((String)null));
                }
                return;
            }
            case 1: {
                final bsf bsf = (bsf)this.G0;
                final zrf g0 = bsf.G0;
                final sfv f2 = bsf.I0.f();
                String d5;
                if (f2 == null) {
                    r9a.d(new Throwable("No event page given to the reminder button scribe"));
                    d5 = s;
                }
                else {
                    d5 = ((f0p)f2).d;
                }
                if (g0.h != null) {
                    final qxf b3 = g0.b();
                    if (b3 != null) {
                        final String c3 = b3.c;
                        if (!flr.e((CharSequence)c3)) {
                            final String c4 = g0.h.c;
                            final boolean b4 = b3.a() ^ true;
                            g0.d.a((b39)g0.a.a(c4, c3, b4).doOnSubscribe((rk6)new ces((Object)g0, 5)).doFinally((sj)new qp3((Object)g0, 1)).subscribeWith((ocj)new yrf(g0, b3.a())));
                            if (b4 && !g0.b.a()) {
                                g0.b.b();
                            }
                            g0.c.a(b3, d5);
                        }
                    }
                }
                return;
            }
            case 0: {
                ((suf)this.G0).c.p();
            }
        }
    }
}
