import java.util.Iterator;
import java.lang.ref.SoftReference;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xkp implements Serializable
{
    public final String C0;
    public byte[] D0;
    
    public xkp() {
        this.C0 = " ";
    }
    
    public final byte[] a() {
        byte[] d0;
        if ((d0 = this.D0) == null) {
            final ThreadLocal b = zie.b;
            final SoftReference softReference = b.get();
            zie zie;
            if (softReference == null) {
                zie = null;
            }
            else {
                zie = (zie)softReference.get();
            }
            zie zie2 = zie;
            if (zie == null) {
                zie2 = new zie();
                b.set(new SoftReference(zie2));
            }
            final String c0 = this.C0;
            z53 a;
            if ((a = zie2.a) == null) {
                a = new z53();
                zie2.a = a;
            }
            final int length = c0.length();
            a.D0 = 0;
            a.F0 = 0;
            if (!a.C0.isEmpty()) {
                a.C0.clear();
            }
            byte[] array = a.E0;
            int n = array.length;
            int n2 = 0;
            int n3 = 0;
            int f0 = 0;
        Label_0776:
            while (true) {
                f0 = n3;
                if (n2 >= length) {
                    break;
                }
                int n4;
                int i;
                int length2;
                for (n4 = n2 + 1, i = c0.charAt(n2); i <= 127; i = c0.charAt(n4), ++n4, n = length2) {
                    int n5;
                    if ((n5 = n3) >= (length2 = n)) {
                        a.a();
                        array = a.E0;
                        length2 = array.length;
                        n5 = 0;
                    }
                    n3 = n5 + 1;
                    array[n5] = (byte)i;
                    if (n4 >= length) {
                        f0 = n3;
                        break Label_0776;
                    }
                }
                int n6;
                int length3;
                if ((n6 = n3) >= (length3 = n)) {
                    a.a();
                    array = a.E0;
                    length3 = array.length;
                    n6 = 0;
                }
                int length4 = 0;
                int n15 = 0;
                Label_0721: {
                    int n8;
                    if (i < 2048) {
                        final int n7 = n6 + 1;
                        array[n6] = (byte)(i >> 6 | 0xC0);
                        length4 = length3;
                        n8 = n7;
                    }
                    else if (i >= 55296 && i <= 57343) {
                        if (i > 56319) {
                            zie.a(i);
                            throw null;
                        }
                        if (n4 >= length) {
                            zie.a(i);
                            throw null;
                        }
                        final char char1 = c0.charAt(n4);
                        if (char1 < '\udc00' || char1 > '\udfff') {
                            final StringBuilder g = w48.g("Broken surrogate pair: first char 0x");
                            g.append(Integer.toHexString(i));
                            g.append(", second 0x");
                            g.append(Integer.toHexString(char1));
                            g.append("; illegal combination");
                            throw new IllegalArgumentException(g.toString());
                        }
                        final int n9 = (i - 55296 << 10) + 65536 + (char1 - '\udc00');
                        if (n9 <= 1114111) {
                            final int n10 = n6 + 1;
                            array[n6] = (byte)(n9 >> 18 | 0xF0);
                            int n11;
                            int length5;
                            if ((n11 = n10) >= (length5 = length3)) {
                                a.a();
                                array = a.E0;
                                length5 = array.length;
                                n11 = 0;
                            }
                            final int n12 = n11 + 1;
                            array[n11] = (byte)((n9 >> 12 & 0x3F) | 0x80);
                            int n13;
                            int length6;
                            if ((n13 = n12) >= (length6 = length5)) {
                                a.a();
                                array = a.E0;
                                length6 = array.length;
                                n13 = 0;
                            }
                            final int n14 = n13 + 1;
                            array[n13] = (byte)((n9 >> 6 & 0x3F) | 0x80);
                            i = n9;
                            ++n4;
                            length4 = length6;
                            n2 = n4;
                            n15 = n14;
                            break Label_0721;
                        }
                        zie.a(n9);
                        throw null;
                    }
                    else {
                        final int n16 = n6 + 1;
                        array[n6] = (byte)(i >> 12 | 0xE0);
                        int n17;
                        if ((n17 = n16) >= (length4 = length3)) {
                            a.a();
                            array = a.E0;
                            length4 = array.length;
                            n17 = 0;
                        }
                        array[n17] = (byte)((i >> 6 & 0x3F) | 0x80);
                        n8 = n17 + 1;
                    }
                    final int n18 = n4;
                    n15 = n8;
                    n2 = n18;
                }
                n = length4;
                int n19 = n15;
                if (n15 >= length4) {
                    a.a();
                    array = a.E0;
                    n = array.length;
                    n19 = 0;
                }
                array[n19] = (byte)((i & 0x3F) | 0x80);
                n3 = n19 + 1;
            }
            final z53 a2 = zie2.a;
            a2.F0 = f0;
            final int n20 = a2.D0 + f0;
            if (n20 == 0) {
                d0 = z53.G0;
            }
            else {
                d0 = new byte[n20];
                final Iterator iterator = a2.C0.iterator();
                int n21 = 0;
                while (iterator.hasNext()) {
                    final byte[] array2 = (byte[])iterator.next();
                    final int length7 = array2.length;
                    System.arraycopy(array2, 0, d0, n21, length7);
                    n21 += length7;
                }
                System.arraycopy(a2.E0, 0, d0, n21, a2.F0);
                final int n22 = n21 + a2.F0;
                if (n22 != n20) {
                    throw new RuntimeException(k1b.f("Internal error: total len assumed to be ", n20, ", copied ", n22, " bytes"));
                }
                if (!a2.C0.isEmpty()) {
                    a2.D0 = 0;
                    a2.F0 = 0;
                    if (!a2.C0.isEmpty()) {
                        a2.C0.clear();
                    }
                }
            }
            this.D0 = d0;
        }
        return d0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o != null && o.getClass() == xkp.class && this.C0.equals(((xkp)o).C0));
    }
    
    @Override
    public final int hashCode() {
        return this.C0.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
}
