import com.twitter.rooms.subsystem.api.args.RoomHostKudosArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qnn
{
    public final RoomHostKudosArgs a;
    
    public qnn(final RoomHostKudosArgs a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qnn && czd.a((Object)this.a, (Object)((qnn)o).a));
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
