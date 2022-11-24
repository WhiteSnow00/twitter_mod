import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tjy implements Comparator
{
    public final fdy F0;
    public final y7z G0;
    
    public tjy(final fdy f0, final y7z g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final /* bridge */ int compare(final Object o, final Object o2) {
        final kfy kfy = (kfy)o;
        final kfy kfy2 = (kfy)o2;
        final fdy f0 = this.F0;
        final y7z g0 = this.G0;
        final boolean b = kfy instanceof chy;
        int compareTo = 1;
        if (b) {
            if (kfy2 instanceof chy) {
                return 0;
            }
        }
        else if (kfy2 instanceof chy) {
            compareTo = -1;
        }
        else if (f0 == null) {
            compareTo = kfy.k().compareTo(kfy2.k());
        }
        else {
            compareTo = (int)vbz.a(f0.a(g0, (List)Arrays.asList(kfy, kfy2)).h());
        }
        return compareTo;
    }
}
