import com.google.android.exoplayer2.n$a;
import java.util.Collections;
import java.util.ArrayList;
import com.google.android.exoplayer2.n;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wk8 implements bau$c
{
    public final int a;
    public final List<n> b;
    
    public wk8() {
        final aed$b d0 = aed.D0;
        final lam g0 = lam.G0;
        this.a = 0;
        this.b = (List<n>)g0;
    }
    
    public wk8(final int a, final List<n> b) {
        this.a = a;
        this.b = b;
    }
    
    public final bau a(final int n, final bau$b bau$b) {
        if (n != 2) {
            if (n == 3 || n == 4) {
                return (bau)new ebk((oy9)new qrh(bau$b.a));
            }
            if (n == 21) {
                return (bau)new ebk((oy9)new e5d());
            }
            final bau bau = null;
            final bau bau2 = null;
            final bau bau3 = null;
            final bau bau4 = null;
            if (n == 27) {
                Object o;
                if (this.c(4)) {
                    o = bau3;
                }
                else {
                    o = new ebk((oy9)new kbc(new zbp((List)this.b(bau$b)), this.c(1), this.c(8)));
                }
                return (bau)o;
            }
            if (n == 36) {
                return (bau)new ebk((oy9)new lbc(new zbp((List)this.b(bau$b))));
            }
            if (n != 89) {
                if (n != 138) {
                    if (n == 172) {
                        return (bau)new ebk((oy9)new ff(bau$b.a));
                    }
                    if (n == 257) {
                        return (bau)new jap((iap)new myj("application/vnd.dvb.ait"));
                    }
                    if (n != 134) {
                        Label_0250: {
                            if (n != 135) {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                return null;
                                            }
                                            case 130: {
                                                if (!this.c(64)) {
                                                    return null;
                                                }
                                                return (bau)new ebk((oy9)new ul9(bau$b.a));
                                            }
                                            case 129: {
                                                break Label_0250;
                                            }
                                            case 128: {
                                                return (bau)new ebk((oy9)new ibc(new daw((List)this.b(bau$b))));
                                            }
                                        }
                                        break;
                                    }
                                    case 17: {
                                        Object o2;
                                        if (this.c(2)) {
                                            o2 = bau4;
                                        }
                                        else {
                                            o2 = new ebk((oy9)new ave(bau$b.a));
                                        }
                                        return (bau)o2;
                                    }
                                    case 16: {
                                        return (bau)new ebk((oy9)new jbc(new daw((List)this.b(bau$b))));
                                    }
                                    case 15: {
                                        Object o3;
                                        if (this.c(2)) {
                                            o3 = bau;
                                        }
                                        else {
                                            o3 = new ebk((oy9)new jv(false, bau$b.a));
                                        }
                                        return (bau)o3;
                                    }
                                }
                            }
                        }
                        return (bau)new ebk((oy9)new cf(bau$b.a));
                    }
                    Object o4;
                    if (this.c(16)) {
                        o4 = bau2;
                    }
                    else {
                        o4 = new jap((iap)new myj("application/x-scte35"));
                    }
                    return (bau)o4;
                }
                return (bau)new ebk((oy9)new ul9(bau$b.a));
            }
            return (bau)new ebk((oy9)new nm9(bau$b.b));
        }
        return (bau)new ebk((oy9)new ibc(new daw((List)this.b(bau$b))));
    }
    
    public final List<n> b(final bau$b bau$b) {
        if (this.c(32)) {
            return this.b;
        }
        final mwj mwj = new mwj(bau$b.c);
        List<n> b = this.b;
        while (mwj.c - mwj.b > 0) {
            final int t = mwj.t();
            final int t2 = mwj.t();
            final int b2 = mwj.b;
            if (t == 134) {
                final ArrayList<n> list = new ArrayList<n>();
                final int t3 = mwj.t();
                int n = 0;
                while (true) {
                    b = list;
                    if (n >= (t3 & 0x1F)) {
                        break;
                    }
                    final String q = mwj.q(3);
                    final int t4 = mwj.t();
                    final boolean b3 = (t4 & 0x80) != 0x0;
                    int c;
                    String k;
                    if (b3) {
                        c = (t4 & 0x3F);
                        k = "application/cea-708";
                    }
                    else {
                        k = "application/cea-608";
                        c = 1;
                    }
                    final byte b4 = (byte)mwj.t();
                    mwj.E(1);
                    List<byte[]> singletonList = null;
                    if (b3) {
                        byte[] array;
                        if ((b4 & 0x40) != 0x0) {
                            array = new byte[] { 1 };
                        }
                        else {
                            array = new byte[] { 0 };
                        }
                        singletonList = Collections.singletonList(array);
                    }
                    final n$a n$a = new n$a();
                    n$a.k = k;
                    n$a.c = q;
                    n$a.C = c;
                    n$a.m = singletonList;
                    list.add(new n(n$a));
                    ++n;
                }
            }
            mwj.D(b2 + t2);
        }
        return b;
    }
    
    public final boolean c(final int n) {
        return (n & this.a) != 0x0;
    }
}
