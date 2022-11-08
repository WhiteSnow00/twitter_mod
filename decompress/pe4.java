// 
// Decompiled by Procyon v0.6.0
// 

public final class pe4 implements o29
{
    public final /* synthetic */ luh a;
    public final /* synthetic */ oth b;
    
    public pe4(final luh a, final oth b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final twk twk = this.a.getValue();
        if (twk != null) {
            this.b.c(new swk(twk));
            this.a.setValue(null);
        }
    }
}
