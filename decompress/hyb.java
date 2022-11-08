import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyb
{
    public static final Pattern c;
    public int a;
    public int b;
    
    static {
        c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }
    
    public hyb() {
        this.a = -1;
        this.b = -1;
    }
    
    public final boolean a(String group) {
        final Matcher matcher = hyb.c.matcher(group);
        if (!matcher.find()) {
            return false;
        }
        try {
            group = matcher.group(1);
            final int a = imw.a;
            final int int1 = Integer.parseInt(group, 16);
            final int int2 = Integer.parseInt(matcher.group(2), 16);
            if (int1 > 0 || int2 > 0) {
                this.a = int1;
                this.b = int2;
                return true;
            }
            return false;
        }
        catch (final NumberFormatException ex) {
            return false;
        }
    }
    
    public final boolean b(final x8h x8h) {
        int n = 0;
        while (true) {
            final x8h$b[] c0 = x8h.C0;
            if (n >= c0.length) {
                return false;
            }
            final x8h$b x8h$b = c0[n];
            if (x8h$b instanceof xs4) {
                final xs4 xs4 = (xs4)x8h$b;
                if ("iTunSMPB".equals(xs4.E0) && this.a(xs4.F0)) {
                    return true;
                }
            }
            else if (x8h$b instanceof hyd) {
                final hyd hyd = (hyd)x8h$b;
                if ("com.apple.iTunes".equals(hyd.D0) && "iTunSMPB".equals(hyd.E0) && this.a(hyd.F0)) {
                    return true;
                }
            }
            ++n;
        }
    }
}
