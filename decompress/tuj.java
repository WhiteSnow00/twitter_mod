// 
// Decompiled by Procyon v0.6.0
// 

public final class tuj<T> implements f8b
{
    public final f8b F0;
    
    public tuj(final f8b f0) {
        this.F0 = f0;
    }
    
    public final Object a(final Object o, final mp6 mp6) {
        tuj$a tuj$a2 = null;
        Label_0051: {
            if (mp6 instanceof tuj$a) {
                final tuj$a tuj$a = (tuj$a)mp6;
                final int g0 = tuj$a.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    tuj$a.G0 = g0 + Integer.MIN_VALUE;
                    tuj$a2 = tuj$a;
                    break Label_0051;
                }
            }
            tuj$a2 = new tuj$a(this, mp6);
        }
        final Object f0 = tuj$a2.F0;
        final jz6 f2 = jz6.F0;
        final int g2 = tuj$a2.G0;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jb2.M0(f0);
        }
        else {
            jb2.M0(f0);
            final f8b f3 = this.F0;
            if ((boolean)o ^ true) {
                tuj$a2.G0 = 1;
                if (f3.a(o, (mp6)tuj$a2) == f2) {
                    return f2;
                }
            }
        }
        return vzv.a;
    }
}
