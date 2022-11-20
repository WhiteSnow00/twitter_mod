// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
public final class i2s extends p0s implements itb<cy6, Float, go6<? super fzv>, Object>
{
    public cy6 D0;
    public float E0;
    public final u2s<Object> F0;
    
    public i2s(final u2s<Object> f0, final go6<? super i2s> go6) {
        this.F0 = f0;
        super(3, (go6)go6);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final cy6 d0 = (cy6)o;
        final float floatValue = ((Number)o2).floatValue();
        final i2s i2s = new i2s(this.F0, (go6<? super i2s>)o3);
        i2s.D0 = d0;
        i2s.E0 = floatValue;
        final fzv a = fzv.a;
        i2s.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        as2.M(this.D0, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(this.F0, this.E0, null) {
            public int D0;
            public final u2s<Object> E0;
            public final float F0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                    public int D0;
                    public final u2s<Object> E0;
                    public final float F0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((i2s$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
            }
            
            public final Object invokeSuspend(Object o) {
                final dy6 d0 = dy6.D0;
                final int d2 = this.D0;
                if (d2 != 0) {
                    if (d2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b1n.u(o);
                }
                else {
                    b1n.u(o);
                    final u2s<Object> e0 = this.E0;
                    final float f0 = this.F0;
                    this.D0 = 1;
                    o = e0.j.b((e7b)new v2s(e0, f0), (go6)this);
                    if (o != d0) {
                        o = fzv.a;
                    }
                    if (o == d0) {
                        return d0;
                    }
                }
                return fzv.a;
            }
        }, 3);
        return fzv.a;
    }
}
