import java.util.Objects;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c6r
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public c6r(final int a, final int b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static c6r a(final String s) {
        omi.m(s.startsWith("Format:"));
        final String[] split = TextUtils.split(s.substring(7), ",");
        int i = 0;
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        while (i < split.length) {
            final String o = ak1.O(split[i].trim());
            Objects.requireNonNull(o);
            int n5 = 0;
            Label_0181: {
                switch (o) {
                    case "style": {
                        n5 = 3;
                        break Label_0181;
                    }
                    case "start": {
                        n5 = 2;
                        break Label_0181;
                    }
                    case "text": {
                        n5 = 1;
                        break Label_0181;
                    }
                    case "end": {
                        n5 = 0;
                        break Label_0181;
                    }
                    default:
                        break;
                }
                n5 = -1;
            }
            if (n5 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        if (n5 == 3) {
                            n3 = i;
                        }
                    }
                    else {
                        n = i;
                    }
                }
                else {
                    n4 = i;
                }
            }
            else {
                n2 = i;
            }
            ++i;
        }
        c6r c6r;
        if (n != -1 && n2 != -1 && n4 != -1) {
            c6r = new c6r(n, n2, n3, n4, split.length);
        }
        else {
            c6r = null;
        }
        return c6r;
    }
}
