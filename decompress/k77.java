// 
// Decompiled by Procyon v0.6.0
// 

public final class k77 implements j77
{
    public String a;
    public String b;
    
    public final String a() {
        final String a = this.a;
        this.a = null;
        return a;
    }
    
    public final void b(final String a, final String b) {
        e0e.f((Object)a, "userId");
        e0e.f((Object)b, "password");
        this.a = a;
        this.b = b;
    }
    
    public final String c() {
        final String b = this.b;
        this.b = null;
        return b;
    }
    
    public final void clear() {
        this.a = null;
        this.b = null;
    }
}
