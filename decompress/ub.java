// 
// Decompiled by Procyon v0.6.0
// 

public final class ub implements zzr<v88<Object>>
{
    public final te9 a;
    public final String b;
    public final Object c;
    public final Object d;
    public final tb.b e;
    public final tb f;
    
    public ub(final tb f, final te9 a, final String b, final Object c, final Object d, final tb.b e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object get() {
        return this.f.b(this.a, this.b, this.c, this.d, this.e);
    }
    
    @Override
    public final String toString() {
        final q5j$a b = q5j.b((Object)this);
        b.c("request", (Object)this.c.toString());
        return b.toString();
    }
}
