import java.util.Collection;
import java.util.ArrayList;
import android.text.SpannableString;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.text.SpannableStringBuilder;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import com.twitter.ui.user.UserLabelView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e9l implements w9l
{
    public final UserLabelView A;
    public final e9l.e9l$a B;
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final RecyclerView d;
    public final View e;
    public final View f;
    public String g;
    public String h;
    public long i;
    public Boolean j;
    public boolean k;
    public final TextView l;
    public cef m;
    public xfl n;
    public View$OnClickListener o;
    public View$OnClickListener p;
    public View$OnClickListener q;
    public kju r;
    public vdv s;
    public ona t;
    public final bra<jev, de6> u;
    public String v;
    public List<h4d> w;
    public final i4d x;
    public final wn3 y;
    public final wn3 z;
    
    public e9l(final View view, final bra<jev, de6> u) {
        final TextView a = (TextView)view.findViewById(2131430188);
        final TextView b = (TextView)view.findViewById(2131432488);
        final TextView c = (TextView)view.findViewById(2131432458);
        final TextView l = (TextView)view.findViewById(2131429243);
        final RecyclerView d = (RecyclerView)view.findViewById(2131429520);
        final View viewById = view.findViewById(2131432489);
        final View viewById2 = view.findViewById(2131430724);
        final UserLabelView a2 = (UserLabelView)view.findViewById(2131432480);
        final e9l.e9l$a b2 = new e9l.e9l$a();
        this.i = -1L;
        this.j = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = viewById;
        this.l = l;
        this.f = viewById2;
        this.A = a2;
        this.w = ijf.w((Object)h4d.D0, (Object[])new h4d[] { h4d.E0, h4d.F0, h4d.G0, h4d.H0, h4d.I0 });
        this.d = d;
        final Context context = ((View)a).getContext();
        final tqm b3 = tqm.Companion.b((View)a);
        final i4d i4d = new i4d(context, b3, (w9l)this);
        ((RecyclerView$e)(this.x = i4d)).A(true);
        final FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(context);
        if (layoutManager.W0 != 0) {
            layoutManager.W0 = 0;
            layoutManager.P0();
        }
        d.setLayoutManager((RecyclerView$m)layoutManager);
        d.setAdapter((RecyclerView$e)i4d);
        this.y = b(b3, xd9.a(context, 2130969754, 2131232212), goz.J(context, 2130968593));
        this.z = b(b3, xd9.a(context, 2130969795, 2131232530), goz.J(context, 2130969040));
        this.u = u;
        this.B = b2;
    }
    
    public static void a(final SpannableStringBuilder spannableStringBuilder, final wn3 wn3) {
        spannableStringBuilder.append((CharSequence)"\u202f");
        spannableStringBuilder.append((CharSequence)"\u202f");
        spannableStringBuilder.setSpan((Object)wn3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }
    
    public static wn3 b(final tqm tqm, int n, final int n2) {
        final Drawable j = tqm.j(n);
        j.setColorFilter(n2, PorterDuff$Mode.SRC_ATOP);
        n = (int)tqm.b.getDimension(2131166932);
        j.setBounds(0, 0, n, n);
        return new wn3(j);
    }
    
    public static void c(final View view, final CharSequence charSequence) {
        int visibility;
        if (pjr.e(charSequence)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view.setVisibility(visibility);
    }
    
    public static void d(final TextView textView, final af4 af4, final String s) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        spannableString.setSpan((Object)af4, 0, spannableString.length(), 33);
        lzq.c(textView);
        g(textView, (CharSequence)spannableString);
        c((View)textView, s);
    }
    
    public static void g(final TextView textView, final CharSequence text) {
        if (textView != null) {
            textView.setText(text);
        }
    }
    
    public final void e(String s, final boolean b, final boolean b2, final String s2) {
        String s3 = s;
        if (pjr.e((CharSequence)s)) {
            s3 = s2;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s3);
        if ((s = s3) == null) {
            s = "";
        }
        final StringBuilder contentDescription = new StringBuilder(s);
        if (b) {
            a(spannableStringBuilder, this.z);
            contentDescription.append(", ");
            contentDescription.append(((View)this.a).getContext().getResources().getString(2131954376));
            if (dta.b().b("identity_verification_educational_prompt_enabled", false)) {
                ((View)this.a).setOnClickListener(this.q);
                this.a.setEnabled(true);
            }
            else {
                this.a.setEnabled(false);
            }
        }
        else {
            ((View)this.a).setOnClickListener((View$OnClickListener)null);
            ((View)this.a).setClickable(false);
            this.a.setEnabled(false);
        }
        if (b2) {
            a(spannableStringBuilder, this.y);
            contentDescription.append(", ");
            contentDescription.append(((View)this.a).getContext().getResources().getString(2131954374));
        }
        g(this.a, (CharSequence)spannableStringBuilder);
        ((View)this.a).setContentDescription((CharSequence)contentDescription);
    }
    
    public final void f(final TextView textView, final jeu jeu, int a, final int e) {
        if (pjr.e((CharSequence)((xwm)jeu).C0)) {
            ((View)textView).setVisibility(8);
        }
        else {
            final kju h0 = jeu.H0;
            final p1a d = o1a.d();
            if ((!h0.a.isEmpty() || !h0.b.isEmpty() || !h0.c.isEmpty() || !h0.d.isEmpty()) && this.m != null) {
                final des des = new des(((View)textView).getContext(), (View)textView);
                des.k = true;
                des.h = true;
                des.g = true;
                des.i = true;
                des.c = this.m;
                des.d = a;
                des.e = e;
                final ced$b d2 = ced.D0;
                a = w4j.a;
                textView.setText(d.b((CharSequence)des.a(jeu, (Iterable)d2, (w5w)null)));
                lzq.c(textView);
            }
            else {
                textView.setText(d.b((CharSequence)new SpannableStringBuilder((CharSequence)((xwm)jeu).C0)));
            }
            ((View)textView).setVisibility(0);
        }
    }
    
    public final void h(final String s) {
        final View e = this.e;
        int visibility;
        if (pjr.g((CharSequence)s)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        e.setVisibility(visibility);
        g(this.b, pjr.l(s));
    }
    
    public final void i() {
        final ArrayList list = new ArrayList();
        final List<h4d> w = this.w;
        final h4d h0 = h4d.H0;
        final boolean contains = w.contains(h0);
        final boolean b = true;
        final int n = 0;
        boolean b2 = false;
        Label_0079: {
            if (contains && pjr.g((CharSequence)this.v)) {
                final xfl n2 = this.n;
                if (n2 != null && this.B.a(n2.a)) {
                    b2 = true;
                    break Label_0079;
                }
            }
            b2 = false;
        }
        if (b2) {
            list.add(h0);
        }
        final List<h4d> w2 = this.w;
        final h4d d0 = h4d.D0;
        if (w2.contains(d0) && pjr.g((CharSequence)this.h)) {
            list.add(d0);
        }
        final List<h4d> w3 = this.w;
        final h4d e0 = h4d.E0;
        if (w3.contains(e0) && pjr.g((CharSequence)this.g)) {
            list.add(e0);
        }
        final List<h4d> w4 = this.w;
        final h4d f0 = h4d.F0;
        if (w4.contains(f0)) {
            final ona t = this.t;
            if (t != null) {
                int n3 = 0;
                Label_0223: {
                    if (t.b != 0) {
                        n3 = (b ? 1 : 0);
                        if (t.c != 0) {
                            break Label_0223;
                        }
                    }
                    if (t.d != 0) {
                        n3 = (b ? 1 : 0);
                    }
                    else {
                        n3 = 0;
                    }
                }
                if (n3 != 0) {
                    list.add(f0);
                }
            }
        }
        final List<h4d> w5 = this.w;
        final h4d g0 = h4d.G0;
        if (w5.contains(g0) && this.i > 0L) {
            list.add(g0);
        }
        if (dta.b().b("verified_phone_label_enabled", false) && Boolean.TRUE.equals(this.j)) {
            final List<h4d> w6 = this.w;
            final h4d i0 = h4d.I0;
            if (w6.contains(i0)) {
                list.add(i0);
            }
        }
        final RecyclerView d2 = this.d;
        int visibility = n;
        if (list.isEmpty()) {
            visibility = 8;
        }
        ((View)d2).setVisibility(visibility);
        final i4d x = this.x;
        x.I0.clear();
        x.I0.addAll(list);
        ((RecyclerView$e)x).f();
    }
}
