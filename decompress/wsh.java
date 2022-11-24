import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wsh implements bck
{
    public static final Pattern b;
    public final String a;
    
    static {
        b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    }
    
    public wsh(final String s) {
        this.a = mqb.l(s, "_");
    }
    
    public final String a(final Object o) {
        final String string = o.toString();
        if (wsh.b.matcher(string).matches()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(o);
            return sb.toString();
        }
        throw new IllegalArgumentException(mqb.l("Invalid key: ", string));
    }
}
