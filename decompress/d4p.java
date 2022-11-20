// 
// Decompiled by Procyon v0.6.0
// 

public final class d4p extends ste implements nsb<Boolean>
{
    public final m8r<q4p> D0;
    
    public d4p(final m8r<q4p> d0) {
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final q4p q4p = (q4p)this.D0.getValue();
        final boolean a = q4p.d.a();
        boolean b = false;
        if (!a && !(boolean)q4p.g.getValue()) {
            final vqj f = q4p.f;
            if (f == null || !f.c()) {
                return b;
            }
        }
        b = true;
        return b;
    }
}
