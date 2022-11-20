import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n6c implements s9
{
    public final String a;
    public final Map<String, Object> b;
    public final f7c c;
    
    public n6c(final a a) {
        final String a2 = a.a;
        jee.l((Object)a2);
        this.a = a2;
        this.b = (Map)((n4j)a.b).e();
        this.c = a.c;
    }
    
    public static final class a extends n4j<n6c>
    {
        public String a;
        public final qjg<String, Object> b;
        public f7c c;
        
        public a() {
            this.b = (qjg$a)qjg.t();
        }
        
        public final Object i() {
            return new n6c(this);
        }
        
        public final boolean l() {
            return ikr.g((CharSequence)this.a);
        }
        
        public final a o(final String s, final Object o) {
            ((qjg)this.b).w((Object)s, o);
            return this;
        }
    }
}
