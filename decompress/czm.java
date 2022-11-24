// 
// Decompiled by Procyon v0.6.0
// 

public final class czm implements kgs
{
    public static final czm.czm$b G0;
    public final long F0;
    
    static {
        G0 = new czm.czm$b();
    }
    
    public czm(final a a) {
        this.F0 = a.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("RichTextUserEntity{userId=");
        f.append(this.F0);
        f.append('}');
        return f.toString();
    }
    
    public static final class a extends z4j<czm>
    {
        public long a;
        
        public a() {
            this.a = -1L;
        }
        
        public final Object i() {
            return new czm(this);
        }
        
        public final boolean k() {
            return this.a != -1L;
        }
    }
}
