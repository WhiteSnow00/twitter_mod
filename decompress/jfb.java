// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", l = { 152, 156 }, m = "invokeSuspend")
public final class jfb extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public Object D0;
    public int E0;
    public final puh<xdb> F0;
    public final sth G0;
    
    public jfb(final puh<xdb> f0, final sth g0, final go6<? super jfb> go6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new jfb(this.F0, this.G0, (go6<? super jfb>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((jfb)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object value) {
        final dy6 d0 = dy6.D0;
        final int e0 = this.E0;
        Label_0204: {
            Label_0154: {
                puh puh2 = null;
                Label_0147: {
                    puh f0;
                    if (e0 != 0) {
                        if (e0 != 1) {
                            if (e0 == 2) {
                                final xdb xdb = (xdb)this.D0;
                                b1n.u(value);
                                value = xdb;
                                break Label_0204;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            final puh puh = (puh)this.D0;
                            b1n.u(value);
                            f0 = puh;
                        }
                    }
                    else {
                        b1n.u(value);
                        final xdb xdb2 = (xdb)this.F0.getValue();
                        if (xdb2 == null) {
                            break Label_0154;
                        }
                        final sth g0 = this.G0;
                        f0 = this.F0;
                        final ydb ydb = new ydb(xdb2);
                        puh2 = f0;
                        if (g0 == null) {
                            break Label_0147;
                        }
                        this.D0 = f0;
                        this.E0 = 1;
                        if (g0.a((dud)ydb, (go6)this) == d0) {
                            return d0;
                        }
                    }
                    puh2 = f0;
                }
                puh2.setValue((Object)null);
            }
            final Object d2 = new xdb();
            final sth g2 = this.G0;
            value = d2;
            if (g2 != null) {
                this.D0 = d2;
                this.E0 = 2;
                if (g2.a((dud)d2, (go6)this) == d0) {
                    return d0;
                }
                value = d2;
            }
        }
        this.F0.setValue(value);
        return fzv.a;
    }
}
