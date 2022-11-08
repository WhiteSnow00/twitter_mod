// 
// Decompiled by Procyon v0.6.0
// 

public final class dpu
{
    public final String a;
    public final fpu b;
    public final zpu c;
    public final opu d;
    public final vpu e;
    
    public dpu(final String a, final fpu b, final zpu c, final opu d, final vpu e) {
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
        if (!(o instanceof dpu)) {
            return false;
        }
        final dpu dpu = (dpu)o;
        return zzd.a((Object)this.a, (Object)dpu.a) && zzd.a((Object)this.b, (Object)dpu.b) && zzd.a((Object)this.c, (Object)dpu.c) && zzd.a((Object)this.d, (Object)dpu.d) && zzd.a((Object)this.e, (Object)dpu.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final fpu b = this.b;
        final zpu c = this.c;
        final opu d = this.d;
        final vpu e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetResults(__typename=");
        sb.append(a);
        sb.append(", tweetResultsJustTweet=");
        sb.append(b);
        sb.append(", tweetResultsWithVisibilityResult=");
        sb.append(c);
        sb.append(", tweetResultsTweetTombstone=");
        sb.append(d);
        sb.append(", tweetResultsTweetUnavailable=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
}
