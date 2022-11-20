// 
// Decompiled by Procyon v0.6.0
// 

public final class euj<T> implements e7b
{
    public final e7b D0;
    
    public euj(final e7b d0) {
        this.D0 = d0;
    }
    
    public final Object a(final Object o, final go6 go6) {
        euj$a euj$a2 = null;
        Label_0051: {
            if (go6 instanceof euj$a) {
                final euj$a euj$a = (euj$a)go6;
                final int e0 = euj$a.E0;
                if ((e0 & Integer.MIN_VALUE) != 0x0) {
                    euj$a.E0 = e0 + Integer.MIN_VALUE;
                    euj$a2 = euj$a;
                    break Label_0051;
                }
            }
            euj$a2 = new euj$a(this, go6);
        }
        final Object d0 = euj$a2.D0;
        final dy6 d2 = dy6.D0;
        final int e2 = euj$a2.E0;
        if (e2 != 0) {
            if (e2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1n.u(d0);
        }
        else {
            b1n.u(d0);
            final e7b d3 = this.D0;
            if ((boolean)o ^ true) {
                euj$a2.E0 = 1;
                if (d3.a(o, (go6)euj$a2) == d2) {
                    return d2;
                }
            }
        }
        return fzv.a;
    }
}
