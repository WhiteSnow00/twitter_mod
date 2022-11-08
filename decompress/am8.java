import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class am8 implements qtd
{
    public static final am8.am8$a Companion;
    public final hr0 a;
    public final gfq b;
    public final cm8 c;
    public final eql d;
    
    static {
        Companion = new am8.am8$a();
    }
    
    public am8(final hr0 a, final gfq b, final cm8 c, final eql d) {
        zzd.f((Object)a, "applicationManager");
        zzd.f((Object)b, "actionScriber");
        zzd.f((Object)c, "delayPushWorkManager");
        zzd.f((Object)d, "pushNotificationRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final jsi jsi, final List<jsi> list) {
        zzd.f((Object)jsi, "receivedPush");
        zzd.f((Object)list, "notificationsList");
        this.b.a(jsi, "delay_received");
        if (this.a.e()) {
            this.b.a(jsi, "delay_failure");
        }
        else {
            this.d.g(jsi).G((fk6)new jua((rtb)new am8$b(this), 28), (fk6)jvb.e);
        }
    }
}
