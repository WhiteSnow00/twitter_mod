import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bn9 implements s9
{
    public final String a;
    public final Map<String, String> b;
    public final Map<String, String> c;
    
    public bn9(final a a) {
        final String a2 = a.a;
        jee.l((Object)a2);
        this.a = a2;
        this.b = (Map)((n4j)a.b).e();
        this.c = (Map)((n4j)a.c).e();
    }
    
    public static final class a extends n4j<bn9>
    {
        public String a;
        public final qjg<String, String> b;
        public final qjg<String, String> c;
        
        public a() {
            this.b = (qjg$a)qjg.t();
            this.c = (qjg$a)qjg.t();
        }
        
        public final Object i() {
            return new bn9(this);
        }
        
        public final boolean l() {
            return ikr.g((CharSequence)this.a);
        }
    }
}
