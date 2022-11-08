// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1", f = "SelectionContainer.kt", l = { 126 }, m = "invokeSuspend")
public final class aep extends xzr implements gub<hpk, ap6<? super oyv>, Object>
{
    public int C0;
    public /* synthetic */ Object D0;
    public final /* synthetic */ res E0;
    
    public aep(final res e0, final ap6<? super aep> ap6) {
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object d0, final ap6<?> ap6) {
        final aep aep = new aep(this.E0, (ap6<? super aep>)ap6);
        aep.D0 = d0;
        return (ap6<oyv>)aep;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((aep)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
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
            final hpk hpk = (hpk)this.D0;
            final res e0 = this.E0;
            this.C0 = 1;
            if (ccg.a(hpk, e0, (ap6)this) == c0) {
                return c0;
            }
        }
        return oyv.a;
    }
}
