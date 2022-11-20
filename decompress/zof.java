import android.widget.CompoundButton;
import com.twitter.model.liveevent.LiveEventConfiguration$a;
import com.twitter.model.liveevent.LiveEventConfiguration;
import java.util.Objects;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zof implements View$OnClickListener
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    
    public zof(final Object e0, final Object f0, final Object g0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        switch (this.D0) {
            default: {
                final rwc rwc = (rwc)this.E0;
                final String s = (String)this.F0;
                final pwc pwc = (pwc)this.G0;
                czd.f((Object)rwc, "this$0");
                czd.f((Object)s, "$identifier");
                czd.f((Object)pwc, "$action");
                rwc.c.onNext((Object)new lvj((Object)s, (Object)pwc.c));
                return;
            }
            case 7: {
                final owd owd = (owd)this.E0;
                final fqt fqt = (fqt)this.F0;
                final bqt bqt = (bqt)this.G0;
                czd.f((Object)owd, "$interestTopicItem");
                czd.f((Object)fqt, "$delegate");
                czd.f((Object)bqt, "this$0");
                final jwd$a jwd$a = new jwd$a(owd.k);
                jwd$a.f = (true ^ owd.k.f);
                final jwd k = (jwd)((n4j)jwd$a).e();
                final owd.a a = new owd.a(owd);
                a.l = owd.l;
                a.m = owd.m;
                a.k = k;
                final owd owd2 = (owd)((n4j)a).e();
                ((oqt)fqt).a(owd2);
                bqt.e(owd2, fqt);
                return;
            }
            case 6: {
                final cgv cgv = (cgv)this.E0;
                final l99 l99 = (l99)this.F0;
                final ntv ntv = (ntv)this.G0;
                czd.f((Object)cgv, "$draftAuthor");
                czd.f((Object)l99, "$draftTweet");
                czd.f((Object)ntv, "this$0");
                final k7l$a k7l$a = new k7l$a();
                k7l$a.h = cgv.D0;
                if (l99.f > 0L) {
                    k7l$a.e = r8l.a.toString();
                }
                ntv.b.a((ym)((n4j)k7l$a).e());
                return;
            }
            case 5: {
                final dpn dpn = (dpn)this.E0;
                final apn apn = (apn)this.F0;
                final yon yon = (yon)this.G0;
                czd.f((Object)dpn, "$this_with");
                czd.f((Object)apn, "this$0");
                czd.f((Object)yon, "$item");
                final View a2 = dpn.a1;
                String s2;
                if (a2.getVisibility() == 0) {
                    s2 = a2.getResources().getString(2131954479, new Object[] { yon.a.b });
                }
                else {
                    s2 = a2.getResources().getString(2131954478, new Object[] { yon.a.b });
                }
                czd.e((Object)s2, "if (isVisible) {\n       \u2026                        }");
                a2.announceForAccessibility((CharSequence)s2);
                apn.e.onNext((Object)new fdn$c(yon));
                return;
            }
            case 4: {
                final ib2 ib2 = (ib2)this.E0;
                final w84 w84 = (w84)this.F0;
                final jb2 jb2 = (jb2)this.G0;
                czd.f((Object)ib2, "this$0");
                czd.f((Object)w84, "$item");
                czd.f((Object)jb2, "$viewHolder");
                ib2.d.h(w84.a, ((CompoundButton)jb2.G0).isChecked());
                return;
            }
            case 3: {
                final eqv eqv = (eqv)this.E0;
                final j0t j0t = (j0t)this.F0;
                final fqv fqv = (fqv)this.G0;
                eqv.F0.a(j0t.d);
                eqv.G0.i((cxs)fqv);
                return;
            }
            case 2: {
                final nzs nzs = (nzs)this.E0;
                ((azs)nzs.c).b((cxs)this.F0, ((ozs$a)this.G0).R0, ((nys)nzs.d).g);
                return;
            }
            case 1: {
                final fsf fsf = (fsf)this.E0;
                final jqf jqf = (jqf)this.F0;
                final cj3 cj3 = (cj3)this.G0;
                Objects.requireNonNull(fsf);
                fsf.K0.d((ym)new evf((LiveEventConfiguration)((n4j)new LiveEventConfiguration$a(jqf.c)).e()));
                fsf.H0.i((cxs)cj3);
                return;
            }
            case 0: {
                final apf apf = (apf)this.E0;
                final ll3 ll3 = (ll3)this.F0;
                final ztf ztf = (ztf)this.G0;
                czd.f((Object)apf, "this$0");
                czd.f((Object)ll3, "$nextItem");
                czd.f((Object)ztf, "$metadataSnapshot");
                apf.m(ll3, ztf);
            }
        }
    }
}
