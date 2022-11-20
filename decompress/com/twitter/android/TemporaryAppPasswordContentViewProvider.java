// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

@v81
public class TemporaryAppPasswordContentViewProvider extends ucv<String>
{
    public boolean c1;
    public final z9j<zds> d1;
    public final jn e1;
    public String f1;
    
    public TemporaryAppPasswordContentViewProvider(final tcv tcv, final jto jto, final kas kas, final jn e1, final jkb jkb) {
        super(tcv);
        if (tcv.q == null) {
            final af4 af4 = new af4();
            ((u0p)af4).q(new String[] { "temporary_app_password::::impression" });
            cbw.b((elm)af4);
        }
        jto.b((Object)this);
        final gdv y0 = super.Y0;
        final Context q0 = this.q0();
        y0.S1((my5)new b(q0, new a(q0), (ny5<Object>)new e71((Object)this, 10), jkb));
        if (!ikr.e((CharSequence)this.f1)) {
            this.e1(this.f1);
        }
        else {
            this.d1("");
        }
        this.e1 = e1;
        final z9j<zds> a = kas.a(zds.class);
        this.d1 = a;
        f.j((h5j)a.a(), (n93)new gg1((Object)this, 1), (z9a)super.P0);
    }
    
    public final void M0() {
        super.M0();
        if (ikr.e((CharSequence)this.f1) && !this.c1) {
            this.d1.d(new zds(super.G0));
            this.c1 = true;
        }
    }
    
    public final void d1(final String f1) {
        if (!f1.equals(this.f1)) {
            this.e1(f1);
            this.f1 = f1;
        }
    }
    
    public final void e1(final String s) {
        Object j;
        if (ikr.g((CharSequence)s)) {
            j = new ckf((Iterable)rif.v((Object)s));
        }
        else {
            j = n3e.j();
        }
        this.Z0((n3e)j);
    }
    
    public final void f1(final int n) {
        m1f.e().a((CharSequence)this.z0().getString(n), 1);
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        gdv$b.a = "temp_password";
        gdv$b.c = 2131625770;
        return gdv$b;
    }
    
    public static final class a extends y2e<String>
    {
        public a(final Context context) {
            super(context);
        }
        
        public final void a(final View view, final Context context, final Object o) {
            final String s = (String)o;
            final TextView textView = (TextView)view.findViewById(2131427760);
            String string;
            if (s != null && s.length() == 12) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, 4));
                sb.append(" ");
                sb.append(s.substring(4, 8));
                sb.append(" ");
                sb.append(s.substring(8));
                string = sb.toString();
            }
            else {
                string = "";
            }
            textView.setText((CharSequence)string);
        }
        
        public final View f(final Context context, final int n, final ViewGroup viewGroup) {
            return LayoutInflater.from(context).inflate(2131624089, (ViewGroup)null);
        }
    }
    
    public static final class b extends fhc<String, a>
    {
        public final y8q J0;
        public final jkb K0;
        
        public b(final Context context, final a a, final ny5<Object> ny5, final jkb k0) {
            super((my5)a, 2, (ny5)ny5);
            this.J0 = new y8q(context.getString(2131954198));
            this.K0 = k0;
        }
        
        public final Object d() {
            return this.J0;
        }
        
        public final View e(final ViewGroup viewGroup) {
            return aaq.a(viewGroup, this.J0, this.K0.c);
        }
        
        public final Object g() {
            return null;
        }
        
        public final View h(final ViewGroup viewGroup) {
            return null;
        }
    }
}
