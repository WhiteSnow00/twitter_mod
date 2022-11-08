import java.util.Objects;
import com.google.android.play.core.install.InstallState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p8y extends InstallState
{
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    
    public p8y(final int a, final long b, final long c, final int d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        Objects.requireNonNull(e, "Null packageName");
        this.e = e;
    }
    
    @Override
    public final long a() {
        return this.b;
    }
    
    @Override
    public final int b() {
        return this.d;
    }
    
    @Override
    public final int c() {
        return this.a;
    }
    
    @Override
    public final String d() {
        return this.e;
    }
    
    @Override
    public final long e() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof InstallState) {
            final InstallState installState = (InstallState)o;
            if (this.a == installState.c() && this.b == installState.a() && this.c == installState.e() && this.d == installState.b() && this.e.equals(installState.d())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final long b = this.b;
        final long c = this.c;
        return ((((a ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c >>> 32 ^ c)) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final long b = this.b;
        final long c = this.c;
        final int d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder(e.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(a);
        sb.append(", bytesDownloaded=");
        sb.append(b);
        c0.G(sb, ", totalBytesToDownload=", c, ", installErrorCode=");
        sb.append(d);
        sb.append(", packageName=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
