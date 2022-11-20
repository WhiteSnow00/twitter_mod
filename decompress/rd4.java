// 
// Decompiled by Procyon v0.6.0
// 

public final class rd4 implements y19
{
    public final puh a;
    public final sth b;
    
    public rd4(final puh a, final sth b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final bxk bxk = (bxk)this.a.getValue();
        if (bxk != null) {
            this.b.c((dud)new axk(bxk));
            this.a.setValue((Object)null);
        }
    }
}
