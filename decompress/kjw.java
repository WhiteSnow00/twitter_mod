// 
// Decompiled by Procyon v0.6.0
// 

public final class kjw implements rhw
{
    public final b C0;
    public final xwm<xes> D0;
    
    public kjw(final a a) {
        this.C0 = a.a;
        this.D0 = a.b;
    }
    
    public static final class a extends h4j<kjw>
    {
        public b a;
        public xwm<xes> b;
        
        public a() {
            this.a = b.D0;
        }
        
        public final Object i() {
            return new kjw(this);
        }
    }
    
    public enum b
    {
        D0("Unknown"), 
        E0("Suspended");
        
        public final String C0;
        
        public b(final String c0) {
            this.C0 = c0;
        }
        
        @Override
        public final String toString() {
            return this.C0;
        }
    }
}
