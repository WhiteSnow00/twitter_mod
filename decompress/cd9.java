// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = { 190 }, m = "invokeSuspend")
public final class cd9 extends l1s implements kub<iz6, crw, mp6<? super vzv>, Object>
{
    public int F0;
    public iz6 G0;
    public long H0;
    public final kub<iz6, Float, mp6<? super vzv>, Object> I0;
    public final dpj J0;
    
    public cd9(final kub<? super iz6, ? super Float, ? super mp6<? super vzv>, ?> i0, final dpj j0, final mp6<? super cd9> mp6) {
        this.I0 = (kub<iz6, Float, mp6<? super vzv>, Object>)i0;
        this.J0 = j0;
        super(3, (mp6)mp6);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final iz6 g0 = (iz6)o;
        final long a = ((crw)o2).a;
        final cd9 cd9 = new cd9(this.I0, this.J0, (mp6<? super cd9>)o3);
        cd9.G0 = g0;
        cd9.H0 = a;
        return cd9.invokeSuspend(vzv.a);
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
            final iz6 g0 = this.G0;
            final long h0 = this.H0;
            final kub<iz6, Float, mp6<? super vzv>, Object> i0 = this.I0;
            float n;
            if (this.J0 == dpj.F0) {
                n = crw.c(h0);
            }
            else {
                n = crw.b(h0);
            }
            final Float n2 = new Float(n);
            this.F0 = 1;
            if (i0.h0((Object)g0, (Object)n2, (Object)this) == f0) {
                return f0;
            }
        }
        return vzv.a;
    }
}
