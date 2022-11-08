import com.twitter.rooms.subsystem.api.args.RoomHostKudosArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnn
{
    public final RoomHostKudosArgs a;
    
    public dnn(final RoomHostKudosArgs a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof dnn && zzd.a((Object)this.a, (Object)((dnn)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final RoomHostKudosArgs a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomHostKudosOpenEvent(args=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
