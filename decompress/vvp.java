import android.util.Size;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vvp implements ccx
{
    public final long a;
    public final Uri b;
    public final Size c;
    
    public vvp(final long a) {
        this.a = a;
        this.b = null;
        this.c = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vvp)) {
            return false;
        }
        final vvp vvp = (vvp)o;
        return this.a == vvp.a && e0e.a((Object)this.b, (Object)vvp.b) && e0e.a((Object)this.c, (Object)vvp.c);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final Uri b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Size c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (n * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final Uri b = this.b;
        final Size c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("ShareSheetState(tweetId=");
        sb.append(a);
        sb.append(", uri=");
        sb.append(b);
        sb.append(", size=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
