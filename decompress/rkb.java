import java.util.Objects;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rkb
{
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    
    @Deprecated
    public rkb(final Uri a, final int b, final int c, final boolean d, final int e) {
        Objects.requireNonNull(a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
