import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvt
{
    public final boolean a;
    public final String b;
    public final ovt$a c;
    public final int d;
    public final byte[] e;
    
    public jvt(final boolean a, final String b, int d, final byte[] array, final int n, final int n2, final byte[] e) {
        final int n3 = 0;
        final int n4 = 1;
        ri4.k(d == 0 ^ e == null);
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        int n5;
        if (b == null) {
            n5 = n4;
        }
        else {
            Label_0192: {
                switch (b.hashCode()) {
                    case 3049895: {
                        if (!b.equals("cens")) {
                            break;
                        }
                        d = 3;
                        break Label_0192;
                    }
                    case 3049879: {
                        if (!b.equals("cenc")) {
                            break;
                        }
                        d = 2;
                        break Label_0192;
                    }
                    case 3046671: {
                        if (!b.equals("cbcs")) {
                            break;
                        }
                        d = 1;
                        break Label_0192;
                    }
                    case 3046605: {
                        d = n3;
                        if (!b.equals("cbc1")) {
                            break;
                        }
                        break Label_0192;
                    }
                }
                d = -1;
            }
            if (d != 0 && d != 1) {
                n5 = n4;
                if (d != 2) {
                    n5 = n4;
                    if (d != 3) {
                        final StringBuilder sb = new StringBuilder(b.length() + 68);
                        sb.append("Unsupported protection scheme type '");
                        sb.append(b);
                        sb.append("'. Assuming AES-CTR crypto mode.");
                        Log.w("TrackEncryptionBox", sb.toString());
                        n5 = n4;
                    }
                }
            }
            else {
                n5 = 2;
            }
        }
        this.c = new ovt$a(n5, array, n, n2);
    }
}
