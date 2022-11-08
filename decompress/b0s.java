// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", f = "SuspendingPointerInputFilter.kt", l = { 244 }, m = "invokeSuspend")
public final class b0s extends xzr implements gub<yy6, ap6<? super oyv>, Object>
{
    public int C0;
    public /* synthetic */ Object D0;
    public final /* synthetic */ a0s E0;
    public final /* synthetic */ gub<hpk, ap6<? super oyv>, Object> F0;
    
    public b0s(final a0s e0, final gub<? super hpk, ? super ap6<? super oyv>, ?> f0, final ap6<? super b0s> ap6) {
        this.E0 = e0;
        this.F0 = (gub<hpk, ap6<? super oyv>, Object>)f0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object d0, final ap6<?> ap6) {
        final b0s b0s = new b0s(this.E0, this.F0, (ap6<? super b0s>)ap6);
        b0s.D0 = d0;
        return (ap6<oyv>)b0s;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((b0s)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final zy6 c0 = zy6.C0;
        final int c2 = this.C0;
        if (c2 != 0) {
            if (c2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq9.b1(o);
        }
        else {
            kq9.b1(o);
            this.E0.O((yy6)this.D0);
            final gub<hpk, ap6<? super oyv>, Object> f0 = this.F0;
            final a0s e0 = this.E0;
            this.C0 = 1;
            if (f0.invoke((Object)e0, (Object)this) == c0) {
                return c0;
            }
        }
        return oyv.a;
    }
}
