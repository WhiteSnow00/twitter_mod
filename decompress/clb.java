import android.util.Base64;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clb
{
    public final String a;
    public final String b;
    public final String c;
    public final List<List<byte[]>> d;
    public final String e;
    
    public clb(final String a, final String b, final String c, final List<List<byte[]>> d) {
        Objects.requireNonNull(a);
        this.a = a;
        Objects.requireNonNull(b);
        this.b = b;
        this.c = c;
        Objects.requireNonNull(d);
        this.d = d;
        final StringBuilder sb = new StringBuilder(a);
        sb.append("-");
        sb.append(b);
        sb.append("-");
        sb.append(c);
        this.e = sb.toString();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder f = ehk.f("FontRequest {mProviderAuthority: ");
        f.append(this.a);
        f.append(", mProviderPackage: ");
        f.append(this.b);
        f.append(", mQuery: ");
        f.append(this.c);
        f.append(", mCertificates:");
        sb.append(f.toString());
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List list = this.d.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return m51.y(sb, "}", "mCertificatesArray: 0");
    }
}
