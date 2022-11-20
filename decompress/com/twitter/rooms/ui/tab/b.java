// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab;

@sa8(c = "com.twitter.rooms.ui.tab.SpacesTabViewModel$intents$2$2", f = "SpacesTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<izq$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final SpacesTabViewModel E0;
    
    public b(final SpacesTabViewModel e0, final go6<? super b> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final b b = new b(this.E0, (go6<? super b>)go6);
        b.D0 = d0;
        return (go6<fzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final izq$a izq$a = (izq$a)this.D0;
        final SpacesTabViewModel e0 = this.E0;
        final String a = izq$a.a;
        final coe<Object>[] v0 = SpacesTabViewModel.V0;
        e0.W(a, true, false);
        return fzv.a;
    }
}
