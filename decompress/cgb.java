// 
// Decompiled by Procyon v0.6.0
// 

public final class cgb implements o29
{
    public final /* synthetic */ luh a;
    public final /* synthetic */ oth b;
    
    public cgb(final luh a, final oth b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final zeb zeb = this.a.getValue();
        if (zeb != null) {
            final afb afb = new afb(zeb);
            final oth b = this.b;
            if (b != null) {
                b.c((avd)afb);
            }
            this.a.setValue(null);
        }
    }
}
