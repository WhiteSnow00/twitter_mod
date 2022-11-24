import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import com.google.android.exoplayer2.n$a;
import java.io.IOException;
import java.util.regex.Matcher;
import com.google.android.exoplayer2.ParserException;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lox implements qoa
{
    public static final Pattern g;
    public static final Pattern h;
    public final String a;
    public final tat b;
    public final gxj c;
    public voa d;
    public byte[] e;
    public int f;
    
    static {
        g = Pattern.compile("LOCAL:([^,]+)");
        h = Pattern.compile("MPEGTS:(-?\\d+)");
    }
    
    public lox(final String a, final tat b) {
        this.a = a;
        this.b = b;
        this.c = new gxj();
        this.e = new byte[1024];
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        Objects.requireNonNull(this.d);
        final int n = (int)roa.getLength();
        final int f = this.f;
        final byte[] e = this.e;
        if (f == e.length) {
            int length;
            if (n != -1) {
                length = n;
            }
            else {
                length = e.length;
            }
            this.e = Arrays.copyOf(e, length * 3 / 2);
        }
        final byte[] e2 = this.e;
        final int f2 = this.f;
        final int b = roa.b(e2, f2, e2.length - f2);
        if (b != -1) {
            final int f3 = this.f + b;
            this.f = f3;
            if (n == -1 || f3 != n) {
                return 0;
            }
        }
        final gxj gxj = new gxj(this.e);
        mox.d(gxj);
        String s = gxj.f();
        long n2 = 0L;
        long c = 0L;
        Matcher matcher;
        while (true) {
            final boolean empty = TextUtils.isEmpty((CharSequence)s);
            matcher = null;
            if (empty) {
                break;
            }
            if (s.startsWith("X-TIMESTAMP-MAP")) {
                final Matcher matcher2 = lox.g.matcher(s);
                if (!matcher2.find()) {
                    String concat;
                    if (s.length() != 0) {
                        concat = "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(s);
                    }
                    else {
                        concat = new String("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    }
                    throw ParserException.a(concat, (Throwable)null);
                }
                final Matcher matcher3 = lox.h.matcher(s);
                if (!matcher3.find()) {
                    String concat2;
                    if (s.length() != 0) {
                        concat2 = "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(s);
                    }
                    else {
                        concat2 = new String("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                    }
                    throw ParserException.a(concat2, (Throwable)null);
                }
                final String group = matcher2.group(1);
                Objects.requireNonNull(group);
                c = mox.c(group);
                final String group2 = matcher3.group(1);
                Objects.requireNonNull(group2);
                n2 = Long.parseLong(group2) * 1000000L / 90000L;
            }
            s = gxj.f();
        }
        Matcher matcher4;
        while (true) {
            final String f4 = gxj.f();
            matcher4 = matcher;
            if (f4 == null) {
                break;
            }
            if (mox.a.matcher(f4).matches()) {
                String f5;
                do {
                    f5 = gxj.f();
                } while (f5 != null && !f5.isEmpty());
            }
            else {
                matcher4 = jox.a.matcher(f4);
                if (matcher4.matches()) {
                    break;
                }
                continue;
            }
        }
        if (matcher4 == null) {
            this.d(0L);
        }
        else {
            final String group3 = matcher4.group(1);
            Objects.requireNonNull(group3);
            final long c2 = mox.c(group3);
            final long b2 = this.b.b((n2 + c2 - c) * 90000L / 1000000L % 8589934592L);
            final vwt d = this.d(b2 - c2);
            this.c.B(this.e, this.f);
            d.d(this.c, this.f);
            d.b(b2, 1, this.f, 0, (vwt$a)null);
        }
        return -1;
    }
    
    public final boolean b(final roa roa) throws IOException {
        final byte[] e = this.e;
        final vh8 vh8 = (vh8)roa;
        vh8.c(e, 0, 6, false);
        this.c.B(this.e, 6);
        if (mox.a(this.c)) {
            return true;
        }
        ((roa)vh8).c(this.e, 6, 3, false);
        this.c.B(this.e, 9);
        return mox.a(this.c);
    }
    
    public final void c(final long n, final long n2) {
        throw new IllegalStateException();
    }
    
    @RequiresNonNull({ "output" })
    public final vwt d(final long o) {
        final vwt r = this.d.r(0, 3);
        final n$a n$a = new n$a();
        n$a.k = "text/vtt";
        n$a.c = this.a;
        n$a.o = o;
        r.e(n$a.a());
        this.d.p();
        return r;
    }
    
    public final void i(final voa d) {
        (this.d = d).l((qcp)new qcp.b(-9223372036854775807L));
    }
    
    public final void release() {
    }
}
