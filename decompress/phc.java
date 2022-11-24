// 
// Decompiled by Procyon v0.6.0
// 

public final class phc implements wur
{
    public final String a;
    public final long b;
    public final ctv c;
    public final dmv d;
    public final String e;
    
    public phc(final a a) {
        final String a2 = a.a;
        vmw.f(a2);
        this.a = a2;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
    }
    
    public final long getId() {
        return this.b;
    }
    
    public static final class a extends z4j<phc>
    {
        public String a;
        public long b;
        public ctv c;
        public dmv d;
        public String e;
        
        public final Object i() {
            return new phc(this);
        }
        
        public final boolean k() {
            return flr.g((CharSequence)this.a);
        }
    }
}
