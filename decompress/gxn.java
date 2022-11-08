import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxn implements oax
{
    public static final gxn.gxn$a Companion;
    public final String a;
    public final e0r b;
    public final i5m c;
    public final Set<RoomUserItem> d;
    public final Set<RoomUserItem> e;
    public final Set<RoomUserItem> f;
    public final int g;
    public final String h;
    public final int i;
    
    static {
        Companion = new gxn.gxn$a();
    }
    
    public gxn(final String a, final e0r b, final i5m c, final Set<RoomUserItem> d, final Set<RoomUserItem> e, final Set<RoomUserItem> f, final int g, final String h, final int i) {
        zzd.f((Object)a, "roomId");
        zzd.f((Object)b, "speakingState");
        zzd.f((Object)c, "recordingState");
        zzd.f((Object)d, "admins");
        zzd.f((Object)e, "speakers");
        zzd.f((Object)f, "listeners");
        zzd.f((Object)h, "primaryAdminId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gxn)) {
            return false;
        }
        final gxn gxn = (gxn)o;
        return zzd.a((Object)this.a, (Object)gxn.a) && this.b == gxn.b && this.c == gxn.c && zzd.a((Object)this.d, (Object)gxn.d) && zzd.a((Object)this.e, (Object)gxn.e) && zzd.a((Object)this.f, (Object)gxn.f) && this.g == gxn.g && zzd.a((Object)this.h, (Object)gxn.h) && this.i == gxn.i;
    }
    
    @Override
    public final int hashCode() {
        return l7k.a(this.h, (dia.p((Set)this.f, dia.p((Set)this.e, dia.p((Set)this.d, (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31, 31), 31), 31) + this.g) * 31, 31) + this.i;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final e0r b = this.b;
        final i5m c = this.c;
        final Set<RoomUserItem> d = this.d;
        final Set<RoomUserItem> e = this.e;
        final Set<RoomUserItem> f = this.f;
        final int g = this.g;
        final String h = this.h;
        final int i = this.i;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomRecordingPromptViewState(roomId=");
        sb.append(a);
        sb.append(", speakingState=");
        sb.append(b);
        sb.append(", recordingState=");
        sb.append(c);
        sb.append(", admins=");
        sb.append(d);
        sb.append(", speakers=");
        sb.append(e);
        sb.append(", listeners=");
        sb.append(f);
        sb.append(", remainingParticipants=");
        y70.B(sb, g, ", primaryAdminId=", h, ", maxAdminCapacity=");
        return gd.y(sb, i, ")");
    }
}
