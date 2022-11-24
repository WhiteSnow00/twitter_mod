import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkm
{
    public final rlm a;
    public final String b;
    public final String c;
    public final String d;
    public final bdm e;
    public final List<Object> f;
    public final List<Object> g;
    public final String h;
    public final olm i;
    public final String j;
    public final hrw k;
    
    public fkm(final rlm a, final String b, final String c, final String d, final bdm f, final List<?> g, final List<?> h, final String i, final olm j, final String k, final hrw hrw) {
        final bdm f2 = bdm.F0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = f2;
        this.f = (List<Object>)f;
        this.g = (List<Object>)g;
        this.h = (String)h;
        this.i = (olm)i;
        this.j = (String)j;
        this.k = (hrw)k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fkm)) {
            return false;
        }
        final fkm fkm = (fkm)o;
        return this.a == fkm.a && e0e.a((Object)this.b, (Object)fkm.b) && e0e.a((Object)this.c, (Object)fkm.c) && e0e.a((Object)this.d, (Object)fkm.d) && this.e == fkm.e && e0e.a((Object)this.f, (Object)fkm.f) && e0e.a((Object)this.g, (Object)fkm.g) && e0e.a((Object)this.h, (Object)fkm.h) && this.i == fkm.i && e0e.a((Object)this.j, (Object)fkm.j) && this.k == fkm.k;
    }
    
    @Override
    public final int hashCode() {
        final rlm a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int d = brg.d(this.c, brg.d(this.b, hashCode * 31, 31), 31);
        final String d2 = this.d;
        int hashCode2;
        if (d2 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d2.hashCode();
        }
        final bdm e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final int o = go9.o((List)this.g, go9.o((List)this.f, ((d + hashCode2) * 31 + hashCode3) * 31, 31), 31);
        final String h = this.h;
        int hashCode4;
        if (h == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = h.hashCode();
        }
        final int d3 = brg.d(this.j, (this.i.hashCode() + (o + hashCode4) * 31) * 31, 31);
        final hrw k = this.k;
        int hashCode5;
        if (k == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = k.hashCode();
        }
        return d3 + hashCode5;
    }
    
    @Override
    public final String toString() {
        final rlm a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final bdm e = this.e;
        final List<Object> f = this.f;
        final List<Object> g = this.g;
        final String h = this.h;
        final olm i = this.i;
        final String j = this.j;
        final hrw k = this.k;
        final StringBuilder sb = new StringBuilder();
        sb.append("ReportDetail(actionedReportType=");
        sb.append(a);
        sb.append(", header=");
        sb.append(b);
        sb.append(", lastUpdateTime=");
        jba.s(sb, c, ", outcomeText=", d, ", remediation=");
        sb.append(e);
        sb.append(", reportEntities=");
        sb.append(f);
        sb.append(", reportEntitiesResults=");
        sb.append(g);
        sb.append(", reportFlowId=");
        sb.append(h);
        sb.append(", reportStatus=");
        sb.append(i);
        sb.append(", ruleLink=");
        sb.append(j);
        sb.append(", verdict=");
        sb.append(k);
        sb.append(")");
        return sb.toString();
    }
}
