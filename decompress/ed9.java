// 
// Decompiled by Procyon v0.6.0
// 

public final class ed9 implements g39
{
    public final fvh a;
    public final iuh b;
    
    public ed9(final fvh a, final iuh b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final nc9 nc9 = (nc9)this.a.getValue();
        if (nc9 != null) {
            final iuh b = this.b;
            if (b != null) {
                b.c((fvd)new mc9(nc9));
            }
            this.a.setValue((Object)null);
        }
    }
}
