// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.signup;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Objects;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.content.res.Resources;

@a91
public class SignUpStepFormPresenter
{
    public v8q a;
    public boolean b;
    public final Resources c;
    public final w7q d;
    public final ush e;
    public final NavigationHandler f;
    public final xqs g;
    public final ick h;
    public final t7q i;
    public final kcm j;
    public final uv1<v8q> k;
    public a8q l;
    
    public SignUpStepFormPresenter(final Resources c, final duo duo, final w7q d, final ush e, final NavigationHandler f, final xqs g, final ick h, final t7q i, final kcm j) {
        this.a = v8q.G0;
        this.b = false;
        this.k = (uv1<v8q>)new uv1();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        final String l = ita.d().l("growth_acquisition_enable_email_easily", "input_mode_phone");
        final v8q h2 = v8q.H0;
        if (l.equals("input_mode_email")) {
            this.a = h2;
        }
        else {
            final v8q i2 = v8q.I0;
            if (l.equals("input_mode_phone_and_email")) {
                this.a = i2;
            }
        }
        duo.b(this);
    }
    
    public final void a(final v8q c, final a8q a8q) {
        if (this.a != c) {
            final w7q d = this.d;
            d.k();
            ((TextView)d.J0.getEditText()).setText((CharSequence)"");
            final t7q i = this.i;
            if ((i.c = c) == v8q.G0) {
                i.b.c((tlm)new fg4(dda.d((iba)zba.i, "phone_number", "choose")));
            }
            else if (c == v8q.H0) {
                i.b.c((tlm)new fg4(dda.d((iba)zba.i, "email", "choose")));
            }
            else {
                i.b.c((tlm)new fg4(dda.d((iba)zba.i, "phone_number_and_email", "choose")));
            }
        }
        this.b(c, a8q);
    }
    
    public final void b(final v8q a, final a8q a8q) {
        final v8q h0 = v8q.H0;
        this.a = a;
        final dtv a2 = a8q.a;
        vmw.g((Object)a2);
        String s;
        if ((s = a2.c) == null) {
            s = "";
        }
        final v8q g0 = v8q.G0;
        if (a == g0) {
            ((TextView)this.d.J0.getEditText()).setInputType(3);
        }
        else if (a == h0) {
            ((TextView)this.d.J0.getEditText()).setInputType(33);
            final dtv t = a8q.t;
            if (t != null) {
                s = t.c;
            }
        }
        else {
            ((TextView)this.d.J0.getEditText()).setInputType(1);
        }
        this.d(a8q);
        if (this.a == v8q.I0) {
            this.d.o(a8q.n);
        }
        else if (!this.d.m() && !flr.g((CharSequence)this.d.l())) {
            this.d.o(a8q.n);
        }
        else {
            final w7q d = this.d;
            String s2;
            if (this.a == g0) {
                s2 = a8q.l;
            }
            else {
                s2 = a8q.m;
            }
            d.o(s2);
        }
        this.k.onNext((Object)this.a);
        final CharSequence text = this.c.getText(2131953634);
        final dtv u = a8q.u;
        CharSequence i = text;
        if (u != null) {
            final String c = u.c;
            i = text;
            if (c != null) {
                i = c;
            }
        }
        final ush e = this.e;
        final String string = this.c.getString(2131955354);
        vmw.g((Object)s);
        final CharSequence h2 = s;
        e.g = string;
        e.h = h2;
        e.i = i;
        e.c(false);
        final cd1 p2 = this.d.P0;
        Objects.requireNonNull(p2);
        if (hdx.n() && p2.d != null && p2.a) {
            if (a == g0) {
                ((LinearLayout)p2.c).setAutofillHints(new String[] { "phone" });
            }
            else if (a == h0) {
                ((LinearLayout)p2.c).setAutofillHints(new String[] { "emailAddress" });
            }
            else {
                ((LinearLayout)p2.c).setAutofillHints(new String[] { "phone", "emailAddress" });
            }
            p2.b(p2.c);
        }
    }
    
    public final void c() {
        final String trim = this.d.l().trim();
        final z7q$a z7q$a = new z7q$a();
        z7q$a.a = this.d.I0.getEditText().getText().toString();
        z7q$a.b = trim;
        z7q$a.f = this.g.a();
        final z7q z7q = (z7q)((z4j)z7q$a).e();
        final dtv u = this.l.u;
        final NavigationHandler f = this.f;
        vmw.g((Object)u);
        f.d(new rrd(u, (vrd)z7q), null);
    }
    
    public final void d(final a8q a8q) {
        if (this.a == v8q.G0) {
            this.d.v(a8q.r);
        }
        else if (this.b) {
            this.d.v(a8q.u.c);
        }
        else {
            this.d.v(a8q.q);
        }
        if (this.b) {
            this.d.w(true);
        }
        else if (this.a == v8q.I0) {
            this.d.w(false);
        }
        else {
            final w7q d = this.d;
            d.w(d.m());
        }
    }
}
