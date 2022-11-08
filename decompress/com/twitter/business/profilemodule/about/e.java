// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.profilemodule.about;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.profilemodule.about.AboutModuleViewModel$intents$2$5", f = "AboutModuleViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends xzr implements gub<y7.b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ AboutModuleViewModel D0;
    
    public e(final AboutModuleViewModel d0, final ap6<? super e> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final e e = new e(this.D0, (ap6<? super e>)ap6);
        e.C0 = c0;
        return (ap6<oyv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final int ordinal = ((Enum)((y7.b)this.C0).a).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        final AboutModuleViewModel d0 = this.D0;
                        final e$b e$b = new e$b(d0);
                        final AboutModuleViewModel$b companion = AboutModuleViewModel.Companion;
                        ((MviViewModel)d0).T((rtb)e$b);
                        this.D0.R0.s();
                    }
                }
                else {
                    final AboutModuleViewModel d2 = this.D0;
                    final e$d e$d = new e$d(d2);
                    final AboutModuleViewModel$b companion2 = AboutModuleViewModel.Companion;
                    ((MviViewModel)d2).T((rtb)e$d);
                    this.D0.R0.o();
                }
            }
            else {
                final AboutModuleViewModel d3 = this.D0;
                final e$c e$c = new e$c(d3);
                final AboutModuleViewModel$b companion3 = AboutModuleViewModel.Companion;
                ((MviViewModel)d3).T((rtb)e$c);
                this.D0.R0.d();
            }
        }
        else {
            final AboutModuleViewModel d4 = this.D0;
            final e$a e$a = new e$a(d4);
            final AboutModuleViewModel$b companion4 = AboutModuleViewModel.Companion;
            ((MviViewModel)d4).T((rtb)e$a);
            this.D0.R0.e();
        }
        return oyv.a;
    }
}
