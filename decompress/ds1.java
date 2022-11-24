import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ds1
{
    public static final ds1 a;
    public static final BitSet b;
    public static final BitSet c;
    
    static {
        a = new ds1();
        final BitSet b2 = new BitSet();
        final int n = 0;
        for (int i = 0; i < 3; ++i) {
            b2.set((new int[] { 61, 59, 44 })[i]);
        }
        b = b2;
        final BitSet c2 = new BitSet();
        for (int j = n; j < 2; ++j) {
            c2.set((new int[] { 59, 44 })[j]);
        }
        c = c2;
    }
    
    public final g7i a(final ut3 ut3, final lxj lxj) {
        final BitSet b = ds1.b;
        final StringBuilder sb = new StringBuilder();
    Label_0014:
        while (true) {
            boolean b2 = false;
            while (!lxj.a()) {
                final char c = ut3.F0[lxj.b];
                if (b != null && b.get(c)) {
                    break;
                }
                if (!xd.J0(c)) {
                    if (b2 && sb.length() > 0) {
                        sb.append(' ');
                    }
                    int i = lxj.b;
                    final int a = lxj.a;
                    int n = i;
                    while (i < a) {
                        final char c2 = ut3.F0[i];
                        if (b != null && b.get(c2)) {
                            break;
                        }
                        if (xd.J0(c2)) {
                            break;
                        }
                        ++n;
                        sb.append(c2);
                        ++i;
                    }
                    lxj.b(n);
                    continue Label_0014;
                }
                int b3 = lxj.b;
                final int a2 = lxj.a;
                int n2 = b3;
                while (b3 < a2 && xd.J0(ut3.F0[b3])) {
                    ++n2;
                    ++b3;
                }
                lxj.b(n2);
                b2 = true;
            }
            break;
        }
        final String string = sb.toString();
        if (lxj.a()) {
            return (g7i)new ns1(string, (String)null);
        }
        final int b4 = lxj.b;
        final char c3 = ut3.F0[b4];
        lxj.b(b4 + 1);
        if (c3 != '=') {
            return (g7i)new ns1(string, (String)null);
        }
        final BitSet c4 = ds1.c;
        final StringBuilder sb2 = new StringBuilder();
        Label_0303:
        while (true) {
            boolean b5 = false;
            while (!lxj.a()) {
                final char c5 = ut3.F0[lxj.b];
                if (c4 != null && c4.get(c5)) {
                    break;
                }
                if (xd.J0(c5)) {
                    int b6 = lxj.b;
                    final int a3 = lxj.a;
                    int n3 = b6;
                    while (b6 < a3 && xd.J0(ut3.F0[b6])) {
                        ++n3;
                        ++b6;
                    }
                    lxj.b(n3);
                    b5 = true;
                }
                else {
                    if (c5 != '\"') {
                        if (b5 && sb2.length() > 0) {
                            sb2.append(' ');
                        }
                        int j = lxj.b;
                        final int a4 = lxj.a;
                        int n4 = j;
                        while (j < a4) {
                            final char c6 = ut3.F0[j];
                            if ((c4 != null && c4.get(c6)) || xd.J0(c6)) {
                                break;
                            }
                            if (c6 == '\"') {
                                break;
                            }
                            ++n4;
                            sb2.append(c6);
                            ++j;
                        }
                        lxj.b(n4);
                        continue Label_0303;
                    }
                    if (b5 && sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    if (lxj.a()) {
                        continue Label_0303;
                    }
                    final int b7 = lxj.b;
                    final int a5 = lxj.a;
                    if (ut3.F0[b7] != '\"') {
                        continue Label_0303;
                    }
                    int n6;
                    int n5 = n6 = b7 + 1;
                    int n7 = 0;
                    int n8;
                    while (true) {
                        n8 = n6;
                        if (n5 >= a5) {
                            break;
                        }
                        final char c7 = ut3.F0[n5];
                        int n9;
                        if (n7 != 0) {
                            if (c7 != '\"' && c7 != '\\') {
                                sb2.append('\\');
                            }
                            sb2.append(c7);
                            n9 = 0;
                        }
                        else {
                            if (c7 == '\"') {
                                n8 = n6 + 1;
                                break;
                            }
                            if (c7 == '\\') {
                                n9 = 1;
                            }
                            else {
                                n9 = n7;
                                if (c7 != '\r') {
                                    n9 = n7;
                                    if (c7 != '\n') {
                                        sb2.append(c7);
                                        n9 = n7;
                                    }
                                }
                            }
                        }
                        ++n5;
                        ++n6;
                        n7 = n9;
                    }
                    lxj.b(n8);
                    continue Label_0303;
                }
            }
            break;
        }
        final String string2 = sb2.toString();
        if (!lxj.a()) {
            lxj.b(lxj.b + 1);
        }
        return (g7i)new ns1(string, string2);
    }
}
