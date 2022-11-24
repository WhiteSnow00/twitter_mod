// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
public final class d3s extends l1s implements kub<iz6, Float, mp6<? super vzv>, Object>
{
    public iz6 F0;
    public float G0;
    public final o3s<Object> H0;
    
    public d3s(final o3s<Object> h0, final mp6<? super d3s> mp6) {
        this.H0 = h0;
        super(3, (mp6)mp6);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final iz6 f0 = (iz6)o;
        final float floatValue = ((Number)o2).floatValue();
        final d3s d3s = new d3s(this.H0, (mp6<? super d3s>)o3);
        d3s.F0 = f0;
        d3s.G0 = floatValue;
        final vzv a = vzv.a;
        d3s.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        ma7.D(this.F0, (yy6)null, 0, (hub)new hub<iz6, mp6<? super vzv>, Object>(this.H0, this.G0, null) {
            public int F0;
            public final o3s<Object> G0;
            public final float H0;
            
            public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                return (mp6<vzv>)new hub<iz6, mp6<? super vzv>, Object>(this.G0, this.H0, mp6) {
                    public int F0;
                    public final o3s<Object> G0;
                    public final float H0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((d3s$a)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
            }
            
            public final Object invokeSuspend(Object o) {
                final jz6 f0 = jz6.F0;
                final int f2 = this.F0;
                if (f2 != 0) {
                    if (f2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jb2.M0(o);
                }
                else {
                    jb2.M0(o);
                    final o3s<Object> g0 = this.G0;
                    final float h0 = this.H0;
                    this.F0 = 1;
                    o = g0.j.b((f8b)new p3s((o3s)g0, h0), (mp6)this);
                    if (o != f0) {
                        o = vzv.a;
                    }
                    if (o == f0) {
                        return f0;
                    }
                }
                return vzv.a;
            }
        }, 3);
        return vzv.a;
    }
}
