import android.widget.ImageView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qxj
{
    public final TextView a;
    public final TextView b;
    public final FrescoMediaImageView c;
    public final ImageView d;
    
    public qxj(final TextView a, final TextView b, final FrescoMediaImageView c, final ImageView d) {
        zzd.f((Object)a, "nameTextView");
        zzd.f((Object)b, "scoreTextView");
        zzd.f((Object)c, "logoMediaView");
        zzd.f((Object)d, "winnerIndicatorView");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qxj)) {
            return false;
        }
        final qxj qxj = (qxj)o;
        return zzd.a((Object)this.a, (Object)qxj.a) && zzd.a((Object)this.b, (Object)qxj.b) && zzd.a((Object)this.c, (Object)qxj.c) && zzd.a((Object)this.d, (Object)qxj.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final TextView a = this.a;
        final TextView b = this.b;
        final FrescoMediaImageView c = this.c;
        final ImageView d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("ParticipantViewHolder(nameTextView=");
        sb.append(a);
        sb.append(", scoreTextView=");
        sb.append(b);
        sb.append(", logoMediaView=");
        sb.append(c);
        sb.append(", winnerIndicatorView=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
