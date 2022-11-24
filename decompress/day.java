import android.content.Intent;
import android.app.PendingIntent;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class day extends n3r
{
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final List<String> f;
    public final List<String> g;
    public final PendingIntent h;
    public final List<Intent> i;
    
    public day(final int a, final int b, final int c, final long d, final long e, final List<String> f, final List<String> g, final PendingIntent h, final List<Intent> i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final long a() {
        return this.d;
    }
    
    @Override
    public final int c() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof n3r) {
            final n3r n3r = (n3r)o;
            if (this.a == n3r.g() && this.b == n3r.h() && this.c == n3r.c() && this.d == n3r.a() && this.e == n3r.i()) {
                final List<String> f = this.f;
                if (f == null) {
                    if (n3r.k() != null) {
                        return false;
                    }
                }
                else if (!f.equals(n3r.k())) {
                    return false;
                }
                final List<String> g = this.g;
                if (g == null) {
                    if (n3r.j() != null) {
                        return false;
                    }
                }
                else if (!g.equals(n3r.j())) {
                    return false;
                }
                final PendingIntent h = this.h;
                if (h == null) {
                    if (n3r.f() != null) {
                        return false;
                    }
                }
                else if (!h.equals((Object)n3r.f())) {
                    return false;
                }
                final List<Intent> i = this.i;
                if (i == null) {
                    if (n3r.l() != null) {
                        return false;
                    }
                }
                else if (!i.equals(n3r.l())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Deprecated
    @Override
    public final PendingIntent f() {
        return this.h;
    }
    
    @Override
    public final int g() {
        return this.a;
    }
    
    @Override
    public final int h() {
        return this.b;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        final int n = (int)(d >>> 32 ^ d);
        final int n2 = (int)(e >>> 32 ^ e);
        final List<String> f = this.f;
        int hashCode = 0;
        int hashCode2;
        if (f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = f.hashCode();
        }
        final List<String> g = this.g;
        int hashCode3;
        if (g == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = g.hashCode();
        }
        final PendingIntent h = this.h;
        int hashCode4;
        if (h == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = h.hashCode();
        }
        final List<Intent> i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode;
    }
    
    @Override
    public final long i() {
        return this.e;
    }
    
    @Override
    public final List<String> j() {
        return this.g;
    }
    
    @Override
    public final List<String> k() {
        return this.f;
    }
    
    @Override
    public final List<Intent> l() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        final long e = this.e;
        final String value = String.valueOf(this.f);
        final String value2 = String.valueOf(this.g);
        final String value3 = String.valueOf(this.h);
        final String value4 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder(value.length() + 251 + value2.length() + value3.length() + value4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(a);
        sb.append(", status=");
        sb.append(b);
        sb.append(", errorCode=");
        sb.append(c);
        sb.append(", bytesDownloaded=");
        sb.append(d);
        po.E(sb, ", totalBytesToDownload=", e, ", moduleNamesNullable=");
        jba.s(sb, value, ", languagesNullable=", value2, ", resolutionIntent=");
        return m58.v(sb, value3, ", splitFileIntents=", value4, "}");
    }
}
