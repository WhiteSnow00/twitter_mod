import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import java.util.Iterator;
import android.view.View;
import java.util.List;
import com.twitter.ui.widget.timeline.a;
import android.app.Activity;
import com.twitter.ui.widget.timeline.a$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czs implements a$a
{
    public final aq9 a;
    public final Activity b;
    public final psc c;
    public final daq<String, vrm<pmi, pav>> d;
    public final gew e;
    public final jev f;
    public final w7t g;
    
    public czs(final Activity b, final psc c, final gew e, final daq<String, vrm<pmi, pav>> d, final jev jev, final w7t g) {
        this.a = new aq9();
        this.b = b;
        this.c = c;
        this.e = e;
        this.g = g;
        this.d = d;
        final jev jev2 = new jev();
        jev f = jev;
        if (jev == null) {
            f = jev2;
        }
        this.f = f;
    }
    
    public final void a(final a a, final String s, final boolean b, final boolean b2, final List<lnv> list) {
        this.d(a, s, b, "secondary_action", b2, list);
    }
    
    public final void b(final a a) {
        final tqv b = ((epv)((View)a).getTag(2131432053)).k.b;
        if (b instanceof gqv) {
            final apv i = ((gqv)b).i;
            if (i != null) {
                this.d(a, i.b, i.a, "prompt_action", true, i.c);
            }
        }
        else if (b instanceof eqv) {
            final apv h = ((eqv)b).h;
            if (h != null) {
                this.d(a, h.b, h.a, "prompt_action", true, h.c);
            }
        }
    }
    
    public final void c(final a a, final String s, final boolean b, final boolean b2, final List<lnv> list) {
        this.d(a, s, b, "primary_action", b2, list);
    }
    
    public final void d(final a a, final String s, final boolean b, final String s2, final boolean b2, final List<lnv> list) {
        final nws nws = (nws)((View)a).getTag(2131432053);
        if (nws != null) {
            this.h(nws.f(), s2, "click");
            if (b) {
                if (b2) {
                    this.e(s, nws);
                }
                else {
                    this.f((View)a, s, nws);
                }
            }
            else {
                this.g(s);
            }
        }
        Object c0;
        if ((c0 = list) == null) {
            c0 = v2a.C0;
        }
        final Iterator<lnv> iterator = ((List<lnv>)c0).iterator();
        while (iterator.hasNext()) {
            this.d.S((Object)iterator.next().a).c((nbq)new yp1());
        }
    }
    
    public final void e(final String s, final nws nws) {
        this.h(nws.f(), null, "dismiss");
        this.g(s);
        this.c.f((ksc)new xo8((Context)this.b, this.e.b(), nws));
    }
    
    public final void f(final View view, final String s, final nws nws) {
        final aq9 a = this.a;
        final int height = view.getHeight();
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator((TimeInterpolator)a);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hc0(view, height));
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new jc0(view, height));
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public final void onAnimationEnd(final Animator animator) {
                czs.this.e(s, nws);
            }
        });
        ((Animator)ofFloat).start();
    }
    
    public final void g(final String a) {
        if (a != null) {
            final w7t g = this.g;
            final zdf.a a2 = new zdf.a();
            a2.a = a;
            g.b((q7t)a2.e(), nca.g("timeline", "", "", "", ""));
        }
    }
    
    public final void h(final qzo r0, final String s, final String s2) {
        final lev lev = new lev();
        lev.R0 = r0;
        final zf4 zf4 = new zf4();
        final jev f = this.f;
        final String d = ((vyo)f).d;
        final String e = ((vyo)f).e;
        String f2;
        if (r0 != null) {
            f2 = r0.f;
        }
        else {
            f2 = null;
        }
        zf4.q(new String[] { d, e, f2, s, s2 });
        zf4.i((szo)lev);
        saw.b((okm)zf4);
    }
}
