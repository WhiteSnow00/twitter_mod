import java.util.Objects;
import java.util.regex.Pattern;
import java.net.URI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hng extends qxm
{
    public final String c;
    
    public hng(final String s, final String s2, final String s3) {
        super(s, s2);
        this.c = s3.substring(0, s3.length() - 1);
    }
    
    @Override
    public final boolean a(final URI uri) {
        final String host = uri.getHost();
        final String path = uri.getPath();
        final String a = super.a;
        final Pattern a2 = flr.a;
        boolean b = true;
        if (!slr.i1(a, host, true) || !path.startsWith(this.c)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hng && super.equals(o) && this.c.equals(((hng)o).c));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(super.hashCode(), this.c);
    }
}
