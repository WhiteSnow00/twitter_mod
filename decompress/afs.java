// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = { 50, 52 }, m = "invokeSuspend")
public final class afs extends xzr implements gub<yy6, ap6<? super oyv>, Object>
{
    public int C0;
    public final /* synthetic */ c80<Float, lc0> D0;
    
    public afs(final c80<Float, lc0> d0, final ap6<? super afs> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new afs(this.D0, (ap6<? super afs>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((afs)this.create(o, (ap6<?>)o2)).invokeSuspend(oyv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final zy6 c0 = zy6.C0;
        final int c2 = this.C0;
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 == 2) {
                    kq9.b1(o);
                    return oyv.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                kq9.b1(o);
            }
        }
        else {
            kq9.b1(o);
            final c80<Float, lc0> d0 = this.D0;
            final Float n = new Float(1.0f);
            this.C0 = 1;
            if (d0.g((Object)n, (ap6)this) == c0) {
                return c0;
            }
        }
        final c80<Float, lc0> d2 = this.D0;
        final Float n2 = new Float(0.0f);
        final rld a = dfs.a;
        this.C0 = 2;
        if (c80.c((c80)d2, (Object)n2, (dc0)a, (rtb)null, (ap6)this, 12) == c0) {
            return c0;
        }
        return oyv.a;
    }
}
