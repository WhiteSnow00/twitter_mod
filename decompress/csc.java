import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.Locale;
import java.net.URI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csc implements sfa
{
    public static void e(final xrc xrc, final String s) {
        final String f = f(xrc);
        final StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(s);
        cag.a("TwitterNetwork", sb.toString());
    }
    
    public static String f(final xrc xrc) {
        final URI c = xrc.c;
        final StringBuilder y = mb0.y("[", c.getScheme(), "://", c.getHost(), c.getPath());
        y.append("] ");
        return y.toString();
    }
    
    public final void a(final xrc xrc) {
        final xsc n = xrc.n;
        final Locale english = Locale.ENGLISH;
        e(xrc, String.format(english, "protocol: %s %s status: %d/%s, content: %s (%s), content-length: %,d", n.t, n.u, n.a, n.b, n.r, n.s, n.q));
        e(xrc, String.format(english, "open: %dms, read: %dms, duration: %dms", n.g, n.f, n.e));
        final int[] z = n.z;
        final int n2 = z[1] + z[2] + z[3] + z[4];
        final int n3 = z[5];
        final int n4 = z[6];
        final long j = n.j;
        final int n5 = z[0];
        final int n6 = z[1];
        final int n7 = z[2];
        final int n8 = z[3];
        final int n9 = z[4];
        final int n10 = z[5];
        final int n11 = z[6];
        final long g = n.g;
        final long f = n.f;
        final long h = n.h;
        final StringBuilder sb = new StringBuilder();
        sb.append("EXECUTE_TIME\tbytes:");
        sb.append(j);
        sb.append("\tCREATE:");
        sb.append(n5);
        sb.append("\tINIT:");
        sb.append(n6);
        sb.append("\tSEND:");
        sb.append(n7);
        sb.append("\tWAIT:");
        sb.append(n8);
        sb.append("\tREAD:");
        sb.append(n9);
        sb.append("\tREAD_TAIL:");
        sb.append(n10);
        sb.append("\tCLOSE:");
        sb.append(n11);
        c0.G(sb, "\toldOpen:", g, "\toldRead:");
        sb.append(f);
        c0.G(sb, "\toldClose:", h, "\toldDuration:");
        sb.append(g + f + h);
        sb.append("\tnewDuration");
        sb.append(n2);
        sb.append("\tnewExecute");
        sb.append(n3 + n2 + n4);
        cag.a("HttpTimings", sb.toString());
    }
    
    public final void b(final xrc xrc, final Exception ex) {
        if (ex instanceof UnknownHostException) {
            e(xrc, ex.getMessage());
        }
        else {
            final StringWriter stringWriter = new StringWriter();
            final PrintWriter printWriter = new PrintWriter(stringWriter);
            stringWriter.append(f(xrc)).append("\n");
            ex.printStackTrace(printWriter);
            printWriter.flush();
            cag.a("TwitterNetwork", stringWriter.toString());
        }
    }
    
    public final void d(final xrc xrc) {
        final src f = xrc.f();
        final boolean b = f != null;
        final Locale english = Locale.ENGLISH;
        e(xrc, String.format(english, "%s, has entity: %s", xrc.b, b));
        if (b) {
            e(xrc, String.format(english, "sending content-length: %,d", f.a()));
        }
    }
}
