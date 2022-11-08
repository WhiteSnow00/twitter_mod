// 
// Decompiled by Procyon v0.6.0
// 

public final class dnj
{
    public final enj a;
    public final vmj b;
    public final xmj c;
    public final tmj d;
    public final cnj e;
    
    public dnj() {
        this(null, null, null, null, 31);
    }
    
    public dnj(enj a, vmj b, xmj c, tmj d, final int n) {
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
    
    public dnj(final enj a, final vmj b, final xmj c, final tmj d, final cnj e) {
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
        if (!(o instanceof dnj)) {
            return false;
        }
        final dnj dnj = (dnj)o;
        return zzd.a((Object)this.a, (Object)dnj.a) && zzd.a((Object)this.b, (Object)dnj.b) && zzd.a((Object)this.c, (Object)dnj.c) && zzd.a((Object)this.d, (Object)dnj.d) && zzd.a((Object)this.e, (Object)dnj.e);
    }
    
    @Override
    public final int hashCode() {
        final enj a = this.a;
        int n = 1;
        int hashCode = 0;
        int a2;
        if (a == null) {
            a2 = 0;
        }
        else if ((a2 = (a.a ? 1 : 0)) != 0) {
            a2 = 1;
        }
        final vmj b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final xmj c = this.c;
        int a3;
        if (c == null) {
            a3 = 0;
        }
        else if ((a3 = (c.a ? 1 : 0)) != 0) {
            a3 = 1;
        }
        final tmj d = this.d;
        if (d == null) {
            n = 0;
        }
        else {
            final int a4 = d.a ? 1 : 0;
            if (a4 == 0) {
                n = a4;
            }
        }
        final cnj e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((a2 * 31 + hashCode2) * 31 + a3) * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final enj a = this.a;
        final vmj b = this.b;
        final xmj c = this.c;
        final tmj d = this.d;
        final cnj e = this.e;
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
