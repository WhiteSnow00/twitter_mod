// 
// Decompiled by Procyon v0.6.0
// 

public final class ynj
{
    public final znj a;
    public final qnj b;
    public final snj c;
    public final onj d;
    public final xnj e;
    
    public ynj() {
        this(null, null, null, null, 31);
    }
    
    public ynj(znj a, qnj b, snj c, onj d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = null;
        }
        if ((n & 0x4) != 0x0) {
            c = null;
        }
        if ((n & 0x8) != 0x0) {
            d = null;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
    }
    
    public ynj(final znj a, final qnj b, final snj c, final onj d, final xnj e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ynj)) {
            return false;
        }
        final ynj ynj = (ynj)o;
        return e0e.a((Object)this.a, (Object)ynj.a) && e0e.a((Object)this.b, (Object)ynj.b) && e0e.a((Object)this.c, (Object)ynj.c) && e0e.a((Object)this.d, (Object)ynj.d) && e0e.a((Object)this.e, (Object)ynj.e);
    }
    
    @Override
    public final int hashCode() {
        final znj a = this.a;
        int n = 1;
        int hashCode = 0;
        int a2;
        if (a == null) {
            a2 = 0;
        }
        else if ((a2 = (a.a ? 1 : 0)) != 0) {
            a2 = 1;
        }
        final qnj b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final snj c = this.c;
        int a3;
        if (c == null) {
            a3 = 0;
        }
        else if ((a3 = (c.a ? 1 : 0)) != 0) {
            a3 = 1;
        }
        final onj d = this.d;
        if (d == null) {
            n = 0;
        }
        else {
            final int a4 = d.a ? 1 : 0;
            if (a4 == 0) {
                n = a4;
            }
        }
        final xnj e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((a2 * 31 + hashCode2) * 31 + a3) * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final znj a = this.a;
        final qnj b = this.b;
        final snj c = this.c;
        final onj d = this.d;
        final xnj e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("OpenbackSignals(openbackUnlockSignal=");
        sb.append(a);
        sb.append(", openbackDeviceDecisionsSignal=");
        sb.append(b);
        sb.append(", openbackHeadphonesSignal=");
        sb.append(c);
        sb.append(", openbackBatteryChargingStatus=");
        sb.append(d);
        sb.append(", openbackRingerVolumeSignal=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
}
