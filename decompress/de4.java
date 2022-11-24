import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class de4
{
    public static final c Companion;
    public static final nmp<de4> d;
    public final Map<String, String> a;
    public final String b;
    public final String c;
    
    static {
        Companion = new c();
        de4.d = de4.de4$b.c;
    }
    
    public de4(final Map<String, String> a, final String b, final String c) {
        e0e.f((Object)a, "urlParams");
        e0e.f((Object)c, "urlOverrideType");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof de4)) {
            return false;
        }
        final de4 de4 = (de4)o;
        return e0e.a((Object)this.a, (Object)de4.a) && e0e.a((Object)this.b, (Object)de4.b) && e0e.a((Object)this.c, (Object)de4.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final Map<String, String> a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("UrlParams: ");
        sb.append(a);
        return sb.toString();
    }
    
    public static final class a extends z4j<de4>
    {
        public final Map<String, String> a;
        public String b;
        public String c;
        
        public a() {
            this.a = new LinkedHashMap();
            this.c = "Undefined";
        }
        
        public final Object i() {
            return new de4(this.a, this.b, this.c);
        }
    }
    
    public static final class c
    {
    }
}
