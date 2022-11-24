import android.content.res.Resources;
import com.twitter.ui.widget.TextLayoutView;
import com.twitter.ui.tweet.inlineactions.InlineActionBar;
import android.view.View;
import com.twitter.tweetview.core.ui.analyticsbar.AnalyticsBarViewDelegateBinder;
import java.util.List;
import java.util.Arrays;
import android.view.View$OnClickListener;
import com.twitter.tweetview.core.ui.replycontext.ReplyContextViewDelegateBinder;
import java.util.Objects;
import com.twitter.tweetview.core.ui.tombstone.SensitiveMediaInterstitialViewBaseDelegateBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kod implements rk6
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public kod(final Object g0, final Object h0, final Object i0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void accept(Object textWithVisibility) {
        switch (this.F0) {
            default: {
                final SensitiveMediaInterstitialViewBaseDelegateBinder sensitiveMediaInterstitialViewBaseDelegateBinder = (SensitiveMediaInterstitialViewBaseDelegateBinder)this.G0;
                final fjp fjp = (fjp)this.H0;
                final zvj zvj = (zvj)textWithVisibility;
                Objects.requireNonNull(sensitiveMediaInterstitialViewBaseDelegateBinder);
                textWithVisibility = ((z2j)zvj).a;
                vmw.g(textWithVisibility);
                final xzu xzu = (xzu)textWithVisibility;
                final Object b = ((z2j)zvj).b;
                vmw.g(b);
                sensitiveMediaInterstitialViewBaseDelegateBinder.d(fjp, xzu, (ojw)b);
                return;
            }
            case 2: {
                final ReplyContextViewDelegateBinder replyContextViewDelegateBinder = (ReplyContextViewDelegateBinder)this.G0;
                final mim mim = (mim)this.H0;
                final xzu xzu2 = (xzu)textWithVisibility;
                Objects.requireNonNull(replyContextViewDelegateBinder);
                final hp6 a = xzu2.a;
                final cqu g = xzu2.g;
                final TextLayoutView f0 = mim.F0;
                final Object o = null;
                f0.setTextWithVisibility((CharSequence)null);
                if (replyContextViewDelegateBinder.b(a, g)) {
                    Label_0510: {
                        if (!g.j) {
                            final m0w f2 = a.F0.N0.K0.f;
                            boolean b3 = false;
                            Label_0177: {
                                if (f2 != null) {
                                    final List<z4h> b2 = qwu.b(a);
                                    if (b2.size() == 1 && f2.a(((z4h)b2.get(0)).K0)) {
                                        b3 = true;
                                        break Label_0177;
                                    }
                                }
                                b3 = false;
                            }
                            if (!b3) {
                                final long id = replyContextViewDelegateBinder.c.getId();
                                final Resources b4 = replyContextViewDelegateBinder.b;
                                final p5w p5w = new p5w((Object)replyContextViewDelegateBinder, (Object)a);
                                final TextLayoutView f3 = mim.F0;
                                textWithVisibility = o;
                                if (!cim.c(a)) {
                                    break Label_0510;
                                }
                                final List a2 = cim.a(a, id);
                                textWithVisibility = o;
                                if (a2.isEmpty()) {
                                    break Label_0510;
                                }
                                ((View)f3).setOnClickListener((View$OnClickListener)new bim((bim$a)p5w, a2, a.D()));
                                final pgx g2 = a.F0.g1;
                                if (g2 != null && g2.d != null && g2.e != null) {
                                    final String d = g2.d;
                                    final fg4 fg4 = new fg4(dda.g("audiospace", "", "", "audiospace_reply", "impression"));
                                    ((o1p)fg4).i((d1p)a11.c(d, true));
                                    sbw.b((tlm)fg4);
                                    final String n = qsz.n(b4, a2, false, false, a.F0.g1.e);
                                    List<Integer> list;
                                    if (a2.size() == 1) {
                                        list = Arrays.asList(b4.getColor(2131100761));
                                    }
                                    else {
                                        list = Arrays.asList(-1, b4.getColor(2131100761));
                                    }
                                    textWithVisibility = new xif(n, (List)list);
                                    break Label_0510;
                                }
                                final String n2 = qsz.n(b4, a2, false, false, (String)null);
                                e0e.f((Object)n2, "text");
                                textWithVisibility = new xif(n2, (List)h3a.F0);
                                break Label_0510;
                            }
                        }
                        textWithVisibility = cim.b(a, replyContextViewDelegateBinder.c.getId(), replyContextViewDelegateBinder.b);
                        ((View)mim.F0).setBackgroundColor(0);
                    }
                    mim.F0.setTextWithVisibility((CharSequence)textWithVisibility);
                }
                return;
            }
            case 1: {
                final AnalyticsBarViewDelegateBinder analyticsBarViewDelegateBinder = (AnalyticsBarViewDelegateBinder)this.G0;
                final nz nz = (nz)this.H0;
                final de6 de6 = (de6)this.I0;
                final hp6 hp6 = (hp6)textWithVisibility;
                if (!analyticsBarViewDelegateBinder.b.a(hp6).c(mku.O0)) {
                    ((View)nz.F0).setVisibility(0);
                    de6.a(too.e((View)nz.F0).map((rtb)fkc.O0).subscribe((rk6)new vxw((Object)analyticsBarViewDelegateBinder, (Object)hp6, 7)));
                }
                else {
                    ((View)nz.F0).setVisibility(8);
                }
                return;
            }
            case 0: {
                final ddu ddu = (ddu)this.G0;
                final fod$a fod$a = (fod$a)this.H0;
                final cdu cdu = (cdu)this.I0;
                final InlineActionBar inlineActionBar = (InlineActionBar)textWithVisibility;
                e0e.f((Object)ddu, "$type");
                e0e.f((Object)fod$a, "$inlineType");
                e0e.f((Object)cdu, "$actionSource");
                e0e.e((Object)inlineActionBar, "it");
                inlineActionBar.f((uda)bs4.H((View)inlineActionBar), ddu, fod$a, cdu);
            }
        }
    }
}
