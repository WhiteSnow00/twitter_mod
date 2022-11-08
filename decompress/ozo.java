import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozo<T extends szo> extends yxc
{
    public final xzo<T> b;
    public final n5k<T> c;
    
    public ozo(final xzo<T> b, final n5k<T> c) {
        zzd.f((Object)b, "scribeItemProvider");
        zzd.f((Object)c, "periscopeScribeHelper");
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        Objects.requireNonNull(super.a);
        this.c.b("", "hangup_screen", "cancel", this.e());
    }
    
    public final void b(final boolean b, final boolean b2) {
        super.b(b, b2);
        String s = "";
        if (b) {
            final n5k<T> c = this.c;
            final Boolean a = super.a.a;
            if (a != null) {
                if (a) {
                    s = "audio";
                }
                else {
                    s = "video";
                }
            }
            c.b("hangup", s, "by_broadcaster", this.e());
            return;
        }
        this.c.b("", "hangup_screen", "confirm", this.e());
    }
    
    public final void c(final boolean b) {
        final yxc$b a = new yxc$b();
        super.a = a;
        a.a = b;
        Objects.requireNonNull(super.a);
        this.c.b("in_broadcast_actions_menu", "hangup", "", this.e());
    }
    
    public final void d(final boolean b) {
        final yxc$b a = new yxc$b();
        super.a = a;
        a.a = b;
        Objects.requireNonNull(super.a);
        this.c.b("chat_bottom_bar", "hangup", "", this.e());
    }
    
    public final szo e() {
        return this.b.a();
    }
}
