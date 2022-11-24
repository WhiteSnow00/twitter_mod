// 
// Decompiled by Procyon v0.6.0
// 

public final class kto implements g39
{
    public final jto.d a;
    public final jto b;
    public final Object c;
    
    public kto(final jto.d a, final jto b, final Object c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void dispose() {
        this.a.a(this.b.a);
        this.b.b.remove(this.c);
    }
}
