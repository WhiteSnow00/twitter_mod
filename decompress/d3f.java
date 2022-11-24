// 
// Decompiled by Procyon v0.6.0
// 

public final class d3f implements g39
{
    public final a3f a;
    public final Object b;
    
    public d3f(final a3f a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        this.a.c.add(this.b);
    }
}
