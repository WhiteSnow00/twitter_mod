import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class twt implements f
{
    public static final twt I0;
    public static final f$a<twt> J0;
    public final int F0;
    public final eed<swt> G0;
    public int H0;
    
    static {
        I0 = new twt(new swt[0]);
        twt.J0 = i71.O0;
    }
    
    public twt(final swt... array) {
        this.G0 = (nbm)eed.r(array);
        this.F0 = array.length;
        int n;
        for (int i = 0; i < this.G0.I0; i = n) {
            int n2;
            n = (n2 = i + 1);
            while (true) {
                final nbm g0 = this.G0;
                if (n2 >= g0.I0) {
                    break;
                }
                if (((swt)g0.get(i)).equals(this.G0.get(n2))) {
                    tqb.y("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
                ++n2;
            }
        }
    }
    
    public final swt a(final int n) {
        return this.G0.get(n);
    }
    
    public final int b(final swt swt) {
        int index = this.G0.indexOf(swt);
        if (index < 0) {
            index = -1;
        }
        return index;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && twt.class == o.getClass()) {
            final twt twt = (twt)o;
            if (this.F0 != twt.F0 || !this.G0.equals(twt.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.H0 == 0) {
            this.H0 = this.G0.hashCode();
        }
        return this.H0;
    }
}
