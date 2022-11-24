import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h73 implements k4a
{
    public static final String c;
    public static final Set<v4a> d;
    public static final h73 e;
    public static final h73 f;
    public final String a;
    public final String b;
    
    static {
        final String s = c = w9y.q("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        final String q = w9y.q("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        final String q2 = w9y.q("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet((Set<? extends v4a>)new HashSet<v4a>(Arrays.asList(new v4a("proto"), new v4a("json"))));
        e = new h73(s, null);
        f = new h73(q, q2);
    }
    
    public h73(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static h73 a(final byte[] array) {
        final String s = new String(array, Charset.forName("UTF-8"));
        if (!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        final String[] split = s.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        final String s2 = split[0];
        if (!s2.isEmpty()) {
            String s3;
            if ((s3 = split[1]).isEmpty()) {
                s3 = null;
            }
            return new h73(s2, s3);
        }
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
    }
    
    public final byte[] b() {
        final String b = this.b;
        byte[] bytes;
        if (b == null && this.a == null) {
            bytes = null;
        }
        else {
            final String a = this.a;
            String s;
            if ((s = b) == null) {
                s = "";
            }
            bytes = String.format("%s%s%s%s", "1$", a, "\\", s).getBytes(Charset.forName("UTF-8"));
        }
        return bytes;
    }
}
