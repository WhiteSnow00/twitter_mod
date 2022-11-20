// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", l = { 144 }, m = "invokeSuspend")
public final class ifb extends p0s implements ftb<cy6, go6<? super fzv>, Object>
{
    public sdk$a D0;
    public int E0;
    public final ae2 F0;
    public final puh<sdk> G0;
    
    public ifb(final ae2 f0, final puh<sdk> g0, final go6<? super ifb> go6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new ifb(this.F0, this.G0, (go6<? super ifb>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ifb)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(Object a) {
        final dy6 d0 = dy6.D0;
        final int e0 = this.E0;
        final sdk$a sdk$a = null;
        sdk$a sdk$a2 = null;
        Throwable t = null;
        Label_0048: {
            if (e0 == 0) {
                break Label_0048;
            }
            Label_0038: {
                if (e0 != 1) {
                    break Label_0038;
                }
                sdk$a d2;
                Object o = d2 = this.D0;
                try {
                    b1n.u(a);
                    while (true) {
                    Label_0087_Outer:
                        while (true) {
                            while (true) {
                                Label_0123: {
                                    break Label_0123;
                                    try {
                                        final ae2 f0 = this.F0;
                                        this.D0 = (sdk$a)a;
                                        this.E0 = 1;
                                        if (f0.a((c6m)null, (go6)this) == d0) {
                                            return d0;
                                        }
                                        o = a;
                                        if (o != null) {
                                            ((sdk$a)o).a();
                                        }
                                        return fzv.a;
                                    }
                                    finally {}
                                }
                                d2 = sdk$a;
                                final sdk sdk;
                                a = sdk.a();
                                continue;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            Label_0085: {
                                a = null;
                            }
                            continue Label_0087_Outer;
                        }
                        b1n.u(a);
                        d2 = sdk$a;
                        final sdk sdk = (sdk)((m8r)this.G0).getValue();
                        iftrue(Label_0085:)(sdk == null);
                        continue;
                    }
                }
                finally {
                    sdk$a2 = d2;
                    final Throwable t2;
                    t = t2;
                }
            }
        }
        if (sdk$a2 != null) {
            sdk$a2.a();
        }
        throw t;
    }
}
