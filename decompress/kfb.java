// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", l = { 163 }, m = "invokeSuspend")
public final class kfb extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public puh D0;
    public int E0;
    public final puh<xdb> F0;
    public final sth G0;
    
    public kfb(final puh<xdb> f0, final sth g0, final go6<? super kfb> go6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new kfb(this.F0, this.G0, (go6<? super kfb>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((kfb)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final dy6 d0 = dy6.D0;
        final int e0 = this.E0;
        puh puh = null;
        Label_0122: {
            puh f0;
            if (e0 != 0) {
                if (e0 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final puh d2 = this.D0;
                b1n.u(o);
                f0 = d2;
            }
            else {
                b1n.u(o);
                final xdb xdb = (xdb)this.F0.getValue();
                if (xdb == null) {
                    return fzv.a;
                }
                final sth g0 = this.G0;
                f0 = this.F0;
                final ydb ydb = new ydb(xdb);
                puh = f0;
                if (g0 == null) {
                    break Label_0122;
                }
                this.D0 = f0;
                this.E0 = 1;
                if (g0.a((dud)ydb, (go6)this) == d0) {
                    return d0;
                }
            }
            puh = f0;
        }
        puh.setValue((Object)null);
        return fzv.a;
    }
}
