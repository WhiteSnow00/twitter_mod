// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import java.util.Objects;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$fetchEditableProfileModules$1$1", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<snj<z8w>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ProfessionalSettingsViewModel D0;
    
    public a(final ProfessionalSettingsViewModel d0, final ap6<? super a> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final a a = new a(this.D0, (ap6<? super a>)ap6);
        a.C0 = c0;
        return (ap6<oyv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (ap6<?>)o2);
        final oyv a2 = oyv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(Object c) {
        kq9.b1(c);
        final snj snj = (snj)this.C0;
        if (snj.f()) {
            this.D0.O0.a(w4l.n);
            c = snj.c();
            final ProfessionalSettingsViewModel d0 = this.D0;
            final z8w z8w = (z8w)c;
            final u4l t0 = d0.T0;
            Objects.requireNonNull(t0);
            String string = null;
            Label_0205: {
                if (z8w != null) {
                    final String s = (String)or4.I1(z8w.a);
                    final String s2 = null;
                    String b = null;
                    Label_0179: {
                        if (s != null) {
                            while (true) {
                                for (final Object next : z8w.b) {
                                    final y8w d2 = ((x8w)next).d;
                                    String a;
                                    if (d2 != null) {
                                        a = d2.a;
                                    }
                                    else {
                                        a = null;
                                    }
                                    if (zzd.a((Object)a, (Object)s)) {
                                        c = next;
                                        final x8w x8w = (x8w)c;
                                        b = s2;
                                        if (x8w != null) {
                                            b = x8w.b;
                                        }
                                        break Label_0179;
                                    }
                                }
                                c = null;
                                continue;
                            }
                        }
                        b = s2;
                    }
                    if ((string = b) != null) {
                        break Label_0205;
                    }
                }
                string = t0.a.getString(2131955116);
                zzd.e((Object)string, "resources.getString(R.string.module_row_none)");
            }
            ((MviViewModel)d0).Q((rtb)new a$a(string, z8w));
        }
        else {
            this.D0.O0.a(w4l.o);
            final ProfessionalSettingsViewModel d3 = this.D0;
            Objects.requireNonNull(d3);
            ((MviViewModel)d3).V((Object)new v4l.g(2131953913));
        }
        return oyv.a;
    }
}
