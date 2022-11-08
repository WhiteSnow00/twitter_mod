// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = { 664 }, m = "invokeSuspend")
public final class zh9 extends xzr implements gub<hpk, ap6<? super oyv>, Object>
{
    public int C0;
    public /* synthetic */ Object D0;
    public final /* synthetic */ otb<oyv> E0;
    
    public zh9(final otb<oyv> e0, final ap6<? super zh9> ap6) {
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object d0, final ap6<?> ap6) {
        final zh9 zh9 = new zh9(this.E0, (ap6<? super zh9>)ap6);
        zh9.D0 = d0;
        return (ap6<oyv>)zh9;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((zh9)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
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
            final rtb<qfj, oyv> rtb = (rtb<qfj, oyv>)new rtb<qfj, oyv>() {
                public final /* synthetic */ otb<oyv> C0 = zh9.this.E0;
                
                public final Object invoke(final Object o) {
                    final long a = ((qfj)o).a;
                    this.C0.invoke();
                    return oyv.a;
                }
            };
            this.C0 = 1;
            if (das.f(hpk, (rtb)rtb, (ap6)this) == c0) {
                return c0;
            }
        }
        return oyv.a;
    }
}
