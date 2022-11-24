import java.util.Objects;
import java.net.URI;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qxm
{
    public final String a;
    public final String b;
    
    public qxm(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public abstract boolean a(final URI p0);
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof qxm)) {
            return false;
        }
        final qxm qxm = (qxm)o;
        if (!this.a.equals(qxm.a) || !this.b.equals(qxm.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
