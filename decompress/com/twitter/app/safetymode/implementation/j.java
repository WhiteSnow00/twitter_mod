// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@sa8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$4", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends p0s implements ftb<rqo.e, go6<? super fzv>, Object>
{
    public final SafetyModePreviewViewModel D0;
    
    public j(final SafetyModePreviewViewModel d0, final go6<? super j> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new j(this.D0, (go6<? super j>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SafetyModePreviewViewModel d0 = this.D0;
        final lqo a = lqo.a;
        final String o2 = d0.O0;
        czd.f((Object)o2, "page");
        d0.W(vba.Companion.e(o2, "safety_mode_prompt", "education_sheet", "", "impression"));
        this.D0.V((Object)oqo$d.a);
        return fzv.a;
    }
}
