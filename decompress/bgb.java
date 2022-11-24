// 
// Decompiled by Procyon v0.6.0
// 

public final class bgb implements g39
{
    public final fvh a;
    public final iuh b;
    
    public bgb(final fvh a, final iuh b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final yeb yeb = (yeb)this.a.getValue();
        if (yeb != null) {
            final zeb zeb = new zeb(yeb);
            final iuh b = this.b;
            if (b != null) {
                b.c((fvd)zeb);
            }
            this.a.setValue((Object)null);
        }
    }
}
