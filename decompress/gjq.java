// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = { 153 }, m = "invokeSuspend")
public final class gjq extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public Object G0;
    public final hub<k1l<Object>, mp6<? super vzv>, Object> H0;
    public final fvh<Object> I0;
    
    public gjq(final hub<? super k1l<Object>, ? super mp6<? super vzv>, ?> h0, final fvh<Object> i0, final mp6<? super gjq> mp6) {
        this.H0 = (hub<k1l<Object>, mp6<? super vzv>, Object>)h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object g0, final mp6<?> mp6) {
        final gjq gjq = new gjq(this.H0, this.I0, (mp6<? super gjq>)mp6);
        gjq.G0 = g0;
        return (mp6<vzv>)gjq;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((gjq)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
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
            final iz6 iz6 = (iz6)this.G0;
            final hub<k1l<Object>, mp6<? super vzv>, Object> h0 = this.H0;
            final l1l l1l = new l1l(this.I0, iz6.A());
            this.F0 = 1;
            if (h0.invoke((Object)l1l, (Object)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
