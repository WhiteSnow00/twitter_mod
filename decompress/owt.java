import com.twitter.rooms.model.StationsSocialProof;
import java.util.List;
import com.twitter.rooms.model.PodcastEpisode;
import com.twitter.rooms.model.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owt
{
    public final Image a;
    public final PodcastEpisode b;
    public final x21 c;
    public final String d;
    public final List<StationsSocialProof> e;
    
    public owt(final Image a, final PodcastEpisode b, final x21 c, final String d, final List<StationsSocialProof> e) {
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
        if (!(o instanceof owt)) {
            return false;
        }
        final owt owt = (owt)o;
        return e0e.a((Object)this.a, (Object)owt.a) && e0e.a((Object)this.b, (Object)owt.b) && e0e.a((Object)this.c, (Object)owt.c) && e0e.a((Object)this.d, (Object)owt.d) && e0e.a((Object)this.e, (Object)owt.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final PodcastEpisode b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final x21 c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final List<StationsSocialProof> e = this.e;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final Image a = this.a;
        final PodcastEpisode b = this.b;
        final x21 c = this.c;
        final String d = this.d;
        final List<StationsSocialProof> e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("Track(image=");
        sb.append(a);
        sb.append(", podcastEpisode=");
        sb.append(b);
        sb.append(", space=");
        sb.append(c);
        sb.append(", trackMetadata=");
        sb.append(d);
        sb.append(", socialProof=");
        return ad.A(sb, e, ")");
    }
}
