// 
// Decompiled by Procyon v0.6.0
// 

public final class drc implements o29
{
    public final /* synthetic */ luh a;
    public final /* synthetic */ oth b;
    
    public drc(final luh a, final oth b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final luh a = this.a;
        final oth b = this.b;
        final arc arc = (arc)((q7r)a).getValue();
        if (arc != null) {
            b.c(new brc(arc));
            a.setValue(null);
        }
    }
}
