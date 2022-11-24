import android.view.View;
import android.annotation.SuppressLint;
import java.util.Map;
import android.text.method.MovementMethod;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.Objects;
import android.content.Context;
import java.util.List;
import android.widget.TextView;
import com.twitter.android.liveevent.landing.scribe.a;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rtf extends zm1
{
    public final Activity b;
    public final a c;
    public final mxe<fci<?>> d;
    public final mxe<d6w> e;
    public final stf f;
    public final int g;
    public final int h;
    public TextView i;
    public List<vtf> j;
    
    public rtf(final Activity b, final a c, final mxe<fci<?>> d, final mxe<d6w> e, final kcm kcm, final stf f) {
        e0e.f((Object)b, "activity");
        e0e.f((Object)c, "scribeClient");
        e0e.f((Object)d, "navigatorLazy");
        e0e.f((Object)e, "uriNavigatorLazy");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)f, "liveEventCoverFeatures");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        kcm.i((sj)new nj4((Object)this, 2));
        this.g = qo6.b((Context)b, 2131100011);
        this.h = b1b.B((Context)b, 2130970040);
    }
    
    public final void c(final w6w w6w) {
        e0e.f((Object)w6w, "url");
        final String k0 = w6w.K0;
        e0e.e((Object)k0, "url.url");
        final List<vtf> j = this.j;
        final String s = null;
        String c = null;
        Label_0123: {
            Label_0121: {
                if (j != null) {
                    while (true) {
                        for (final vtf next : j) {
                            final vtf vtf = next;
                            if (e0e.a((Object)vtf.a, (Object)k0) || e0e.a((Object)vtf.b, (Object)k0)) {
                                final vtf vtf2 = next;
                                if (vtf2 != null) {
                                    c = vtf2.c;
                                    break Label_0123;
                                }
                                break Label_0121;
                            }
                        }
                        vtf next = null;
                        continue;
                    }
                }
            }
            c = null;
        }
        Objects.requireNonNull(this.f);
        if (!ita.b().b("live_event_description_entities_enabled", false) || c == null || c.length() == 0) {
            Objects.requireNonNull(this.f);
            c = s;
            if (!ita.b().b("live_event_description_entities_enabled", false)) {
                c = k0;
            }
        }
        if (c != null) {
            ((d6w)this.e.get()).c(c);
            final a c2 = this.c;
            Objects.requireNonNull(c2);
            final dda g = dda.g("live_event_timeline", "", "user", "", "open_link");
            final fg4 fg4 = new fg4();
            ((o1p)fg4).q = k0;
            final int a = o5j.a;
            c2.n(fg4, g, new d1p[] { (d1p)c2.m(c2.i) });
        }
    }
    
    public final void e(final z4h z4h) {
        e0e.f((Object)z4h, "mentionEntity");
        rcl.e((Context)this.b, UserIdentifier.UNDEFINED, z4h.L0, null, null, null);
        final a c = this.c;
        final String l0 = z4h.L0;
        Objects.requireNonNull(c);
        final dda g = dda.g("live_event_timeline", "", "user", "mention", "click");
        final ufv m = c.m(c.i);
        final ufv$a ufv$a = new ufv$a();
        ufv$a.c = 3;
        ufv$a.b = l0;
        c.p(g, false, false, new d1p[] { (d1p)m, (d1p)((z4j)ufv$a).e() });
    }
    
    public final void f(final on3 on3) {
        e0e.f((Object)on3, "cashtagEntity");
        ((fci)this.d.get()).d((cn)t7a.a(on3));
        final a c = this.c;
        final String k0 = on3.K0;
        Objects.requireNonNull(c);
        final dda g = dda.g("live_event_timeline", "", "user", "cashtag", "search");
        final fg4 fg4 = new fg4();
        ((o1p)fg4).w = k0;
        final int a = o5j.a;
        c.n(fg4, g, new d1p[] { (d1p)c.m(c.i) });
    }
    
    public final void h(final sgc sgc) {
        e0e.f((Object)sgc, "hashtagEntity");
        ((fci)this.d.get()).d((cn)t7a.b(sgc));
        final a c = this.c;
        final String k0 = sgc.K0;
        Objects.requireNonNull(c);
        final dda g = dda.g("live_event_timeline", "", "user", "hashtag", "search");
        final fg4 fg4 = new fg4();
        ((o1p)fg4).w = k0;
        final int a = o5j.a;
        c.n(fg4, g, new d1p[] { (d1p)c.m(c.i) });
    }
    
    @SuppressLint({ "DisallowedMethod" })
    public final void i(final TextView i, final String s, final List<vtf> j) {
        e0e.f((Object)i, "descriptionTextView");
        this.i = i;
        this.j = j;
        if (s == null || s.length() == 0) {
            ((View)i).setVisibility(8);
            i.setMovementMethod((MovementMethod)null);
            i.setText((CharSequence)null);
            return;
        }
        final rfu i2 = xd.i0(new rfu(s, (qku)((z4j)egv.a(s)).e(), null), true);
        ((View)i).setVisibility(0);
        final zif b = zif.b((v7a)i2);
        b.n = true;
        b.o = true;
        b.m = true;
        b.p = true;
        b.c = this.g;
        b.d = this.h;
        b.l = true;
        b.h = (lef)this;
        i.setText((CharSequence)b.d());
        c1r.c(i);
    }
}
