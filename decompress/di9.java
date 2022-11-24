// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = { 450 }, m = "invokeSuspend")
public final class di9 extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public int F0;
    public final zi9 G0;
    
    public di9(final zi9 g0, final mp6<? super di9> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new di9(this.G0, (mp6<? super di9>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((di9)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
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
            final zi9 g0 = this.G0;
            this.F0 = 1;
            if (g0.a((mp6<? super vzv>)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
