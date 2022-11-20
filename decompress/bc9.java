// 
// Decompiled by Procyon v0.6.0
// 

public final class bc9 implements y19
{
    public final puh a;
    public final sth b;
    
    public bc9(final puh a, final sth b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final kb9 kb9 = (kb9)this.a.getValue();
        if (kb9 != null) {
            final sth b = this.b;
            if (b != null) {
                b.c((dud)new jb9(kb9));
            }
            this.a.setValue((Object)null);
        }
    }
}
