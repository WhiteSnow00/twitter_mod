// 
// Decompiled by Procyon v0.6.0
// 

public final class w9l implements ls8
{
    public final String b;
    public final nba c;
    
    public w9l(final String b) {
        this.b = b;
        this.c = nba.M0;
    }
    
    public final nba getName() {
        return this.c;
    }
    
    public static final class a extends z4j<w9l>
    {
        public String a;
        
        public final Object i() {
            final String a = this.a;
            e0e.c((Object)a);
            return new w9l(a);
        }
        
        public final boolean k() {
            return this.a != null;
        }
    }
}
