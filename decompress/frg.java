// 
// Decompiled by Procyon v0.6.0
// 

public final class frg
{
    public static final alp<frg> d;
    public final String a;
    public final String b;
    public final n1h c;
    
    static {
        frg.d = new frg.frg$a();
    }
    
    public frg(final String a, final String b, final n1h c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof frg)) {
            return false;
        }
        final frg frg = (frg)o;
        if (!w4j.a((Object)this.a, (Object)frg.a) || !w4j.a((Object)this.b, (Object)frg.b) || !w4j.a((Object)this.c, (Object)frg.c)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
