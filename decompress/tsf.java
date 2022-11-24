import java.util.Map;
import com.twitter.tweetdetail.destinationoverlay.TweetDetailDestinationOverLayViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tsf implements nuk
{
    public static final tsf d;
    public static final tsf e;
    public static final tsf f;
    public static final tsf g;
    public static final tsf h;
    public static final tsf i;
    public static final tsf j;
    public static final tsf k;
    public static final tsf l;
    public static final tsf m;
    public final int c;
    
    static {
        d = new tsf(0);
        e = new tsf(1);
        f = new tsf(2);
        g = new tsf(3);
        h = new tsf(4);
        i = new tsf(5);
        j = new tsf(6);
        k = new tsf(7);
        l = new tsf(8);
        m = new tsf(9);
    }
    
    public tsf(final int c) {
        this.c = c;
    }
    
    public final boolean apply(final Object o) {
        final int c = this.c;
        final boolean b = true;
        boolean b2 = true;
        final boolean b3 = true;
        final boolean b4 = true;
        final boolean b5 = true;
        final boolean b6 = true;
        final boolean b7 = true;
        final boolean b8 = true;
        switch (c) {
            default: {
                final zwv zwv = (zwv)o;
                final ape[] x0 = TweetDetailDestinationOverLayViewModel.X0;
                e0e.f((Object)zwv, "input");
                boolean b9 = b7;
                if (!(zwv instanceof cu8)) {
                    b9 = (zwv instanceof yo0 && b7);
                }
                return b9;
            }
            case 8: {
                final x99 x2 = (x99)o;
                return n0h.L0.equals(x2.K0) && e2h.J0 == x2.J0 && b8;
            }
            case 7: {
                final zwv zwv2 = (zwv)o;
                if (zwv2 instanceof wsg) {
                    final wtg b10 = ((wsg)zwv2).b;
                    if (b10 != null && qvg.v(b10)) {
                        return b;
                    }
                }
                return false;
            }
            case 6: {
                final xtd xtd = (xtd)o;
                if (xtd instanceof q4q.a) {
                    final int a = o5j.a;
                    if (((q4q.a)xtd).a.a != bx.F0) {
                        return b2;
                    }
                }
                b2 = false;
                return b2;
            }
            case 5: {
                final yzk yzk = (yzk)o;
                final Map d = tss.d;
                return yzk.c == 2 && b3;
            }
            case 4: {
                final qs4 qs4 = (qs4)o;
                final hmw a2 = ivs.a;
                return qs4.b ^ true;
            }
            case 3: {
                return ((tj1)o).c() != null && b4;
            }
            case 2: {
                return o != null && b5;
            }
            case 1: {
                return ((ct6)o) instanceof ryj;
            }
            case 0: {
                final mm3 mm3 = (mm3)o;
                final h5s a3 = msf.a;
                e0e.f((Object)mm3, "item");
                final int j = mm3.j;
                boolean b12 = b6;
                if (j != 1) {
                    b12 = b6;
                    if (j != 2) {
                        b12 = b6;
                        if (j != 3) {
                            b12 = (j == 5 && (boolean)msf.a.getValue());
                        }
                    }
                }
                return b12;
            }
        }
    }
}
