// 
// Decompiled by Procyon v0.6.0
// 

public final class i7w implements i8t
{
    public static final rlp<i7w> d;
    public final String b;
    public final epv c;
    
    static {
        i7w.d = new i7w.i7w$b();
    }
    
    public i7w(final a a) {
        final String a2 = a.a;
        jee.l((Object)a2);
        this.b = a2;
        final epv b = a.b;
        jee.l((Object)b);
        this.c = b;
    }
    
    @Override
    public final String a() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && i7w.class == o.getClass()) {
            final i7w i7w = (i7w)o;
            if (!c5j.a((Object)this.b, (Object)i7w.b) || !c5j.a((Object)this.c, (Object)i7w.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.b, (Object)this.c);
    }
    
    public static final class a extends n4j<i7w>
    {
        public String a;
        public epv b;
        
        public final Object i() {
            return new i7w(this);
        }
        
        public final boolean l() {
            return !ikr.e((CharSequence)this.a) && this.a.endsWith(".json") && this.b != null;
        }
    }
}
