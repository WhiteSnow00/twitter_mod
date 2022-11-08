import com.twitter.rooms.model.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kjo
{
    public static final class a extends kjo
    {
        public final Image a;
        
        public a(final Image a) {
            zzd.f((Object)a, "stationsFacePileImage");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final Image a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("StationsFacePile(stationsFacePileImage=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
