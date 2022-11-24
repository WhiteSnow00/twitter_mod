// 
// Decompiled by Procyon v0.6.0
// 

public final class c90 implements g39
{
    public final jjq a;
    public final Object b;
    public final h90 c;
    
    public c90(final jjq a, final Object b, final h90 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void dispose() {
        this.a.remove(this.b);
        this.c.d.remove(this.b);
    }
}
