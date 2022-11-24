import com.google.android.exoplayer2.n$a;
import java.util.Collections;
import java.util.ArrayList;
import com.google.android.exoplayer2.n;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kl8 implements kbu$c
{
    public final int a;
    public final List<n> b;
    
    public kl8() {
        final eed.b g0 = eed.G0;
        final nbm j0 = nbm.J0;
        this.a = 0;
        this.b = j0;
    }
    
    public kl8(final int a, final List<n> b) {
        this.a = a;
        this.b = b;
    }
    
    public final kbu a(final int n, final kbu$b kbu$b) {
        if (n != 2) {
            if (n == 3 || n == 4) {
                return (kbu)new xbk((bz9)new ksh(kbu$b.a));
            }
            if (n == 21) {
                return (kbu)new xbk((bz9)new j5d());
            }
            final kbu kbu = null;
            final kbu kbu2 = null;
            final kbu kbu3 = null;
            final kbu kbu4 = null;
            if (n == 27) {
                Object o;
                if (this.c(4)) {
                    o = kbu3;
                }
                else {
                    o = new xbk((bz9)new mbc(new mdp((List)this.b(kbu$b)), this.c(1), this.c(8)));
                }
                return (kbu)o;
            }
            if (n == 36) {
                return (kbu)new xbk((bz9)new nbc(new mdp((List)this.b(kbu$b))));
            }
            if (n != 89) {
                if (n != 138) {
                    if (n == 172) {
                        return (kbu)new xbk((bz9)new ff(kbu$b.a));
                    }
                    if (n == 257) {
                        return (kbu)new vbp((ubp)new gzj("application/vnd.dvb.ait"));
                    }
                    if (n != 134) {
                        Label_0251: {
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
                                                return (kbu)new xbk((bz9)new fm9(kbu$b.a));
                                            }
                                            case 129: {
                                                break Label_0251;
                                            }
                                            case 128: {
                                                return (kbu)new xbk((bz9)new kbc(new cbw(this.b(kbu$b))));
                                            }
                                        }
                                        break;
                                    }
                                    case 17: {
                                        Object o2;
                                        if (this.c(2)) {
                                            o2 = kbu4;
                                        }
                                        else {
                                            o2 = new xbk((bz9)new jve(kbu$b.a));
                                        }
                                        return (kbu)o2;
                                    }
                                    case 16: {
                                        return (kbu)new xbk((bz9)new lbc(new cbw(this.b(kbu$b))));
                                    }
                                    case 15: {
                                        Object o3;
                                        if (this.c(2)) {
                                            o3 = kbu;
                                        }
                                        else {
                                            o3 = new xbk((bz9)new jv(false, kbu$b.a));
                                        }
                                        return (kbu)o3;
                                    }
                                }
                            }
                        }
                        return (kbu)new xbk((bz9)new cf(kbu$b.a));
                    }
                    Object o4;
                    if (this.c(16)) {
                        o4 = kbu2;
                    }
                    else {
                        o4 = new vbp((ubp)new gzj("application/x-scte35"));
                    }
                    return (kbu)o4;
                }
                return (kbu)new xbk((bz9)new fm9(kbu$b.a));
            }
            return (kbu)new xbk((bz9)new ym9(kbu$b.b));
        }
        return (kbu)new xbk((bz9)new kbc(new cbw(this.b(kbu$b))));
    }
    
    public final List<n> b(final kbu$b kbu$b) {
        if (this.c(32)) {
            return this.b;
        }
        final gxj gxj = new gxj(kbu$b.c);
        List<n> b = this.b;
        while (gxj.c - gxj.b > 0) {
            final int t = gxj.t();
            final int t2 = gxj.t();
            final int b2 = gxj.b;
            if (t == 134) {
                final ArrayList<n> list = new ArrayList<n>();
                final int t3 = gxj.t();
                int n = 0;
                while (true) {
                    b = list;
                    if (n >= (t3 & 0x1F)) {
                        break;
                    }
                    final String q = gxj.q(3);
                    final int t4 = gxj.t();
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
                    final byte b4 = (byte)gxj.t();
                    gxj.E(1);
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
            gxj.D(b2 + t2);
        }
        return b;
    }
    
    public final boolean c(final int n) {
        return (n & this.a) != 0x0;
    }
}
