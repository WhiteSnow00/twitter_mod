// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

@gb8(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2", f = "Wrapper.android.kt", l = { 154 }, m = "invokeSuspend")
public final class b extends xzr implements gub<yy6, ap6<? super oyv>, Object>
{
    public int C0;
    public final /* synthetic */ WrappedComposition D0;
    
    public b(final WrappedComposition d0, final ap6<? super b> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new b(this.D0, (ap6<? super b>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((b)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(Object o) {
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
            final AndroidComposeView c3 = this.D0.C0;
            this.C0 = 1;
            o = c3.O0.j((ap6<? super oyv>)this);
            if (o != c0) {
                o = oyv.a;
            }
            if (o == c0) {
                return c0;
            }
        }
        return oyv.a;
    }
}
