import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.blast.util.collection.SequenceExtensionsKt$takeIfNotEmpty$1", f = "SequenceExtensions.kt", l = { 11, 11 }, m = "invokeSuspend")
public final class jjp extends trm implements gub<kjp<Object>, ap6<? super oyv>, Object>
{
    public int D0;
    public /* synthetic */ Object E0;
    public final /* synthetic */ Iterator<Object> F0;
    public final /* synthetic */ gjp<Object> G0;
    
    public jjp(final Iterator<Object> f0, final gjp<Object> g0, final ap6<? super jjp> ap6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object e0, final ap6<?> ap6) {
        final jjp jjp = new jjp(this.F0, this.G0, (ap6<? super jjp>)ap6);
        jjp.E0 = e0;
        return (ap6<oyv>)jjp;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((jjp)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final zy6 c0 = zy6.C0;
        final int d0 = this.D0;
        if (d0 != 0) {
            if (d0 != 1 && d0 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(o);
        }
        else {
            kq9.b1(o);
            final kjp kjp = (kjp)this.E0;
            if (this.F0.hasNext()) {
                final Iterator<Object> f0 = this.F0;
                this.D0 = 1;
                if (kjp.e((Iterator)f0, (ap6)this) == c0) {
                    return c0;
                }
            }
            else {
                final gjp<Object> g0 = this.G0;
                this.D0 = 2;
                if (kjp.c((gjp)g0, (ap6)this) == c0) {
                    return c0;
                }
            }
        }
        return oyv.a;
    }
}
