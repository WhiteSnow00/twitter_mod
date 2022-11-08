import java.util.Arrays;
import com.google.android.gms.common.api.a$d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wcs implements a$d
{
    public static final wcs D0;
    public final String C0 = c0;
    
    static {
        D0 = new wcs(null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof wcs && z4j.a((Object)this.C0, (Object)((wcs)o).C0));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0 });
    }
}
