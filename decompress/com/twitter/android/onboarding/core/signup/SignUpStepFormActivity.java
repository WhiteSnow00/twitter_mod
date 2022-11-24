// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.signup;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;
import com.twitter.onboarding.ocf.signup.SignUpStepFormPresenter;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import java.util.Objects;
import android.content.Intent;

public class SignUpStepFormActivity extends vnd
{
    public final void d0(final Intent intent) {
        final vn6 c = ((x9)this.b1()).n().c();
        vmw.g((Object)c);
        final int a = o5j.a;
        final eo6 r = ((sml)c).R();
        vmw.g((Object)r);
        final x7q x7q = (x7q)r;
        final scs b = vcs.b(intent);
        vmw.g((Object)b);
        Objects.requireNonNull(x7q);
        final a8q l = (a8q)b.h.b;
        final SignUpStepFormPresenter n0 = x7q.N0;
        n0.l = l;
        final w7q d = n0.d;
        final boolean a2 = n0.f.a();
        final View n2 = d.N0;
        int visibility;
        if (a2) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        n2.setVisibility(visibility);
        final w7q d2 = n0.d;
        final String j = l.j;
        Objects.requireNonNull(d2);
        if (flr.g((CharSequence)j)) {
            d2.H0.setText((CharSequence)j);
            ((View)d2.H0).setVisibility(0);
        }
        else {
            ((View)d2.H0).setVisibility(8);
        }
        n0.d.I0.setHint((CharSequence)l.k);
        n0.d.o(l.n);
        n0.d.Q0.c(l.o, l.p);
        if (n0.a != v8q.I0) {
            ((View)n0.d.J0.getEditText()).setOnFocusChangeListener((View$OnFocusChangeListener)new u7q(n0, l));
            f.j((t5j)n0.d.R0, (fa3)new zcl((Object)n0, (Object)l, 2), (gba)n0.j);
        }
        n0.d.M0.setOnClickListener((View$OnClickListener)new zgk((Object)n0, (Object)l, 18));
        n0.a(n0.a, l);
        final ush e = n0.e;
        e.f = (View$OnClickListener)new d1x((Object)n0, 29);
        e.e = (View$OnClickListener)new v8w((Object)n0, (Object)l, 14);
        n0.g.b(n0.d.O0, l.s);
        final SignUpStepFormPresenter n3 = x7q.N0;
        Objects.requireNonNull(n3);
        final v8q g0 = v8q.G0;
        final v8q h0 = v8q.H0;
        final vtr f = b.f;
        if (f != null) {
            final int a3 = f.a;
            if (a3 != 1) {
                if (a3 != 2) {
                    if (a3 != 3) {
                        if (a3 != 4) {
                            if (a3 != 5) {
                                if (a3 == 7) {
                                    final w7q d3 = n3.d;
                                    ((TextView)d3.I0.getEditText()).setText((CharSequence)"");
                                    ((TextView)d3.J0.getEditText()).setText((CharSequence)"");
                                    d3.Q0.b();
                                    ((View)d3.I0).requestFocus();
                                }
                            }
                            else {
                                final w7q d4 = n3.d;
                                d4.k();
                                ((TextView)d4.J0.getEditText()).setText((CharSequence)"");
                            }
                        }
                        else {
                            ((View)n3.d.Q0.b).requestFocus();
                        }
                    }
                    else {
                        final w7q d5 = n3.d;
                        hdx.z((Context)d5.F0, (View)d5.I0, true);
                        ((View)d5.I0).requestFocus();
                        d5.I0.getEditText().selectAll();
                    }
                }
                else if (n3.a == g0) {
                    n3.a(h0, l);
                    n3.d.k();
                }
                else {
                    final w7q d6 = n3.d;
                    d6.k();
                    d6.J0.getEditText().selectAll();
                }
            }
            else if (n3.a == h0) {
                n3.a(g0, l);
                n3.d.k();
            }
            else {
                final w7q d7 = n3.d;
                d7.k();
                d7.J0.getEditText().selectAll();
            }
        }
        x7q.Q0.N0.setOnClickListener((View$OnClickListener)new qsk((Object)x7q, 25));
        final ywk m0 = x7q.M0;
        if (m0.a()) {
            final gck i = m0.j;
            final zga zga = new zga((Object)m0, 1);
            final fda k = m0.i;
            Objects.requireNonNull(i);
            e0e.f((Object)k, "eventObservable");
            vo.b(k, 1991, (stb)new hck((gck$b)zga));
        }
        else if (m0.e.a((Context)m0.f, new String[] { "android.permission.READ_PHONE_STATE" }) || m0.e.a((Context)m0.f, new String[] { "android.permission.READ_CONTACTS" })) {
            m0.g.c(bbq.Q((idq)m0.b, (idq)m0.c, (hw1)new ke4((Object)m0, 1)).G((rk6)new i9f((Object)m0, 14), (rk6)lvb.e));
        }
        if (l.u != null) {
            x7q.S0.b(x7q.R0.c.map((rtb)dkc.T0).subscribe((rk6)new ec2((Object)x7q, 22)));
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.d0(((Activity)this).getIntent());
    }
    
    public final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.d0(intent);
    }
}
