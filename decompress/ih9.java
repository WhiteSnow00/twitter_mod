// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = { 664 }, m = "invokeSuspend")
public final class ih9 extends p0s implements ftb<ppk, go6<? super fzv>, Object>
{
    public int D0;
    public Object E0;
    public final nsb<fzv> F0;
    
    public ih9(final nsb<fzv> f0, final go6<? super ih9> go6) {
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object e0, final go6<?> go6) {
        final ih9 ih9 = new ih9(this.F0, (go6<? super ih9>)go6);
        ih9.E0 = e0;
        return (go6<fzv>)ih9;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ih9)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
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
            final ppk ppk = (ppk)this.E0;
            final ih9$a ih9$a = new ih9$a((nsb)this.F0);
            this.D0 = 1;
            if (yas.f(ppk, (qsb)ih9$a, (go6)this) == d0) {
                return d0;
            }
        }
        return fzv.a;
    }
}
