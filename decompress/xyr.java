import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xyr
{
    public static final Pattern j;
    public boolean a;
    public final String b;
    public String[] c;
    public String d;
    public Object[] e;
    public String f;
    public String g;
    public String h;
    public String i;
    
    static {
        j = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }
    
    public xyr(final String b) {
        this.a = false;
        this.c = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.b = b;
    }
    
    public static void a(final StringBuilder sb, final String s, final String s2) {
        if (!e(s2)) {
            sb.append(s);
            sb.append(s2);
        }
    }
    
    public static xyr b() {
        return new xyr("timeline");
    }
    
    public static boolean e(final String s) {
        return s == null || s.length() == 0;
    }
    
    public final xyr c(final String[] c) {
        this.c = c;
        return this;
    }
    
    public final wyr d() {
        if (e(this.f) && !e(this.g)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        final StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.a) {
            sb.append("DISTINCT ");
        }
        final String[] c = this.c;
        if (c != null && c.length != 0) {
            for (int length = c.length, i = 0; i < length; ++i) {
                final String s = c[i];
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(s);
            }
            sb.append(' ');
        }
        else {
            sb.append(" * ");
        }
        sb.append(" FROM ");
        sb.append(this.b);
        a(sb, " WHERE ", this.d);
        a(sb, " GROUP BY ", this.f);
        a(sb, " HAVING ", this.g);
        a(sb, " ORDER BY ", this.h);
        a(sb, " LIMIT ", this.i);
        return (wyr)new t8q(sb.toString(), this.e);
    }
    
    public final xyr f(final String i) {
        if (!e(i) && !xyr.j.matcher(i).matches()) {
            throw new IllegalArgumentException(l7k.c("invalid LIMIT clauses:", i));
        }
        this.i = i;
        return this;
    }
    
    public final xyr g(final String d, final Object[] e) {
        this.d = d;
        this.e = e;
        return this;
    }
}
