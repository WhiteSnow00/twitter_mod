import java.util.Collection;
import java.util.Collections;
import java.util.List;
import tv.periscope.android.api.ThumbnailPlaylistItem;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zjb implements Comparator
{
    public static final zjb E0;
    public static final zjb F0;
    public static final zjb G0;
    public static final zjb H0;
    public static final zjb I0;
    public static final zjb J0;
    public static final zjb K0;
    public static final zjb L0;
    public final int D0;
    
    static {
        E0 = new zjb(0);
        F0 = new zjb(1);
        G0 = new zjb(2);
        H0 = new zjb(3);
        I0 = new zjb(4);
        J0 = new zjb(5);
        K0 = new zjb(6);
        L0 = new zjb(7);
    }
    
    public zjb(final int d0) {
        this.D0 = d0;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        switch (this.D0) {
            default: {
                final kkt kkt = (kkt)o;
                final kkt kkt2 = (kkt)o2;
                final boolean b1 = m34.B1;
                return (int)(kkt2.c - kkt.c);
            }
            case 6: {
                return Double.compare(((ThumbnailPlaylistItem)o).timeInSecs, ((ThumbnailPlaylistItem)o2).timeInSecs);
            }
            case 5: {
                return (int)(((kkt)o2).c - ((kkt)o).c);
            }
            case 4: {
                return Integer.compare(((Enum)o).ordinal(), ((Enum)o2).ordinal());
            }
            case 3: {
                final adw adw = (adw)o;
                final adw adw2 = (adw)o2;
                final int a = zcw.a;
                final String c = adw.c();
                String s = "";
                String s2 = c;
                if (c == null) {
                    s2 = "";
                }
                final String c2 = adw2.c();
                if (c2 != null) {
                    s = c2;
                }
                return s2.compareToIgnoreCase(s);
            }
            case 2: {
                final kfq$a kfq$a = (kfq$a)o;
                final kfq$a kfq$a2 = (kfq$a)o2;
                final rnx h = kfq.h;
                return Float.compare(kfq$a.c, kfq$a2.c);
            }
            case 1: {
                return ((ek8.a)Collections.max((Collection<? extends ek8.a>)o)).f(Collections.max((Collection<? extends ek8.a>)o2));
            }
            case 0: {
                final byte[] array = (byte[])o;
                final byte[] array2 = (byte[])o2;
                final int length = array.length;
                final int length2 = array2.length;
                final int n = 0;
                int length3;
                int length4;
                if (length != length2) {
                    length3 = array.length;
                    length4 = array2.length;
                }
                else {
                    int n2 = 0;
                    while (true) {
                        final int n3 = n;
                        if (n2 >= array.length) {
                            return n3;
                        }
                        if (array[n2] != array2[n2]) {
                            length3 = array[n2];
                            length4 = array2[n2];
                            break;
                        }
                        ++n2;
                    }
                }
                return length3 - length4;
            }
        }
    }
}
