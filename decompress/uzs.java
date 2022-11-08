// 
// Decompiled by Procyon v0.6.0
// 

public final class uzs extends kus implements usw
{
    public final tzs q;
    
    public uzs(final a a) {
        super((kus.a)a, 29);
        this.q = a.p;
    }
    
    public static final class a extends kus.a<uzs, a>
    {
        public final tzs p;
        
        public a(final tzs p) {
            this.p = p;
        }
        
        public final Object i() {
            return new uzs(this);
        }
    }
}
