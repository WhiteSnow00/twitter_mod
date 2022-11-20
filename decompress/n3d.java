import android.view.ViewGroup;
import android.content.res.Resources;
import java.util.Map;
import java.util.Objects;
import android.view.View;
import android.text.format.DateUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3d extends RecyclerView$e<a>
{
    public final krm G0;
    public final Context H0;
    public final ial I0;
    public final List<m3d> J0;
    
    public n3d(final Context h0, final krm g0, final ial i0) {
        this.J0 = new ArrayList();
        this.I0 = i0;
        this.H0 = h0;
        this.G0 = g0;
    }
    
    public final m3d C(final int n) {
        m3d m3d;
        if (this.J0.size() > n) {
            m3d = this.J0.get(n);
        }
        else {
            m3d = null;
        }
        return m3d;
    }
    
    public final void D(final TextView textView, final int id) {
        textView.setTextColor(d4j.i(this.H0, 2130969093));
        ((View)textView).setId(id);
    }
    
    public final int c() {
        return this.J0.size();
    }
    
    public final long d(final int n) {
        final m3d c = this.C(n);
        long n2;
        if (c != null) {
            n2 = c.ordinal();
        }
        else {
            n2 = 0L;
        }
        return n2;
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, int n) {
        final a a = (a)recyclerView$c0;
        final m3d c = this.C(n);
        final TextView x0 = a.X0;
        final CharSequence charSequence = null;
        if (c == null) {
            x0.setText((CharSequence)null);
        }
        else {
            final krm g0 = this.G0;
            final Resources b = g0.b;
            final Drawable j = g0.j(c.D0);
            n = b.getDimensionPixelSize(2131166921);
            final int dimensionPixelSize = b.getDimensionPixelSize(2131166921);
            if (j != null) {
                j.setBounds(0, 0, n, dimensionPixelSize);
                j.mutate().setColorFilter((ColorFilter)new PorterDuffColorFilter(d4j.i(this.H0, 2130969093), PorterDuff$Mode.SRC_IN));
                x0.setCompoundDrawablesRelative(j, (Drawable)null, (Drawable)null, (Drawable)null);
                x0.setCompoundDrawablePadding(b.getDimensionPixelSize(2131166933));
            }
            ((View)x0).setTag((Object)c);
            n = c.ordinal();
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 5) {
                                    x0.setText((CharSequence)null);
                                }
                                else {
                                    final q9l q9l = (q9l)this.I0;
                                    if (Boolean.TRUE.equals(q9l.j)) {
                                        q9l.g(x0, (CharSequence)b.getString(2131959543));
                                        if (!q9l.k) {
                                            n9l.a().b(n9l.d);
                                            q9l.k = true;
                                        }
                                    }
                                    this.D(x0, 2131430741);
                                }
                            }
                            else {
                                final q9l q9l2 = (q9l)this.I0;
                                q9l.g(x0, (CharSequence)q9l2.v);
                                ((View)x0).setOnClickListener((View$OnClickListener)new epf((Object)q9l2, 8));
                                n9l.a().b(n9l.b);
                                this.D(x0, 2131430736);
                            }
                        }
                        else {
                            q9l.g(x0, (CharSequence)ngl.g(((q9l)this.I0).i, this.H0));
                            this.D(x0, 2131430739);
                        }
                    }
                    else {
                        final ial i0 = this.I0;
                        final Context h0 = this.H0;
                        final q9l q9l3 = (q9l)i0;
                        if (ngl.o(q9l3.t, new Date())) {
                            if (q9l3.n.a) {
                                n = 2131957538;
                            }
                            else {
                                n = 2131955608;
                            }
                            final String string = b.getString(n);
                            if (q3j.M()) {
                                q9l.g(x0, (CharSequence)string);
                            }
                            else {
                                q9l.d(x0, (ce4)new p9l(q9l3, d4j.i(((View)x0).getContext(), 2130969074), x0), string);
                            }
                        }
                        else {
                            final oma t = q9l3.t;
                            CharSequence charSequence2 = charSequence;
                            if (t != null) {
                                final Resources resources = h0.getResources();
                                final int d = t.d;
                                n = t.c;
                                final int b2 = t.b;
                                final Calendar instance = Calendar.getInstance();
                                instance.set(d, n - 1, b2);
                                if (n != 0 && b2 != 0) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                if (d != 0) {
                                    if (n != 0) {
                                        charSequence2 = resources.getString(2131952200, new Object[] { DateFormat.getDateInstance(1).format(instance.getTime()) });
                                    }
                                    else {
                                        charSequence2 = resources.getString(2131952201, new Object[] { d });
                                    }
                                }
                                else {
                                    charSequence2 = charSequence;
                                    if (n != 0) {
                                        charSequence2 = resources.getString(2131952199, new Object[] { DateUtils.formatDateTime(h0, instance.getTimeInMillis(), 24) });
                                    }
                                }
                            }
                            q9l.g(x0, charSequence2);
                            q9l.c((View)x0, charSequence2);
                        }
                        this.D(x0, 2131430735);
                    }
                }
                else {
                    final q9l q9l4 = (q9l)this.I0;
                    Objects.requireNonNull(q9l4);
                    final Context context = ((View)x0).getContext();
                    final String g2 = q9l4.g;
                    final eku r = q9l4.r;
                    n = d4j.i(context, 2130968591);
                    q9l4.f(x0, new cfu(g2, r, (Map)null), n, d4j.i(context, 2130969074));
                    q9l.c((View)x0, (CharSequence)q9l4.g);
                    x0.setTextColor(d4j.i(this.H0, 2130968591));
                    ((View)x0).setId(2131430742);
                }
            }
            else {
                final q9l q9l5 = (q9l)this.I0;
                if (q9l5.s == null) {
                    q9l.g(x0, (CharSequence)q9l5.h);
                    q9l.c((View)x0, (CharSequence)q9l5.h);
                }
                else {
                    q9l.d(x0, (ce4)new o9l(q9l5, d4j.i(((View)x0).getContext(), 2130969074)), q9l5.h);
                }
                this.D(x0, 2131430740);
            }
        }
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        return new a((TextView)da8.h(viewGroup, 2131625225, viewGroup, false));
    }
    
    public static final class a extends RecyclerView$c0
    {
        public final TextView X0;
        
        public a(final TextView x0) {
            super((View)x0);
            this.X0 = x0;
        }
    }
}
