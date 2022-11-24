// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf;

import android.view.View;
import android.widget.TextView;
import android.view.View$OnFocusChangeListener;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import android.widget.EditText;
import android.widget.DatePicker$OnDateChangedListener;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputLayout;
import android.app.Activity;
import kotlin.Metadata;

@a91
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Lcom/twitter/onboarding/ocf/OcfDateViewDelegate;", "", "a", "subsystem.tfa.ocf.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class OcfDateViewDelegate
{
    public final Activity a;
    public final TextInputLayout b;
    public final DatePicker c;
    public sa8 d;
    public final uv1<noj<sa8>> e;
    public final t5j<noj<sa8>> f;
    public final fdj g;
    
    public OcfDateViewDelegate(final Activity a, final TextInputLayout b, final DatePicker c, final sa8 d, final duo duo) {
        e0e.f((Object)a, "activity");
        e0e.f((Object)b, "dateField");
        e0e.f((Object)c, "datePicker");
        e0e.f((Object)duo, "savedStateHandler");
        this.a = a;
        this.b = b;
        this.c = c;
        final uv1 uv1 = new uv1();
        this.e = (uv1<noj<sa8>>)uv1;
        this.f = uv1;
        final fdj g = new fdj(this);
        this.g = g;
        duo.b(this);
        if (this.d == null) {
            this.d = d;
        }
        final EditText editText = b.getEditText();
        if (editText != null) {
            ((TextView)editText).setShowSoftInputOnFocus(false);
        }
        final g5s a2 = nq1.a;
        c.setMaxDate(System.currentTimeMillis());
        final sa8 d2 = this.d;
        vzv a3;
        if (d2 != null) {
            this.a(d2);
            c.init(d2.a, d2.b - 1, d2.c, (DatePicker$OnDateChangedListener)g);
            a3 = vzv.a;
        }
        else {
            a3 = null;
        }
        if (a3 == null) {
            this.b();
        }
    }
    
    public final void a(final sa8 sa8) {
        final Date time = new GregorianCalendar(sa8.a, sa8.b - 1, sa8.c).getTime();
        final EditText editText = this.b.getEditText();
        if (editText != null) {
            ((TextView)editText).setText((CharSequence)DateFormat.getDateInstance(1).format(time));
        }
        this.e.onNext((Object)new noj((Object)sa8));
    }
    
    public final void b() {
        final Calendar instance = Calendar.getInstance();
        this.c.init(instance.get(1), instance.get(2), instance.get(5), (DatePicker$OnDateChangedListener)this.g);
        this.d = null;
        final EditText editText = this.b.getEditText();
        if (editText != null) {
            ((TextView)editText).setText((CharSequence)"");
        }
        final uv1<noj<sa8>> e = this.e;
        final noj b = noj.b;
        final int a = o5j.a;
        e.onNext((Object)b);
    }
    
    public final void c(final String hint, final String s) {
        e0e.f((Object)hint, "hint");
        this.b.setHint((CharSequence)hint);
        final a a = new a(this.a, this.c);
        final EditText editText = this.b.getEditText();
        if (editText != null) {
            ((View)editText).setOnFocusChangeListener((View$OnFocusChangeListener)new edj(this, s, hint, a));
        }
    }
    
    public static final class a
    {
        public final Activity a;
        public final DatePicker b;
        
        public a(final Activity a, final DatePicker b) {
            e0e.f((Object)a, "activity");
            e0e.f((Object)b, "datePicker");
            this.a = a;
            this.b = b;
        }
    }
}
