import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzz extends fdy
{
    public final boolean H0;
    public final boolean I0;
    public final tzz J0;
    
    public bzz(final tzz j0, final boolean h0, final boolean i0) {
        this.J0 = j0;
        super("log");
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final kfy a(final y7z y7z, final List list) {
        vbz.i("log", 1, list);
        if (list.size() == 1) {
            this.J0.H0.u0(3, y7z.d((kfy)list.get(0)).k(), (List)Collections.emptyList(), this.H0, this.I0);
            return (kfy)kfy.x0;
        }
        final int b = vbz.b(y7z.d((kfy)list.get(0)).h());
        int i = 2;
        int n;
        if (b != 2) {
            if (b != 3) {
                if (b != 5) {
                    if (b != 6) {
                        n = 3;
                    }
                    else {
                        n = 2;
                    }
                }
                else {
                    n = 5;
                }
            }
            else {
                n = 1;
            }
        }
        else {
            n = 4;
        }
        final String k = y7z.d((kfy)list.get(1)).k();
        if (list.size() == 2) {
            this.J0.H0.u0(n, k, (List)Collections.emptyList(), this.H0, this.I0);
            return (kfy)kfy.x0;
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        while (i < Math.min(list.size(), 5)) {
            list2.add(y7z.d((kfy)list.get(i)).k());
            ++i;
        }
        this.J0.H0.u0(n, k, (List)list2, this.H0, this.I0);
        return (kfy)kfy.x0;
    }
}
