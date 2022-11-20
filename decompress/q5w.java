import java.util.regex.Pattern;
import java.net.URI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5w
{
    public final URI a;
    public final String b;
    
    public q5w(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof q5w)) {
            return false;
        }
        final q5w q5w = (q5w)o;
        if (this.a.equals(q5w.a)) {
            final String b2 = this.b;
            final String b3 = q5w.b;
            final Pattern a = ikr.a;
            if (czd.a((Object)b2, (Object)b3)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.a.toString());
        if (!ikr.e((CharSequence)this.b)) {
            sb.append("[host=");
            sb.append(this.b);
            sb.append("]");
        }
        return sb.toString();
    }
    
    public static final class a extends n4j<q5w>
    {
        public URI a;
        public String b;
        
        public a(final URI a) {
            this.b = null;
            this.a = a;
        }
        
        public final Object i() {
            return new q5w(this);
        }
    }
}
