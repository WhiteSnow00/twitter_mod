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

public final class cnx implements joa
{
    public static final Pattern g;
    public static final Pattern h;
    public final String a;
    public final h9t b;
    public final mwj c;
    public ooa d;
    public byte[] e;
    public int f;
    
    static {
        g = Pattern.compile("LOCAL:([^,]+)");
        h = Pattern.compile("MPEGTS:(-?\\d+)");
    }
    
    public cnx(final String a, final h9t b) {
        this.a = a;
        this.b = b;
        this.c = new mwj();
        this.e = new byte[1024];
    }
    
    @Override
    public final int a(final koa koa, final rrk rrk) throws IOException {
        Objects.requireNonNull(this.d);
        final int n = (int)koa.getLength();
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
        final int b = koa.b(e2, f2, e2.length - f2);
        if (b != -1) {
            final int f3 = this.f + b;
            this.f = f3;
            if (n == -1 || f3 != n) {
                return 0;
            }
        }
        final mwj mwj = new mwj(this.e);
        dnx.d(mwj);
        String s = mwj.f();
        long c;
        long n2 = c = 0L;
        Matcher matcher;
        while (true) {
            final boolean empty = TextUtils.isEmpty((CharSequence)s);
            matcher = null;
            if (empty) {
                break;
            }
            if (s.startsWith("X-TIMESTAMP-MAP")) {
                final Matcher matcher2 = cnx.g.matcher(s);
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
                final Matcher matcher3 = cnx.h.matcher(s);
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
                c = dnx.c(group);
                final String group2 = matcher3.group(1);
                Objects.requireNonNull(group2);
                n2 = Long.parseLong(group2) * 1000000L / 90000L;
            }
            s = mwj.f();
        }
        Matcher matcher4;
        while (true) {
            final String f4 = mwj.f();
            matcher4 = matcher;
            if (f4 == null) {
                break;
            }
            if (dnx.a.matcher(f4).matches()) {
                String f5;
                do {
                    f5 = mwj.f();
                } while (f5 != null && !f5.isEmpty());
            }
            else {
                matcher4 = anx.a.matcher(f4);
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
            final long c2 = dnx.c(group3);
            final long b2 = this.b.b((n2 + c2 - c) * 90000L / 1000000L % 8589934592L);
            final ovt d = this.d(b2 - c2);
            this.c.B(this.e, this.f);
            d.d(this.c, this.f);
            d.b(b2, 1, this.f, 0, (ovt$a)null);
        }
        return -1;
    }
    
    @Override
    public final boolean b(final koa koa) throws IOException {
        final byte[] e = this.e;
        final gh8 gh8 = (gh8)koa;
        gh8.c(e, 0, 6, false);
        this.c.B(this.e, 6);
        if (dnx.a(this.c)) {
            return true;
        }
        ((koa)gh8).c(this.e, 6, 3, false);
        this.c.B(this.e, 9);
        return dnx.a(this.c);
    }
    
    @Override
    public final void c(final long n, final long n2) {
        throw new IllegalStateException();
    }
    
    @RequiresNonNull({ "output" })
    public final ovt d(final long o) {
        final ovt s = this.d.s(0, 3);
        final n$a n$a = new n$a();
        n$a.k = "text/vtt";
        n$a.c = this.a;
        n$a.o = o;
        s.e(n$a.a());
        this.d.q();
        return s;
    }
    
    @Override
    public final void i(final ooa d) {
        (this.d = d).n((ebp)new ebp.b(-9223372036854775807L));
    }
    
    @Override
    public final void release() {
    }
}
