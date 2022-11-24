// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$1$1", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<jro, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SafetyModePreviewViewModel G0;
    
    public a(final SafetyModePreviewViewModel g0, final mp6<? super a> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final a a = new a(this.G0, (mp6<? super a>)mp6);
        a.F0 = f0;
        return (mp6<vzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final jro jro = (jro)this.F0;
        final SafetyModePreviewViewModel g0 = this.G0;
        final a$a a$a = new a$a(jro);
        final ape<Object>[] s0 = SafetyModePreviewViewModel.S0;
        g0.Q((stb)a$a);
        return vzv.a;
    }
}
