import android.widget.ViewAnimator;
import java.util.Iterator;
import java.util.List;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import android.text.SpannableString;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnq extends ste implements qsb<xmq, fzv>
{
    public final zmq D0;
    
    public jnq(final zmq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xmq xmq = (xmq)o;
        czd.f((Object)xmq, "$this$distinct");
        final doq h = xmq.h;
        if (h == null) {
            final zmq d0 = this.D0;
            final View d2 = d0.D0;
            final zmq.a companion = zmq.Companion;
            final Context h2 = d0.H0;
            czd.e((Object)h2, "context");
            Objects.requireNonNull(companion);
            d2.setContentDescription(eoq.a.a(h2, xmq.d, xmq.e));
            final ViewSwitcher j0 = this.D0.J0;
            czd.e((Object)j0, "switcher");
            if (((ViewAnimator)j0).getDisplayedChild() != 0) {
                ((ViewAnimator)j0).showPrevious();
            }
        }
        else {
            final zmq d3 = this.D0;
            final TextView q0 = d3.Q0;
            final zmq.a companion2 = zmq.Companion;
            czd.e((Object)q0, "renderTicker$lambda$1");
            Objects.requireNonNull(companion2);
            q0.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            q0.setCompoundDrawablePadding(0);
            if (h instanceof doq$c) {
                final doq$c doq$c = (doq$c)h;
                final int e = ib0.E(doq$c.F0);
                int n;
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n = 2131954101;
                        }
                        else {
                            n = 2131954103;
                        }
                    }
                    else {
                        n = 2131954098;
                    }
                }
                else {
                    boolean b = false;
                    Label_0280: {
                        if (doq$c.G0 != null) {
                            final m4s a = hq1.a;
                            if (TimeUnit.MILLISECONDS.toSeconds(new Date(System.currentTimeMillis()).getTime() - doq$c.G0.getTime()) <= 300L) {
                                b = true;
                                break Label_0280;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        n = 2131954100;
                    }
                    else {
                        n = 2131954099;
                    }
                }
                final String a2 = zmq.a.a(companion2, doq$c.E0);
                final String string = d3.H0.getString(n, new Object[] { a2 });
                czd.e((Object)string, "context.getString(fmtResId, username)");
                final TextView q2 = d3.Q0;
                final SpannableString text = new SpannableString((CharSequence)string);
                zmq.a.b(companion2, text, a2);
                q2.setText((CharSequence)text);
            }
            else if (h instanceof doq$e) {
                final s9i e2 = s9i.E0;
                final Context h3 = d3.H0;
                czd.e((Object)h3, "context");
                final String string2 = d3.H0.getString(2131954096, new Object[] { e2.k(h3, ((doq$e)h).E0, 2) });
                czd.e((Object)string2, "context.getString(R.stri\u2026icker_tweet_count, count)");
                final String string3 = d3.H0.getString(2131954097, new Object[] { string2 });
                czd.e((Object)string3, "context.getString(R.stri\u2026nt_qualifier, tweetCount)");
                final TextView q3 = d3.Q0;
                final SpannableString text2 = new SpannableString((CharSequence)string3);
                zmq.a.b(companion2, text2, string2);
                q3.setText((CharSequence)text2);
            }
            else if (h instanceof doq$d) {
                final TextView q4 = d3.Q0;
                final List e3 = ((doq$d)h).E0;
                final ArrayList list = new ArrayList<String>(iq4.H((Iterable)e3, 10));
                final Iterator iterator = e3.iterator();
                while (iterator.hasNext()) {
                    list.add(((i31)iterator.next()).b);
                }
                final String string4 = ((View)q4).getContext().getString(2131953873);
                czd.e((Object)string4, "context.getString(DOT)");
                q4.setText((CharSequence)mq4.m0((Iterable)list, (CharSequence)string4, (CharSequence)null, (CharSequence)null, (qsb)null, 62));
                Objects.requireNonNull(zmq.Companion);
                q4.setCompoundDrawablesRelativeWithIntrinsicBounds(2131231762, 0, 0, 0);
                q4.setCompoundDrawablePadding(((View)q4).getContext().getResources().getDimensionPixelSize(2131167445));
            }
            else if (h instanceof doq$f) {
                final String a3 = zmq.a.a(companion2, ((doq$f)h).E0);
                final String string5 = d3.H0.getString(2131954102, new Object[] { a3 });
                czd.e((Object)string5, "context.getString(R.stri\u2026shared_a_tweet, username)");
                final TextView q5 = d3.Q0;
                final SpannableString text3 = new SpannableString((CharSequence)string5);
                zmq.a.b(companion2, text3, a3);
                q5.setText((CharSequence)text3);
            }
            else {
                d3.Q0.setText((CharSequence)d3.H0.getString(2131954095));
            }
            d3.D0.setContentDescription(d3.Q0.getText());
            final zmq.a companion3 = zmq.Companion;
            final ViewSwitcher j2 = this.D0.J0;
            czd.e((Object)j2, "switcher");
            Objects.requireNonNull(companion3);
            if (((ViewAnimator)j2).getDisplayedChild() != 1) {
                ((ViewAnimator)j2).showNext();
            }
        }
        return fzv.a;
    }
}
