import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrc
{
    public static final Pattern c;
    public final String a;
    public final String b;
    
    static {
        c = Pattern.compile("http(s?)://([^/]+).*", 2);
    }
    
    public yrc(final String b, final boolean b2) {
        String a;
        if (b2) {
            a = "https";
        }
        else {
            a = "http";
        }
        this.a = a;
        if (flr.e((CharSequence)b)) {
            throw new IllegalArgumentException("host/scheme cannot be null");
        }
        if (b.indexOf(47) == -1) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException(mqb.l("Invalid host/scheme: ", b));
    }
    
    public static yrc a(final String s) {
        final Matcher matcher = yrc.c.matcher(s);
        if (matcher.matches()) {
            return new yrc(matcher.group(2), matcher.group(1).isEmpty() ^ true);
        }
        throw new IllegalArgumentException(mqb.l("Invalid url: ", s));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof yrc) {
                final String a = this.a;
                final yrc yrc = (yrc)o;
                if (a.equals(yrc.a) && this.b.equals(yrc.b)) {
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
        return c0e.h(this.a, "://", this.b);
    }
}
