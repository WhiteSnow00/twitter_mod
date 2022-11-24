// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$4", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends l1s implements hub<kro$e, mp6<? super vzv>, Object>
{
    public final SafetyModePreviewViewModel F0;
    
    public j(final SafetyModePreviewViewModel f0, final mp6<? super j> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new j(this.F0, (mp6<? super j>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final SafetyModePreviewViewModel f0 = this.F0;
        final ero a = ero.a;
        final String q0 = f0.Q0;
        e0e.f((Object)q0, "page");
        f0.W(dda.Companion.e(q0, "safety_mode_prompt", "education_sheet", "", "impression"));
        this.F0.V((Object)hro$d.a);
        return vzv.a;
    }
}
