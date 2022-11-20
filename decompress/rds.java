import java.util.Arrays;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rds implements d
{
    public static final rds E0;
    public final String D0;
    
    static {
        E0 = new rds(null);
    }
    
    public rds(final String d0) {
        this.D0 = d0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof rds && f5j.a(this.D0, ((rds)o).D0));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0 });
    }
}
