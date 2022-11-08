import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vrc
{
    public static final Pattern c;
    public final String a;
    public final String b;
    
    static {
        c = Pattern.compile("http(s?)://([^/]+).*", 2);
    }
    
    public vrc(final String b, final boolean b2) {
        String a;
        if (b2) {
            a = "https";
        }
        else {
            a = "http";
        }
        this.a = a;
        if (pjr.e((CharSequence)b)) {
            throw new IllegalArgumentException("host/scheme cannot be null");
        }
        if (b.indexOf(47) == -1) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException(l7k.c("Invalid host/scheme: ", b));
    }
    
    public static vrc a(final String s) {
        final Matcher matcher = vrc.c.matcher(s);
        if (matcher.matches()) {
            return new vrc(matcher.group(2), matcher.group(1).isEmpty() ^ true);
        }
        throw new IllegalArgumentException(l7k.c("Invalid url: ", s));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof vrc) {
                final String a = this.a;
                final vrc vrc = (vrc)o;
                if (a.equals(vrc.a) && this.b.equals(vrc.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return zi.y(this.a, "://", this.b);
    }
}
