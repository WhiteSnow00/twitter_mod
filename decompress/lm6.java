import com.twitter.network.apache.ParseException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Locale;
import java.nio.charset.Charset;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lm6 implements Serializable
{
    public static final lm6 G0;
    public static final lm6 H0;
    public static final lm6 I0;
    public static final lm6 J0;
    public static final lm6 K0;
    public static final lm6 L0;
    public final String D0;
    public final Charset E0;
    public final n6i[] F0;
    
    static {
        final Charset c = cj6.c;
        a("application/atom+xml", c);
        a("application/x-www-form-urlencoded", c);
        final Charset a = cj6.a;
        G0 = a("application/json", a);
        H0 = a("image/jpeg", a);
        I0 = a("application/octet-stream", null);
        a("application/svg+xml", c);
        a("application/xhtml+xml", c);
        a("application/xml", c);
        a("multipart/form-data", c);
        a("text/html", c);
        final lm6 l0 = J0 = a("text/plain", c);
        a("text/xml", c);
        a("*/*", null);
        K0 = a("application/vnd.apache.thrift.binary", null);
        a("application/vnd.apache.thrift.json", a);
        L0 = l0;
    }
    
    public lm6(final String d0, final Charset e0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = null;
    }
    
    public lm6(final String d0, final Charset e0, final n6i[] f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public static lm6 a(String lowerCase, final Charset charset) {
        if (lowerCase == null) {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        if (!max.y((CharSequence)lowerCase)) {
            lowerCase = lowerCase.toLowerCase(Locale.ROOT);
            final boolean b = false;
            int i = 0;
            while (true) {
                while (i < lowerCase.length()) {
                    final char char1 = lowerCase.charAt(i);
                    int n = b ? 1 : 0;
                    if (char1 != '\"') {
                        n = (b ? 1 : 0);
                        if (char1 != ',') {
                            if (char1 != ';') {
                                ++i;
                                continue;
                            }
                            n = (b ? 1 : 0);
                        }
                    }
                    if (n != 0) {
                        return new lm6(lowerCase, charset);
                    }
                    throw new IllegalArgumentException("MIME type may not contain reserved characters");
                }
                int n = 1;
                continue;
            }
        }
        throw new IllegalArgumentException("MIME type may not be blank");
    }
    
    public static lm6 b(final vqc vqc) throws ParseException, UnsupportedCharsetException {
        n6i[] array = null;
        if (vqc == null) {
            return null;
        }
        final bhc d = vqc.d();
        if (d != null) {
            final ehc[] a = d.a();
            if (a.length > 0) {
                int i = 0;
                final ehc ehc = a[0];
                final String name = ehc.getName();
            Label_0114:
                while (true) {
                    for (n6i[] parameters = ehc.getParameters(); i < parameters.length; ++i) {
                        final n6i n6i = parameters[i];
                        if (n6i.getName().equalsIgnoreCase("charset")) {
                            final String value = n6i.getValue();
                            if (!max.y((CharSequence)value)) {
                                try {
                                    final Charset forName = Charset.forName(value);
                                    break Label_0114;
                                }
                                catch (final UnsupportedCharsetException ex) {
                                    throw ex;
                                }
                                continue;
                                if (parameters.length > 0) {
                                    array = parameters;
                                }
                                Charset forName = null;
                                return new lm6(name, forName, array);
                            }
                            break;
                        }
                    }
                    final Charset forName = null;
                    continue Label_0114;
                }
            }
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final us3 us3 = new us3(64);
        us3.b(this.D0);
        if (this.F0 != null) {
            us3.b("; ");
            final n6i[] f0 = this.F0;
            as0.a((Object)f0, "Header parameter array");
            int n;
            if (f0.length < 1) {
                n = 0;
            }
            else {
                int n2 = (f0.length - 1) * 2;
                final int length = f0.length;
                int n3 = 0;
                while (true) {
                    n = n2;
                    if (n3 >= length) {
                        break;
                    }
                    final n6i n6i = f0[n3];
                    int n4;
                    if (n6i == null) {
                        n4 = 0;
                    }
                    else {
                        final int length2 = n6i.getName().length();
                        final String value = n6i.getValue();
                        n4 = length2;
                        if (value != null) {
                            n4 = length2 + (value.length() + 3);
                        }
                    }
                    n2 += n4;
                    ++n3;
                }
            }
            us3.d(n);
            for (int i = 0; i < f0.length; ++i) {
                if (i > 0) {
                    us3.b("; ");
                }
                final n6i n6i2 = f0[i];
                as0.a((Object)n6i2, "Name / value pair");
                final int length3 = n6i2.getName().length();
                final String value2 = n6i2.getValue();
                int n5 = length3;
                if (value2 != null) {
                    n5 = length3 + (value2.length() + 3);
                }
                us3.d(n5);
                us3.b(n6i2.getName());
                final String value3 = n6i2.getValue();
                if (value3 != null) {
                    us3.a('=');
                    int n6;
                    int n7;
                    for (n6 = 0, n7 = 0; n6 < value3.length() && n7 == 0; ++n6) {
                        if (" ;,:@()<>\\\"/[]?={}\t".indexOf(value3.charAt(n6)) >= 0) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                    }
                    if (n7 != 0) {
                        us3.a('\"');
                    }
                    for (int j = 0; j < value3.length(); ++j) {
                        final char char1 = value3.charAt(j);
                        if ("\"\\".indexOf(char1) >= 0) {
                            us3.a('\\');
                        }
                        us3.a(char1);
                    }
                    if (n7 != 0) {
                        us3.a('\"');
                    }
                }
            }
        }
        else if (this.E0 != null) {
            us3.b("; charset=");
            us3.b(this.E0.name());
        }
        return us3.toString();
    }
}
