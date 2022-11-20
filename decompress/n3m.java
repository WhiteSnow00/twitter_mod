// 
// Decompiled by Procyon v0.6.0
// 

public final class n3m implements g3e
{
    public final long b;
    public final boolean c;
    
    public n3m(final long b, final boolean c) {
        this.b = b;
        this.c = c;
    }
    
    public final boolean b(final Object o) {
        czd.f(o, "item");
        final qr6<?> h = ((qs6)o).h;
        return h instanceof fk1 && ((fk1)h).z() && !h.B(this.b) && this.c;
    }
}
