import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kem extends t2t
{
    public final Map<String, String> b;
    public final int c;
    
    public kem(final Map<String, String> b, final int c) {
        e0e.f((Object)b, "requestParams");
        this.b = b;
        Math.max(0, this.c = c);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kem)) {
            return false;
        }
        final kem kem = (kem)o;
        return e0e.a((Object)this.b, (Object)kem.b) && this.c == kem.c;
    }
    
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.c;
    }
    
    public final String toString() {
        final Map<String, String> b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("RemoteTimelineReaction(requestParams=");
        sb.append(b);
        sb.append(", timeoutInSeconds=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends k5j<kem>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            final rx6$m f = rx6.f;
            final Object a = ((k5j)new fr4((nmp)f, (nmp)f)).a(rmp);
            vmw.g(a);
            e0e.e(a, "input.readNotNullObject(\u2026      )\n                )");
            return new kem((Map<String, String>)a, rmp.z());
        }
        
        public final void f(final smp smp, final Object o) {
            final kem kem = (kem)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)kem, "object");
            final Map<String, String> b = kem.b;
            final rx6$m f = rx6.f;
            ((k5j)new fr4((nmp)f, (nmp)f)).c(smp, (Object)b);
            final int a = o5j.a;
            smp.z(kem.c);
        }
    }
}
